package com.appsdeveloper.app.ws.student.exception.util;

import java.io.Serializable;

public class ErrorCodeWrapper implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String errorCode;

    public ErrorCodeWrapper(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
