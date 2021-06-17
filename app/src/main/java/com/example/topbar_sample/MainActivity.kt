package com.example.topbar_sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.topbar_sample.ui.theme.Topbar_sampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Topbar_sampleTheme {
                TopBar("Android")
            }
        }
    }
}

@Composable
fun TopBar(name: String) {
    Column {
        TopAppBar(
            navigationIcon = {
                IconButton(onClick = { /*doSomething*/ }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = null)
                }
            },
            title = {
                Text(text = name, maxLines = 2)
            },
            actions = {
                IconButton(onClick = { /*doSomething*/ }) {
                    Icon(Icons.Filled.Favorite, contentDescription = null)
                }
                IconButton(onClick = { /*doSomething*/ }) {
                    Icon(Icons.Filled.Menu, contentDescription = null)
                }
            }
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Topbar_sampleTheme {
        TopBar("Android")
    }
}