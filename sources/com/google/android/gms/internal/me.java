package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;
import java.util.concurrent.TimeUnit;

@bfk
public final class me {
    private final Context a;
    private final String b;
    private final jp c;
    private final ath d;
    private final atj e;
    private final ib f = new ie().a("min_1", Double.MIN_VALUE, 1.0d).a("1_5", 1.0d, 5.0d).a("5_10", 5.0d, 10.0d).a("10_20", 10.0d, 20.0d).a("20_30", 20.0d, 30.0d).a("30_max", 30.0d, Double.MAX_VALUE).a();
    private final long[] g;
    private final String[] h;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m;
    private lp n;
    private boolean o;
    private boolean p;
    private long q = -1;

    public me(Context context, jp jpVar, String str, atj atj, ath ath) {
        this.a = context;
        this.c = jpVar;
        this.b = str;
        this.e = atj;
        this.d = ath;
        String str2 = (String) app.f().a(asw.q);
        if (str2 == null) {
            this.h = new String[0];
            this.g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.h = new String[split.length];
        this.g = new long[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                this.g[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException e2) {
                fn.c("Unable to parse frame hash target time number.", e2);
                this.g[i2] = -1;
            }
        }
    }

    public final void a() {
        if (this.i && !this.j) {
            atc.a(this.e, this.d, "vfr2");
            this.j = true;
        }
    }

    public final void a(lp lpVar) {
        atc.a(this.e, this.d, "vpc2");
        this.i = true;
        if (this.e != null) {
            this.e.a("vpn", lpVar.a());
        }
        this.n = lpVar;
    }

    public final void b() {
        if (((Boolean) app.f().a(asw.p)).booleanValue() && !this.o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.b);
            bundle.putString("player", this.n.a());
            for (id next : this.f.a()) {
                String valueOf = String.valueOf("fps_c_");
                String valueOf2 = String.valueOf(next.a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(next.c));
                String valueOf3 = String.valueOf("fps_p_");
                String valueOf4 = String.valueOf(next.a);
                bundle.putString(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), Double.toString(next.b));
            }
            for (int i2 = 0; i2 < this.g.length; i2++) {
                String str = this.h[i2];
                if (str != null) {
                    String valueOf5 = String.valueOf(Long.valueOf(this.g[i2]));
                    bundle.putString(new StringBuilder(String.valueOf("fh_").length() + String.valueOf(valueOf5).length()).append("fh_").append(valueOf5).toString(), str);
                }
            }
            au.e().a(this.a, this.c.a, "gmob-apps", bundle, true);
            this.o = true;
        }
    }

    public final void b(lp lpVar) {
        long j2;
        if (this.k && !this.l) {
            atc.a(this.e, this.d, "vff2");
            this.l = true;
        }
        long c2 = au.k().c();
        if (this.m && this.p && this.q != -1) {
            this.f.a(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c2 - this.q)));
        }
        this.p = this.m;
        this.q = c2;
        long longValue = ((Long) app.f().a(asw.r)).longValue();
        long currentPosition = (long) lpVar.getCurrentPosition();
        int i2 = 0;
        while (i2 < this.h.length) {
            if (this.h[i2] != null || longValue <= Math.abs(currentPosition - this.g[i2])) {
                i2++;
            } else {
                String[] strArr = this.h;
                Bitmap bitmap = lpVar.getBitmap(8, 8);
                long j3 = 0;
                long j4 = 63;
                int i3 = 0;
                while (i3 < 8) {
                    int i4 = 0;
                    long j5 = j3;
                    while (true) {
                        j2 = j4;
                        if (i4 >= 8) {
                            break;
                        }
                        int pixel = bitmap.getPixel(i4, i3);
                        j5 |= (Color.green(pixel) + (Color.blue(pixel) + Color.red(pixel)) > 128 ? 1 : 0) << ((int) j2);
                        i4++;
                        j4 = j2 - 1;
                    }
                    i3++;
                    j4 = j2;
                    j3 = j5;
                }
                strArr[i2] = String.format("%016X", new Object[]{Long.valueOf(j3)});
                return;
            }
        }
    }

    public final void c() {
        this.m = true;
        if (this.j && !this.k) {
            atc.a(this.e, this.d, "vfp2");
            this.k = true;
        }
    }

    public final void d() {
        this.m = false;
    }
}
