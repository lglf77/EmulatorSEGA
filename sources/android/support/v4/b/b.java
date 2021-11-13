package android.support.v4.b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.b.a;

public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: a */
        public b[] newArray(int i) {
            return new b[i];
        }
    };
    final boolean a = false;
    final Handler b = null;
    a c;

    class a extends a.C0001a {
        a() {
        }

        public void a(int i, Bundle bundle) {
            if (b.this.b != null) {
                b.this.b.post(new C0003b(i, bundle));
            } else {
                b.this.a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.b.b$b  reason: collision with other inner class name */
    class C0003b implements Runnable {
        final int a;
        final Bundle b;

        C0003b(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }

        public void run() {
            b.this.a(this.a, this.b);
        }
    }

    b(Parcel parcel) {
        this.c = a.C0001a.a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.c == null) {
                this.c = new a();
            }
            parcel.writeStrongBinder(this.c.asBinder());
        }
    }
}
