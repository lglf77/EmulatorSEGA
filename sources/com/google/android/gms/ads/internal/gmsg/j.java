package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.internal.atj;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.mw;
import java.util.Map;

@bfk
public final class j implements aa<mw> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        mw mwVar = (mw) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                fn.e("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                fn.e("No timestamp given for CSI tick.");
            } else {
                try {
                    long parseLong = (Long.parseLong(str4) - au.k().a()) + au.k().b();
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    mwVar.j().a(str2, str3, parseLong);
                } catch (NumberFormatException e) {
                    fn.c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                fn.e("No value given for CSI experiment.");
                return;
            }
            atj a = mwVar.j().a();
            if (a == null) {
                fn.e("No ticker for WebView, dropping experiment ID.");
            } else {
                a.a("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                fn.e("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                fn.e("No name given for CSI extra.");
            } else {
                atj a2 = mwVar.j().a();
                if (a2 == null) {
                    fn.e("No ticker for WebView, dropping extra parameter.");
                } else {
                    a2.a(str6, str7);
                }
            }
        }
    }
}
