package com.example.di

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor(): UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d(TAG,"User saved in db")
    }
}

class FirebaseRepository: UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User saved in firebase db")
    }

}