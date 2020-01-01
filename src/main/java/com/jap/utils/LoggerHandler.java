package com.jap.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerHandler {
    private static Logger logger = Logger.getLogger("Log Manager");

    private static void info(String message, Object[] objects) {
        logger.log(Level.INFO, message, objects);
    }
    private static void info(String message, Throwable throwable) {
        logger.log(Level.INFO, message, throwable);
    }
    private static void error(String message, Object[] objects) {
        logger.log(Level.WARNING, message, objects);
    }
    private static void error(String message, Throwable throwable) {
        logger.log(Level.WARNING, message, throwable);
    }

    public static void logInfo(String message) {
        info(message, new Object[]{});
    }
    public static void logInfo(String message, Object[] objects) {
        info(message, objects);
    }
    public static void logInfo(String message, Throwable throwable) {
        info(message, throwable);
    }
    public static void logInfo(Throwable throwable) {
        info(throwable.getMessage(), throwable);
    }

    public static void logError(String message) {
        error(message, new Object[]{});
    }
    public static void logError(String message, Object[] objects) {
        error(message, objects);
    }
    public static void logError(String message, Throwable throwable) {
        error(message, throwable);
    }
    public static void logError(Throwable throwable) {
        error(throwable.getMessage(), throwable);
    }


}
