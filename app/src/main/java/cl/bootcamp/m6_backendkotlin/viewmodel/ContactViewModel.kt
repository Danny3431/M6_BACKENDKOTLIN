package cl.bootcamp.m6_backendkotlin.viewmodel

import androidx.lifecycle.*
import cl.bootcamp.m6_backendkotlin.model.Contact
import cl.bootcamp.m6_backendkotlin.repository.ContactRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactViewModel @Inject constructor(
    private val repository: ContactRepository

) : ViewModel() {

    val allContacts: Flow<List<Contact>> = repository.allContacts

    fun insert(contact: Contact) = viewModelScope.launch {
        repository.insert(contact)
    }

    fun getContactById(contactId: Int): Flow<Contact?> {
        return repository.getContactById(contactId) ?: flowOf(null)
    }

    fun update(contact: Contact) = viewModelScope.launch {
        repository.update(contact)
    }

    fun delete(contact: Contact) = viewModelScope.launch {
        repository.delete(contact)
    }
}