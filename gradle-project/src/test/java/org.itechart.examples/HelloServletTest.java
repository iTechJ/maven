package org.itechart.examples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloServletTest {
    @Test
    public void fakeTest() throws Exception {
        String fakeResult = "Hello, World!";
        assertEquals("Hello, World!", fakeResult);
    }
}
