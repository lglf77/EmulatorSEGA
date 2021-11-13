package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;

@bfk
public final class ep {
    public static String a(String str, Context context) {
        String i;
        if (!au.z().a(context) || TextUtils.isEmpty(str) || (i = au.z().i(context)) == null) {
            return str;
        }
        if (((Boolean) app.f().a(asw.an)).booleanValue()) {
            String str2 = (String) app.f().a(asw.ao);
            if (!str.contains(str2)) {
                return str;
            }
            if (au.e().d(str)) {
                au.z().d(context, i);
                return str.replace(str2, i);
            } else if (!au.e().e(str)) {
                return str;
            } else {
                au.z().e(context, i);
                return str.replace(str2, i);
            }
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (au.e().d(str)) {
                au.z().d(context, i);
                au.e();
                return gw.a(str, "fbs_aeid", i).toString();
            } else if (!au.e().e(str)) {
                return str;
            } else {
                au.z().e(context, i);
                au.e();
                return gw.a(str, "fbs_aeid", i).toString();
            }
        }
    }
}
