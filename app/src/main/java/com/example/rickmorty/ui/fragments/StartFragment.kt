package com.example.rickmorty.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.rickmorty.databinding.FragmentStartBinding
import com.example.rickmorty.utilits.Api
import com.example.rickmorty.utilits.Person
import com.example.rickmorty.utilits.ToastPrint
import kotlinx.coroutines.runBlocking

class StartFragment : Fragment() {
    private lateinit var binding: FragmentStartBinding
    private lateinit var person: Person
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        this.binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //simpleCase()
        load()
        binding.namePerson.text = person.name
//        binding.imagePerson.load

    }

    fun load() = runBlocking<Unit> {
        var api = Api()
        person = api.loadPage("https://rickandmortyapi.com/api/character/69")
        ToastPrint(person.name)
    }
}
