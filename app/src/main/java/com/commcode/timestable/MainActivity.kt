package com.commcode.timestable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimesTable()
        }
    }
}

@Preview
@Composable
fun TimesTable() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        for (i in 1..9) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(weight = 1f)
            ) {
                for (j in 1..9) {
                    val color = if ((i + j) % 2 == 0) {
                        Color.Red
                    } else {
                        Color.Magenta
                    }
                    Box(
                        modifier = Modifier
                            .background(color)
                            .fillMaxHeight()
                            .weight(weight = 1f)
                            .border(width = 1.dp, color = Color.Yellow),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${i * j}",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }
}