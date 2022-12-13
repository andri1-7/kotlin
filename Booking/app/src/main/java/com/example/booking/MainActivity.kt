package com.example.booking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import com.example.booking.ui.theme.BookingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Column(
               modifier = Modifier
                   .fillMaxSize()
                   .background(color = Color.Cyan),
               verticalArrangement = Arrangement.Center
           ) {
               Column(modifier = Modifier.padding(horizontal = 40.dp)) {
                   Text(text = "Welcome", fontSize = 44.sp, fontWeight = FontWeight.Bold)
                   Row{
                       Text(text = "To ", fontSize = 44.sp, fontWeight = FontWeight.Bold)
                       Text(text = "Booking APP", fontSize = 44.sp, fontWeight = FontWeight.Bold, color = Color.Yellow)
                   }
                   Spacer(modifier = Modifier.height(24.dp))
                   Button(onClick = { /*TODO*/ },
                       modifier = Modifier
                           .fillMaxWidth(),
                       colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
                       ,shape = RoundedCornerShape(14.dp)
                   ) {
                       Text(text = "SignUp", color = Color.Blue, modifier = Modifier.padding(vertical = 5.dp))
                   }
                   Spacer(modifier = Modifier.height(24.dp))
                   Button(onClick = { /*TODO*/ },
                       modifier = Modifier
                           .fillMaxWidth(),
                       colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                       shape = RoundedCornerShape(14.dp)
                   ) {
                       Text(text = "Login", color = Color.Blue, modifier = Modifier.padding(vertical = 5.dp))
                   }
               }
           }
        }
    }
}