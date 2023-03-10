package com.example.di

class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService:EmailService) {

    // This implementation violate the all below mentioned points, to overcome this issue
    // we'll used constructor injection (Manual Dependency Injection)
    //private val userRepository = UserRepository() // Class Object
    //private val emailService = EmailService()

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email, password)
        emailService.send(email,"no-reply@usama.com","User Registered")
    }
}

/*
    * Unit testing
    * Single Responsibility
    * Lifetime of these objects
    * Extensible
*/