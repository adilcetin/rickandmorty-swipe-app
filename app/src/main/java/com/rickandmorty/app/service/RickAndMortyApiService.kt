package com.rickandmorty.app.service

import com.rickandmorty.app.model.CharacterResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RickAndMortyApiService {

    @GET("character")
    fun getCharacters(@Query("page") page: Int): Call<CharacterResponse>
}