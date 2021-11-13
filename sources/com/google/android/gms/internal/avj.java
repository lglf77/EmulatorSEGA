package com.google.android.gms.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class avj extends afu implements avh {
    avj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final a a() {
        Parcel a = a(1, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final Uri b() {
        Parcel a = a(2, i_());
        Uri uri = (Uri) afw.a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    public final double c() {
        Parcel a = a(3, i_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }
}
