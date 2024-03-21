package com.rickandmorty.app.presenter.main

import com.rickandmorty.app.presenter.base.BasePresenter
import com.rickandmorty.app.view.main.IMainView

interface MainPresenter<V: IMainView> : BasePresenter<V> {

    fun loadCharacters()
}