package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.a.c;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@bfk
public final class aol {
    akt a;
    boolean b;

    public aol() {
    }

    public aol(Context context) {
        asw.a(context);
        if (((Boolean) app.f().a(asw.cJ)).booleanValue()) {
            try {
                this.a = aku.a(DynamiteModule.a(context, DynamiteModule.a, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                c.a(context);
                this.a.a(c.a(context), "GMA_SDK");
                this.b = true;
            } catch (RemoteException | DynamiteModule.c | NullPointerException e) {
                jn.b("Cannot dynamite load clearcut");
            }
        }
    }

    public aol(Context context, String str, String str2) {
        asw.a(context);
        try {
            this.a = aku.a(DynamiteModule.a(context, DynamiteModule.a, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            c.a(context);
            this.a.a(c.a(context), str, (String) null);
            this.b = true;
        } catch (RemoteException | DynamiteModule.c | NullPointerException e) {
            jn.b("Cannot dynamite load clearcut");
        }
    }

    public final aon a(byte[] bArr) {
        return new aon(this, bArr);
    }
}
