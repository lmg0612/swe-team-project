 package com.example.real_project.ui.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "거래내역 공간입니다."
    }
    val text: LiveData<String> = _text
}
