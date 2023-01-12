package dimaster.app.hiltdepinj.network

import dimaster.app.hiltdepinj.model.RepositoriesList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//2 cl
interface RetroInterface {
    @GET("repositories")
    fun getDataFromApi(@Query("q")query: String): Call<RepositoriesList>
}