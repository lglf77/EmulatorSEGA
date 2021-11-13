package com.google.android.gms.internal;

import java.util.Arrays;

final class agp extends agn {
    private final byte[] d;
    private final boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    private agp(byte[] bArr, int i2, int i3, boolean z) {
        super();
        this.k = Integer.MAX_VALUE;
        this.d = bArr;
        this.f = i2 + i3;
        this.h = i2;
        this.i = this.h;
        this.e = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (((long) r4[r3]) < 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long n() {
        /*
            r10 = this;
            r8 = 0
            int r0 = r10.h
            int r1 = r10.f
            if (r1 == r0) goto L_0x00b4
            byte[] r4 = r10.d
            int r1 = r0 + 1
            byte r0 = r4[r0]
            if (r0 < 0) goto L_0x0014
            r10.h = r1
            long r0 = (long) r0
        L_0x0013:
            return r0
        L_0x0014:
            int r2 = r10.f
            int r2 = r2 - r1
            r3 = 9
            if (r2 < r3) goto L_0x00b4
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x002a
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            long r0 = (long) r0
        L_0x0027:
            r10.h = r2
            goto L_0x0013
        L_0x002a:
            int r3 = r2 + 1
            byte r1 = r4[r2]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0038
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r2 = r3
            goto L_0x0027
        L_0x0038:
            int r2 = r3 + 1
            byte r1 = r4[r3]
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L_0x0047
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            long r0 = (long) r0
            goto L_0x0027
        L_0x0047:
            long r0 = (long) r0
            int r3 = r2 + 1
            byte r2 = r4[r2]
            long r6 = (long) r2
            r2 = 28
            long r6 = r6 << r2
            long r0 = r0 ^ r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x005b
            r4 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r0 = r0 ^ r4
            r2 = r3
            goto L_0x0027
        L_0x005b:
            int r2 = r3 + 1
            byte r3 = r4[r3]
            long r6 = (long) r3
            r3 = 35
            long r6 = r6 << r3
            long r0 = r0 ^ r6
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x006f
            r4 = -34093383808(0xfffffff80fe03f80, double:NaN)
            long r0 = r0 ^ r4
            goto L_0x0027
        L_0x006f:
            int r3 = r2 + 1
            byte r2 = r4[r2]
            long r6 = (long) r2
            r2 = 42
            long r6 = r6 << r2
            long r0 = r0 ^ r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0084
            r4 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            long r0 = r0 ^ r4
            r2 = r3
            goto L_0x0027
        L_0x0084:
            int r2 = r3 + 1
            byte r3 = r4[r3]
            long r6 = (long) r3
            r3 = 49
            long r6 = r6 << r3
            long r0 = r0 ^ r6
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0098
            r4 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            long r0 = r0 ^ r4
            goto L_0x0027
        L_0x0098:
            int r3 = r2 + 1
            byte r2 = r4[r2]
            long r6 = (long) r2
            r2 = 56
            long r6 = r6 << r2
            long r0 = r0 ^ r6
            r6 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r0 = r0 ^ r6
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ba
            int r2 = r3 + 1
            byte r3 = r4[r3]
            long r4 = (long) r3
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0027
        L_0x00b4:
            long r0 = r10.k()
            goto L_0x0013
        L_0x00ba:
            r2 = r3
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.agp.n():long");
    }

    private final int o() {
        int i2 = this.h;
        if (this.f - i2 < 4) {
            throw ahi.a();
        }
        byte[] bArr = this.d;
        this.h = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    private final long p() {
        int i2 = this.h;
        if (this.f - i2 < 8) {
            throw ahi.a();
        }
        byte[] bArr = this.d;
        this.h = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    private final void q() {
        this.f += this.g;
        int i2 = this.f - this.i;
        if (i2 > this.k) {
            this.g = i2 - this.k;
            this.f -= this.g;
            return;
        }
        this.g = 0;
    }

    private final byte r() {
        if (this.h == this.f) {
            throw ahi.a();
        }
        byte[] bArr = this.d;
        int i2 = this.h;
        this.h = i2 + 1;
        return bArr[i2];
    }

    public final int a() {
        if (l()) {
            this.j = 0;
            return 0;
        }
        this.j = j();
        if ((this.j >>> 3) != 0) {
            return this.j;
        }
        throw ahi.d();
    }

    public final <T extends ahc<T, ?>> T a(T t, agu agu) {
        int j2 = j();
        if (this.a >= this.b) {
            throw ahi.g();
        }
        int b = b(j2);
        this.a++;
        T a = ahc.a(t, (agn) this, agu);
        a(0);
        this.a--;
        c(b);
        return a;
    }

    public final void a(int i2) {
        if (this.j != i2) {
            throw ahi.e();
        }
    }

    public final int b(int i2) {
        if (i2 < 0) {
            throw ahi.b();
        }
        int m = m() + i2;
        int i3 = this.k;
        if (m > i3) {
            throw ahi.a();
        }
        this.k = m;
        q();
        return i3;
    }

    public final long b() {
        return n();
    }

    public final long c() {
        return p();
    }

    public final void c(int i2) {
        this.k = i2;
        q();
    }

    public final int d() {
        return o();
    }

    public final boolean e() {
        return n() != 0;
    }

    public final String f() {
        int j2 = j();
        if (j2 <= 0 || j2 > this.f - this.h) {
            if (j2 == 0) {
                return "";
            }
            if (j2 <= 0) {
                throw ahi.b();
            }
            throw ahi.a();
        } else if (!ajj.a(this.d, this.h, this.h + j2)) {
            throw ahi.h();
        } else {
            int i2 = this.h;
            this.h += j2;
            return new String(this.d, i2, j2, ahe.a);
        }
    }

    public final age g() {
        byte[] bArr;
        int j2 = j();
        if (j2 > 0 && j2 <= this.f - this.h) {
            age a = age.a(this.d, this.h, j2);
            this.h = j2 + this.h;
            return a;
        } else if (j2 == 0) {
            return age.a;
        } else {
            if (j2 > 0 && j2 <= this.f - this.h) {
                int i2 = this.h;
                this.h = j2 + this.h;
                bArr = Arrays.copyOfRange(this.d, i2, this.h);
            } else if (j2 > 0) {
                throw ahi.a();
            } else if (j2 == 0) {
                bArr = ahe.b;
            } else {
                throw ahi.b();
            }
            return age.b(bArr);
        }
    }

    public final int h() {
        return j();
    }

    public final int i() {
        return j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r3[r2] < 0) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int j() {
        /*
            r5 = this;
            int r0 = r5.h
            int r1 = r5.f
            if (r1 == r0) goto L_0x006c
            byte[] r3 = r5.d
            int r2 = r0 + 1
            byte r0 = r3[r0]
            if (r0 < 0) goto L_0x0011
            r5.h = r2
        L_0x0010:
            return r0
        L_0x0011:
            int r1 = r5.f
            int r1 = r1 - r2
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r2 + 1
            byte r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0026
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0023:
            r5.h = r1
            goto L_0x0010
        L_0x0026:
            int r2 = r1 + 1
            byte r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0033
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            r1 = r2
            goto L_0x0023
        L_0x0033:
            int r1 = r2 + 1
            byte r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L_0x0041
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0023
        L_0x0041:
            int r2 = r1 + 1
            byte r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x0072
            int r1 = r2 + 1
            byte r2 = r3[r2]
            if (r2 >= 0) goto L_0x0023
            int r2 = r1 + 1
            byte r1 = r3[r1]
            if (r1 >= 0) goto L_0x0072
            int r1 = r2 + 1
            byte r2 = r3[r2]
            if (r2 >= 0) goto L_0x0023
            int r2 = r1 + 1
            byte r1 = r3[r1]
            if (r1 >= 0) goto L_0x0072
            int r1 = r2 + 1
            byte r2 = r3[r2]
            if (r2 >= 0) goto L_0x0023
        L_0x006c:
            long r0 = r5.k()
            int r0 = (int) r0
            goto L_0x0010
        L_0x0072:
            r1 = r2
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.agp.j():int");
    }

    /* access modifiers changed from: package-private */
    public final long k() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte r = r();
            j2 |= ((long) (r & Byte.MAX_VALUE)) << i2;
            if ((r & 128) == 0) {
                return j2;
            }
        }
        throw ahi.c();
    }

    public final boolean l() {
        return this.h == this.f;
    }

    public final int m() {
        return this.h - this.i;
    }
}
