package com.appsdeveloper.app.ws.student.exception;

import com.appsdeveloper.app.ws.student.exception.util.ErrorCodeWrapper;
import com.appsdeveloper.app.ws.student.exception.util.ExceptionStatus;

public class NotFoundException extends PlatformRuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Object... parameters) {
        super(message, parameters);
    }

    public NotFoundException(Throwable cause, String message, Object... parameters) {
        super(cause, message, parameters);
    }

    public NotFoundException(ErrorCodeWrapper code, String message, Object... parameters) {
        super(code, message, parameters);
    }

    public NotFoundException(ErrorCodeWrapper errorCodeWrapper, String message, Throwable cause, Object... parameters) {
        super(errorCodeWrapper, message, cause, parameters);
    }

    public ExceptionStatus getExceptionStatus() {
        return ExceptionStatus.NOT_FOUND;
    }
}
