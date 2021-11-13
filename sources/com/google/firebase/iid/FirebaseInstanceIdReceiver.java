package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.a.b;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.j;

public final class FirebaseInstanceIdReceiver extends b {
    private static boolean a = false;
    private static j b;
    private static j c;

    private static synchronized j a(Context context, String str) {
        j jVar;
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (c == null) {
                    c = new j(context, str);
                }
                jVar = c;
            } else {
                if (b == null) {
                    b = new j(context, str);
                }
                jVar = b;
            }
        }
        return jVar;
    }

    private final void a(Context context, Intent intent, String str) {
        String str2 = null;
        boolean z = false;
        int i = -1;
        intent.setComponent((ComponentName) null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("google.com/iid".equals(intent.getStringExtra("from")) || "com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
            str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || "com.google.firebase.MESSAGING_EVENT".equals(str)) {
            str2 = "com.google.firebase.MESSAGING_EVENT";
        } else {
            Log.d("FirebaseInstanceId", "Unexpected intent");
        }
        if (str2 != null) {
            if (j.i() && context.getApplicationInfo().targetSdkVersion >= 26) {
                z = true;
            }
            if (z) {
                if (isOrderedBroadcast()) {
                    setResultCode(-1);
                }
                a(context, str2).a(intent, goAsync());
            } else {
                i = y.a().a(context, str2, intent);
            }
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                a(context, (Intent) parcelableExtra, intent.getAction());
            } else {
                a(context, intent, intent.getAction());
            }
        }
    }
}
