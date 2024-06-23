package com.example.wb_android_school.ui.components

import android.content.res.Resources.Theme
import android.widget.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.wb_android_school.ui.theme.ExtraLightGray
import com.example.wb_android_school.ui.theme.LightPurple



@Composable
fun FilledButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    primaryColor: Color,
    text: String
){
        Button(
            onClick = onClick,
            shape =RoundedCornerShape(30.dp),
            modifier = modifier,
            colors = ButtonDefaults.buttonColors(
                containerColor = primaryColor,
                contentColor = Color.White
            )
        ) {
            Text(text = "Border")
        }
}

@Composable
fun OutLineButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    primaryColor: Color,
    text: String
) {

        OutlinedButton(
            onClick = onClick,
            shape = RoundedCornerShape(30.dp),
            modifier = modifier,
            border = BorderStroke(
                width = 2.dp,
                color = primaryColor
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = primaryColor
            )
        ) {
            Text(text = "Border")
        }
}

@Composable
fun TextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    primaryColor: Color,
    secondaryColor: Color,
    text: String
){
        TextButton(
            onClick = onClick,
            shape =RoundedCornerShape(30.dp),
            modifier = modifier,
            colors = ButtonDefaults.buttonColors(
                contentColor = primaryColor,
                containerColor = secondaryColor
            )
        ) {
            Text(text = text)
        }
}
    @Composable
    fun ButtonsRow(
        modifier: Modifier = Modifier,
        primaryColor: Color,
        secondaryColor: Color = Color.Transparent,
        text:String
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
        FilledButton(
            onClick = {},
            modifier = Modifier,
            primaryColor = primaryColor,
            text = text
        )
        OutLineButton(
            onClick = {},
            modifier = Modifier,
            primaryColor = primaryColor,
            text = text
        )
        TextButton(
            onClick = {},
            modifier = Modifier,
            primaryColor = primaryColor,
            secondaryColor = secondaryColor,
            text = text
        )
    }
}
