package by.kavalchuk.aliaksandr.videoapp.data.network

import by.kavalchuk.aliaksandr.videoapp.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/shows")
    suspend fun getAllMovies(): Response<List<Movies>>
}