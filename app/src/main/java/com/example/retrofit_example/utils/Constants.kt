package com.example.retrofit_example.utils

object Constants {
    const val TAG : String = "로그"
}

enum class SEARCH_TYPE {
    PHOTO,
    USER
}

object API{
    const val Base_URL: String = "https://api.unsplash.com/"

    const val CLIENT_ID : String = ""

    const val SEARCH_PHOTOS: String = "search/photos"
    const val SEARCH_USERS: String = "search/users"
}

