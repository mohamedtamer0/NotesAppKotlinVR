package com.example.notesappkotlinvr.dao

import androidx.room.*
import com.example.notesappkotlinvr.enities.Notes


@Dao
interface NoteDao {

   @get:Query("SELECT * FROM notes ORDER BY id DESC")
    val allNotes: List<Notes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(notes: Notes)

    @Delete
    fun deleteNote(notes: Notes)

}