package com.example.mviarchitecture.di.module

import com.example.mviarchitecture.data.api.ApiHelper
import com.example.mviarchitecture.data.api.ApiHelperImpl
import com.example.mviarchitecture.data.api.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(ActivityComponent::class)
object AppModule {
    private const val BASE_URL = "https://5e510330f2c0d300147c034c.mockapi.io/"

    @Provides
    fun provideApiService(): ApiService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(ApiService::class.java)

    @Provides
    fun provideApiHelper(apiHelperImpl: ApiHelperImpl): ApiHelper = apiHelperImpl

}