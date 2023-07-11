package com.example.minesweeper.classes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.minesweeper.R

class TopBar{
    @Composable
    fun create(){
        Row(
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
                .background(colorResource(R.color.main))
        ){
            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center,
            ){
                Text(text = "144", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ){
                Box(modifier = Modifier
                    .background(colorResource(R.color.main_dark), CircleShape)
                    .fillMaxSize(0.7f),
                    contentAlignment = Alignment.Center

                ){
                    Text(text = "Level 1", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
                }
            }
            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ){
                Icon(imageVector = Icons.Default.Settings,
                    contentDescription = "Settings Icon",
                    modifier = Modifier
                        .size(28.dp),
                    tint = Color.White
                )
            }
        }
    }
}