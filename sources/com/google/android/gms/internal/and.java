package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@bfk
public abstract class and {
    private static MessageDigest b = null;
    protected Object a = new Object();

    /* access modifiers changed from: protected */
    public final MessageDigest a() {
        MessageDigest messageDigest;
        synchronized (this.a) {
            if (b != null) {
                messageDigest = b;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        b = MessageDigest.getInstance("MD5");
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = b;
            }
        }
        return messageDigest;
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] a(String str);
}
