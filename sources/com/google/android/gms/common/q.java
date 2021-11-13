package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.pp;
import com.google.android.gms.internal.ps;

public final class q extends pp {
    public static final Parcelable.Creator<q> CREATOR = new r();
    private final String a;
    private final k b;
    private final boolean c;

    q(String str, IBinder iBinder, boolean z) {
        this.a = str;
        this.b = a(iBinder);
        this.c = z;
    }

    q(String str, k kVar, boolean z) {
        this.a = str;
        this.b = kVar;
        this.c = z;
    }

    private static k a(IBinder iBinder) {
        l lVar;
        if (iBinder == null) {
            return null;
        }
        try {
            a a2 = l.a(iBinder).a();
            byte[] bArr = a2 == null ? null : (byte[]) c.a(a2);
            if (bArr != null) {
                lVar = new l(bArr);
            } else {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                lVar = null;
            }
            return lVar;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.a, false);
        if (this.b == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            asBinder = null;
        } else {
            asBinder = this.b.asBinder();
        }
        ps.a(parcel, 2, asBinder, false);
        ps.a(parcel, 3, this.c);
        ps.a(parcel, a2);
    }
}
