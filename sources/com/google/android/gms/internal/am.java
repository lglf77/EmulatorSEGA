package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.util.i;
import java.io.DataInputStream;
import java.io.IOException;

@bfk
public final class am extends pp {
    public static final Parcelable.Creator<am> CREATOR = new ao();
    private ParcelFileDescriptor a;
    private Parcelable b;
    private boolean c;

    public am(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
        this.b = null;
        this.c = true;
    }

    public am(pt ptVar) {
        this.a = null;
        this.b = ptVar;
        this.c = false;
    }

    /* JADX INFO: finally extract failed */
    private final ParcelFileDescriptor a() {
        if (this.a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.a = a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.a;
    }

    private final <T> ParcelFileDescriptor a(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new an(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
            fn.b("Error transporting the ad response", e);
            au.i().a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
            i.a(autoCloseOutputStream);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public final <T extends pt> T a(Parcelable.Creator<T> creator) {
        if (this.c) {
            if (this.a == null) {
                fn.c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.a));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                i.a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.b = (pt) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                fn.b("Could not read from parcel file descriptor", e);
                i.a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                i.a(dataInputStream);
                throw th2;
            }
        }
        return (pt) this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        a();
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, (Parcelable) this.a, i, false);
        ps.a(parcel, a2);
    }
}
