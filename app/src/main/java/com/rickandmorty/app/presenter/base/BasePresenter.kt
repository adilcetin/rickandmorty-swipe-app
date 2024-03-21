package com.rickandmorty.app.presenter.base

import com.rickandmorty.app.view.base.IBaseView

interface BasePresenter<V: IBaseView> {

    fun onAttach(mvpView: V)

    fun isAttached(): Boolean

    fun onDetach()
}