package com.example.myapplication

import com.example.testandroidkpl.RegistrationUtil
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    private val regisUtil = RegistrationUtil()

    @Test
    //the username is empty
    fun `empty username return false`(){
        val result= regisUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    //username and password correct
    @Test
    fun `valid username and correctly repeated password return true`(){
        val result=regisUtil.validateRegistrationInput(
            "Philipp",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    //confirmed password not same
    @Test
    fun `incorrectly confirmed password return false`(){
        val result = regisUtil.validateRegistrationInput(
            "Philipp",
            "123456",
            "145678"
        )
        assertThat(result).isFalse()
    }

    //the username already
    @Test
    fun `username already exist return false`(){
        val result = regisUtil.validateRegistrationInput(
            "Carl",
            "123456",
            "145678"
        )
        assertThat(result).isFalse()
    }

    //password is empty
    @Test
    fun `empty password returns false`(){
        val result = regisUtil.validateRegistrationInput(
            "Philipp",
            "",
            ""
        )
        assertThat(result).isFalse()
    }


}









