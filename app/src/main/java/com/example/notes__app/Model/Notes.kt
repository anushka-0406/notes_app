package com.example.notes__app.Model

import android.text.Editable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "Notes")
class Notes(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    var title: String,
    var subTitle:String,
    var date: String,
    var notes: String,
    var priority: String

)