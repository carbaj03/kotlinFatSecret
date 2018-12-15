package com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search

import android.os.Bundle
import android.support.annotation.VisibleForTesting
import android.support.v4.view.MenuItemCompat
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.SearchView
import android.util.Log
import android.view.*
import com.acv.kotlin_fat_secret.R
import com.acv.kotlin_fat_secret.domain.FoodSearch
import com.acv.kotlin_fat_secret.infraestructure.di.ApplicationComponent
import com.acv.kotlin_fat_secret.infraestructure.di.subcomponent.food.SearchFoodFragmentModule
import com.acv.kotlin_fat_secret.infraestructure.ui.common.BaseFragment
import com.acv.kotlin_fat_secret.infraestructure.ui.main.food.search.adapter.SearchFoodAdapter
import com.acv.kotlin_fat_secret.infraestructure.ui.main.weight.adapter.WeightAdapter
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx
import org.jetbrains.anko.support.v4.find
import javax.inject.Inject

class SearchFoodFragment : BaseFragment(), SearchFoodView {

    companion object {
        fun newInstance(): SearchFoodFragment = SearchFoodFragment()
    }

    val swipe by lazy { find<SwipeRefreshLayout>(R.id.swipe_refresh) }

    @Inject
    lateinit var adapter: SearchFoodAdapter

    @Inject @VisibleForTesting
    lateinit var presenter: SearchFoodPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?)
            : View? = SearchFoodFragmentUI(adapter).createView(AnkoContext.create(ctx, this))

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.searchFood("papa")
        swipe.setOnRefreshListener { presenter.searchFood("pollo") }
    }

    override fun injectDependencies(applicationComponent: ApplicationComponent)
            = applicationComponent.plus(SearchFoodFragmentModule(this)).injectTo(this)

    override fun showFoods(foods: List<FoodSearch>) {
        adapter.items = foods
        adapter.notifyDataSetChanged()
    }

    override fun showLoading() {
        swipe.isRefreshing = true
    }

    override fun hideLoading() {
        swipe.isRefreshing = false
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        Log.e("create", "ee")
        inflater?.apply { inflate(R.menu.search, menu) }
        val searchItem = menu?.findItem(R.id.action_search)
        val searchView = MenuItemCompat.getActionView(searchItem) as SearchView
        characterSearch(searchView)
        super.onCreateOptionsMenu(menu, inflater)
    }

    fun characterSearch(searchView: SearchView) {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean = false
            override fun onQueryTextChange(newText: String): Boolean = false
        })
    }
}


