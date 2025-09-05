package com.example.codepathmail

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var emails: MutableList<Email>
    private lateinit var adapter: EmailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)
        val btnLoadMore = findViewById<Button>(R.id.btnLoadMore)

        emails = EmailFetcher.getEmails()          // first 10
        adapter = EmailAdapter(emails)

        emailsRv.adapter = adapter
        val lm = LinearLayoutManager(this)
        emailsRv.layoutManager = lm

        // optional divider between rows
        emailsRv.addItemDecoration(DividerItemDecoration(this, lm.orientation))

        btnLoadMore.setOnClickListener {
            val more = EmailFetcher.getNext5Emails()
            val start = emails.size
            emails.addAll(more)
            adapter.notifyItemRangeInserted(start, more.size)

            // disable after one use (since we only have +5)
            btnLoadMore.isEnabled = false
            btnLoadMore.text = "No more emails"
        }
    }
}


