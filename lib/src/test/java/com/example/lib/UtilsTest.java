package com.example.lib;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilsTest {
    @Test
    public void runTest() {
        assertEquals(17, new MyLibUtils().getCoolNumber$lib());
    }
}
