package com.example.pertemuan4

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pertemuan4.data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("")
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var emaill: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    var statuss: String by mutableStateOf("")
        private set
    var alamt: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, eml: String, jk: String, sts: String, alm: String){
        namaUsr = nm;
        noTlp = tlp;
        emaill = eml;
        jenisKl = jk;
        statuss = sts;
        alamt = alm;
    }
    fun setStatus(pilihStatus: String){
        _uiState.update { currentState -> currentState.copy(status = pilihStatus) }
    }
    fun setJenis(pilihJk: String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJk) }
    }



}