package com.example.dagger_hilt_compose1

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendEmail(to:String?,from:String?,body:String?){
        Log.d("userresistation", "email sent")
    }
}