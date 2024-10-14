package com.example.persian_date_picker

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val dateShape= CircleShape
val dateShapeSize= 40.dp

val persianWeekDays = listOf("شنبه","یکشنبه","دوشنبه","سه شنبه","چهارشنبه","پنجشنبه","جمعه", )
val persianWeekDaysShort = listOf("ش","ی","د","س","چ","پ","ج",)

val monthsList = listOf("فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد","شهریور","مهر","آبان","آذر","دی","بهمن","اسفند",)

val buttonStyle= TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
