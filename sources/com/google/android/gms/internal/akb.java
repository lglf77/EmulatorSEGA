package com.google.android.gms.internal;

public final class akb implements Cloneable {
    private static final akc a = new akc();
    private boolean b;
    private int[] c;
    private akc[] d;
    private int e;

    akb() {
        this(10);
    }

    private akb(int i) {
        this.b = false;
        int c2 = c(i);
        this.c = new int[c2];
        this.d = new akc[c2];
        this.e = 0;
    }

    private static int c(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            } else if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            } else {
                i3++;
            }
        }
        return i2 / 4;
    }

    private final int d(int i) {
        int i2 = 0;
        int i3 = this.e - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.c[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final akc a(int i) {
        int d2 = d(i);
        if (d2 < 0 || this.d[d2] == a) {
            return null;
        }
        return this.d[d2];
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, akc akc) {
        int d2 = d(i);
        if (d2 >= 0) {
            this.d[d2] = akc;
            return;
        }
        int i2 = d2 ^ -1;
        if (i2 >= this.e || this.d[i2] != a) {
            if (this.e >= this.c.length) {
                int c2 = c(this.e + 1);
                int[] iArr = new int[c2];
                akc[] akcArr = new akc[c2];
                System.arraycopy(this.c, 0, iArr, 0, this.c.length);
                System.arraycopy(this.d, 0, akcArr, 0, this.d.length);
                this.c = iArr;
                this.d = akcArr;
            }
            if (this.e - i2 != 0) {
                System.arraycopy(this.c, i2, this.c, i2 + 1, this.e - i2);
                System.arraycopy(this.d, i2, this.d, i2 + 1, this.e - i2);
            }
            this.c[i2] = i;
            this.d[i2] = akc;
            this.e++;
            return;
        }
        this.c[i2] = i;
        this.d[i2] = akc;
    }

    /* access modifiers changed from: package-private */
    public final akc b(int i) {
        return this.d[i];
    }

    public final boolean b() {
        return this.e == 0;
    }

    public final /* synthetic */ Object clone() {
        int i = this.e;
        akb akb = new akb(i);
        System.arraycopy(this.c, 0, akb.c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d[i2] != null) {
                akb.d[i2] = (akc) this.d[i2].clone();
            }
        }
        akb.e = i;
        return akb;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akb)) {
            return false;
        }
        akb akb = (akb) obj;
        if (this.e != akb.e) {
            return false;
        }
        int[] iArr = this.c;
        int[] iArr2 = akb.c;
        int i = this.e;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            akc[] akcArr = this.d;
            akc[] akcArr2 = akb.d;
            int i3 = this.e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!akcArr[i4].equals(akcArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.e; i2++) {
            i = (((i * 31) + this.c[i2]) * 31) + this.d[i2].hashCode();
        }
        return i;
    }
}
