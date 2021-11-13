package com.google.android.gms.internal;

class agl extends agk {
    protected final byte[] b;

    agl(byte[] bArr) {
        this.b = bArr;
    }

    public byte a(int i) {
        return this.b[i];
    }

    public int a() {
        return this.b.length;
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2, int i3) {
        return ahe.a(i, this.b, f() + i2, i3);
    }

    public final age a(int i, int i2) {
        int b2 = b(i, i2, a());
        return b2 == 0 ? age.a : new agh(this.b, f() + i, b2);
    }

    /* access modifiers changed from: package-private */
    public final void a(agd agd) {
        agd.a(this.b, f(), a());
    }

    /* access modifiers changed from: protected */
    public void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.b, i, bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(age age, int i, int i2) {
        if (i2 > age.a()) {
            throw new IllegalArgumentException(new StringBuilder(40).append("Length too large: ").append(i2).append(a()).toString());
        } else if (i + i2 > age.a()) {
            throw new IllegalArgumentException(new StringBuilder(59).append("Ran off end of other: ").append(i).append(", ").append(i2).append(", ").append(age.a()).toString());
        } else if (!(age instanceof agl)) {
            return age.a(i, i + i2).equals(a(0, i2));
        } else {
            agl agl = (agl) age;
            byte[] bArr = this.b;
            byte[] bArr2 = agl.b;
            int f = f() + i2;
            int f2 = f();
            int f3 = agl.f() + i;
            while (f2 < f) {
                if (bArr[f2] != bArr2[f3]) {
                    return false;
                }
                f2++;
                f3++;
            }
            return true;
        }
    }

    public final agn d() {
        return agn.a(this.b, f(), a(), true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof age)) {
            return false;
        }
        if (a() != ((age) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (!(obj instanceof agl)) {
            return obj.equals(this);
        }
        int e = e();
        int e2 = ((agl) obj).e();
        if (e == 0 || e2 == 0 || e == e2) {
            return a((agl) obj, 0, a());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int f() {
        return 0;
    }
}
