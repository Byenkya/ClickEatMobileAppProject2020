package com.clickEat.ug.screens.account

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.clickEat.ug.data.Customer
import java.lang.IllegalArgumentException

class AccountsViewModalFactory(private val customer: Customer, private val app: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(AccountsViewModal::class.java)){
            return AccountsViewModal(customer, app) as T
        }

        throw IllegalArgumentException("Unknown view modal class AccountsViewModalFactory")
    }
}