package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement;

final class ui implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ String c;
    private /* synthetic */ long d;
    private /* synthetic */ tp e;

    ui(tp tpVar, String str, String str2, String str3, long j) {
        this.e = tpVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final void run() {
        if (this.a == null) {
            this.e.a.v().a(this.b, (AppMeasurement.g) null);
            return;
        }
        AppMeasurement.g gVar = new AppMeasurement.g();
        gVar.b = this.c;
        gVar.c = this.a;
        gVar.d = this.d;
        this.e.a.v().a(this.b, gVar);
    }
}
