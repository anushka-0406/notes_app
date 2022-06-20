package com.example.notes__app.Repository

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import com.example.notes__app.Dao.NotesDao
import com.example.notes__app.Model.Notes

class NotesRepository(val dao: NotesDao) {

    fun getAllNotes():LiveData<List<Notes>>
    {
        return dao.getNotes()
    }

    fun insertNotes(notes: Notes){
        dao.insertNotes(notes)
    }

    fun deleteNotes(id:Int){
        dao.deleteNotes(id)
    }

    fun updateNotes(notes: Notes){
        dao.updateNotes(notes)
    }
}