package com.itechart.examples;

import org.junit.Test;

public class GreeterTest {
    @Test
    public void shouldSayHelloWithoutExceptions() {
        Greeter greeter = new Greeter("Test guest");
        greeter.sayHello();
    }
}
