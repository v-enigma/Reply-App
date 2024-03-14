package com.example.replyapp

import com.example.replyapp.data.Email
import com.example.replyapp.data.MailType

data class ReplyUiState(
    val mails : Map<MailType, List<Email>> = emptyMap(),
    val currentMailBoxType : MailType = MailType.INBOX
) {
    val currentMailBoxEmails : List<Email> by lazy { mails[currentMailBoxType]!! }

}