package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class hw {
    private final Object a = new Object();
    private String b = "";
    private String c = "";
    private boolean d = false;
    private String e = "";

    private final String a(Context context) {
        String str;
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.b)) {
                au.e();
                this.b = gw.b(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.b)) {
                    au.e();
                    this.b = gw.a();
                    au.e();
                    gw.c(context, "debug_signals_id.txt", this.b);
                }
            }
            str = this.b;
        }
        return str;
    }

    private final void a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            fn.d("Can not create dialog without Activity Context");
        } else {
            gw.a.post(new hx(this, context, str, z, z2));
        }
    }

    private final boolean b(Context context, String str, String str2) {
        String d2 = d(context, c(context, (String) app.f().a(asw.cB), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            fn.b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d2.trim());
            String optString = jSONObject.optString("gct");
            this.e = jSONObject.optString("status");
            synchronized (this.a) {
                this.c = optString;
            }
            return true;
        } catch (JSONException e2) {
            fn.c("Fail to get in app preview response json.", e2);
            return false;
        }
    }

    private final Uri c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private final boolean c(Context context, String str, String str2) {
        String d2 = d(context, c(context, (String) app.f().a(asw.cC), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            fn.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d2.trim()).optString("debug_mode"));
            synchronized (this.a) {
                this.d = equals;
            }
            return equals;
        } catch (JSONException e2) {
            fn.c("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    private static String d(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", au.e().a(context, str2));
        kh<String> a2 = new Cif(context).a(str, (Map<String, String>) hashMap);
        try {
            return (String) a2.get((long) ((Integer) app.f().a(asw.cE)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            TimeoutException timeoutException = e2;
            String valueOf = String.valueOf(str);
            fn.b(valueOf.length() != 0 ? "Timeout while retriving a response from: ".concat(valueOf) : new String("Timeout while retriving a response from: "), timeoutException);
            a2.cancel(true);
        } catch (InterruptedException e3) {
            InterruptedException interruptedException = e3;
            String valueOf2 = String.valueOf(str);
            fn.b(valueOf2.length() != 0 ? "Interrupted while retriving a response from: ".concat(valueOf2) : new String("Interrupted while retriving a response from: "), interruptedException);
            a2.cancel(true);
        } catch (Exception e4) {
            Exception exc = e4;
            String valueOf3 = String.valueOf(str);
            fn.b(valueOf3.length() != 0 ? "Error retriving a response from: ".concat(valueOf3) : new String("Error retriving a response from: "), exc);
        }
        return null;
    }

    private final void e(Context context, String str, String str2) {
        au.e();
        gw.a(context, c(context, (String) app.f().a(asw.cA), str, str2));
    }

    public final String a() {
        String str;
        synchronized (this.a) {
            str = this.c;
        }
        return str;
    }

    public final void a(Context context, String str, String str2) {
        if (!b(context, str, str2)) {
            a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.e)) {
            fn.b("Creative is not pushed for this device.");
            a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.e)) {
            fn.b("The app is not linked for creative preview.");
            e(context, str, str2);
        } else if ("0".equals(this.e)) {
            fn.b("Device is linked for in app preview.");
            a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void a(Context context, String str, String str2, String str3) {
        boolean b2 = b();
        if (c(context, str, str2)) {
            if (!b2 && !TextUtils.isEmpty(str3)) {
                b(context, str2, str3, str);
            }
            fn.b("Device is linked for debug signals.");
            a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        e(context, str, str2);
    }

    public final void b(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = c(context, (String) app.f().a(asw.cD), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        au.e();
        gw.b(context, str, buildUpon.build().toString());
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }
}
