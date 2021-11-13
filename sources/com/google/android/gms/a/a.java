package com.google.android.gms.a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.afv;

public interface a extends IInterface {

    /* renamed from: com.google.android.gms.a.a$a  reason: collision with other inner class name */
    public static abstract class C0014a extends afv implements a {
        public C0014a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new b(iBinder);
        }
    }
}
