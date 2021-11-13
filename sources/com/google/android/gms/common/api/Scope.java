package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.pp;
import com.google.android.gms.internal.ps;

public final class Scope extends pp implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new b();
    private int a;
    private final String b;

    Scope(int i, String str) {
        y.a(str, (Object) "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.a);
        ps.a(parcel, 2, this.b, false);
        ps.a(parcel, a2);
    }
}
