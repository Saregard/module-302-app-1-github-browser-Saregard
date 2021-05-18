package com.example.githubbrowser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), TextView.OnEditorActionListener {

    private var editTextUsername: EditText? = null
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextUsername = findViewById(R.id.editTextUsername)
        progressBar = findViewById(R.id.progressBar)

        editTextUsername?.setOnEditorActionListener(this)

    }

    override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
        return if (v == editTextUsername) {

            val username = editTextUsername?.text?.trim().toString()

            if(username.isEmpty() || username.isBlank()) {
                editTextUsername?.error = getString(R.string.username_cannot_be_empty)
            }else {
                progressBar?.visibility = View.VISIBLE
                getRepositoriesForUsername(username)
            }
            true
        } else {
            false
        }
    }

    private fun getRepositoriesForUsername(username: String){

    }
}