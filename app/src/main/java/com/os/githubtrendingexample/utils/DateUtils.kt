package com.os.githubtrendingexample.utils

import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

object DateUtils {

    private const val DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'"

    fun formatDate(inputDate: String): String {
        return try {
            val inputDateFormat = SimpleDateFormat(DATE_FORMAT, Locale.US)
            val outputDateFormat = SimpleDateFormat("dd MMM yyyy", Locale.US)

            val parsedDate = inputDateFormat.parse(inputDate) ?: return inputDate
            outputDateFormat.format(parsedDate)

        } catch (ex: Exception) {
            Log.e("formatDate", "failed to format date")
            inputDate
        }
    }
     fun MutableList<Int>.swap(index1:Int,index2:Int){
        val temp = this[index1]
        this[index1] = this[index2]
        this[index1] = temp

    }
}