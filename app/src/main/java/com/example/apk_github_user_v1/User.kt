package com.example.apk_github_user_v1
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var username: String,
    var real_name: String,
    var location: String,
    var repository: String,
    var user_company: String,
    var followers: String,
    var following: String,
    var avatar: Int
):Parcelable
