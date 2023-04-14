package ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.use_case

import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.model.Note
import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        noteRepository.deleteNote(note)
    }
}