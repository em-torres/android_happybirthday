package com.cuanticosoluciones.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cuanticosoluciones.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top) {
                    ImageHead()
                    ArticleContent(
                        title = stringResource(R.string.article_title),
                        content = stringResource(R.string.article_body),
                        extra = stringResource(R.string.article_extra)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleContent(modifier: Modifier = Modifier, title: String, content: String, extra: String) {
    Column(modifier = modifier) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = extra,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun ImageHead() {
    Image(
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = stringResource(id = R.string.app_name),
        contentScale = ContentScale.FillWidth
    )
}

@Preview(showBackground = true)
@Composable
fun ArticlesPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top) {
        ImageHead()
        ArticleContent(
            title = stringResource(R.string.article_title),
            content = stringResource(R.string.article_body),
            extra = stringResource(R.string.article_extra)
        )
    }
}
