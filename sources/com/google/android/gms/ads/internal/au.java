package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.js.n;
import com.google.android.gms.ads.internal.overlay.a;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.ads.internal.overlay.r;
import com.google.android.gms.ads.internal.overlay.s;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.f;
import com.google.android.gms.internal.amt;
import com.google.android.gms.internal.anq;
import com.google.android.gms.internal.anr;
import com.google.android.gms.internal.aof;
import com.google.android.gms.internal.atb;
import com.google.android.gms.internal.ayz;
import com.google.android.gms.internal.azj;
import com.google.android.gms.internal.bak;
import com.google.android.gms.internal.bdo;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.bfl;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.em;
import com.google.android.gms.internal.fa;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hh;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.ho;
import com.google.android.gms.internal.hw;
import com.google.android.gms.internal.iq;
import com.google.android.gms.internal.ir;
import com.google.android.gms.internal.iy;
import com.google.android.gms.internal.kt;
import com.google.android.gms.internal.la;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.ng;

@bfk
public final class au {
    private static final Object a = new Object();
    private static au b;
    private final aa A;
    private final aof B;
    private final em C;
    private final mn D;
    private final la E;
    private final n F;
    private final ho G;
    private final iy H;
    private final a c = new a();
    private final bfl d = new bfl();
    private final l e = new l();
    private final bdo f = new bdo();
    private final gw g = new gw();
    private final ng h = new ng();
    private final hc i;
    private final amt j;
    private final fa k;
    private final anq l;
    private final anr m;
    private final d n;
    private final d o;
    private final atb p;
    private final hw q;
    private final bu r;
    private final kt s;
    private final ayz t;
    private final azj u;
    private final iq v;
    private final r w;
    private final s x;
    private final bak y;
    private final ir z;

    static {
        au auVar = new au();
        synchronized (a) {
            b = auVar;
        }
    }

    protected au() {
        int i2 = Build.VERSION.SDK_INT;
        this.i = i2 >= 21 ? new hn() : i2 >= 19 ? new hm() : i2 >= 18 ? new hk() : i2 >= 17 ? new hi() : i2 >= 16 ? new hl() : new hh();
        this.j = new amt();
        this.k = new fa(this.g);
        this.l = new anq();
        this.m = new anr();
        this.n = f.d();
        this.o = new d();
        this.p = new atb();
        this.q = new hw();
        this.r = new bu();
        this.F = new n();
        this.s = new kt();
        this.t = new ayz();
        this.u = new azj();
        this.v = new iq();
        this.w = new r();
        this.x = new s();
        this.y = new bak();
        this.z = new ir();
        this.A = new aa();
        this.B = new aof();
        this.C = new em();
        this.D = new mn();
        this.E = new la();
        this.G = new ho();
        this.H = new iy();
    }

    public static n A() {
        return D().F;
    }

    public static ho B() {
        return D().G;
    }

    public static iy C() {
        return D().H;
    }

    private static au D() {
        au auVar;
        synchronized (a) {
            auVar = b;
        }
        return auVar;
    }

    public static bfl a() {
        return D().d;
    }

    public static a b() {
        return D().c;
    }

    public static l c() {
        return D().e;
    }

    public static bdo d() {
        return D().f;
    }

    public static gw e() {
        return D().g;
    }

    public static ng f() {
        return D().h;
    }

    public static hc g() {
        return D().i;
    }

    public static amt h() {
        return D().j;
    }

    public static fa i() {
        return D().k;
    }

    public static anr j() {
        return D().m;
    }

    public static d k() {
        return D().n;
    }

    public static d l() {
        return D().o;
    }

    public static atb m() {
        return D().p;
    }

    public static hw n() {
        return D().q;
    }

    public static bu o() {
        return D().r;
    }

    public static kt p() {
        return D().s;
    }

    public static ayz q() {
        return D().t;
    }

    public static azj r() {
        return D().u;
    }

    public static iq s() {
        return D().v;
    }

    public static r t() {
        return D().w;
    }

    public static s u() {
        return D().x;
    }

    public static bak v() {
        return D().y;
    }

    public static ir w() {
        return D().z;
    }

    public static mn x() {
        return D().D;
    }

    public static la y() {
        return D().E;
    }

    public static em z() {
        return D().C;
    }
}
