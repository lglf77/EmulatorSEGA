package com.google.android.gms.internal;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

public final class aew extends aft {
    public aew(yj yjVar, String str, String str2, pb pbVar, int i, int i2) {
        super(yjVar, str, str2, pbVar, i, 49);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.F = 2;
        try {
            this.b.F = Integer.valueOf(((Boolean) this.c.invoke((Object) null, new Object[]{this.a.a()})).booleanValue() ? 1 : 0);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
