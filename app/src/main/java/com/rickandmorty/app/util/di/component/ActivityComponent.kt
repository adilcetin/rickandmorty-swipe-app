package com.rickandmorty.app.util.di.component

import com.rickandmorty.app.util.di.annotation.ActivityScope
import com.rickandmorty.app.util.di.module.ActivityModule
import com.rickandmorty.app.view.main.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ContractComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}