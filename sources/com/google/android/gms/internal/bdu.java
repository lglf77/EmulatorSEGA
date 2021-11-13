package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@bfk
public final class bdu extends bdj {
    protected bai g;
    private bar h;
    private baa i;
    private bac j;
    private final atj k;
    /* access modifiers changed from: private */
    public final mw l;
    /* access modifiers changed from: private */
    public boolean m;

    bdu(Context context, ew ewVar, bar bar, bdp bdp, atj atj, mw mwVar) {
        super(context, ewVar, bdp);
        this.h = bar;
        this.j = ewVar.c;
        this.k = atj;
        this.l = mwVar;
    }

    private static String a(List<bai> list) {
        int i2;
        if (list == null) {
            return "".toString();
        }
        String str = "";
        for (bai next : list) {
            if (!(next == null || next.b == null || TextUtils.isEmpty(next.b.d))) {
                String valueOf = String.valueOf(str);
                String str2 = next.b.d;
                switch (next.a) {
                    case -1:
                        i2 = 4;
                        break;
                    case a.b.AdsAttrs_adSize:
                        i2 = 0;
                        break;
                    case a.b.AdsAttrs_adSizes:
                        i2 = 1;
                        break;
                    case 3:
                        i2 = 2;
                        break;
                    case 4:
                        i2 = 3;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    default:
                        i2 = 6;
                        break;
                }
                String sb = new StringBuilder(String.valueOf(str2).length() + 33).append(str2).append(".").append(i2).append(".").append(next.g).toString();
                str = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb).length()).append(valueOf).append(sb).append("_").toString();
            }
        }
        return str.substring(0, Math.max(0, str.length() - 1));
    }

    /* access modifiers changed from: protected */
    public final ev a(int i2) {
        v vVar = this.e.a;
        return new ev(vVar.c, this.l, this.f.c, i2, this.f.e, this.f.i, this.f.k, this.f.j, vVar.i, this.f.g, this.g != null ? this.g.b : null, this.g != null ? this.g.c : null, this.g != null ? this.g.d : AdMobAdapter.class.getName(), this.j, this.g != null ? this.g.e : null, this.f.h, this.e.d, this.f.f, this.e.f, this.f.m, this.f.n, this.e.h, (auk) null, this.f.A, this.f.B, this.f.C, this.j != null ? this.j.n : false, this.f.E, this.i != null ? a(this.i.b()) : null, this.f.H, this.f.L, this.e.i, this.f.O, this.e.j);
    }

    /* access modifiers changed from: protected */
    public final void a(long j2) {
        baa bao;
        Bundle bundle;
        synchronized (this.d) {
            if (this.j.l != -1) {
                bao = new bal(this.b, this.e.a, this.h, this.j, this.f.s, this.f.z, this.f.J, j2, ((Long) app.f().a(asw.bn)).longValue(), 2, this.e.j);
            } else {
                bao = new bao(this.b, this.e.a, this.h, this.j, this.f.s, this.f.z, this.f.J, j2, ((Long) app.f().a(asw.bn)).longValue(), this.k, this.e.j);
            }
            this.i = bao;
        }
        ArrayList arrayList = new ArrayList(this.j.a);
        boolean z = false;
        Bundle bundle2 = this.e.a.c.m;
        if (!(bundle2 == null || (bundle = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter")) == null)) {
            z = bundle.getBoolean("_skipMediation");
        }
        if (z) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((bab) listIterator.next()).c.contains("com.google.ads.mediation.admob.AdMobAdapter")) {
                    listIterator.remove();
                }
            }
        }
        this.g = this.i.a(arrayList);
        switch (this.g.a) {
            case a.b.AdsAttrs_adSize:
                if (this.g.b != null && this.g.b.m != null) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    gw.a.post(new bdv(this, countDownLatch));
                    try {
                        countDownLatch.await(10, TimeUnit.SECONDS);
                        synchronized (this.d) {
                            if (!this.m) {
                                throw new bdm("View could not be prepared", 0);
                            } else if (this.l.B()) {
                                throw new bdm("Assets not loaded, web view is destroyed", 0);
                            }
                        }
                        return;
                    } catch (InterruptedException e) {
                        String valueOf = String.valueOf(e);
                        throw new bdm(new StringBuilder(String.valueOf(valueOf).length() + 38).append("Interrupted while waiting for latch : ").append(valueOf).toString(), 0);
                    }
                } else {
                    return;
                }
            case a.b.AdsAttrs_adSizes:
                throw new bdm("No fill from any mediation ad networks.", 3);
            default:
                throw new bdm(new StringBuilder(40).append("Unexpected mediation result: ").append(this.g.a).toString(), 0);
        }
    }

    public final void b() {
        synchronized (this.d) {
            super.b();
            if (this.i != null) {
                this.i.a();
            }
        }
    }
}
