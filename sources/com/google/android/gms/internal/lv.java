package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;

@bfk
public final class lv extends lq {
    public final lp a(Context context, md mdVar, int i, boolean z, atj atj, mc mcVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        return new le(context, z, mdVar.u().d(), mcVar, new me(context, mdVar.k(), mdVar.i(), atj, mdVar.c()));
    }
}
