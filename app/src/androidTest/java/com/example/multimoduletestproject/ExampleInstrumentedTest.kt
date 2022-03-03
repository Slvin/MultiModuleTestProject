package com.example.multimoduletestproject

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    fun wrapperJarLibBuildConfigValue(): String {
        // Ensure we can resolved symbols from the included jar
        return com.android.tests.libstest.lib1.BuildConfig.PACKAGE_NAME
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        R.layout.activity_main
        assertEquals(0, MainActivity().number)
        assertEquals("com.example.multimoduletestproject", appContext.packageName)
    }
}