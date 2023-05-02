package com.appsdeveloper.app.ws.student.endpoint.util;

import java.util.UUID;

public class GeneratorUtil {

    public static String generateRandomId() {
        return UUID.randomUUID().toString();
    }
}
