package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

@bfk
public final class bcn extends bco implements aa<mw> {
    private final mw a;
    private final Context b;
    private final WindowManager c;
    private final ash d;
    private DisplayMetrics e;
    private float f;
    private int g = -1;
    private int h = -1;
    private int i;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;

    public bcn(mw mwVar, Context context, ash ash) {
        super(mwVar);
        this.a = mwVar;
        this.b = context;
        this.d = ash;
        this.c = (WindowManager) context.getSystemService("window");
    }

    public final void a(int i2, int i3) {
        int i4 = this.b instanceof Activity ? au.e().c((Activity) this.b)[0] : 0;
        if (this.a.u() == null || !this.a.u().d()) {
            app.a();
            this.l = jc.b(this.b, this.a.getWidth());
            app.a();
            this.m = jc.b(this.b, this.a.getHeight());
        }
        b(i2, i3 - i4, this.l, this.m);
        this.a.w().a(i2, i3);
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        this.e = new DisplayMetrics();
        Display defaultDisplay = this.c.getDefaultDisplay();
        defaultDisplay.getMetrics(this.e);
        this.f = this.e.density;
        this.i = defaultDisplay.getRotation();
        app.a();
        this.g = jc.b(this.e, this.e.widthPixels);
        app.a();
        this.h = jc.b(this.e, this.e.heightPixels);
        Activity d2 = this.a.d();
        if (d2 == null || d2.getWindow() == null) {
            this.j = this.g;
            this.k = this.h;
        } else {
            au.e();
            int[] a2 = gw.a(d2);
            app.a();
            this.j = jc.b(this.e, a2[0]);
            app.a();
            this.k = jc.b(this.e, a2[1]);
        }
        if (this.a.u().d()) {
            this.l = this.g;
            this.m = this.h;
        } else {
            this.a.measure(0, 0);
        }
        a(this.g, this.h, this.j, this.k, this.f, this.i);
        this.a.a("onDeviceFeaturesReceived", new bcj(new bcl().b(this.d.a()).a(this.d.b()).c(this.d.d()).d(this.d.c()).e(true)).a());
        int[] iArr = new int[2];
        this.a.getLocationOnScreen(iArr);
        app.a();
        int b2 = jc.b(this.b, iArr[0]);
        app.a();
        a(b2, jc.b(this.b, iArr[1]));
        if (fn.a(2)) {
            fn.d("Dispatching Ready Event.");
        }
        b(this.a.k().a);
    }
}
