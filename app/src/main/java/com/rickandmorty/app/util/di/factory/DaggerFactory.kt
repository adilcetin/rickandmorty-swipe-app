package com.rickandmorty.app.util.di.factory

import android.app.Activity
import com.rickandmorty.app.App
import com.rickandmorty.app.util.di.component.ActivityComponent
import com.rickandmorty.app.util.di.component.ContractComponent

interface DaggerFactory {

    fun createActivityComponent(): ActivityComponent

    fun createContactComponent(app: App): ContractComponent
}