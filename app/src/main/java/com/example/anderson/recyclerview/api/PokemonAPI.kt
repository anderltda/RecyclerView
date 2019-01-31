package com.example.anderson.recyclerview.api

import com.example.anderson.recyclerview.model.PokemonResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonAPI {

    @GET("/api/pokemon")
    fun buscar(@Query("size") size: Int) : Observable<PokemonResponse>
}