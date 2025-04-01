package io.github.s0ooo0k.day49.util;

import java.util.logging.Logger;

public class MyLogger {
    final Logger logger;
    public MyLogger(String className) {
        logger = Logger.getLogger(className);
    }

    public void info(String message) {
        logger.info(message);
    }

    void error(String message) {
        logger.severe(message);
    }
}
