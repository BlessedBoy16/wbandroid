package com.example.wb_android_school.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.wb_android_school.R

val SFProDisplay = FontFamily(
    Font(R.font.sf_pro_display_regular, FontWeight.Normal),
    Font(R.font.sf_pro_display_semibold, FontWeight.SemiBold),
    Font(R.font.sf_pro_display_bold, FontWeight.Bold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
val Typography.Heading1: TextStyle
    get() = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
    )
val Typography.Heading2: TextStyle
    get() = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    )
val Typography.SubHeading1: TextStyle
    get() = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold
    )
val Typography.SubHeading2: TextStyle
    get() = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
    )
val Typography.BodyText1: TextStyle
    get() = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold
    )
val Typography.BodyText2: TextStyle
    get() = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    )
val Typography.MetaData1: TextStyle
    get() = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    )
val Typography.MetaData2: TextStyle
    get() = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal
    )
val Typography.MetaData3: TextStyle
    get() = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.SemiBold
    )
