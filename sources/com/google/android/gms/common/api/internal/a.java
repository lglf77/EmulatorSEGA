package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.y;

@Deprecated
public final class a {
    private static final Object a = new Object();
    private static a b;
    private final String c;
    private final Status d;
    private final boolean e;
    private final boolean f;

    private a(Context context) {
        boolean z = true;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(a.C0013a.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            boolean z2 = resources.getInteger(identifier) != 0;
            this.f = z2 ? false : z;
            z = z2;
        } else {
            this.f = false;
        }
        this.e = z;
        String a2 = u.a(context);
        a2 = a2 == null ? new aa(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.c = null;
            return;
        }
        this.c = a2;
        this.d = Status.a;
    }

    public static Status a(Context context) {
        Status status;
        y.a(context, (Object) "Context must not be null.");
        synchronized (a) {
            if (b == null) {
                b = new a(context);
            }
            status = b.d;
        }
        return status;
    }

    private static a a(String str) {
        a aVar;
        synchronized (a) {
            if (b == null) {
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 34).append("Initialize must be called before ").append(str).append(".").toString());
            }
            aVar = b;
        }
        return aVar;
    }

    public static String a() {
        return a("getGoogleAppId").c;
    }

    public static boolean b() {
        return a("isMeasurementExplicitlyDisabled").f;
    }
}
