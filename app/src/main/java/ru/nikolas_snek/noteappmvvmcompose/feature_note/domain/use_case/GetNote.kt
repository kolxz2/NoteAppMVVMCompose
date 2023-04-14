package ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.use_case

import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.model.Note
import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}