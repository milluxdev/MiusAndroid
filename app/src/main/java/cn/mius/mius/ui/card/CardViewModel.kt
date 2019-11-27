package cn.mius.mius.ui.card

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Card Search Fragment"
    }
    val text: LiveData<String> = _text
}