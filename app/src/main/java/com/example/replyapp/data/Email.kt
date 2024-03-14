package com.example.replyapp.data

import androidx.annotation.StringRes

data class Email(
    val id:String,
    val sender : Account,
    val createdTime : Int,
    @StringRes val subject:Int,
    @StringRes val body:Int,
    val recipients : List<Account> = mutableListOf()
    )
