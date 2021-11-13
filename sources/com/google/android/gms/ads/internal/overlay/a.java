package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;

@bfk
public final class a {
    private static boolean a(Context context, Intent intent, q qVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            fn.a(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            au.e();
            gw.a(context, intent);
            if (qVar != null) {
                qVar.g();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            fn.e(e.getMessage());
            return false;
        }
    }

    public static boolean a(Context context, c cVar, q qVar) {
        int i;
        if (cVar == null) {
            fn.e("No intent data for launcher overlay.");
            return false;
        }
        asw.a(context);
        if (cVar.f != null) {
            return a(context, cVar.f, qVar);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(cVar.a)) {
            fn.e("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(cVar.b)) {
            intent.setDataAndType(Uri.parse(cVar.a), cVar.b);
        } else {
            intent.setData(Uri.parse(cVar.a));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(cVar.c)) {
            intent.setPackage(cVar.c);
        }
        if (!TextUtils.isEmpty(cVar.d)) {
            String[] split = cVar.d.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(cVar.d);
                fn.e(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str = cVar.e;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                fn.e("Could not parse intent flags.");
                i = 0;
            }
            intent.addFlags(i);
        }
        if (((Boolean) app.f().a(asw.cx)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) app.f().a(asw.cw)).booleanValue()) {
                au.e();
                gw.b(context, intent);
            }
        }
        return a(context, intent, qVar);
    }
}
