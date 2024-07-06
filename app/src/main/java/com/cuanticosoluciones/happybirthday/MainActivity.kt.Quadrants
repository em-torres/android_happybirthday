package com.cuanticosoluciones.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cuanticosoluciones.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                QuadrantLayout()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantLayout()
}

@Composable
fun QuadrantLayout(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            QuadrantContent(
                title = stringResource(R.string.title_1),
                content = stringResource(R.string.content_1),
                bgColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            QuadrantContent(
                title = stringResource(R.string.title_2),
                content = stringResource(R.string.content_2),
                bgColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            QuadrantContent(
                title = stringResource(R.string.title_3),
                content = stringResource(R.string.content_3),
                bgColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            QuadrantContent(
                title = stringResource(R.string.title_4),
                content = stringResource(R.string.content_4),
                bgColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun QuadrantContent(modifier: Modifier = Modifier, title: String, content: String, bgColor: androidx.compose.ui.graphics.Color) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(bgColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify
        )
    }
}
