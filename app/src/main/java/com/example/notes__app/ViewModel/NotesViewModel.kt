package com.example.notes__app.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.notes__app.Database.NotesDatabase
import com.example.notes__app.Model.Notes
import com.example.notes__app.Repository.NotesRepository

class NotesViewModel(application:Application):AndroidViewModel(application){
    val repository: NotesRepository
    init {
        val dao= NotesDatabase.getDatabaseInstance(application).myNotesDao()
        repository=NotesRepository(dao)
    }

    fun addNotes(notes: Notes){
        repository.insertNotes(notes)
    }
    fun getNotes():LiveData<List<Notes>> = repository.getAllNotes()
    fun deleteNotes(id:Int){
        repository.deleteNotes(id)
    }
    fun updateNotes(notes: Notes)
    {
        repository.updateNotes(notes)
    }
}