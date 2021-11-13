package com.google.android.gms.internal;

import android.os.Looper;

final class lz implements Runnable {
    lz(ly lyVar) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
