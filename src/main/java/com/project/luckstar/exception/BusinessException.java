package com.project.luckstar.exception;

/**
 * Exception for duplicated data in the application
 */
public class BusinessException extends com.project.luckstar.exception.GeneralRuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, String translationKey) {
        super(message, translationKey);
    }

}
