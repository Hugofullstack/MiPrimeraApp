package com.example.miprimeraapp.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("api/d5c1d0ae5bfffef31148060ec2b40d1c/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

    @GET("/api/d5c1d0ae5bfffef31148060ec2b40d1c/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId: String): Response<SuperHeroDetailResponse>

}