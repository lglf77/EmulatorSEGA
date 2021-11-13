package com.google.android.gms.internal;

import java.io.Serializable;
import java.util.Iterator;

public abstract class age implements Serializable, Iterable<Byte> {
    public static final age a = new agl(ahe.b);
    private static final agi b;
    private int c = 0;

    static {
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException e) {
            z = false;
        }
        b = z ? new agm((agf) null) : new agg((agf) null);
    }

    age() {
    }

    public static age a(String str) {
        return new agl(str.getBytes(ahe.a));
    }

    public static age a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static age a(byte[] bArr, int i, int i2) {
        return new agl(b.a(bArr, i, i2));
    }

    static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(new StringBuilder(32).append("Beginning index: ").append(i).append(" < 0").toString());
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(new StringBuilder(66).append("Beginning index larger than ending index: ").append(i).append(", ").append(i2).toString());
        } else {
            throw new IndexOutOfBoundsException(new StringBuilder(37).append("End index: ").append(i2).append(" >= ").append(i3).toString());
        }
    }

    static age b(byte[] bArr) {
        return new agl(bArr);
    }

    static agj b(int i) {
        return new agj(i, (agf) null);
    }

    static void b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(new StringBuilder(22).append("Index < 0: ").append(i).toString());
        }
        throw new ArrayIndexOutOfBoundsException(new StringBuilder(40).append("Index > length: ").append(i).append(", ").append(i2).toString());
    }

    public abstract byte a(int i);

    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public abstract age a(int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract void a(agd agd);

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr, int i, int i2, int i3);

    public final boolean b() {
        return a() == 0;
    }

    public final byte[] c() {
        int a2 = a();
        if (a2 == 0) {
            return ahe.b;
        }
        byte[] bArr = new byte[a2];
        a(bArr, 0, 0, a2);
        return bArr;
    }

    public abstract agn d();

    /* access modifiers changed from: protected */
    public final int e() {
        return this.c;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int a2 = a();
            i = a(a2, 0, a2);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new agf(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a())});
    }
}
