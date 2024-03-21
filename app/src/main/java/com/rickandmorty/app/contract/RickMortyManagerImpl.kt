package com.rickandmorty.app.contract

import com.rickandmorty.app.model.CharacterResponse
import com.rickandmorty.app.service.RickAndMortyApiService
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RickMortyManagerImpl: RickMortyContract {

    private val apiAddress = "https://rickandmortyapi.com/api/"
    private lateinit var service: RickAndMortyApiService
    private var currentPage = 0

    init {
        // Initialize api service
        val retrofit = Retrofit.Builder()
            .baseUrl(apiAddress)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(RickAndMortyApiService::class.java)
    }

    override fun getNextCharacters(): Call<CharacterResponse> {
        if(this::service.isInitialized) {
            currentPage++
            return service.getCharacters(currentPage)
        }
        throw java.lang.Exception("Rick and Morty Api Service Connection Problem!")
    }

    override fun getPreviousCharacters(): Call<CharacterResponse> {
        if(this::service.isInitialized) {
            currentPage = if (currentPage <= 2) 1 else currentPage - 1
            return service.getCharacters(currentPage)
        }
        throw java.lang.Exception("Rick and Morty Api Service Connection Problem!")
    }

    override fun getCurrentPage(): Int {
        return currentPage
    }
}