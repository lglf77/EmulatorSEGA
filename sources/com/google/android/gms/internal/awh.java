package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.b.b;
import com.google.android.gms.ads.b.i;
import java.util.WeakHashMap;

@bfk
public final class awh implements i {
    private static WeakHashMap<IBinder, awh> a = new WeakHashMap<>();
    private final awe b;
    private final b c;
    private final com.google.android.gms.ads.i d = new com.google.android.gms.ads.i();

    private awh(awe awe) {
        Context context;
        b bVar = null;
        this.b = awe;
        try {
            context = (Context) c.a(awe.e());
        } catch (RemoteException | NullPointerException e) {
            jn.b("Unable to inflate MediaView.", e);
            context = null;
        }
        if (context != null) {
            b bVar2 = new b(context);
            try {
                bVar = !this.b.a(c.a(bVar2)) ? null : bVar2;
            } catch (RemoteException e2) {
                jn.b("Unable to render video in MediaView.", e2);
            }
        }
        this.c = bVar;
    }

    public static awh a(awe awe) {
        awh awh;
        synchronized (a) {
            awh = a.get(awe.asBinder());
            if (awh == null) {
                awh = new awh(awe);
                a.put(awe.asBinder(), awh);
            }
        }
        return awh;
    }

    public final String a() {
        try {
            return this.b.l();
        } catch (RemoteException e) {
            jn.b("Failed to get custom template id.", e);
            return null;
        }
    }

    public final awe b() {
        return this.b;
    }
}
