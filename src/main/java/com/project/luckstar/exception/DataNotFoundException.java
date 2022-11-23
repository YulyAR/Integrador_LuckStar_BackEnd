package com.project.luckstar.exception;

/**
 * Exception when any resource or data is not found.
 */
public class DataNotFoundException extends com.project.luckstar.exception.GeneralRuntimeException {

    private static final long serialVersionUID = 1L;

    public DataNotFoundException(String message) {
        super(message);
    }

}
