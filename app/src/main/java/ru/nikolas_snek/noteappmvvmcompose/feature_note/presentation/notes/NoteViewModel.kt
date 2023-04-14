package ru.nikolas_snek.noteappmvvmcompose.feature_note.presentation.notes

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.nikolas_snek.noteappmvvmcompose.feature_note.domain.use_case.NoteUseCases
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
) : ViewModel() {
}