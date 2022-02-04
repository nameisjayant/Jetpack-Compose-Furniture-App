package com.codingwithjks.furnitureapp

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithjks.furnitureapp.ui.theme.FurnitureAppTheme

class StartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 0)
        setContent {
            FurnitureAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    StartApp()
                }
            }
        }
    }
}

@Composable
fun StartApp() {

    val stroke = Stroke(
        width = 2f,
        //pathEffect = PathEffect.chao(floatArrayOf(10f, 10f), 0f)
    )


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "", contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.padding(top = 100.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo), contentDescription = "",
                    modifier = Modifier
                        .width(180.dp)
                        .height(53.dp)
                )
            }

            Column(
                modifier = Modifier.padding(bottom = 30.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp, bottom = 20.dp, start = 30.dp, end = 30.dp)
                ) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(46.dp), contentAlignment = Alignment.Center
                    ) {
                        Canvas(
                            modifier = Modifier
                                .fillMaxSize()

                        ) {
                            drawRoundRect(
                                color = Color.White,
                                style = stroke,
                                cornerRadius = CornerRadius(4f)
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "SIGN UP",
                                fontSize = 15.sp,
                                color = Color.White,
                                modifier = Modifier.padding(5.dp),
                            )
                        }
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, end = 30.dp)
                ) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(46.dp)
                    ) {
                        Box(modifier = Modifier.background(Color(0XFFD0021B))) {
                            Text(
                                text = "LOGIN",
                                fontSize = 15.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .align(Alignment.Center),
                            )
                        }
                    }
                }
            }
        }
    }
}
