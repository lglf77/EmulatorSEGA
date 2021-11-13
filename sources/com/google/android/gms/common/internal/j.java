package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.afu;
import com.google.android.gms.internal.afw;

public final class j extends afu implements h {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account a() {
        Parcel a = a(2, i_());
        Account account = (Account) afw.a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
