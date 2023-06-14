package com.example.mviarchitecture.di.module

import com.example.mviarchitecture.data.api.ApiHelperImpl
import com.example.mviarchitecture.data.repository.MainRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ApiHelperModule {

    //
    @Binds
    abstract fun bindRepo(impl: ApiHelperImpl): MainRepository
}