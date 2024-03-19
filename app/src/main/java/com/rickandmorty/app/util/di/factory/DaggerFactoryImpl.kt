package com.rickandmorty.app.util.di.factory

import com.rickandmorty.app.App
import com.rickandmorty.app.util.di.component.ActivityComponent
import com.rickandmorty.app.util.di.component.ContractComponent
import com.rickandmorty.app.util.di.component.DaggerActivityComponent
import com.rickandmorty.app.util.di.component.DaggerContractComponent
import com.rickandmorty.app.util.di.module.ActivityModule

class DaggerFactoryImpl: DaggerFactory {

    private var activityComponent: ActivityComponent? = null
    private var contractComponent: ContractComponent? = null

    override fun createActivityComponent(): ActivityComponent {
        activityComponent ?: run {
            activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule())
                .contractComponent(contractComponent)
                .build()
        }

        return activityComponent!!
    }

    override fun createContactComponent(app: App): ContractComponent {
        contractComponent = DaggerContractComponent.create()
        return contractComponent!!
    }
}