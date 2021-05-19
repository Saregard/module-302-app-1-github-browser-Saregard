package com.example.githubbrowser.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.githubbrowser.R
import com.example.githubbrowser.model.Repository

class RepositoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repository)

        val listOfRepos = intent?.getParcelableArrayListExtra<Repository>(KEY_REPOSITORY_DATA)
        listOfRepos?.let {
            val numberOfRepositories = it.size

            val textViewNumbersOfRepos = findViewById<TextView>(R.id.textViewNumberOfRepos)
            textViewNumbersOfRepos?.text =
        }
    }
    companion object{
        const val KEY_REPOSITORY_DATA = "keyRepositoryData"
    }
}