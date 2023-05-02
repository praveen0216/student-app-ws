package com.appsdeveloper.app.ws.student.exception;

import com.appsdeveloper.app.ws.student.exception.util.ErrorCodeWrapper;
import com.appsdeveloper.app.ws.student.exception.util.ExceptionStatus;
import org.slf4j.helpers.MessageFormatter;

public class PlatformRuntimeException extends RuntimeException {

    private final transient Object[] parameters;
    private final ErrorCodeWrapper errorCodeWrapper;

    public PlatformRuntimeException(String message) {
        this((ErrorCodeWrapper)null, message, (Throwable)null, (Object[])null);
    }

    public PlatformRuntimeException(String message, Object ... parameters) {
        this((ErrorCodeWrapper)null, message, (Throwable)null, parameters);
    }

    public PlatformRuntimeException(Throwable cause, String message,  Object ... parameters) {
        this((ErrorCodeWrapper)null, message, cause, parameters);
    }

    public PlatformRuntimeException(ErrorCodeWrapper code, String message,  Object ... parameters) {
        this(code, message, (Throwable)null, parameters);
    }

    public PlatformRuntimeException(ErrorCodeWrapper errorCodeWrapper, String message, Throwable cause, Object ... parameters) {
        super(MessageFormatter.arrayFormat(message, parameters).getMessage(), cause);
        this.errorCodeWrapper = errorCodeWrapper;
        this.parameters = parameters;
    }

    public Object[] getParameters() {
        return this.parameters;
    }

    public String getCode() {
        return this.errorCodeWrapper != null ? this.errorCodeWrapper.getErrorCode() : null;
    }

    public ExceptionStatus getExceptionStatus() {
        return ExceptionStatus.SERVER_ERROR;
    }
}
