package com.example.wb_android_school

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.wb_android_school.ui.components.Avatar
import com.example.wb_android_school.ui.components.ButtonsRow
import com.example.wb_android_school.ui.components.FilterChips
import com.example.wb_android_school.ui.components.SearchBar
import com.example.wb_android_school.ui.components.TypographyItem
import com.example.wb_android_school.ui.components.TypographyRow
import com.example.wb_android_school.ui.theme.BodyText1
import com.example.wb_android_school.ui.theme.BodyText2
import com.example.wb_android_school.ui.theme.DarkPurple
import com.example.wb_android_school.ui.theme.Heading1
import com.example.wb_android_school.ui.theme.Heading2
import com.example.wb_android_school.ui.theme.MetaData1
import com.example.wb_android_school.ui.theme.MetaData2
import com.example.wb_android_school.ui.theme.MetaData3
import com.example.wb_android_school.ui.theme.Purple
import com.example.wb_android_school.ui.theme.SubHeading1
import com.example.wb_android_school.ui.theme.SubHeading2
import com.example.wb_android_school.ui.theme.WbandroidschoolTheme


val chipList = listOf(
    "Python",
    "Junior",
    "Moscow"
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WbandroidschoolTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        LazyColumn(
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            item {
                                ButtonsGrid()
                            }
                            item {
                                TypographyList()
                            }
                            item {
                                Avatar(modifier = Modifier)
                            }
                            item {
                                SearchBar()
                            }
                            item {
                                Row(
                                    modifier = Modifier.padding(16.dp),
                                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                                ) {
                                    chipList.forEach {
                                        FilterChips(it)
                                    }
                                }
                            }
                        }
                    }
                }
        }
    }
}
@Composable
fun ButtonsGrid(){
    Column {
        ButtonsRow(
            modifier = Modifier.padding(16.dp),
            primaryColor = Purple,
            text = "Click"
        )
        ButtonsRow(
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp
            ),
            text = "Click",
            primaryColor = DarkPurple
        )
        ButtonsRow(
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp
            ),
            primaryColor = Purple.copy(alpha = 0.5f),
            text = "Click"
        )
    }
}

@Composable
fun TypographyList(){
    val typographyList = listOf(
        TypographyItem( fontSize = MaterialTheme.typography.Heading1.fontSize,
            fontWeight = FontWeight.Bold,
            title = "Heading 1",
            subTitle = "SF Pro Display/32/Bold"
        ),
        TypographyItem(
            fontSize = MaterialTheme.typography.Heading2.fontSize,
            fontWeight = FontWeight.Bold,
            title = "Heading 2",
            subTitle = "SF Pro Display/24/Bold"
        ),
        TypographyItem(
            fontSize = MaterialTheme.typography.SubHeading1.fontSize,
            fontWeight = FontWeight.SemiBold,
            title = "Subheading 1",
            subTitle = "SF Pro Display/18/SemiBold"
        ),
        TypographyItem(
            fontSize = MaterialTheme.typography.SubHeading2.fontSize,
            fontWeight = FontWeight.SemiBold,
            title = "Subheading 2",
            subTitle = "SF Pro Display/16/SemiBold"
        ),
        TypographyItem(
            fontSize = MaterialTheme.typography.BodyText1.fontSize,
            fontWeight = FontWeight.SemiBold,
            title = "Body Text 1",
            subTitle = "SF Pro Display/14/SemiBold"
        ),
        TypographyItem(
            fontSize = MaterialTheme.typography.BodyText2.fontSize,
            fontWeight = FontWeight.Normal,
            title = "Body Text 2",
            subTitle = "SF Pro Display/14/Regular"
        ),
        TypographyItem(
            fontSize = MaterialTheme.typography.MetaData1.fontSize,
            fontWeight = FontWeight.Normal,
            title = "Metadata 1",
            subTitle = "SF Pro Display/12/Regular"
        ),
        TypographyItem(
            fontSize = MaterialTheme.typography.MetaData2.fontSize,
            fontWeight = FontWeight.Normal,
            title = "Metadata 2",
            subTitle = "SF Pro Display/10/Regular"
        ),
        TypographyItem(
            fontSize = MaterialTheme.typography.MetaData3.fontSize,
            fontWeight = FontWeight.SemiBold,
            title = "Metadata 3",
            subTitle = "SF Pro Display/10/SemiBold"
        )
    )
    typographyList.forEach{
        TypographyRow(
            title = it.title,
            subTitle = it.subTitle,
            fontSize = it.fontSize,
            fontWeight = it.fontWeight,
            modifier = Modifier.padding(
                horizontal = 16.dp,
                vertical = 16.dp
            )
        )
    }
}

