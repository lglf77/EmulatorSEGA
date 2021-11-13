package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.y;

public final class tb {
    private final td a;

    public tb(td tdVar) {
        y.a(tdVar);
        this.a = tdVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r1 = r1.getReceiverInfo(new android.content.ComponentName(r4, "com.google.android.gms.measurement.AppMeasurementReceiver"), 2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4) {
        /*
            r0 = 0
            com.google.android.gms.common.internal.y.a(r4)
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001f }
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            return r0
        L_0x000b:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001f }
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x001f }
            r3 = 2
            android.content.pm.ActivityInfo r1 = r1.getReceiverInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x001f }
            if (r1 == 0) goto L_0x000a
            boolean r1 = r1.enabled     // Catch:{ NameNotFoundException -> 0x001f }
            if (r1 == 0) goto L_0x000a
            r0 = 1
            goto L_0x000a
        L_0x001f:
            r1 = move-exception
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tb.a(android.content.Context):boolean");
    }

    public final void a(Context context, Intent intent) {
        tk a2 = tk.a(context);
        sj f = a2.f();
        if (intent == null) {
            f.A().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        f.E().a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            f.E().a("Starting wakeful intent.");
            this.a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            BroadcastReceiver.PendingResult a3 = this.a.a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                f.E().a("Install referrer extras are null");
                if (a3 != null) {
                    a3.finish();
                    return;
                }
                return;
            }
            f.C().a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? "?".concat(valueOf) : new String("?");
            }
            Bundle a4 = a2.o().a(Uri.parse(stringExtra));
            if (a4 == null) {
                f.E().a("No campaign defined in install referrer broadcast");
                if (a3 != null) {
                    a3.finish();
                    return;
                }
                return;
            }
            long longExtra = 1000 * intent.getLongExtra("referrer_timestamp_seconds", 0);
            if (longExtra == 0) {
                f.A().a("Install referrer is missing timestamp");
            }
            a2.h().a((Runnable) new tc(this, a2, longExtra, a4, context, f, a3));
        }
    }
}
