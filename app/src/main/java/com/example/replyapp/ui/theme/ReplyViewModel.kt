package com.example.replyapp.ui.theme

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import com.example.replyapp.ReplyUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


class ReplyViewModel: ViewModel() {
    private val _replyUiState  = MutableStateFlow(ReplyUiState())
    val replyUiState : StateFlow<ReplyUiState> = _replyUiState

    init{

    }
    private fun initializeUIState(){

    }
}