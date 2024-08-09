package com.example.dagger_hilt_compose1

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveUser(email:String,password:String){
        Log.d("userresistation", "user saved in DB")
    }
}