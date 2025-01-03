package com.clickEat.ug.screens.account

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.clickEat.ug.api.ApiConnection
import com.clickEat.ug.data.*
import com.clickEat.ug.database.AppDataBase
import com.clickEat.ug.database.CustomerTable
import kotlinx.coroutines.*

class AccountsViewModal(customer: Customer, app: Application ): AndroidViewModel(app) {
    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + viewModelJob)
    var database = AppDataBase.getInstance(getApplication()).databaseDao

    private var _accountInformation = MutableLiveData<Customer>()
    val accountInformation: LiveData<Customer>
        get() = _accountInformation

    private var _addresses  = MutableLiveData<List<CustomerAddress>>()
    val addresses: LiveData<List<CustomerAddress>>
        get() = _addresses


    init {
        _accountInformation.value = customer
        getCustomerAddresses(customer.customer_id)
    }

    private fun getCustomerAddresses(customer_id: Int){
        coroutineScope.launch {
            try{
                _addresses.value = getAddresses(customer_id)
            }catch (it: Throwable){
                _addresses.value = null
            }
        }

    }

    private suspend fun getAddresses(customer_id: Int):List<CustomerAddress>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.getCustomerAddressesAsync(customer_id).await()
        }
    }

    fun updateCustomerInformation(customerID: Int,customer: UpdateCustomer){
        coroutineScope.launch {
            try {
                _accountInformation.value = updateCustomer(customerID, customer)
            }catch (it: Throwable){
                _accountInformation.value = null
            }
        }
    }

    private suspend fun updateCustomer(customerID: Int, customer: UpdateCustomer): Customer{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.updateCustomerInformationAsync(customerID,customer).await()
                    .also {
                        it.token = CustomerToken.token
                        database.saveCustomer(it.toCustomerTable())
                    }
        }
    }



    fun addNewAddress(customerID: Int, customerNewAddress: CustomerNewAddress){
        coroutineScope.launch {
            try {
                _addresses.value = addAddress(customerID, customerNewAddress)
            }catch (it: Throwable){
                _addresses.value = null
            }
        }
    }

    private suspend fun addAddress(customerID: Int, customerNewAddress: CustomerNewAddress):List<CustomerAddress>{
        return withContext(Dispatchers.IO){
            ApiConnection(getApplication()).connectionService.addNewCustomerAddressAsync(customerID, customerNewAddress).await()
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}