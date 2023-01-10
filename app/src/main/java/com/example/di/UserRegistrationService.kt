package com.example.di

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService) {

    // This implementation violate the all below mentioned points, to overcome this issue
    // we'll used constructor injection (Manual Dependency Injection)
    //private val userRepository = UserRepository() // Class Object
    //private val emailService = EmailService()

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email, password)
        notificationService.send(email,"no-reply@usama.com","User Registered")
    }
}

/*
    * Unit testing
    * Single Responsibility
    * Lifetime of these objects
    * Extensible
*/