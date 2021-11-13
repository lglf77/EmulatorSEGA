package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.y;

public final class wo extends pp {
    public static final Parcelable.Creator<wo> CREATOR = new wp();
    public final String a;
    public final long b;
    public final String c;
    private int d;
    private Long e;
    private Float f;
    private String g;
    private Double h;

    wo(int i, String str, long j, Long l, Float f2, String str2, String str3, Double d2) {
        Double d3 = null;
        this.d = i;
        this.a = str;
        this.b = j;
        this.e = l;
        this.f = null;
        if (i == 1) {
            this.h = f2 != null ? Double.valueOf(f2.doubleValue()) : d3;
        } else {
            this.h = d2;
        }
        this.g = str2;
        this.c = str3;
    }

    wo(wq wqVar) {
        this(wqVar.c, wqVar.d, wqVar.e, wqVar.b);
    }

    wo(String str, long j, Object obj, String str2) {
        y.a(str);
        this.d = 2;
        this.a = str;
        this.b = j;
        this.c = str2;
        if (obj == null) {
            this.e = null;
            this.f = null;
            this.h = null;
            this.g = null;
        } else if (obj instanceof Long) {
            this.e = (Long) obj;
            this.f = null;
            this.h = null;
            this.g = null;
        } else if (obj instanceof String) {
            this.e = null;
            this.f = null;
            this.h = null;
            this.g = (String) obj;
        } else if (obj instanceof Double) {
            this.e = null;
            this.f = null;
            this.h = (Double) obj;
            this.g = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public final Object a() {
        if (this.e != null) {
            return this.e;
        }
        if (this.h != null) {
            return this.h;
        }
        if (this.g != null) {
            return this.g;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.d);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, this.b);
        ps.a(parcel, 4, this.e, false);
        ps.a(parcel, 5, (Float) null, false);
        ps.a(parcel, 6, this.g, false);
        ps.a(parcel, 7, this.c, false);
        ps.a(parcel, 8, this.h, false);
        ps.a(parcel, a2);
    }
}
