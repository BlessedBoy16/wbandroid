package com.example.wb_android_school.ui.components

import android.content.ClipData.Item
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.wb_android_school.ui.theme.Gray
import com.example.wb_android_school.ui.theme.Heading1
import com.example.wb_android_school.ui.theme.Heading2
import com.example.wb_android_school.ui.theme.SFProDisplay

data class TypographyItem(
    val title: String,
    val subTitle: String,
    val fontSize: TextUnit,
    val fontWeight: FontWeight

)
@Composable
fun TypographyRow(
    title: String,
    subTitle: String,
    fontSize:TextUnit,
    fontWeight:FontWeight,
    modifier: Modifier = Modifier
){
    val text = "The quick brown fox jumps over the lazy dog"
    LazyRow(
        modifier
    ){
        item {
            Column(
                modifier
                    .padding(end = 16.dp)
                    .widthIn(200.dp)
            ) {
                Text(
                    text = title,
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = SFProDisplay
                )
                Text(
                    text = subTitle,
                    fontSize = MaterialTheme.typography.titleSmall.fontSize,
                    color = Gray,
                    fontFamily = SFProDisplay
                )
            }
        }
        item {
            Text(
                text = text,
                fontSize = fontSize,
                fontWeight = fontWeight,
                fontFamily = SFProDisplay
            )
        }
    }
}