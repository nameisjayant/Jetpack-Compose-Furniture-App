package com.codingwithjks.furnitureapp.data.splash.screens


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithjks.furnitureapp.data.splash.data.Page
import com.codingwithjks.furnitureapp.data.splash.data.pageData
import com.codingwithjks.furnitureapp.ui.theme.Purple700
import com.google.accompanist.pager.*

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun OnBoardingScreen(onGettingClick: () -> Unit) {
    val pagerState = rememberPagerState(pageCount = 3)
    Column(
    ) {
        HorizontalPager(
            state = pagerState, modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) { page ->
            PageUi(pageData[page], pagerState)
        }

        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(vertical = 20.dp),
            activeColor = Purple700
        )
        AnimatedVisibility(visible = pagerState.currentPage == 2) {
            OutlinedButton(
                onClick = { onGettingClick() }, shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp, end = 50.dp, bottom = 20.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Purple700
                )
            ) {
                Text(
                    text = "Getting Started", fontSize = 16.sp, color = Color.White,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}

@ExperimentalPagerApi
@Composable
fun PageUi(page: Page, pageState: PagerState) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp),
    ) {
        Image(
            painter = painterResource(id = page.image), contentDescription = "",
            contentScale = ContentScale.Crop, modifier = Modifier.size(450.dp)
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(modifier = Modifier.padding(top = 10.dp)) {
                Text(text = page.title, fontSize = 28.sp, color = Color.Black)

            }
            Row(modifier = Modifier.padding(top = 10.dp)) {
                Text(
                    text = page.description,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Normal
                )
            }

        }
    }
}