package cn.mius.mius.ui.deck

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DeckViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Deck Fragment"
    }
    val text: LiveData<String> = _text
}