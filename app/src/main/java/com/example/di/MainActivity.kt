package com.example.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ----------Dagger Introduction-----------

        // Dagger 2 is framework to implement dependency injection, DI can implemented manually
        // Dagger is a fully static, compile-time dependency injection framework
        // Compile time checking is performed if Dagger can create the required objects
        // Annotation Based(then dagger can create code itself)
        //-------Dagger 2--------
        // Dagger will behave as a system for us to create required objects
        // Dagger will help us inject these objects
        // Dagger will manage the lifetime of the objects
        // Dagger will help us write manageable code

        //-------Concept---------
        // Consumer: consumes the object @Inject
        // Producer: produces the object @Module, @Provides, @Binds
        // Connector: bridge between consumer and producer @Component

        // Manual Dependency Injection Constructor injection and Field Injection

        // Dependency Injection with Dagger 2
        // We've to tell Dagger two points
        // 1. How the object created(We ask or request the component to create objects)
        // 2. How it's consume

        val component = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()
        userRegistrationService.registerUser("Usama@gmail.com","1111111")

    }
}