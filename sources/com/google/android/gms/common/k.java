package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.h;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class k extends l {
    private int a;

    protected k(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 25) {
            int length = bArr.length;
            String a2 = h.a(bArr, 0, bArr.length, false);
            Log.wtf("GoogleCertificates", new StringBuilder(String.valueOf(a2).length() + 51).append("Cert hash data has incorrect length (").append(length).append("):\n").append(a2).toString(), new Exception());
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            y.b(bArr.length == 25 ? true : z, new StringBuilder(55).append("cert hash data has incorrect length. length=").append(bArr.length).toString());
        }
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final a a() {
        return c.a(c());
    }

    public final int b() {
        return hashCode();
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] c();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof com.google.android.gms.common.internal.k)) {
            return false;
        }
        try {
            com.google.android.gms.common.internal.k kVar = (com.google.android.gms.common.internal.k) obj;
            if (kVar.b() != hashCode()) {
                return false;
            }
            a a2 = kVar.a();
            if (a2 == null) {
                return false;
            }
            return Arrays.equals(c(), (byte[]) c.a(a2));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public int hashCode() {
        return this.a;
    }
}
