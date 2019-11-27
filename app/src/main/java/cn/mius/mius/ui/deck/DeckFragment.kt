package cn.mius.mius.ui.deck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cn.mius.mius.R

class DeckFragment : Fragment() {

    private lateinit var deckViewModel: DeckViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        deckViewModel =
            ViewModelProviders.of(this).get(DeckViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_deck, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        deckViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}