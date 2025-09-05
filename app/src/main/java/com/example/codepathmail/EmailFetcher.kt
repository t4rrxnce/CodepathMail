package com.example.codepathmail

class EmailFetcher {
    companion object {
        val senders = listOf(
            "Dahlia Cline","Kevin Miranda","Kaya Austin","Laila Calderon","Marquise Rhodes",
            "Fletcher Patel","Luz Barron","Kamren Dudley","Jairo Foster","Lilah Sandoval",
            "Ansley Blake","Slade Sawyer","Jaelyn Holmes","Phoenix Bright","Ernesto Gould"
        )

        private const val title = "Welcome to Kotlin!"
        private const val summary =
            "Welcome to the Android Kotlin Course! We're excited to have you. Here are some tips to get started."

        fun getEmails(): MutableList<Email> {
            val emails = mutableListOf<Email>()
            for (i in 0..9) emails += Email(senders[i], title, summary)
            return emails
        }

        fun getNext5Emails(): MutableList<Email> {
            val newEmails = mutableListOf<Email>()
            for (i in 10..14) newEmails += Email(senders[i], title, summary)
            return newEmails
        }
    }
}
