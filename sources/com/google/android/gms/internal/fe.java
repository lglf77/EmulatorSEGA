package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

@bfk
public final class fe {
    int a = -1;
    private long b = -1;
    private long c = -1;
    private int d = -1;
    private long e = 0;
    private final Object f = new Object();
    private String g;
    private int h = 0;
    private int i = 0;

    public fe(String str) {
        this.g = str;
    }

    private static boolean a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            fn.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            fn.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            fn.e("Fail to fetch AdActivity theme");
            fn.d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public final Bundle a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.g);
            bundle.putLong("basets", this.c);
            bundle.putLong("currts", this.b);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.d);
            bundle.putInt("preqs_in_session", this.a);
            bundle.putLong("time_in_session", this.e);
            bundle.putInt("pclick", this.h);
            bundle.putInt("pimp", this.i);
            bundle.putBoolean("support_transparent_background", a(context));
        }
        return bundle;
    }

    public final void a() {
        synchronized (this.f) {
            this.h++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.aoy r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r1 = r10.f
            monitor-enter(r1)
            com.google.android.gms.internal.fa r0 = com.google.android.gms.ads.internal.au.i()     // Catch:{ all -> 0x0059 }
            long r2 = r0.k()     // Catch:{ all -> 0x0059 }
            com.google.android.gms.common.util.d r0 = com.google.android.gms.ads.internal.au.k()     // Catch:{ all -> 0x0059 }
            long r4 = r0.a()     // Catch:{ all -> 0x0059 }
            long r6 = r10.c     // Catch:{ all -> 0x0059 }
            r8 = -1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x005c
            long r2 = r4 - r2
            com.google.android.gms.internal.asl<java.lang.Long> r0 = com.google.android.gms.internal.asw.aw     // Catch:{ all -> 0x0059 }
            com.google.android.gms.internal.asu r6 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r6.a(r0)     // Catch:{ all -> 0x0059 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0059 }
            long r6 = r0.longValue()     // Catch:{ all -> 0x0059 }
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            r0 = -1
            r10.a = r0     // Catch:{ all -> 0x0059 }
        L_0x0034:
            r10.c = r12     // Catch:{ all -> 0x0059 }
            long r2 = r10.c     // Catch:{ all -> 0x0059 }
            r10.b = r2     // Catch:{ all -> 0x0059 }
        L_0x003a:
            if (r11 == 0) goto L_0x005f
            android.os.Bundle r0 = r11.c     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x005f
            android.os.Bundle r0 = r11.c     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "gw"
            r3 = 2
            int r0 = r0.getInt(r2, r3)     // Catch:{ all -> 0x0059 }
            r2 = 1
            if (r0 != r2) goto L_0x005f
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
        L_0x004d:
            return
        L_0x004e:
            com.google.android.gms.internal.fa r0 = com.google.android.gms.ads.internal.au.i()     // Catch:{ all -> 0x0059 }
            int r0 = r0.n()     // Catch:{ all -> 0x0059 }
            r10.a = r0     // Catch:{ all -> 0x0059 }
            goto L_0x0034
        L_0x0059:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            throw r0
        L_0x005c:
            r10.b = r12     // Catch:{ all -> 0x0059 }
            goto L_0x003a
        L_0x005f:
            int r0 = r10.d     // Catch:{ all -> 0x0059 }
            int r0 = r0 + 1
            r10.d = r0     // Catch:{ all -> 0x0059 }
            int r0 = r10.a     // Catch:{ all -> 0x0059 }
            int r0 = r0 + 1
            r10.a = r0     // Catch:{ all -> 0x0059 }
            int r0 = r10.a     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x007c
            r2 = 0
            r10.e = r2     // Catch:{ all -> 0x0059 }
            com.google.android.gms.internal.fa r0 = com.google.android.gms.ads.internal.au.i()     // Catch:{ all -> 0x0059 }
            r0.a((long) r4)     // Catch:{ all -> 0x0059 }
        L_0x007a:
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            goto L_0x004d
        L_0x007c:
            com.google.android.gms.internal.fa r0 = com.google.android.gms.ads.internal.au.i()     // Catch:{ all -> 0x0059 }
            long r2 = r0.l()     // Catch:{ all -> 0x0059 }
            long r2 = r4 - r2
            r10.e = r2     // Catch:{ all -> 0x0059 }
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fe.a(com.google.android.gms.internal.aoy, long):void");
    }

    public final void b() {
        synchronized (this.f) {
            this.i++;
        }
    }
}
