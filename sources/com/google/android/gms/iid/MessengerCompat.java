package com.google.android.gms.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator<MessengerCompat> CREATOR = new c();
    private Messenger a;
    private a b;

    public MessengerCompat(IBinder iBinder) {
        a bVar;
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = new Messenger(iBinder);
            return;
        }
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            bVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new b(iBinder);
        }
        this.b = bVar;
    }

    private final IBinder a() {
        return this.a != null ? this.a.getBinder() : this.b.asBinder();
    }

    public final void a(Message message) {
        if (this.a != null) {
            this.a.send(message);
        } else {
            this.b.a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((MessengerCompat) obj).a());
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.a != null) {
            parcel.writeStrongBinder(this.a.getBinder());
        } else {
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
