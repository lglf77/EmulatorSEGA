package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.pq;

public final class b implements Parcelable.Creator<an> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        g[] gVarArr = null;
        int a = pq.a(parcel);
        Account account = null;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    i3 = pq.d(parcel, readInt);
                    break;
                case 2:
                    i2 = pq.d(parcel, readInt);
                    break;
                case 3:
                    i = pq.d(parcel, readInt);
                    break;
                case 4:
                    str = pq.j(parcel, readInt);
                    break;
                case 5:
                    iBinder = pq.k(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) pq.b(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = pq.l(parcel, readInt);
                    break;
                case 8:
                    account = (Account) pq.a(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    gVarArr = (g[]) pq.b(parcel, readInt, g.CREATOR);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new an(i3, i2, i, str, iBinder, scopeArr, bundle, account, gVarArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new an[i];
    }
}
