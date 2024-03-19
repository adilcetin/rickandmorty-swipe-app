package com.rickandmorty.app

import android.app.Application
import com.rickandmorty.app.util.di.component.ContractComponent
import com.rickandmorty.app.util.di.factory.FactoryCreator

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initializeInitInjector()
    }

    private fun initializeInitInjector() {
        val initComponent: ContractComponent = FactoryCreator.createDaggerFactory().createContactComponent(this)
        initComponent.inject(this)
    }
}