package com.example.githubbrowser.adapter

import android.view.View
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
            
        }




    }
}