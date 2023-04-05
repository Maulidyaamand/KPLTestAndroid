package com.example.testandroidkpl

import android.app.Application
import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ResourceComparerTest{
    private var resourceComparer= ResourceComparer()

    //testing penamaan projek benar
    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "TestAndroidKpl")

        assertThat(result).isTrue()
    }
    //Testing penamaan projek salah
    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "Hello")

        assertThat(result).isFalse()
    }
}