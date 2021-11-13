package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;

final class af extends Handler {
    private /* synthetic */ ab a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(ab abVar, Looper looper) {
        super(looper);
        this.a = abVar;
    }

    private static void a(Message message) {
        ((ag) message.obj).c();
    }

    private static boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    public final void handleMessage(Message message) {
        PendingIntent pendingIntent = null;
        if (this.a.c.get() != message.arg1) {
            if (b(message)) {
                a(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.a.f()) {
            a(message);
        } else if (message.what == 4) {
            a unused = this.a.y = new a(message.arg2);
            if (!this.a.s() || this.a.z) {
                a d = this.a.y != null ? this.a.y : new a(8);
                this.a.b.a(d);
                this.a.a(d);
                return;
            }
            this.a.a(3, null);
        } else if (message.what == 5) {
            a d2 = this.a.y != null ? this.a.y : new a(8);
            this.a.b.a(d2);
            this.a.a(d2);
        } else if (message.what == 3) {
            if (message.obj instanceof PendingIntent) {
                pendingIntent = (PendingIntent) message.obj;
            }
            a aVar = new a(message.arg2, pendingIntent);
            this.a.b.a(aVar);
            this.a.a(aVar);
        } else if (message.what == 6) {
            this.a.a(5, null);
            if (this.a.u != null) {
                this.a.u.a(message.arg2);
            }
            this.a.a(message.arg2);
            boolean unused2 = this.a.a(5, 1, null);
        } else if (message.what == 2 && !this.a.e()) {
            a(message);
        } else if (b(message)) {
            ((ag) message.obj).b();
        } else {
            Log.wtf("GmsClient", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
        }
    }
}
