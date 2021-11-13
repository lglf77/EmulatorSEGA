package com.google.firebase.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class x extends Handler {
    private /* synthetic */ w a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    x(w wVar, Looper looper) {
        super(looper);
        this.a = wVar;
    }

    public final void handleMessage(Message message) {
        this.a.a(message);
    }
}
