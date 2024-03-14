package com.example.replyapp.data

import com.example.replyapp.R

object Data {
    val account_one = Account(
        "acc1",
        R.string.account_1f,
        R.string.account_1l,
        R.string.account_1e,
        R.drawable.avatar_express
    )
    val account_two = Account(
        "acc2",
        R.string.account_2f,
        R.string.account_2l,
        R.string.account_2e,
        R.drawable.avatar_0
    )
    val account_three = Account(
        "acc3",
        R.string.account_3f,
        R.string.account_3l,
        R.string.account_3e,
        R.drawable.avatar_1
    )
    val account_four = Account(
        "acc4",
        R.string.account_4f,
        R.string.account_4l,
        R.string.account_4e,
        R.drawable.avatar_2
    )
    val account_five = Account(
        "acc5",
        R.string.account_5f,
        R.string.account_5l,
        R.string.account_5e,
        R.drawable.avatar_3
    )
    val account_six = Account(
        "acc6",
        R.string.account_6f,
        R.string.account_6l,
        R.string.account_6e,
        R.drawable.avatar_4
    )
    val account_seven = Account(
        "acc7",
        R.string.account_7f,
        R.string.account_7l,
        R.string.account_7e,
        R.drawable.avatar_5
    )
    val account_eight = Account(
        "acc8",
        R.string.account_8f,
        R.string.account_8l,
        R.string.account_8e,
        R.drawable.avatar_6
    )
    val account_nine = Account(
        "acc9",
        R.string.account_9_first_name,
        R.string.account_9_last_name,
        R.string.account_9_email,
        R.drawable.avatar_7
    )
    val account_ten = Account(
        "acc10",
        R.string.account_10_first_name,
        R.string.account_10_last_name,
        R.string.account_10_email,
        R.drawable.avatar_8
    )
    val email_one = Email(
        "em1",
        account_one,
        R.string.email_1_time,
        R.string.email_1_subject,
        R.string.email_1_body
    )
    val email_two = Email(
        "em2",
        account_two,
        R.string.email_2_time,
        R.string.email_2_subject,
        R.string.email_2_body
    )
    val email_three = Email(
        "em3",
        account_three,
        R.string.email_3_time,
        R.string.email_3_subject,
        R.string.email_3_body
    )
    val email_four = Email(
        "em4",
        account_four,
        R.string.email_4_time,
        R.string.email_4_subject,
        R.string.email_4_body
    )
    val email_five = Email(
        "em5",
        account_five,
        R.string.email_5_time,
        R.string.email_5_subject,
        R.string.email_5_body
    )
    val email_six = Email(
        "em6",
        account_six,
        R.string.email_6_time,
        R.string.email_6_subject,
        R.string.email_6_body
    )
    val email_seven = Email(
        "em7",
        account_seven,
        R.string.email_7_time,
        R.string.email_7_subject,
        R.string.email_7_body
    )
    val email_eight = Email(
        "em8",
        account_eight,
        R.string.email_8_time,
        R.string.email_8_subject,
        R.string.email_8_body
    )
    val email_nine = Email(
        "em9",
        account_nine,
        R.string.email_9_time,
        R.string.email_9_subject,
        R.string.email_9_body
    )
    val email_ten = Email(
        "em10",
        account_ten,
        R.string.email_10_time,
        R.string.email_10_subject,
        R.string.email_10_body
    )
    val emails = listOf<Email>(
        email_one, email_two, email_three, email_four, email_five, email_seven, email_eight,
        email_nine, email_ten
    )

}