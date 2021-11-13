package com.google.android.gms.internal;

public enum aju {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(age.a),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object j;

    private aju(Object obj) {
        this.j = obj;
    }
}
