package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.s;

public abstract class d<T> {
    private final String a;
    private T b;

    protected d(String str) {
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final T a(Context context) {
        if (this.b == null) {
            y.a(context);
            Context c = s.c(context);
            if (c == null) {
                throw new e("Could not get remote context.");
            }
            try {
                this.b = a((IBinder) c.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new e("Could not load creator class.", e);
            } catch (InstantiationException e2) {
                throw new e("Could not instantiate creator.", e2);
            } catch (IllegalAccessException e3) {
                throw new e("Could not access creator.", e3);
            }
        }
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);
}
