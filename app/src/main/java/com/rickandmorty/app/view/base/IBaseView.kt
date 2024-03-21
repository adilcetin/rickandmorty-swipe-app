package com.rickandmorty.app.view.base

interface IBaseView {

    /**
     * Show progress dialog
     */
    fun showLoading()

    /**
     * Hide progress dialog
     */
    fun hideLoading()

    /**
     * Show toast message
     * @param message
     */
    fun showToastMessage(message: String?)
}