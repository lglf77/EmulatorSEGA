package com.google.android.gms.internal;

import android.content.DialogInterface;

final class hr implements DialogInterface.OnClickListener {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ int c;
    private /* synthetic */ hq d;

    hr(hq hqVar, int i, int i2, int i3) {
        this.d = hqVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == this.a) {
            this.d.b();
            return;
        }
        if (i == this.b) {
            if (((Boolean) app.f().a(asw.cy)).booleanValue()) {
                this.d.c();
                return;
            }
        }
        if (i == this.c) {
            if (((Boolean) app.f().a(asw.cz)).booleanValue()) {
                this.d.d();
            }
        }
    }
}
