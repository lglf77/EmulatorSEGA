package com.google.android.gms.internal;

import android.content.Context;

@bfk
public final class el implements amf {
    private final Context a;
    private final Object b;
    private String c;
    private boolean d;

    public el(Context context, String str) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = str;
        this.d = false;
        this.b = new Object();
    }

    public final void a(ame ame) {
        a(ame.a);
    }

    public final void a(String str) {
        this.c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.em r0 = com.google.android.gms.ads.internal.au.z()
            android.content.Context r1 = r4.a
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r4.b
            monitor-enter(r1)
            boolean r0 = r4.d     // Catch:{ all -> 0x0016 }
            if (r0 != r5) goto L_0x0019
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            goto L_0x000c
        L_0x0016:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            throw r0
        L_0x0019:
            r4.d = r5     // Catch:{ all -> 0x0016 }
            java.lang.String r0 = r4.c     // Catch:{ all -> 0x0016 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0025
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            goto L_0x000c
        L_0x0025:
            boolean r0 = r4.d     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0036
            com.google.android.gms.internal.em r0 = com.google.android.gms.ads.internal.au.z()     // Catch:{ all -> 0x0016 }
            android.content.Context r2 = r4.a     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r4.c     // Catch:{ all -> 0x0016 }
            r0.a((android.content.Context) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0016 }
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            goto L_0x000c
        L_0x0036:
            com.google.android.gms.internal.em r0 = com.google.android.gms.ads.internal.au.z()     // Catch:{ all -> 0x0016 }
            android.content.Context r2 = r4.a     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r4.c     // Catch:{ all -> 0x0016 }
            r0.b(r2, r3)     // Catch:{ all -> 0x0016 }
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.el.a(boolean):void");
    }
}
