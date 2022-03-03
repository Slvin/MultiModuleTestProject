package com.example.lib

import junit.framework.Assert.assertEquals
import org.junit.Test

class CoolTest {
    @Test
    fun coolThingTest() {
        assertEquals(17, MyLibUtils().coolNumber)
    }
}