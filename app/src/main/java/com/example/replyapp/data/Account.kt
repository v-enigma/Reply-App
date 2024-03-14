package com.example.replyapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Account(
    val accountId:String,
    @StringRes val firstName:Int = -1,
    @StringRes val lastName:Int = -1,
    @StringRes val emailId :Int = -1,
    @DrawableRes val avatar:Int = -1
)
