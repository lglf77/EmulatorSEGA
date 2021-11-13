package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.gmsg.i;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.aot;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.pp;
import com.google.android.gms.internal.ps;

@bfk
public final class AdOverlayInfoParcel extends pp implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new m();
    public final c a;
    public final aot b;
    public final n c;
    public final mw d;
    public final i e;
    public final String f;
    public final boolean g;
    public final String h;
    public final q i;
    public final int j;
    public final int k;
    public final String l;
    public final jp m;
    public final String n;
    public final p o;

    AdOverlayInfoParcel(c cVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, jp jpVar, String str4, p pVar) {
        this.a = cVar;
        this.b = (aot) c.a(a.C0014a.a(iBinder));
        this.c = (n) c.a(a.C0014a.a(iBinder2));
        this.d = (mw) c.a(a.C0014a.a(iBinder3));
        this.e = (i) c.a(a.C0014a.a(iBinder4));
        this.f = str;
        this.g = z;
        this.h = str2;
        this.i = (q) c.a(a.C0014a.a(iBinder5));
        this.j = i2;
        this.k = i3;
        this.l = str3;
        this.m = jpVar;
        this.n = str4;
        this.o = pVar;
    }

    public AdOverlayInfoParcel(c cVar, aot aot, n nVar, q qVar, jp jpVar) {
        this.a = cVar;
        this.b = aot;
        this.c = nVar;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = qVar;
        this.j = -1;
        this.k = 4;
        this.l = null;
        this.m = jpVar;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(aot aot, n nVar, i iVar, q qVar, mw mwVar, boolean z, int i2, String str, jp jpVar) {
        this.a = null;
        this.b = aot;
        this.c = nVar;
        this.d = mwVar;
        this.e = iVar;
        this.f = null;
        this.g = z;
        this.h = null;
        this.i = qVar;
        this.j = i2;
        this.k = 3;
        this.l = str;
        this.m = jpVar;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(aot aot, n nVar, i iVar, q qVar, mw mwVar, boolean z, int i2, String str, String str2, jp jpVar) {
        this.a = null;
        this.b = aot;
        this.c = nVar;
        this.d = mwVar;
        this.e = iVar;
        this.f = str2;
        this.g = z;
        this.h = str;
        this.i = qVar;
        this.j = i2;
        this.k = 3;
        this.l = null;
        this.m = jpVar;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(aot aot, n nVar, q qVar, mw mwVar, int i2, jp jpVar, String str, p pVar) {
        this.a = null;
        this.b = aot;
        this.c = nVar;
        this.d = mwVar;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = qVar;
        this.j = i2;
        this.k = 1;
        this.l = null;
        this.m = jpVar;
        this.n = str;
        this.o = pVar;
    }

    public AdOverlayInfoParcel(aot aot, n nVar, q qVar, mw mwVar, boolean z, int i2, jp jpVar) {
        this.a = null;
        this.b = aot;
        this.c = nVar;
        this.d = mwVar;
        this.e = null;
        this.f = null;
        this.g = z;
        this.h = null;
        this.i = qVar;
        this.j = i2;
        this.k = 2;
        this.l = null;
        this.m = jpVar;
        this.n = null;
        this.o = null;
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e2) {
            return null;
        }
    }

    public static void a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, (Parcelable) this.a, i2, false);
        ps.a(parcel, 3, c.a(this.b).asBinder(), false);
        ps.a(parcel, 4, c.a(this.c).asBinder(), false);
        ps.a(parcel, 5, c.a(this.d).asBinder(), false);
        ps.a(parcel, 6, c.a(this.e).asBinder(), false);
        ps.a(parcel, 7, this.f, false);
        ps.a(parcel, 8, this.g);
        ps.a(parcel, 9, this.h, false);
        ps.a(parcel, 10, c.a(this.i).asBinder(), false);
        ps.a(parcel, 11, this.j);
        ps.a(parcel, 12, this.k);
        ps.a(parcel, 13, this.l, false);
        ps.a(parcel, 14, (Parcelable) this.m, i2, false);
        ps.a(parcel, 16, this.n, false);
        ps.a(parcel, 17, (Parcelable) this.o, i2, false);
        ps.a(parcel, a2);
    }
}
