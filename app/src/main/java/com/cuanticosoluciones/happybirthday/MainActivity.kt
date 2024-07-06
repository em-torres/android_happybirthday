package com.cuanticosoluciones.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
                BusinessCard(
                    name = stringResource(R.string.bsc_name),
                    role = stringResource(R.string.bsc_title),
                    email = stringResource(R.string.bsc_email),
                    phone = stringResource(R.string.bsc_phone),
                    social = stringResource(R.string.bsc_social),
                    imagePainter = painterResource(id = R.drawable.profile)
                )
            }
        }
    }
}

@Composable
fun BusinessCard(
    modifier: Modifier = Modifier,
    name: String,
    role: String,
    email: String,
    phone: String,
    social: String,
    imagePainter: Painter
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        BusinessCardTopSection(name = name, role = role, imagePainter = imagePainter)
        BusinessCardBottomSection(email = email, phone = phone, social = social)
    }
}

@Composable
fun BusinessCardTopSection(
    modifier: Modifier = Modifier,
    name: String,
    role: String,
    imagePainter: Painter
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(0.87f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = imagePainter,
            contentDescription = R.string.bsc_name.toString(),
            modifier = Modifier
                .size(100.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(20.dp)
        ) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = Modifier.padding(bottom = 10.dp)
            )
            Text(
                fontSize = 25.sp,
                text = role,
                color = Color.Gray
            )
        }
    }
}

@Composable
fun BusinessCardBottomSection(
    modifier: Modifier = Modifier,
    email: String,
    social: String,
    phone: String,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        BusinessCardBottomItem(
            vector = Icons.Filled.Email,
            description = "Email",
            text = email
        )
        BusinessCardBottomItem(
            vector = Icons.Filled.Phone,
            text = phone,
            description = "Phone"
        )
        BusinessCardBottomItem(
            vector = Icons.Filled.Face,
            text = social,
            description = "Social"
        )
    }
}

@Composable
fun BusinessCardBottomItem(
    modifier: Modifier = Modifier,
    vector: ImageVector,
    text: String,
    description: String,
    tint: Color = Color.Black
) {
    Row (
        modifier = modifier
            .fillMaxWidth()
            .wrapContentWidth(),
    ) {
        Icon(
            imageVector = vector,
            contentDescription = description,
            tint = tint
        )
        Text(
            text = text,
            fontSize = 18.sp,
            modifier = Modifier.padding(start = 8.dp),
            textAlign = TextAlign.Start
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard(
        name = stringResource(R.string.bsc_name),
        role = stringResource(R.string.bsc_title),
        email = stringResource(R.string.bsc_email),
        phone = stringResource(R.string.bsc_phone),
        social = stringResource(R.string.bsc_social),
        imagePainter = painterResource(id = R.drawable.profile)
    )
}


