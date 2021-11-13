package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;

final class axp extends ks<ParcelFileDescriptor> {
    private /* synthetic */ axo a;

    axp(axo axo) {
        this.a = axo;
    }

    public final boolean cancel(boolean z) {
        this.a.a();
        return super.cancel(z);
    }
}
