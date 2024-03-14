package com.example.replyapp


import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.replyapp.data.Email


@Composable
fun InfoCard(email: Email){
    Card(Modifier.wrapContentHeight()){
        Spacer(Modifier.height(15.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)){
            //Image(painterResource(email.sender.avatar),"", Modifier.size(50.dp).clip(CircleShape))
            ProfileImage(Modifier.size(50.dp),email.sender.avatar, "profile photo")
            Column(
                Modifier
                    .height(50.dp)
                    .padding(start = 20.dp)) {
                Text(text = stringResource(email.sender.firstName) + stringResource( email.sender.lastName), fontWeight = FontWeight.Bold)
                Text(text = stringResource(email.createdTime), color = MaterialTheme.colorScheme.outline, fontSize = 14.sp)
            }
        }
        Spacer(Modifier.height(10.dp))
        Text(modifier = Modifier.padding(start =10.dp, end = 10.dp, bottom = 10.dp),text = stringResource(email.subject), fontWeight = FontWeight.Bold)
        Text(modifier = Modifier.padding(start =10.dp, end = 10.dp),text = stringResource(email.body), maxLines = 2, overflow = TextOverflow.Ellipsis)
        Spacer(Modifier.height(10.dp))
     }
}

@Composable
fun ProfileImage(modifier:Modifier, imageResource:Int, description:String){
    Box(modifier = Modifier){
        Image(
            modifier = modifier.clip(CircleShape),
            painter = painterResource(imageResource),
            contentDescription = description
        )

    }

}

@Composable
fun ReplyHomeScreen(emails: List<Email>, title:Int, imageId: Int){

        LazyColumn(Modifier.padding(start = 10.dp, end = 10.dp )){
            item {
                ReplyTopAppBar(title = title , imageId = imageId )
            }

            items(emails){
                Spacer(modifier = Modifier.height(10.dp).padding())
                InfoCard(it)
            }
        }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReplyTopAppBar(title: Int, imageId: Int){
    TopAppBar( modifier = Modifier.fillMaxWidth(),
        title = { TextWithImage(Modifier.fillMaxWidth(),title = title , imageId =imageId )},
        scrollBehavior =  TopAppBarDefaults.pinnedScrollBehavior(canScroll = {false } )
    )
}
@Composable
fun TextWithImage( modifier:Modifier,  title:Int,imageId: Int ){
    Row( horizontalArrangement = Arrangement.SpaceBetween, modifier = modifier.padding(start =15.dp, end = 55.dp)){
        Text(  stringResource(title).uppercase(), color = Color.Blue )
        ProfileImage(modifier = Modifier, imageResource = imageId, description = "profilePhoto" )
    }

}