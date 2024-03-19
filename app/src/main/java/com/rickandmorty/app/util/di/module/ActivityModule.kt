package com.rickandmorty.app.util.di.module

import com.rickandmorty.app.presenter.main.MainPresenter
import com.rickandmorty.app.presenter.main.MainPresenterImpl
import com.rickandmorty.app.util.di.annotation.ActivityScope
import com.rickandmorty.app.view.main.IMainView
import dagger.Module
import dagger.Provides

@Module
class ActivityModule() {

    @Provides
    @ActivityScope
    fun provideMainPresenter(): MainPresenter<IMainView> {
        return MainPresenterImpl<IMainView>();
    }
}