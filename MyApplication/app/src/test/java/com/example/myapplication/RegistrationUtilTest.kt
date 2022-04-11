package com.example.myapplication


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `valid username and repeated valid password returns true `() {
        val result = RegistrationUtil.validateRegistrationInput(
            "leila",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun `valid username and not repeated password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "leila",
            "1234",
            "abcd"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password with less than 3 characters returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "tom",
            "12",
            "12"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Tom",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "leila",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

}