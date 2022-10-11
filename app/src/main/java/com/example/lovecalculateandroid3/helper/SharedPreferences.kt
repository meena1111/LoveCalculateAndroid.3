package com.example.lovecalculateandroid3.helper

import android.content.Context
import android.content.SharedPreferences
import androidx.navigation.NavController
import com.example.lovecalculateandroid3.R

class SharedPreferences {
    fun getPreferences(context: Context, findNavController: NavController) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences("on_boarding", Context.MODE_PRIVATE)
        val isShow = sharedPreferences.getBoolean("isShow", false)
        if (isShow) {
            findNavController.navigate(R.id.clearBackStack)
        }
    }

    fun putPreferences(context: Context) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences("on_boarding", Context.MODE_PRIVATE)
        sharedPreferences.edit().putBoolean("isShow", true).apply()
    }
}