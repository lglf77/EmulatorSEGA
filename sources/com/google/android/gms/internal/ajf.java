package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.ahc;
import java.util.Arrays;

public final class ajf {
    private static final ajf a = new ajf(0, new int[0], new Object[0], false);
    private int b;
    private int[] c;
    private Object[] d;
    private int e;
    private boolean f;

    private ajf() {
        this(0, new int[8], new Object[8], true);
    }

    private ajf(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public static ajf a() {
        return a;
    }

    static ajf a(ajf ajf, ajf ajf2) {
        int i = ajf.b + ajf2.b;
        int[] copyOf = Arrays.copyOf(ajf.c, i);
        System.arraycopy(ajf2.c, 0, copyOf, ajf.b, ajf2.b);
        Object[] copyOf2 = Arrays.copyOf(ajf.d, i);
        System.arraycopy(ajf2.d, 0, copyOf2, ajf.b, ajf2.b);
        return new ajf(i, copyOf, copyOf2, true);
    }

    private void a(int i, Object obj) {
        f();
        if (this.b == this.c.length) {
            int i2 = (this.b < 4 ? 8 : this.b >> 1) + this.b;
            this.c = Arrays.copyOf(this.c, i2);
            this.d = Arrays.copyOf(this.d, i2);
        }
        this.c[this.b] = i;
        this.d[this.b] = obj;
        this.b++;
    }

    static ajf b() {
        return new ajf();
    }

    private final void f() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void a(agq agq) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.b) {
                int i3 = this.c[i2];
                int i4 = i3 >>> 3;
                switch (i3 & 7) {
                    case a.b.AdsAttrs_adSize:
                        agq.a(i4, ((Long) this.d[i2]).longValue());
                        break;
                    case a.b.AdsAttrs_adSizes:
                        agq.b(i4, ((Long) this.d[i2]).longValue());
                        break;
                    case 2:
                        agq.a(i4, (age) this.d[i2]);
                        break;
                    case 3:
                        agq.a(i4, 3);
                        ((ajf) this.d[i2]).a(agq);
                        agq.a(i4, 4);
                        break;
                    case 5:
                        agq.d(i4, ((Integer) this.d[i2]).intValue());
                        break;
                    default:
                        throw ahi.f();
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ajv ajv) {
        if (ajv.a() == ahc.g.l) {
            for (int i = this.b - 1; i >= 0; i--) {
                ajv.a(this.c[i] >>> 3, this.d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            ajv.a(this.c[i2] >>> 3, this.d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            aig.a(sb, i, String.valueOf(this.c[i2] >>> 3), this.d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i, agn agn) {
        int a2;
        f();
        int i2 = i >>> 3;
        switch (i & 7) {
            case a.b.AdsAttrs_adSize:
                a(i, (Object) Long.valueOf(agn.b()));
                return true;
            case a.b.AdsAttrs_adSizes:
                a(i, (Object) Long.valueOf(agn.c()));
                return true;
            case 2:
                a(i, (Object) agn.g());
                return true;
            case 3:
                ajf ajf = new ajf();
                do {
                    a2 = agn.a();
                    if (a2 == 0 || !ajf.a(a2, agn)) {
                        agn.a((i2 << 3) | 4);
                        a(i, (Object) ajf);
                        return true;
                    }
                    a2 = agn.a();
                    agn.a((i2 << 3) | 4);
                    a(i, (Object) ajf);
                    return true;
                } while (!ajf.a(a2, agn));
                agn.a((i2 << 3) | 4);
                a(i, (Object) ajf);
                return true;
            case 4:
                return false;
            case 5:
                a(i, (Object) Integer.valueOf(agn.d()));
                return true;
            default:
                throw ahi.f();
        }
    }

    public final void c() {
        this.f = false;
    }

    public final int d() {
        int i = this.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                i += agq.d(this.c[i2] >>> 3, (age) this.d[i2]);
            }
            this.e = i;
        }
        return i;
    }

    public final int e() {
        int e2;
        int i = this.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                int i3 = this.c[i2];
                int i4 = i3 >>> 3;
                switch (i3 & 7) {
                    case a.b.AdsAttrs_adSize:
                        e2 = agq.c(i4, ((Long) this.d[i2]).longValue());
                        break;
                    case a.b.AdsAttrs_adSizes:
                        e2 = agq.d(i4, ((Long) this.d[i2]).longValue());
                        break;
                    case 2:
                        e2 = agq.c(i4, (age) this.d[i2]);
                        break;
                    case 3:
                        e2 = ((ajf) this.d[i2]).e() + (agq.d(i4) << 1);
                        break;
                    case 5:
                        e2 = agq.f(i4, ((Integer) this.d[i2]).intValue());
                        break;
                    default:
                        throw new IllegalStateException(ahi.f());
                }
                i += e2;
            }
            this.e = i;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ajf)) {
            return false;
        }
        ajf ajf = (ajf) obj;
        if (this.b == ajf.b) {
            int[] iArr = this.c;
            int[] iArr2 = ajf.c;
            int i = this.b;
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
                Object[] objArr = this.d;
                Object[] objArr2 = ajf.d;
                int i3 = this.b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
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
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.deepHashCode(this.d);
    }
}
