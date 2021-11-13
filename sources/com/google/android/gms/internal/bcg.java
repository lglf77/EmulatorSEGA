package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.a;
import com.google.android.gms.ads.internal.au;
import java.util.Map;

@bfk
public final class bcg extends bco {
    private final Map<String, String> a;
    /* access modifiers changed from: private */
    public final Context b;

    public bcg(mw mwVar, Map<String, String> map) {
        super(mwVar, "storePicture");
        this.a = map;
        this.b = mwVar.d();
    }

    public final void a() {
        if (this.b == null) {
            a("Activity context is not available");
            return;
        }
        au.e();
        if (!gw.f(this.b).c()) {
            a("Feature is not supported by the device.");
            return;
        }
        String str = this.a.get("iurl");
        if (TextUtils.isEmpty(str)) {
            a("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            a(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            au.e();
            if (!gw.c(lastPathSegment)) {
                String valueOf2 = String.valueOf(lastPathSegment);
                a(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
                return;
            }
            Resources v = au.i().v();
            au.e();
            AlertDialog.Builder e = gw.e(this.b);
            e.setTitle(v != null ? v.getString(a.C0013a.s1) : "Save image");
            e.setMessage(v != null ? v.getString(a.C0013a.s2) : "Allow Ad to store image in Picture gallery?");
            e.setPositiveButton(v != null ? v.getString(a.C0013a.s3) : "Accept", new bch(this, str, lastPathSegment));
            e.setNegativeButton(v != null ? v.getString(a.C0013a.s4) : "Decline", new bci(this));
            e.create().show();
        }
    }
}
