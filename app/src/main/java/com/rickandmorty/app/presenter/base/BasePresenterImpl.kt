package com.rickandmorty.app.presenter.base

import com.rickandmorty.app.view.base.IBaseView

open class BasePresenterImpl<V: IBaseView>: BasePresenter<V> {

    var mvpView: IBaseView? = null

    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }

    override fun isAttached(): Boolean {
       return mvpView != null
    }

    override fun onDetach() {
        this.mvpView = null
    }
}