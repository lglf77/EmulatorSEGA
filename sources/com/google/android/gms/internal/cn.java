package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.a;

public abstract class cn extends afv implements cm {
    public cn() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                String a = a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                int b = b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            default:
                return false;
        }
    }
}
