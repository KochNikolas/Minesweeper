package com.example.minesweeper.classes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.minesweeper.R

class level{
    @Composable
    fun create(){
        Column(modifier = Modifier
            .fillMaxWidth(0.7f)
            .background(colorResource(R.color.black))
            .height(100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(modifier = Modifier
                .fillMaxWidth(0.6f)
                .height(40.dp)
                .background(colorResource(R.color.main_dark))

            ){
                Text(text = "Level 1")
            }
            Box(modifier = Modifier)
        }
    }
}