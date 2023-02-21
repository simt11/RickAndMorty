package com.example.rickmorty.utilits

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class Api {
    val client = HttpClient(CIO){
        install(ContentNegotiation){
            json(Json{
                ignoreUnknownKeys = true
            })
        }
    }
    suspend fun loadPerson(id: Long): Person =
        client.get("https://rickandmortyapi.com/api/character/$id").body()

    suspend fun loadPage(url: String): Person = client.get(url).body()
}