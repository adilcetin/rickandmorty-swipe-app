package com.rickandmorty.app.view.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rickandmorty.app.R
import com.rickandmorty.app.presenter.main.MainPresenter
import com.rickandmorty.app.util.di.component.DaggerActivityComponent
import com.rickandmorty.app.util.di.factory.FactoryCreator
import javax.inject.Inject

class MainActivity : AppCompatActivity(), IMainView {

    @Inject lateinit var presenter: MainPresenter<IMainView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        FactoryCreator.createDaggerFactory().createActivityComponent().inject(this)

        presenter.onAttach(this)
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun showToastMessage(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}