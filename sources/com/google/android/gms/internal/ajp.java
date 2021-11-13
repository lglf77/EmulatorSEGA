package com.google.android.gms.internal;

public enum ajp {
    DOUBLE(aju.DOUBLE, 1),
    FLOAT(aju.FLOAT, 5),
    INT64(aju.LONG, 0),
    UINT64(aju.LONG, 0),
    INT32(aju.INT, 0),
    FIXED64(aju.LONG, 1),
    FIXED32(aju.INT, 5),
    BOOL(aju.BOOLEAN, 0),
    STRING(aju.STRING, 2),
    GROUP(aju.MESSAGE, 3),
    MESSAGE(aju.MESSAGE, 2),
    BYTES(aju.BYTE_STRING, 2),
    UINT32(aju.INT, 0),
    ENUM(aju.ENUM, 0),
    SFIXED32(aju.INT, 5),
    SFIXED64(aju.LONG, 1),
    SINT32(aju.INT, 0),
    SINT64(aju.LONG, 0);
    
    private final aju s;
    private final int t;

    private ajp(aju aju, int i) {
        this.s = aju;
        this.t = i;
    }

    public final aju a() {
        return this.s;
    }
}
