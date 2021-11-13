package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.a;

public final class al extends ac {
    private IBinder a;
    private /* synthetic */ ab b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al(ab abVar, int i, IBinder iBinder, Bundle bundle) {
        super(abVar, i, bundle);
        this.b = abVar;
        this.a = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void a(a aVar) {
        if (this.b.v != null) {
            this.b.v.a(aVar);
        }
        this.b.a(aVar);
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        try {
            String interfaceDescriptor = this.a.getInterfaceDescriptor();
            if (!this.b.c().equals(interfaceDescriptor)) {
                String c = this.b.c();
                Log.e("GmsClient", new StringBuilder(String.valueOf(c).length() + 34 + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(c).append(" vs. ").append(interfaceDescriptor).toString());
                return false;
            }
            IInterface a2 = this.b.a(this.a);
            if (a2 == null) {
                return false;
            }
            if (!this.b.a(2, 4, a2) && !this.b.a(3, 4, a2)) {
                return false;
            }
            a unused = this.b.y = null;
            Bundle l = this.b.l();
            if (this.b.u != null) {
                this.b.u.a(l);
            }
            return true;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
