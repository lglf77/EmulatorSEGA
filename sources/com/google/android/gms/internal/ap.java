package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@bfk
public final class ap extends pp {
    public static final Parcelable.Creator<ap> CREATOR = new aq();
    private Bundle a;
    private jp b;
    private ApplicationInfo c;
    private String d;
    private List<String> e;
    private PackageInfo f;
    private String g;
    private boolean h;
    private String i;

    public ap(Bundle bundle, jp jpVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.a = bundle;
        this.b = jpVar;
        this.d = str;
        this.c = applicationInfo;
        this.e = list;
        this.f = packageInfo;
        this.g = str2;
        this.h = z;
        this.i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.a, false);
        ps.a(parcel, 2, (Parcelable) this.b, i2, false);
        ps.a(parcel, 3, (Parcelable) this.c, i2, false);
        ps.a(parcel, 4, this.d, false);
        ps.b(parcel, 5, this.e, false);
        ps.a(parcel, 6, (Parcelable) this.f, i2, false);
        ps.a(parcel, 7, this.g, false);
        ps.a(parcel, 8, this.h);
        ps.a(parcel, 9, this.i, false);
        ps.a(parcel, a2);
    }
}
