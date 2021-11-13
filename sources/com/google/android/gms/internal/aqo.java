package com.google.android.gms.internal;

import android.text.TextUtils;

public final class aqo {
    private final String a;
    private final String b;

    public aqo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aqo aqo = (aqo) obj;
        return TextUtils.equals(this.a, aqo.a) && TextUtils.equals(this.b, aqo.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length()).append("Header[name=").append(str).append(",value=").append(str2).append("]").toString();
    }
}
