package dimaster.app.hiltdepinj.dep_inj

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dimaster.app.hiltdepinj.network.RetroInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

//1 class
@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    val BASE_URL = "https://api.github.com/search/"

    @Provides
    @Singleton
    fun getRetroInterface(retrofit: Retrofit): RetroInterface {
        return retrofit.create(RetroInterface::class.java)
    }
    @Provides
    @Singleton
    fun getRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}