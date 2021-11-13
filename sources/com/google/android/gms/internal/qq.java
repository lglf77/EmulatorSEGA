package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class qq extends pp {
    public static final Parcelable.Creator<qq> CREATOR = new qr();
    private int a;
    private pb b = null;
    private byte[] c;

    qq(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        b();
    }

    private final void b() {
        if (this.b == null && this.c != null) {
            return;
        }
        if (this.b != null && this.c == null) {
            return;
        }
        if (this.b != null && this.c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.b == null && this.c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final pb a() {
        if (!(this.b != null)) {
            try {
                this.b = (pb) akf.a(new pb(), this.c);
                this.c = null;
            } catch (ake e) {
                throw new IllegalStateException(e);
            }
        }
        b();
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.a);
        ps.a(parcel, 2, this.c != null ? this.c : akf.a((akf) this.b), false);
        ps.a(parcel, a2);
    }
}
