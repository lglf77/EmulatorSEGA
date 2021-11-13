package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

public final class rt extends pp implements Iterable<String> {
    public static final Parcelable.Creator<rt> CREATOR = new rv();
    /* access modifiers changed from: private */
    public final Bundle a;

    rt(Bundle bundle) {
        this.a = bundle;
    }

    public final int a() {
        return this.a.size();
    }

    /* access modifiers changed from: package-private */
    public final Object a(String str) {
        return this.a.get(str);
    }

    public final Bundle b() {
        return new Bundle(this.a);
    }

    /* access modifiers changed from: package-private */
    public final Long b(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    /* access modifiers changed from: package-private */
    public final Double c(String str) {
        return Double.valueOf(this.a.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    public final String d(String str) {
        return this.a.getString(str);
    }

    public final Iterator<String> iterator() {
        return new ru(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, b(), false);
        ps.a(parcel, a2);
    }
}
