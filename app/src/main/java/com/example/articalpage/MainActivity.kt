package com.example.articalpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articalpage.ui.theme.Gray40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Article()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Article(){
    Column(modifier = Modifier.background(Color.White),) {
        Image(painter = painterResource(id = R.drawable.a12),
            contentDescription = "gif",
//            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .align(CenterHorizontally)
                .scale(1f)
                .padding(16.dp)
        )
        Text(text = "Android Development",
            fontSize = 28.sp,
//            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(16.dp),
//                .align(CenterHorizontally),
            textAlign = Justify
        )

        Text(text = "The easiest way to get started with developing " +
                "Android applications is to download the Android Studio " +
                "application suite. You can download a copy of Android Studio" +
                " for your preferred platform (Windows®, Mac OS X, or Linux) ",
            modifier = Modifier
                .padding(16.dp),
            textAlign = Justify
            )

        Text(
            text = "There are older generations of development tools, " +
                    "including Android Developer Tools (ADT), " +
                    "which is the predecessor to Android Studio," +
                    " and Eclipse with an Android Developer Tools plug-in," +
                    " which was the predecessor to ADT. In essence, Android Studio" +
                    " is the third generation of the Android Integrated Developer " +
                    "Environment (IDE). There are also command-line " +
                    "tools and various continuous integration toolchains that" +
                    " permit the building of Android applications" +
                    "This article assumes that you are using Android Studio." +
                    " Coding in Java within Android Studio is intuitive" +
                    " because it provides a rich Java environment, including " +
                    "context-sensitive help and code suggestion hints. After you " +
                    "compile your Java code cleanly, the components of " +
                    "Android Studio make sure all of the application is packaged properly," +
                    " including the AndroidManifest.xml file.",
            modifier = Modifier
                .padding(16.dp),
            textAlign = Justify
        )
        }
    }
