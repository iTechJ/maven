package com.itechart.examples;

import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Greeter[] greeters = {new Greeter("Mark"), new Greeter("Alex"), new Greeter("John")};

        Stream.of(greeters)
                .forEach(greeter -> {
                    greeter.sayHello();
                    greeter.sayGoodBye();
                });
    }
}
