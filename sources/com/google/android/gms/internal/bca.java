package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.a;
import com.google.android.gms.ads.internal.au;
import java.util.Map;

@bfk
public final class bca extends bco {
    private final Map<String, String> a;
    /* access modifiers changed from: private */
    public final Context b;
    private String c = d("description");
    private long d = e("start_ticks");
    private long e = e("end_ticks");
    private String f = d("summary");
    private String g = d("location");

    public bca(mw mwVar, Map<String, String> map) {
        super(mwVar, "createCalendarEvent");
        this.a = map;
        this.b = mwVar.d();
    }

    private final String d(String str) {
        return TextUtils.isEmpty(this.a.get(str)) ? "" : this.a.get(str);
    }

    private final long e(String str) {
        String str2 = this.a.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e2) {
            return -1;
        }
    }

    public final void a() {
        if (this.b == null) {
            a("Activity context is not available.");
            return;
        }
        au.e();
        if (!gw.f(this.b).d()) {
            a("This feature is not available on the device.");
            return;
        }
        au.e();
        AlertDialog.Builder e2 = gw.e(this.b);
        Resources v = au.i().v();
        e2.setTitle(v != null ? v.getString(a.C0013a.s5) : "Create calendar event");
        e2.setMessage(v != null ? v.getString(a.C0013a.s6) : "Allow Ad to create a calendar event?");
        e2.setPositiveButton(v != null ? v.getString(a.C0013a.s3) : "Accept", new bcb(this));
        e2.setNegativeButton(v != null ? v.getString(a.C0013a.s4) : "Decline", new bcc(this));
        e2.create().show();
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    public final Intent b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.c);
        data.putExtra("eventLocation", this.g);
        data.putExtra("description", this.f);
        if (this.d > -1) {
            data.putExtra("beginTime", this.d);
        }
        if (this.e > -1) {
            data.putExtra("endTime", this.e);
        }
        data.setFlags(268435456);
        return data;
    }
}
