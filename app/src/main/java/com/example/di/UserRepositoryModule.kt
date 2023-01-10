package com.example.di

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {
    @Provides
    fun getFirebaseRepository(): UserRepository{
        return FirebaseRepository()
    }
}