package cl.bootcamp.m6_backendkotlin.viewmodel

import androidx.lifecycle.*
import cl.bootcamp.m6_backendkotlin.model.Contact
import cl.bootcamp.m6_backendkotlin.repository.ContactRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactViewModel @Inject constructor(
    private val repository: ContactRepository

) : ViewModel() {

    val allContacts: LiveData<List<Contact>> = repository.allContacts

    fun insert(contact: Contact) = viewModelScope.launch {
        repository.insert(contact)
    }

    fun update(contact: Contact) = viewModelScope.launch {
        repository.update(contact)
    }

    fun delete(contact: Contact) = viewModelScope.launch {
        repository.delete(contact)
    }
}