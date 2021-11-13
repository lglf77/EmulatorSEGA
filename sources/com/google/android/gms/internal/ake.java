package com.google.android.gms.internal;

import java.io.IOException;

public final class ake extends IOException {
    public ake(String str) {
        super(str);
    }

    static ake a() {
        return new ake("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static ake b() {
        return new ake("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static ake c() {
        return new ake("CodedInputStream encountered a malformed varint.");
    }

    static ake d() {
        return new ake("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
