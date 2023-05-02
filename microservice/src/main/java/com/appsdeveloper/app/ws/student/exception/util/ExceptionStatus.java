package com.appsdeveloper.app.ws.student.exception.util;

import java.io.Serializable;

public class ExceptionStatus implements Serializable {

    public static final ExceptionStatus NOT_FOUND = new ExceptionStatus("Something was expected to be there , but was not", 404);
    public static final ExceptionStatus SERVER_ERROR = new ExceptionStatus("A Generic application error occured", 500);

    private static final long serialVersionUID = 1L;
    private final String description;
    private final int statusCode;

    public ExceptionStatus(String description, int statusCode) {
        this.description = description;
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
