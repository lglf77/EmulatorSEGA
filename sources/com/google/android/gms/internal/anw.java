package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

@bfk
public final class anw extends pp {
    public static final Parcelable.Creator<anw> CREATOR = new anx();
    private ParcelFileDescriptor a;

    public anw() {
        this((ParcelFileDescriptor) null);
    }

    public anw(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    private synchronized ParcelFileDescriptor c() {
        return this.a;
    }

    public final synchronized boolean a() {
        return this.a != null;
    }

    public final synchronized InputStream b() {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = null;
        synchronized (this) {
            if (this.a != null) {
                autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.a);
                this.a = null;
            }
        }
        return autoCloseInputStream;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, (Parcelable) c(), i, false);
        ps.a(parcel, a2);
    }
}
