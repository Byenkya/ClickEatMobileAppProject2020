package com.clickEat.ug

import android.app.Application
import androidx.lifecycle.*
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.*
import com.clickEat.ug.database.CustomerTable
import com.clickEat.ug.database.DatabaseDao
import com.clickEat.ug.database.toCustomer
import kotlinx.coroutines.*

class MainActivityViewModel(private val databaseDao: DatabaseDao, application: Application): AndroidViewModel(application){
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)
//    val cartSize: LiveData<Int> = databaseDao.cartSize()
    var _cartSize =  MutableLiveData<Int>()
    val cartSize: LiveData<Int>
        get() = _cartSize

    private var _result = MutableLiveData<Customer>()
    val result: LiveData<Customer>
        get() = _result

    private val _navigateToSelectedProduct = MutableLiveData<Product>()
    val navigateToSelectedProduct: LiveData<Product>
        get() = _navigateToSelectedProduct

    private val _response = MutableLiveData<ApiResponse>()
    val response: LiveData<ApiResponse>
        get() = _response

    private var _passwordStatus = MutableLiveData<ApiResponse>()
    val passwordStatus: LiveData<ApiResponse>
        get() = _passwordStatus


    val currentUser: LiveData<CustomerTable> = Transformations.map(databaseDao.getCurrentUser()){
            CustomerToken.token = it?.token ?: ""
            it ?: CustomerTable(
                    customer_id = 0,
                    names = "click_it",
                    email = "welcome to click it App",
                    contact = "",
                    second_contact = "",
                    date_of_reg = "",
                    account_active = false,
                    token = null,
                    cart_size = null

            )
    }

    //adding to cart
    private var _addedToCart = MutableLiveData<ApiResponse>()
    val addedToCart: LiveData<ApiResponse>
        get() = _addedToCart

    // customer new address
    var _newAddress = MutableLiveData<CustomerNewAddress>()
    val newAddress: LiveData<CustomerNewAddress>
        get() = _newAddress


    fun signInUser(loginCredentials: LoginCredentials){
        coroutineScope.launch {
            try {
                _result.value = getUserFromServer(loginCredentials)
                _cartSize.value = _result.value!!.cartSize
            }catch (it: Throwable){
                _result.value = null
            }
        }
    }

    private suspend fun getUserFromServer(loginCredentials: LoginCredentials): Customer{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getUserAsync(loginCredentials).await()
        }
    }

    fun saveCustomerInfo(customer: Customer){
        coroutineScope.launch {
            saveCustomerData(customer)
        }
    }
    private suspend fun saveCustomerData(customer: Customer){
        withContext(Dispatchers.IO){
            databaseDao.saveCustomer(customer.toCustomerTable())
        }
    }

    fun addToCart(cartItem: CartItem){
        coroutineScope.launch {
            try {
                _addedToCart.value = addItemToCart(cartItem)
                _cartSize.value = addedToCart.value?.data
            }catch (it: Throwable){
                _addedToCart.value = ApiResponse("error", it.message, 0)
            }
        }
    }

    private suspend fun addItemToCart(cartItem: CartItem): ApiResponse{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.addToCartAsync(cartItem).await()
        }
    }

    fun changeCustomerPassword(customerID: Int, changePassword: ChangePassword){
        coroutineScope.launch {
            try {
                _passwordStatus.value = changePassword(customerID, changePassword)
            }catch (it: Throwable){
                _passwordStatus.value = ApiResponse("error", "${it.message}",0)
            }
        }
    }

    private suspend fun changePassword(customerID: Int, changePassword: ChangePassword): ApiResponse{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.changeCustomerPasswordAsync(customerID, changePassword).await()
        }
    }


    fun deleteAddress(addressID: Int){
        coroutineScope.launch {
            try {
                _response.value = deleteCustomerAddress(addressID)
            }catch (it: Throwable){
                _response.value = ApiResponse("error", it.message, 0)
            }
        }
    }

    private suspend fun deleteCustomerAddress(addressID: Int): ApiResponse{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.deleteCustomerAddressAsync(addressID).await()
        }
    }


    fun saveNewAddress(address: CustomerNewAddress){
        try{
            _newAddress.value = address
        }catch (it: Throwable){
            _newAddress.value  = null
        }

    }

    fun deleteCustomer() {
        coroutineScope.launch {
            clear()
        }
    }

    private suspend fun clear() {
        withContext(Dispatchers.IO) {
            databaseDao.deleteCustomer()
        }
    }


    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    fun displayProductDetails(product: Product){
        _navigateToSelectedProduct.value = product
    }

    fun displayProductDetailsComplete(){
        _navigateToSelectedProduct.value = null
    }


}