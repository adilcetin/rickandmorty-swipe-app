package com.rickandmorty.app.presenter.main

import android.util.Log
import com.rickandmorty.app.contract.RickMortyContract
import com.rickandmorty.app.model.CharacterResponse
import com.rickandmorty.app.presenter.base.BasePresenterImpl
import com.rickandmorty.app.view.main.IMainView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenterImpl<V : IMainView>(private val rickMortyContract: RickMortyContract): MainPresenter<V>, BasePresenterImpl<V>() {
    private val TAG = "MainPresenterImpl"

    override fun loadCharacters() {

        rickMortyContract.getNextCharacters().enqueue(object : Callback<CharacterResponse> {
            override fun onResponse(call: Call<CharacterResponse>, response: Response<CharacterResponse>) {
                if (response.isSuccessful) {
                    val characterResponse = response.body()
                    characterResponse?.let {

                    }
                }
            }

            override fun onFailure(call: Call<CharacterResponse>, t: Throwable) {
                Log.e(TAG, t.message, t)
                mvpView?.showToastMessage(t.message)
            }
        })
    }
}