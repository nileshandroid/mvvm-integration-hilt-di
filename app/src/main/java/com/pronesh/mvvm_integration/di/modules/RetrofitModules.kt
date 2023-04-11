package com.pronesh.mvvm_integration.di.modules

import com.pronesh.mvvm_integration.di.network.ApiServices
import com.pronesh.mvvm_integration.di.network.WebConstant.baseURL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Nilesh Salunkhe on 11-04-2023.
 */
@Module
@InstallIn(SingletonComponent::class)
object RetrofitModules {

    @Provides
    fun provideBaseURL() = baseURL

    @Provides
    @Singleton
    fun provideRetrofitInstance(okHttpClient: OkHttpClient, baseUrl: String) = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder().build()

    @Provides
    @Singleton
    fun provideApiServices(retrofit: Retrofit):ApiServices= retrofit.create(ApiServices::class.java)
}