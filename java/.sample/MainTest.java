package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testGreet() {
        assertEquals("Hello, Java!", Main.greet("Java"));
    }
}
