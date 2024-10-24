package cl.bootcamp.m6_backendkotlin.room

import androidx.lifecycle.LiveData
import androidx.room.*
import cl.bootcamp.m6_backendkotlin.model.Contact

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(contact: Contact)

    @Update
    suspend fun update(contact: Contact)

    @Delete
    suspend fun delete(contact: Contact)

    @Query("SELECT * FROM contacts ORDER BY nombre ASC")
    fun getAllContacts(): LiveData<List<Contact>>
}