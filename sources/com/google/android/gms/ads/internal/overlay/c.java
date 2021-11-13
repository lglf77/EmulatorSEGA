package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.pp;
import com.google.android.gms.internal.ps;

@bfk
public final class c extends pp {
    public static final Parcelable.Creator<c> CREATOR = new b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Intent f;
    private String g;
    private String h;

    public c(Intent intent) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.g = str;
        this.a = str2;
        this.b = str3;
        this.c = str4;
        this.d = str5;
        this.e = str6;
        this.h = str7;
        this.f = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.g, false);
        ps.a(parcel, 3, this.a, false);
        ps.a(parcel, 4, this.b, false);
        ps.a(parcel, 5, this.c, false);
        ps.a(parcel, 6, this.d, false);
        ps.a(parcel, 7, this.e, false);
        ps.a(parcel, 8, this.h, false);
        ps.a(parcel, 9, (Parcelable) this.f, i, false);
        ps.a(parcel, a2);
    }
}
