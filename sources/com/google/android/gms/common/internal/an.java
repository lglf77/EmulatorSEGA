package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.g;
import com.google.android.gms.common.i;
import com.google.android.gms.internal.pp;
import com.google.android.gms.internal.ps;

public final class an extends pp {
    public static final Parcelable.Creator<an> CREATOR = new b();
    String a;
    IBinder b;
    Scope[] c;
    Bundle d;
    Account e;
    g[] f;
    private int g;
    private int h;
    private int i;

    public an(int i2) {
        this.g = 3;
        this.i = i.a;
        this.h = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.accounts.Account} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.common.internal.h] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    an(int r3, int r4, int r5, java.lang.String r6, android.os.IBinder r7, com.google.android.gms.common.api.Scope[] r8, android.os.Bundle r9, android.accounts.Account r10, com.google.android.gms.common.g[] r11) {
        /*
            r2 = this;
            r0 = 0
            r2.<init>()
            r2.g = r3
            r2.h = r4
            r2.i = r5
            java.lang.String r1 = "com.google.android.gms"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x002a
            java.lang.String r1 = "com.google.android.gms"
            r2.a = r1
        L_0x0016:
            r1 = 2
            if (r3 >= r1) goto L_0x0040
            if (r7 == 0) goto L_0x0021
            if (r7 != 0) goto L_0x002d
        L_0x001d:
            android.accounts.Account r0 = com.google.android.gms.common.internal.a.a(r0)
        L_0x0021:
            r2.e = r0
        L_0x0023:
            r2.c = r8
            r2.d = r9
            r2.f = r11
            return
        L_0x002a:
            r2.a = r6
            goto L_0x0016
        L_0x002d:
            java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
            android.os.IInterface r0 = r7.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.h
            if (r1 == 0) goto L_0x003a
            com.google.android.gms.common.internal.h r0 = (com.google.android.gms.common.internal.h) r0
            goto L_0x001d
        L_0x003a:
            com.google.android.gms.common.internal.j r0 = new com.google.android.gms.common.internal.j
            r0.<init>(r7)
            goto L_0x001d
        L_0x0040:
            r2.b = r7
            r2.e = r10
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.an.<init>(int, int, int, java.lang.String, android.os.IBinder, com.google.android.gms.common.api.Scope[], android.os.Bundle, android.accounts.Account, com.google.android.gms.common.g[]):void");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.g);
        ps.a(parcel, 2, this.h);
        ps.a(parcel, 3, this.i);
        ps.a(parcel, 4, this.a, false);
        ps.a(parcel, 5, this.b, false);
        ps.a(parcel, 6, (T[]) this.c, i2, false);
        ps.a(parcel, 7, this.d, false);
        ps.a(parcel, 8, (Parcelable) this.e, i2, false);
        ps.a(parcel, 10, (T[]) this.f, i2, false);
        ps.a(parcel, a2);
    }
}
