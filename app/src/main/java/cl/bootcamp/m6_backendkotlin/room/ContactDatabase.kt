package cl.bootcamp.m6_backendkotlin.room


import androidx.room.*
import androidx.room.RoomDatabase
import cl.bootcamp.m6_backendkotlin.model.Contact


@Database(entities = [Contact::class], version = 1)

abstract class ContactDatabase : RoomDatabase() {

    abstract fun contactDao(): ContactDao

}