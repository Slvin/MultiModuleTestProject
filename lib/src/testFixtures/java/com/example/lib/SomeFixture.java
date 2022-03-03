package com.example.lib;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeFixture {
    public String coolString() {
        String myMockString = mock(String.class);
        when(myMockString.toString()).thenReturn("I'm a cool string!");
        System.out.println(myMockString);
        return myMockString;
    }

}