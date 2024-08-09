package com.example.dagger_hilt_compose1


import javax.inject.Inject


class UserResistationService @Inject constructor(
    private val userRepository:UserRepository,
    private val emailService:EmailService
) {



    fun resisterUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.sendEmail(email,"","")
    }
}