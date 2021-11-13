package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.pp;
import com.google.android.gms.internal.ps;
import java.util.Arrays;

public final class Status extends pp implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new c();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Status f = new Status(17);
    private static Status g = new Status(18);
    private int h;
    private final int i;
    private final String j;
    private final PendingIntent k;

    public Status(int i2) {
        this(i2, (String) null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.h = i2;
        this.i = i3;
        this.j = str;
        this.k = pendingIntent;
    }

    public Status(int i2, String str) {
        this(1, i2, str, (PendingIntent) null);
    }

    public final String a() {
        return this.j;
    }

    public final boolean b() {
        return this.i <= 0;
    }

    public final int c() {
        return this.i;
    }

    public final String d() {
        return this.j != null ? this.j : a.a(this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.h == status.h && this.i == status.i && v.a(this.j, status.j) && v.a(this.k, status.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k});
    }

    public final String toString() {
        return v.a(this).a("statusCode", d()).a("resolution", this.k).toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, c());
        ps.a(parcel, 2, a(), false);
        ps.a(parcel, 3, (Parcelable) this.k, i2, false);
        ps.a(parcel, 1000, this.h);
        ps.a(parcel, a2);
    }
}
