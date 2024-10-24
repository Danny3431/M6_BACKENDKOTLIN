package cl.bootcamp.m6_backendkotlin.repository

import cl.bootcamp.m6_backendkotlin.model.Contact
import cl.bootcamp.m6_backendkotlin.room.ContactDao
import javax.inject.Inject

class ContactRepository @Inject constructor(
    private val contactDao: ContactDao
) {

    val allContacts = contactDao.getAllContacts()

    suspend fun insert(contact: Contact) {
        contactDao.insert(contact)
    }

    suspend fun update(contact: Contact) {
        contactDao.update(contact)
    }

    suspend fun delete(contact: Contact) {
        contactDao.delete(contact)
    }
}