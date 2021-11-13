package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

public class ow extends aws<String> {
    private final bdn<String> a;

    public ow(int i, String str, bdn<String> bdn, bcm bcm) {
        super(i, str, bcm);
        this.a = bdn;
    }

    /* access modifiers changed from: protected */
    public final bbt<String> a(auq auq) {
        String str;
        try {
            str = new String(auq.b, np.a(auq.c));
        } catch (UnsupportedEncodingException e) {
            str = new String(auq.b);
        }
        return bbt.a(str, np.a(auq));
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        if (this.a != null) {
            this.a.a(str);
        }
    }
}
