package com.pronesh.mvvm_integration.di.modules

import com.pronesh.mvvm_integration.repository.LoginRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by Nilesh Salunkhe on 08-04-2023.
 */
@Module
@InstallIn(SingletonComponent::class)
object RepositoryProvider {

    @Provides
    fun provideLoginRepository(): LoginRepository= LoginRepository()
}