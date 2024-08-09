package com.example.dagger_hilt_compose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.dagger_hilt_compose1.ui.theme.Dagger_hilt_compose1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Dagger_hilt_compose1Theme {
                Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {

                    val userResistationComponent = DaggerUserResistationComponent.builder().build().userResistation()
                    userResistationComponent.resisterUser("","")
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Dagger_hilt_compose1Theme {

    }
}