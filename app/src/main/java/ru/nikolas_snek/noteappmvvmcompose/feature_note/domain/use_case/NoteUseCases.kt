package ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.use_case

import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.use_case.AddNote
import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.use_case.DeleteNote
import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.use_case.GetNote
import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.use_case.GetNotes

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
