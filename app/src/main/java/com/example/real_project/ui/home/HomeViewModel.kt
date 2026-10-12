package com.example.real_project.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "안녕하세요 메인화면입니다."
    }
    val text: LiveData<String> = _text
}