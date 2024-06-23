package com.example.wb_android_school.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wb_android_school.R
import com.example.wb_android_school.ui.theme.ExtraLightGray

@Composable
fun Avatar(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .aspectRatio(1f) // Делает Box квадратным со сторонами 1:1
                .clip(CircleShape)
                .background(ExtraLightGray)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.avatar_person),
                contentDescription = "avatar person",
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.avatar_meeting),
            contentDescription = "avatar meeting",
            modifier = Modifier.size(48.dp),
            contentScale = ContentScale.Fit
        )
    }
}