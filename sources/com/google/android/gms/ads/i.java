package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ara;
import com.google.android.gms.internal.ard;
import com.google.android.gms.internal.ase;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.jn;

@bfk
public final class i {
    private final Object a = new Object();
    private ara b;
    private a c;

    public static abstract class a {
        public void a() {
        }

        public void a(boolean z) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public final ara a() {
        ara ara;
        synchronized (this.a) {
            ara = this.b;
        }
        return ara;
    }

    public final void a(a aVar) {
        y.a(aVar, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.a) {
            this.c = aVar;
            if (this.b != null) {
                try {
                    this.b.a((ard) new ase(aVar));
                } catch (RemoteException e) {
                    jn.b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
                return;
            }
            return;
        }
    }

    public final void a(ara ara) {
        synchronized (this.a) {
            this.b = ara;
            if (this.c != null) {
                a(this.c);
            }
        }
    }
}
