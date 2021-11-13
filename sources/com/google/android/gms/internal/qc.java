package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class qc implements Runnable {
    private qc() {
    }

    public final void run() {
        try {
            MessageDigest unused = qa.c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
        } finally {
            qa.a.countDown();
        }
    }
}
