package com.dotin.composdatapicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dotin.composdatapicker.ui.theme.ComposDataPickerTheme
import com.example.persian_date_picker.PersianDatePicker
import com.example.persian_date_picker.PersianRangeDatePicker

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposDataPickerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview()
//                    PersianRangeDatePicker(onDismiss = {}, setDate ={} )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposDataPickerTheme {
//        PersianDatePicker(minYear = 1385, positiveButtonTxt = "تایید", negativeButtonTxt = "لفو", onDismiss = {}, setDate = {
//
//        })
        PersianRangeDatePicker(onDismiss = {}, setDate ={} )
    }
}