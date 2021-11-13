package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.a;
import com.google.android.gms.ads.internal.au;
import java.lang.ref.WeakReference;
import java.util.Map;

@bfk
public abstract class mp {
    protected Context a;
    private String b;
    private WeakReference<md> c;

    public mp(md mdVar) {
        this.a = mdVar.getContext();
        this.b = au.e().a(this.a, mdVar.k().a);
        this.c = new WeakReference<>(mdVar);
    }

    /* access modifiers changed from: private */
    public final void a(String str, Map<String, String> map) {
        md mdVar = (md) this.c.get();
        if (mdVar != null) {
            mdVar.a(str, map);
        }
    }

    /* access modifiers changed from: private */
    public static String b(String str) {
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1396664534:
                if (str.equals("badUrl")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c2 = 2;
                    break;
                }
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c2 = 7;
                    break;
                }
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c2 = 3;
                    break;
                }
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c2 = 1;
                    break;
                }
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c2 = 8;
                    break;
                }
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c2 = 9;
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    c2 = 0;
                    break;
                }
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c2 = 5;
                    break;
                }
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case a.b.AdsAttrs_adSize:
            case a.b.AdsAttrs_adSizes:
            case 2:
            case 3:
                return "internal";
            case 4:
            case 5:
                return "io";
            case 6:
            case 7:
                return "network";
            case 8:
            case 9:
                return "policy";
            default:
                return "internal";
        }
    }

    public abstract void a();

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, int i) {
        jc.a.post(new mr(this, str, str2, i));
    }

    public final void a(String str, String str2, String str3, String str4) {
        jc.a.post(new ms(this, str, str2, str3, str4));
    }

    public abstract boolean a(String str);
}
