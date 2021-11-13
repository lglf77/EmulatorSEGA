package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.a;
import com.google.android.gms.ads.d;

@bfk
public final class apf {
    private final d[] a;
    private final String b;

    public apf(Context context, AttributeSet attributeSet) {
        boolean z = true;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a.b.AdsAttrs);
        String string = obtainAttributes.getString(a.b.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(a.b.AdsAttrs_adSizes);
        boolean z2 = !TextUtils.isEmpty(string);
        z = TextUtils.isEmpty(string2) ? false : z;
        if (z2 && !z) {
            this.a = a(string);
        } else if (!z2 && z) {
            this.a = a(string2);
        } else if (z2) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.b = obtainAttributes.getString(a.b.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static d[] a(String str) {
        String[] split = str.split("\\s*,\\s*");
        d[] dVarArr = new d[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    dVarArr[i] = new d("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException e) {
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(trim)) {
                dVarArr[i] = d.a;
            } else if ("LARGE_BANNER".equals(trim)) {
                dVarArr[i] = d.c;
            } else if ("FULL_BANNER".equals(trim)) {
                dVarArr[i] = d.b;
            } else if ("LEADERBOARD".equals(trim)) {
                dVarArr[i] = d.d;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                dVarArr[i] = d.e;
            } else if ("SMART_BANNER".equals(trim)) {
                dVarArr[i] = d.g;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                dVarArr[i] = d.f;
            } else if ("FLUID".equals(trim)) {
                dVarArr[i] = d.h;
            } else if ("ICON".equals(trim)) {
                dVarArr[i] = d.i;
            } else {
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf2) : new String("Could not parse XML attribute \"adSize\": "));
            }
        }
        if (dVarArr.length != 0) {
            return dVarArr;
        }
        String valueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(valueOf3.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(valueOf3) : new String("Could not parse XML attribute \"adSize\": "));
    }

    public final String a() {
        return this.b;
    }

    public final d[] a(boolean z) {
        if (z || this.a.length == 1) {
            return this.a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
