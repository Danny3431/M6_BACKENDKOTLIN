package cl.bootcamp.m6_backendkotlin.di

import android.content.Context

import androidx.room.Room
import cl.bootcamp.m6_backendkotlin.room.ContactDatabase
import cl.bootcamp.m6_backendkotlin.room.ContactDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideContactDatabase(@ApplicationContext context: Context): ContactDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            ContactDatabase::class.java,
            "contact_database"
        ).build()
    }

    @Provides
    fun provideContactDao(database: ContactDatabase): ContactDao {
        return database.contactDao()
    }
}