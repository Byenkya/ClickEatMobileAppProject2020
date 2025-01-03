package com.clickEat.ug.screens.home

import androidx.lifecycle.ViewModel

class Categories(val category: String){}

class HomeFragmentViewModel : ViewModel(){

    var categories = listOf<String>("Drinks", "Food")

}