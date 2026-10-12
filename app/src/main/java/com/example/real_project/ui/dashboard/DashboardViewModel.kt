package com.example.real_project.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "여기는 글쓰기 공간입니다."
    }
    val text: LiveData<String> = _text
}