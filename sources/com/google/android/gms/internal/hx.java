package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

final class hx implements Runnable {
    final /* synthetic */ Context a;
    private /* synthetic */ String b;
    private /* synthetic */ boolean c;
    private /* synthetic */ boolean d;

    hx(hw hwVar, Context context, String str, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
        builder.setMessage(this.b);
        if (this.c) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.d) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new hy(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
