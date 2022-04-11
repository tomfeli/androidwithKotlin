package com.example.myapplication

object RegistrationUtil {

    private val existingUsers = listOf("Tom","Dan")

    /**
     * the input is no valid if...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than 3 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ):Boolean {
        if(username.isEmpty() ||
            existingUsers.contains(username) ||
            password.isEmpty() ||
            password.length < 3 ||
            (password!==confirmedPassword)
        ){
            return false
        }
        return true
    }
}