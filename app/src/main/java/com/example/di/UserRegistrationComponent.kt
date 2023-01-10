package com.example.di

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService
    fun getEmailService(): EmailService
}