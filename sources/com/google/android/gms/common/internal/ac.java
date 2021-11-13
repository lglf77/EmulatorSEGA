package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.a;
import com.google.android.gms.common.a;

abstract class ac extends ag<Boolean> {
    private int a;
    private Bundle b;
    private /* synthetic */ ab c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ac(ab abVar, int i, Bundle bundle) {
        super(abVar, true);
        this.c = abVar;
        this.a = i;
        this.b = bundle;
    }

    /* access modifiers changed from: protected */
    public abstract void a(a aVar);

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.c.a(1, null);
            return;
        }
        switch (this.a) {
            case a.b.AdsAttrs_adSize:
                if (!a()) {
                    this.c.a(1, null);
                    a(new com.google.android.gms.common.a(8, (PendingIntent) null));
                    return;
                }
                return;
            case 10:
                this.c.a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.c.a(1, null);
                if (this.b != null) {
                    pendingIntent = (PendingIntent) this.b.getParcelable("pendingIntent");
                }
                a(new com.google.android.gms.common.a(this.a, pendingIntent));
                return;
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();
}
