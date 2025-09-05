# CodepathMail

Unit 2 Lab: Simple Gmail Clone

## Overview
This project is a simple clone of the Gmail app built in Android Studio using **Kotlin**.  
The goal of this lab was to learn how to use **RecyclerView** to display a scrollable list of items, one of the most common UI patterns in mobile development.

---

## Required Features
The following **required features** are completed:

- [x] User can scroll through a list of **10 emails**
- [x] Each email displays the following:
  - Sender
  - Email title
  - Email summary

---

## Demo

| Main Screen |
|-------------|
| ![App Demo](demo.gif) |

https://github.com/t4rrxnce/CodepathMail/blob/d86d95083178211a43f4590d0daaf4a6ff4716c3/Untitled%20design%20(2).gif 

## Technical Details
- **RecyclerView** is used to efficiently display a scrollable list.
- `Email.kt`: Data model representing an email (sender, title, summary).
- `EmailFetcher.kt`: Provides 10 sample emails.
- `EmailAdapter.kt`: Custom adapter that binds each `Email` object into `email_item.xml`.
- `email_item.xml`: Layout file defining how a single email row looks.
- `activity_main.xml`: Contains the RecyclerView filling the screen.

---

## Resources
- [RecyclerView Guide (CodePath)](https://guides.codepath.com/android/using-the-recyclerview)
- [Create dynamic lists with RecyclerView (Android Docs)](https://developer.android.com/guide/topics/ui/layout/recyclerview)

---

## Author
- **Terrance McGowan**  
CodePath Android University Student
