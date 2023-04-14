package ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.use_case

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.model.Note
import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.repository.NoteRepository
import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.util.NoteOrder
import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.util.OrderType

class GetNotesUseCase(
    private val repository: NoteRepository
) {
    operator fun invoke(noteOrder: NoteOrder = NoteOrder.Date(OrderType.Ascending)): Flow<List<Note>> {
        return repository.getNotes().map { note ->
            when (noteOrder.orderType) {
                is OrderType.Ascending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> note.sortedBy { it.title.lowercase() }
                        is NoteOrder.Date -> note.sortedBy { it.timestamp }
                        is NoteOrder.Color -> note.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when (noteOrder) {
                        is NoteOrder.Title -> note.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Date -> note.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> note.sortedByDescending { it.color }
                    }

                }
            }
        }

    }
}