package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

public final class a extends i {
    public static Account a(h hVar) {
        Account account = null;
        if (hVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = hVar.a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public final Account a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
