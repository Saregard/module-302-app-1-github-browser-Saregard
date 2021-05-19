package com.example.githubbrowser.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.githubbrowser.R
import com.example.githubbrowser.model.Repository
import kotlinx.android.synthetic.main.layout_recycler_view_repository.view.*

class RepositoryRecyclerViewAdapter {



    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        private var textViewRepoName = view.findViewById<TextView>(R.id.textViewRepoName)
        private var textViewPrivacy = view.findViewById<TextView>(R.id.textViewPrivacy)
        private var textViewLicence = view.findViewById<TextView>(R.id.textViewLicence)

        fun bind (repository: Repository) {
            textViewRepoName?.text = repository.name
            textViewLicence?.text = repository.license
            val privacyType = when(repository.private){
                true -> R.string.private_repo
                else -> R.string.public_repo
            }
            textViewPrivacy?.setText(privacyType)
        }

        companion object {
            fun create(parent: ViewGroup): ViewHolder {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.layout_recycler_view_repository, parent, false)
                return ViewHolder(view)
            }
        }



    }
}