package com.example.di

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {

    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int): NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService{
        return emailService
    }
}