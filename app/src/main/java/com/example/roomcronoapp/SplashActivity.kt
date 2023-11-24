package com.example.roomcronoapp
//Vek Histories

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.roomcronoapp.ui.theme.VekCronosAppTheme
import kotlinx.coroutines.delay

@SuppressLint("CustomSplashScreen")
class SplashActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            VekCronosAppTheme {
                SplashScreen()
            }
        }
    }

    @Preview
    @Composable
    private fun SplashScreen(){
        LaunchedEffect(key1 = true, block = {
            delay(2000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        })
        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xFF170606)
            ), contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.vek),
                contentDescription = null)
        }

    }
}
