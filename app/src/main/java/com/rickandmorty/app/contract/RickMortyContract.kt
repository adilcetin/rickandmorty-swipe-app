package com.rickandmorty.app.contract

import com.rickandmorty.app.model.CharacterResponse
import retrofit2.Call

interface RickMortyContract {
    fun getNextCharacters(): Call<CharacterResponse>
    fun getPreviousCharacters(): Call<CharacterResponse>
    fun getCurrentPage(): Int
}