package com.itechart.examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Greeter {
    private static final Logger logger = LogManager.getLogger(Greeter.class);

    private String guestName;

    public Greeter(String guestName) {
        this.guestName = guestName;
    }

    public void sayHello() {
        if (logger.isInfoEnabled()) {
            logger.info(String.format("Hello, %s!", guestName));
        }
    }

    public void sayGoodBye() {
        if (logger.isInfoEnabled()) {
            logger.info(String.format("Good bye, %s!", guestName));
        }
    }
}
