package cl.bootcamp.m6_backendkotlin.room


import androidx.room.*
import cl.bootcamp.m6_backendkotlin.model.Contact
import kotlinx.coroutines.flow.Flow
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ContactDao {
    //CRUD

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(contact: Contact): Long

    @Update
    suspend fun update(contact: Contact): Int

    @Delete
    suspend fun delete(contact: Contact): Int

    @Query("SELECT * FROM contacts WHERE id = :contactId")
    fun getContactById(contactId: Int): Flow<Contact?>

    @Query("SELECT * FROM contacts ORDER BY id ASC")
    fun getAllContacts(): Flow<List<Contact>>
}