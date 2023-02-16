package com.example.rickmorty.utilits

import kotlinx.serialization.Serializable

@Serializable
class Person(
    val id: Int,
    val name: String,
    val status: Status,
    val species: String,
    val type: String,
    val gender: Gender,
//    val origin: ObjLocal,
//    val location: ObjLocal,
    val image: String,
    val episode: Array<String>,
    val url: String,
    val created: String,
) {
    enum class Gender {
        Female, Male, Genderless, unknown
    }
    enum class Status {
        Alive, Dead, unknown
    }
}
