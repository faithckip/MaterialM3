package com.example.MaterialM3.ui.theme.timedatePicker

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun SimpleDateRangePicker() {

    /*val datePickerState = rememberDatePickerState(
        initialSelectedDateMillis = Instant.now.toEpochMilli(),

    )
    DatePicker(state = datePickerState)
    val selectedDate = datePickerState.selectedDateMillis?.let{
        Instant.ofEpochMilli(it).atOffset(ZoneOffset.UTC)
    }*/
    //Finally to get the user value you could do something like this
    //Text("Selected: ${ selectDate?.format(DateTimeFormatter.ISO_LOCAL_DATE) ?: "no selection"}")

    /*val dateRangePickerState = rememberDateRangePickerState(
        initialSelectedStartDateMillis = Instant.now().toEpochMilli(),
        initialSelectedEndDateMillis = OffsetDateTime.now().plusDays(8).toInstant().toEpochMilli(),
        yearRange = IntRange(2023, 2100), //available years
        initialDisplayMode = DisplayMode.Picker

    )

    DateRangePicker(
        modifier = Modifier.padding(16.dp),
        state = dateRangePickerState,
    )
*/
}