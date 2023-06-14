package com.example.mviarchitecture.data.api

import com.example.mviarchitecture.data.model.User
import retrofit2.http.GET
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService): ApiHelper{
    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }

}