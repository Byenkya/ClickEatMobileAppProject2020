package com.clickEat.ug

import android.app.AlertDialog
import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.content.res.ResourcesCompat
import androidx.core.text.HtmlCompat
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.clickEat.ug.data.SearchString
import com.clickEat.ug.database.AppDataBase
import com.clickEat.ug.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.UpdateAvailability
import kotlinx.android.synthetic.main.calltoorder.view.*
import kotlinx.android.synthetic.main.click_eat_image.view.*

class MainActivity : AppCompatActivity() {
    private  lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityModelFactory
    private lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val toolbar = binding.toolbar
        toolbar.background.alpha = 0
        setSupportActionBar(toolbar) // set the toolbar
        drawerLayout = binding.drawerLayout
        navView = binding.navView
        navController = findNavController(R.id.myNavHostFragment)
        appBarConfiguration = AppBarConfiguration(
                setOf(
                        R.id.login,
                        R.id.mainFragment,
                        R.id.menuFragment,
                        R.id.ordersFragment,
                        R.id.accountFragment,
                        R.id.myStepperFragment
                ),
                drawerLayout
        )
        setupActionBarWithNavController( navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        //MainActivityModelView
        val application = requireNotNull(application)
        val database = AppDataBase.getInstance(application).databaseDao
        viewModelFactory = MainActivityModelFactory(database, application)

        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        viewModel.cartSize.observe(this, Observer {
            if(null != it){
                if(it > 0){
                    val badge = binding.bottomNav.getOrCreateBadge(R.id.cart_item)
                    badge.number = it
                }else{
                    binding.bottomNav.removeBadge(R.id.cart_item)
                }

            }
        })

        binding.bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.home_menu -> {
                    navController.navigate(R.id.mainFragment)
                    true
                }

                R.id.order_item -> {
                    navController.navigate(R.id.ordersFragment)
                    true
                }

                R.id.restaurant_item -> {
                    navController.navigate(R.id.resturantsFragment)
                    true
                }

                R.id.drinks_item -> {
                    navController.navigate(R.id.drinksFragment)
                    true
                }

                R.id.cart_item -> {
                    navController.navigate(R.id.myStepperFragment)
                    true
                }


                else -> false

            }

        }

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when(destination.id){
                R.id.signUp-> {
                    binding.bottomNav.visibility = View.GONE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.login-> {
                    viewModel.deleteCustomer()
                    binding.bottomNav.visibility = View.GONE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.checkoutFragment-> {
                    binding.bottomNav.visibility = View.GONE
                }

                R.id.menuFragment-> {
                    binding.bottomNav.visibility = View.VISIBLE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.mainFragment-> {
                    binding.bottomNav.visibility = View.VISIBLE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.homeFragment-> {
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.cartFragment-> {
                    binding.bottomNav.visibility = View.GONE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }


                R.id.ordersFragment-> {
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.commentFragment-> {
                    binding.bottomNav.visibility = View.GONE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.rateFragment-> {
                    binding.bottomNav.visibility = View.VISIBLE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.accountFragment-> {
                    binding.bottomNav.visibility = View.VISIBLE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.drinksFragment-> {
                    binding.bottomNav.visibility = View.VISIBLE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.listDrinksFragment-> {
                    binding.bottomNav.visibility = View.VISIBLE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.subCatProductsFragment-> {
                    binding.bottomNav.visibility = View.VISIBLE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                R.id.myStepperFragment-> {
                    binding.bottomNav.visibility = View.GONE
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                }

                else -> {
                    drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                }
            }
        }

        navView.setNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.signup-> {
                    navController.navigate(R.id.signUp)
                    true
                }

                R.id.signin-> {
                    navController.navigate(R.id.login)
                    true
                }

                R.id.cart-> {
                    viewModel.currentUser.observe(this, Observer {
                        if(it.names != "click_it" && it.email != "welcome to click it App"){
                            navController.navigate(R.id.myStepperFragment)

                        }
                    })
                    true
                }

                R.id.orders-> {
                    viewModel.currentUser.observe(this, Observer {
                        if(it.names != "click_it" && it.email !="welcome to click it App" ){
                            navController.navigate(R.id.ordersFragment)
                        }
                    })
                    true
                }

                R.id.account-> {
                    viewModel.currentUser.observe(this, Observer {
                        if(it.names != "click_it" && it.email !="welcome to click it App" ){
                            navController.navigate(R.id.accountFragment)
                        }
                    })
                    true
                }

                R.id.cat-> {
                    navController.navigate(R.id.homeFragment)
                    true
                }

                R.id.mainFragment-> {
                    when(navController.currentDestination?.id){
                        R.id.mainFragment-> {
                            drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
                        }

                        else-> navController.navigate(R.id.mainFragment)
                    }

                    true
                }

                else -> {
                    true
                }
            }
        }

        viewModel.currentUser.observe(this, Observer {
            if(it.names != "click_it" && it.email !="welcome to click it App" ){
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    val drawable = ResourcesCompat.getDrawable(resources,R.drawable.ic_baseline_power_settings_new_24, null)
                    binding.navView.menu.findItem(R.id.signin).icon = drawable
                }

                binding.navView.menu.findItem(R.id.signin).title = "Logout"
                binding.navView.menu.findItem(R.id.signup).isVisible = false
                binding.navView.menu.findItem(R.id.orders).isVisible = true
                binding.navView.menu.findItem(R.id.account).isVisible = true
                binding.navView.menu.findItem(R.id.cart).isVisible = true
                binding.navView.findViewById<LinearLayout>(R.id.headerLayout)?.user_name?.text = it.names
                binding.navView.findViewById<LinearLayout>(R.id.headerLayout)?.current_user_contact?.text = it.contact
            }else{
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    val drawable = ResourcesCompat.getDrawable(resources,R.drawable.ic_baseline_login_24, null)
                    binding.navView.menu.findItem(R.id.signin).icon = drawable
                }
                binding.bottomNav.removeBadge(R.id.cart_item)
                binding.navView.findViewById<LinearLayout>(R.id.headerLayout)?.user_name?.text = "ClickEat"
                binding.navView.findViewById<LinearLayout>(R.id.headerLayout)?.current_user_contact?.text = "Scrumptious Delicacies At Your Luxury"
                binding.navView.menu.findItem(R.id.signin).title = "Signin"

                binding.navView.menu.findItem(R.id.signup).isVisible = true
                binding.navView.menu.findItem(R.id.orders).isVisible = false
                binding.navView.menu.findItem(R.id.account).isVisible = false
                binding.navView.menu.findItem(R.id.orders).isVisible = false
                binding.navView.menu.findItem(R.id.cart).isVisible = false

            }
        })

        handleIntent(intent)
        checkClickEatAppUpdate()

    }

    private fun loginError() {
        val builder = AlertDialog.Builder(binding.root.context)
        builder.setTitle("Alert")
        builder.setIcon(R.drawable.ic_baseline_error_outline_24)
        builder.setMessage("Please signIn to view Cart items!.")
        navController.navigate(R.id.login)
        builder.setNegativeButton(
                HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
        ) { dialogInterface, _ -> dialogInterface.cancel() }

        builder.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.settings, menu)

        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (menu!!.findItem(R.id.app_bar_search).actionView as SearchView).apply {
            setSearchableInfo(searchManager.getSearchableInfo(componentName))
            setIconifiedByDefault(true)
            isQueryRefinementEnabled = true
            isSubmitButtonEnabled = true
        }

        return true
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        setIntent(intent)
        handleIntent(intent!!)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.aboutClickEat -> {
                val builder = AlertDialog.Builder(binding.root.context)
                builder.setTitle("About Us")
                builder.setIcon(R.drawable.ic_baseline_info_24)
                builder.setMessage(R.string.about_click_eat_desc)
                builder.setNegativeButton(
                        HtmlCompat.fromHtml("<font color='#FF5722'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)
                ) { dialogInterface, _ -> dialogInterface.cancel() }

                builder.show()
                true
            }

            R.id.shareAppID -> {
                val sendIntent = Intent()
                sendIntent.action = Intent.ACTION_SEND
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Hey check out clickEat app at: https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID)
                sendIntent.type = "text/plain"
                startActivity(sendIntent)
                true
            }

            R.id.callOrder -> {
                val mDialogView = LayoutInflater.from(binding.root.context).inflate(R.layout.calltoorder, null)
                var id = mDialogView.orderNumbers.orderNumber1.id
                mDialogView.orderNumbers.check(id)
                val mBuilder = androidx.appcompat.app.AlertDialog.Builder(binding.root.context)
                    .setView(mDialogView)
                    .setTitle("Call to Order")
                mBuilder.setNegativeButton(HtmlCompat.fromHtml("<font color='#FF7F27'>Cancel</font>", HtmlCompat.FROM_HTML_MODE_COMPACT))
                {dialogInterface, _ ->  dialogInterface.cancel()}
                mBuilder.setPositiveButton(HtmlCompat.fromHtml("<font color='#FF7F27'>Call</font>", HtmlCompat.FROM_HTML_MODE_COMPACT)){dialog, _ ->
                    id = mDialogView.orderNumbers.checkedRadioButtonId
                    val contact = mDialogView.orderNumbers.findViewById<RadioButton>(id).text.toString()
                    val intent = Intent(Intent.ACTION_DIAL)
                    intent.data = Uri.parse("tel:$contact")
                    startActivity(intent)
                    dialog.dismiss()
                }

                mBuilder.show()


                true
            }

            R.id.clickEatCategories -> {
                navController.navigate(R.id.homeFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onBackPressed() {
        if(navController.currentDestination?.id == R.id.login){
            navController.navigate(R.id.mainFragment)
        }else if(navController.currentDestination?.id == R.id.mainFragment){
            moveTaskToBack(true)
            kotlin.system.exitProcess(-1)
        }

        when{
            drawerLayout.isDrawerOpen(GravityCompat.START) ->{
                drawerLayout.closeDrawer(GravityCompat.START)
            }
            else ->super.onBackPressed()
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.myNavHostFragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


    private fun handleIntent(intent: Intent){
        if(Intent.ACTION_SEARCH == intent.action){
            intent.getStringExtra(SearchManager.QUERY)?.also { query ->
                SearchString.searchTerm = query
                navController.navigate(R.id.searchFragment)
            }
        }
    }

    private fun checkClickEatAppUpdate() {
        val appUpdateManager = AppUpdateManagerFactory.create(applicationContext)
        val appUpdateInfo = appUpdateManager.appUpdateInfo
        appUpdateInfo.addOnSuccessListener {
            if (it.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE && it.isUpdateTypeAllowed(
                            AppUpdateType.IMMEDIATE
                    )
            ){
                appUpdateManager.startUpdateFlowForResult(
                        it,
                        AppUpdateType.IMMEDIATE,
                        this,
                        100
                )
            }
        }
    }



}


