package com.rickandmorty.app.util.di.component

import com.rickandmorty.app.App
import com.rickandmorty.app.util.di.annotation.ContractScope
import com.rickandmorty.app.util.di.module.ContractModule
import dagger.Component


@ContractScope
@Component(modules = [ContractModule::class])
interface ContractComponent {
    fun inject(app: App)
}