package com.google.android.gms.internal;

import com.google.android.gms.a;

public final class ajw {
    private final byte[] a;
    private final int b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h = Integer.MAX_VALUE;
    private int i;
    private int j = 64;
    private int k = 67108864;

    private ajw(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.b = i2;
        int i4 = i2 + i3;
        this.d = i4;
        this.c = i4;
        this.f = i2;
    }

    public static ajw a(byte[] bArr, int i2, int i3) {
        return new ajw(bArr, 0, i3);
    }

    private final void f(int i2) {
        if (i2 < 0) {
            throw ake.b();
        } else if (this.f + i2 > this.h) {
            f(this.h - this.f);
            throw ake.a();
        } else if (i2 <= this.d - this.f) {
            this.f += i2;
        } else {
            throw ake.a();
        }
    }

    private final void m() {
        this.d += this.e;
        int i2 = this.d;
        if (i2 > this.h) {
            this.e = i2 - this.h;
            this.d -= this.e;
            return;
        }
        this.e = 0;
    }

    private final byte n() {
        if (this.f == this.d) {
            throw ake.a();
        }
        byte[] bArr = this.a;
        int i2 = this.f;
        this.f = i2 + 1;
        return bArr[i2];
    }

    public final int a() {
        if (this.f == this.d) {
            this.g = 0;
            return 0;
        }
        this.g = g();
        if (this.g != 0) {
            return this.g;
        }
        throw new ake("Protocol message contained an invalid tag (zero).");
    }

    public final void a(int i2) {
        if (this.g != i2) {
            throw new ake("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void a(akf akf) {
        int g2 = g();
        if (this.i >= this.j) {
            throw ake.d();
        }
        int c2 = c(g2);
        this.i++;
        akf.a(this);
        a(0);
        this.i--;
        d(c2);
    }

    public final byte[] a(int i2, int i3) {
        if (i3 == 0) {
            return aki.h;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.a, this.b + i2, bArr, 0, i3);
        return bArr;
    }

    public final long b() {
        return h();
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3) {
        if (i2 > this.f - this.b) {
            throw new IllegalArgumentException(new StringBuilder(50).append("Position ").append(i2).append(" is beyond current ").append(this.f - this.b).toString());
        } else if (i2 < 0) {
            throw new IllegalArgumentException(new StringBuilder(24).append("Bad position ").append(i2).toString());
        } else {
            this.f = this.b + i2;
            this.g = i3;
        }
    }

    public final boolean b(int i2) {
        int a2;
        switch (i2 & 7) {
            case a.b.AdsAttrs_adSize:
                g();
                return true;
            case a.b.AdsAttrs_adSizes:
                j();
                return true;
            case 2:
                f(g());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                i();
                return true;
            default:
                throw new ake("Protocol message tag had invalid wire type.");
        }
        do {
            a2 = a();
            if (a2 == 0 || !b(a2)) {
                a(((i2 >>> 3) << 3) | 4);
                return true;
            }
            a2 = a();
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } while (!b(a2));
        a(((i2 >>> 3) << 3) | 4);
        return true;
    }

    public final int c() {
        return g();
    }

    public final int c(int i2) {
        if (i2 < 0) {
            throw ake.b();
        }
        int i3 = this.f + i2;
        int i4 = this.h;
        if (i3 > i4) {
            throw ake.a();
        }
        this.h = i3;
        m();
        return i4;
    }

    public final void d(int i2) {
        this.h = i2;
        m();
    }

    public final boolean d() {
        return g() != 0;
    }

    public final String e() {
        int g2 = g();
        if (g2 < 0) {
            throw ake.b();
        } else if (g2 > this.d - this.f) {
            throw ake.a();
        } else {
            String str = new String(this.a, this.f, g2, akd.a);
            this.f = g2 + this.f;
            return str;
        }
    }

    public final void e(int i2) {
        b(i2, this.g);
    }

    public final byte[] f() {
        int g2 = g();
        if (g2 < 0) {
            throw ake.b();
        } else if (g2 == 0) {
            return aki.h;
        } else {
            if (g2 > this.d - this.f) {
                throw ake.a();
            }
            byte[] bArr = new byte[g2];
            System.arraycopy(this.a, this.f, bArr, 0, g2);
            this.f = g2 + this.f;
            return bArr;
        }
    }

    public final int g() {
        byte n = n();
        if (n >= 0) {
            return n;
        }
        byte b2 = n & Byte.MAX_VALUE;
        byte n2 = n();
        if (n2 >= 0) {
            return b2 | (n2 << 7);
        }
        byte b3 = b2 | ((n2 & Byte.MAX_VALUE) << 7);
        byte n3 = n();
        if (n3 >= 0) {
            return b3 | (n3 << 14);
        }
        byte b4 = b3 | ((n3 & Byte.MAX_VALUE) << 14);
        byte n4 = n();
        if (n4 >= 0) {
            return b4 | (n4 << 21);
        }
        byte b5 = b4 | ((n4 & Byte.MAX_VALUE) << 21);
        byte n5 = n();
        byte b6 = b5 | (n5 << 28);
        if (n5 >= 0) {
            return b6;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (n() >= 0) {
                return b6;
            }
        }
        throw ake.c();
    }

    public final long h() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte n = n();
            j2 |= ((long) (n & Byte.MAX_VALUE)) << i2;
            if ((n & 128) == 0) {
                return j2;
            }
        }
        throw ake.c();
    }

    public final int i() {
        return (n() & 255) | ((n() & 255) << 8) | ((n() & 255) << 16) | ((n() & 255) << 24);
    }

    public final long j() {
        byte n = n();
        byte n2 = n();
        return ((((long) n2) & 255) << 8) | (((long) n) & 255) | ((((long) n()) & 255) << 16) | ((((long) n()) & 255) << 24) | ((((long) n()) & 255) << 32) | ((((long) n()) & 255) << 40) | ((((long) n()) & 255) << 48) | ((((long) n()) & 255) << 56);
    }

    public final int k() {
        if (this.h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.h - this.f;
    }

    public final int l() {
        return this.f - this.b;
    }
}
