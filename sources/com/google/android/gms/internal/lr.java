package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.internal.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@bfk
public final class lr extends FrameLayout implements lo {
    private final md a;
    private final FrameLayout b;
    private final atj c;
    private final mf d;
    private final long e;
    private lp f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private String m;
    private Bitmap n;
    private ImageView o;
    private boolean p;

    public lr(Context context, md mdVar, int i2, boolean z, atj atj, mc mcVar) {
        super(context);
        this.a = mdVar;
        this.c = atj;
        this.b = new FrameLayout(context);
        addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        z.a(mdVar.e());
        this.f = mdVar.e().b.a(context, mdVar, i2, z, atj, mcVar);
        if (this.f != null) {
            this.b.addView(this.f, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) app.f().a(asw.s)).booleanValue()) {
                m();
            }
        }
        this.o = new ImageView(context);
        this.e = ((Long) app.f().a(asw.w)).longValue();
        this.j = ((Boolean) app.f().a(asw.u)).booleanValue();
        if (this.c != null) {
            this.c.a("spinner_used", this.j ? "1" : "0");
        }
        this.d = new mf(this);
        if (this.f != null) {
            this.f.a((lo) this);
        }
        if (this.f == null) {
            a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void a(md mdVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        mdVar.a("onVideoEvent", hashMap);
    }

    public static void a(md mdVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        mdVar.a("onVideoEvent", hashMap);
    }

    public static void a(md mdVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        mdVar.a("onVideoEvent", hashMap);
    }

    /* access modifiers changed from: private */
    public final void a(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        int length = strArr.length;
        int i2 = 0;
        String str2 = null;
        while (i2 < length) {
            String str3 = strArr[i2];
            if (str2 != null) {
                hashMap.put(str2, str3);
                str3 = null;
            }
            i2++;
            str2 = str3;
        }
        this.a.a("onVideoEvent", hashMap);
    }

    private final boolean p() {
        return this.o.getParent() != null;
    }

    private final void q() {
        if (this.a.d() != null && this.h && !this.i) {
            this.a.d().getWindow().clearFlags(128);
            this.h = false;
        }
    }

    public final void a() {
        this.d.b();
        gw.a.post(new ls(this));
    }

    public final void a(float f2) {
        if (this.f != null) {
            lp lpVar = this.f;
            lpVar.b.a(f2);
            lpVar.e();
        }
    }

    public final void a(float f2, float f3) {
        if (this.f != null) {
            this.f.a(f2, f3);
        }
    }

    public final void a(int i2) {
        if (this.f != null) {
            this.f.a(i2);
        }
    }

    public final void a(int i2, int i3) {
        if (this.j) {
            int max = Math.max(i2 / ((Integer) app.f().a(asw.v)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) app.f().a(asw.v)).intValue(), 1);
            if (this.n == null || this.n.getWidth() != max || this.n.getHeight() != max2) {
                this.n = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.p = false;
            }
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (i4 != 0 && i5 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.setMargins(i2, i3, 0, 0);
            this.b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    @TargetApi(14)
    public final void a(MotionEvent motionEvent) {
        if (this.f != null) {
            this.f.dispatchTouchEvent(motionEvent);
        }
    }

    public final void a(String str) {
        this.m = str;
    }

    public final void a(String str, String str2) {
        a("error", "what", str, "extra", str2);
    }

    public final void b() {
        if (this.f != null && this.l == 0) {
            a("canplaythrough", "duration", String.valueOf(((float) this.f.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.f.getVideoWidth()), "videoHeight", String.valueOf(this.f.getVideoHeight()));
        }
    }

    public final void c() {
        if (this.a.d() != null && !this.h) {
            this.i = (this.a.d().getWindow().getAttributes().flags & 128) != 0;
            if (!this.i) {
                this.a.d().getWindow().addFlags(128);
                this.h = true;
            }
        }
        this.g = true;
    }

    public final void d() {
        a("pause", new String[0]);
        q();
        this.g = false;
    }

    public final void e() {
        a("ended", new String[0]);
        q();
    }

    public final void f() {
        if (this.p && this.n != null && !p()) {
            this.o.setImageBitmap(this.n);
            this.o.invalidate();
            this.b.addView(this.o, new FrameLayout.LayoutParams(-1, -1));
            this.b.bringChildToFront(this.o);
        }
        this.d.a();
        this.l = this.k;
        gw.a.post(new lt(this));
    }

    public final void g() {
        if (this.g && p()) {
            this.b.removeView(this.o);
        }
        if (this.n != null) {
            long b2 = au.k().b();
            if (this.f.getBitmap(this.n) != null) {
                this.p = true;
            }
            long b3 = au.k().b() - b2;
            if (fn.a()) {
                fn.a(new StringBuilder(46).append("Spinner frame grab took ").append(b3).append("ms").toString());
            }
            if (b3 > this.e) {
                fn.e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.j = false;
                this.n = null;
                if (this.c != null) {
                    this.c.a("spinner_jank", Long.toString(b3));
                }
            }
        }
    }

    public final void h() {
        if (this.f != null) {
            if (!TextUtils.isEmpty(this.m)) {
                this.f.setVideoPath(this.m);
            } else {
                a("no_src", new String[0]);
            }
        }
    }

    public final void i() {
        if (this.f != null) {
            this.f.d();
        }
    }

    public final void j() {
        if (this.f != null) {
            this.f.c();
        }
    }

    public final void k() {
        if (this.f != null) {
            lp lpVar = this.f;
            lpVar.b.a(true);
            lpVar.e();
        }
    }

    public final void l() {
        if (this.f != null) {
            lp lpVar = this.f;
            lpVar.b.a(false);
            lpVar.e();
        }
    }

    @TargetApi(14)
    public final void m() {
        if (this.f != null) {
            TextView textView = new TextView(this.f.getContext());
            String valueOf = String.valueOf(this.f.a());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.b.bringChildToFront(textView);
        }
    }

    public final void n() {
        this.d.a();
        if (this.f != null) {
            this.f.b();
        }
        q();
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        if (this.f != null) {
            long currentPosition = (long) this.f.getCurrentPosition();
            if (this.k != currentPosition && currentPosition > 0) {
                a("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.k = currentPosition;
            }
        }
    }
}
