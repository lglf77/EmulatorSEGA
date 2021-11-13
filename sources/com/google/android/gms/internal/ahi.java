package com.google.android.gms.internal;

import java.io.IOException;

public class ahi extends IOException {
    private aid a = null;

    public ahi(String str) {
        super(str);
    }

    static ahi a() {
        return new ahi("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static ahi b() {
        return new ahi("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static ahi c() {
        return new ahi("CodedInputStream encountered a malformed varint.");
    }

    static ahi d() {
        return new ahi("Protocol message contained an invalid tag (zero).");
    }

    static ahi e() {
        return new ahi("Protocol message end-group tag did not match expected tag.");
    }

    static ahj f() {
        return new ahj("Protocol message tag had invalid wire type.");
    }

    static ahi g() {
        return new ahi("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static ahi h() {
        return new ahi("Protocol message had invalid UTF-8.");
    }

    public final ahi a(aid aid) {
        this.a = aid;
        return this;
    }
}
