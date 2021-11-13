package com.google.android.gms.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class agq extends agd {
    private static final Logger b = Logger.getLogger(agq.class.getName());
    /* access modifiers changed from: private */
    public static final boolean c = ajh.a();
    ags a;

    static class a extends agq {
        private final byte[] b;
        private final int c;
        private final int d;
        private int e;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i | i2 | (bArr.length - (i + i2))) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            } else {
                this.b = bArr;
                this.c = i;
                this.e = i;
                this.d = i + i2;
            }
        }

        public final int a() {
            return this.d - this.e;
        }

        public final void a(byte b2) {
            try {
                byte[] bArr = this.b;
                int i = this.e;
                this.e = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.d), 1}), e2);
            }
        }

        public final void a(int i) {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        public final void a(int i, int i2) {
            b((i << 3) | i2);
        }

        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        public final void a(int i, age age) {
            a(i, 2);
            a(age);
        }

        public final void a(int i, aid aid) {
            a(i, 2);
            a(aid);
        }

        public final void a(int i, String str) {
            a(i, 2);
            a(str);
        }

        public final void a(int i, boolean z) {
            int i2 = 0;
            a(i, 0);
            if (z) {
                i2 = 1;
            }
            a((byte) i2);
        }

        public final void a(long j) {
            if (!agq.c || a() < 10) {
                while ((j & -128) != 0) {
                    try {
                        byte[] bArr = this.b;
                        int i = this.e;
                        this.e = i + 1;
                        bArr[i] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.d), 1}), e2);
                    }
                }
                byte[] bArr2 = this.b;
                int i2 = this.e;
                this.e = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.b;
                int i3 = this.e;
                this.e = i3 + 1;
                ajh.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.b;
            int i4 = this.e;
            this.e = i4 + 1;
            ajh.a(bArr4, (long) i4, (byte) ((int) j));
        }

        public final void a(age age) {
            b(age.a());
            age.a((agd) this);
        }

        public final void a(aid aid) {
            b(aid.d());
            aid.a(this);
        }

        public final void a(String str) {
            int i = this.e;
            try {
                int f = f(str.length() * 3);
                int f2 = f(str.length());
                if (f2 == f) {
                    this.e = i + f2;
                    int a = ajj.a(str, this.b, this.e, a());
                    this.e = i;
                    b((a - i) - f2);
                    this.e = a;
                    return;
                }
                b(ajj.a((CharSequence) str));
                this.e = ajj.a(str, this.b, this.e, a());
            } catch (ajm e2) {
                this.e = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        public final void a(byte[] bArr, int i, int i2) {
            c(bArr, i, i2);
        }

        public final void b(int i) {
            if (!agq.c || a() < 10) {
                while ((i & -128) != 0) {
                    try {
                        byte[] bArr = this.b;
                        int i2 = this.e;
                        this.e = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.d), 1}), e2);
                    }
                }
                byte[] bArr2 = this.b;
                int i3 = this.e;
                this.e = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.b;
                int i4 = this.e;
                this.e = i4 + 1;
                ajh.a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.b;
            int i5 = this.e;
            this.e = i5 + 1;
            ajh.a(bArr4, (long) i5, (byte) i);
        }

        public final void b(int i, int i2) {
            a(i, 0);
            a(i2);
        }

        public final void b(int i, long j) {
            a(i, 1);
            b(j);
        }

        public final void b(int i, age age) {
            a(1, 3);
            c(2, i);
            a(3, age);
            a(1, 4);
        }

        public final void b(int i, aid aid) {
            a(1, 3);
            c(2, i);
            a(3, aid);
            a(1, 4);
        }

        public final void b(long j) {
            try {
                byte[] bArr = this.b;
                int i = this.e;
                this.e = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.b;
                int i2 = this.e;
                this.e = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.b;
                int i3 = this.e;
                this.e = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.b;
                int i4 = this.e;
                this.e = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.b;
                int i5 = this.e;
                this.e = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.b;
                int i6 = this.e;
                this.e = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.b;
                int i7 = this.e;
                this.e = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.b;
                int i8 = this.e;
                this.e = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.d), 1}), e2);
            }
        }

        public final void c(int i) {
            try {
                byte[] bArr = this.b;
                int i2 = this.e;
                this.e = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.b;
                int i3 = this.e;
                this.e = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.b;
                int i4 = this.e;
                this.e = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.b;
                int i5 = this.e;
                this.e = i5 + 1;
                bArr4[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.d), 1}), e2);
            }
        }

        public final void c(int i, int i2) {
            a(i, 0);
            b(i2);
        }

        public final void c(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.b, this.e, i2);
                this.e += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.d), Integer.valueOf(i2)}), e2);
            }
        }

        public final void d(int i, int i2) {
            a(i, 5);
            c(i2);
        }
    }

    public static class b extends IOException {
        b() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        b(java.lang.String r4, java.lang.Throwable r5) {
            /*
                r3 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r1 = java.lang.String.valueOf(r0)
                java.lang.String r0 = java.lang.String.valueOf(r4)
                int r2 = r0.length()
                if (r2 == 0) goto L_0x0018
                java.lang.String r0 = r1.concat(r0)
            L_0x0014:
                r3.<init>(r0, r5)
                return
            L_0x0018:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r1)
                goto L_0x0014
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.agq.b.<init>(java.lang.String, java.lang.Throwable):void");
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private agq() {
    }

    public static int a(double d) {
        return 8;
    }

    public static int a(float f) {
        return 4;
    }

    public static int a(int i, aho aho) {
        int d = d(i);
        int b2 = aho.b();
        return d + b2 + f(b2);
    }

    public static int a(aho aho) {
        int b2 = aho.b();
        return b2 + f(b2);
    }

    public static int a(boolean z) {
        return 1;
    }

    public static agq a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static int b(int i, aho aho) {
        return (d(1) << 1) + e(2, i) + a(3, aho);
    }

    public static int b(int i, String str) {
        return d(i) + b(str);
    }

    public static int b(int i, boolean z) {
        return d(i) + 1;
    }

    public static int b(age age) {
        int a2 = age.a();
        return a2 + f(a2);
    }

    public static int b(aid aid) {
        int d = aid.d();
        return d + f(d);
    }

    public static int b(String str) {
        int length;
        try {
            length = ajj.a((CharSequence) str);
        } catch (ajm e) {
            length = str.getBytes(ahe.a).length;
        }
        return length + f(length);
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return length + f(length);
    }

    public static agq b(byte[] bArr, int i, int i2) {
        return new a(bArr, i, i2);
    }

    public static int c(int i, long j) {
        return d(i) + d(j);
    }

    public static int c(int i, age age) {
        int d = d(i);
        int a2 = age.a();
        return d + a2 + f(a2);
    }

    public static int c(int i, aid aid) {
        return d(i) + b(aid);
    }

    public static int c(long j) {
        return d(j);
    }

    @Deprecated
    public static int c(aid aid) {
        return aid.d();
    }

    public static int d(int i) {
        return f(i << 3);
    }

    public static int d(int i, long j) {
        return d(i) + 8;
    }

    public static int d(int i, age age) {
        return (d(1) << 1) + e(2, i) + c(3, age);
    }

    public static int d(int i, aid aid) {
        return (d(1) << 1) + e(2, i) + c(3, aid);
    }

    public static int d(long j) {
        long j2;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j2 = j >>> 28;
        } else {
            j2 = j;
        }
        if ((-2097152 & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i + 1 : i;
    }

    public static int e(int i) {
        if (i >= 0) {
            return f(i);
        }
        return 10;
    }

    public static int e(int i, int i2) {
        return d(i) + f(i2);
    }

    public static int e(long j) {
        return d(h(j));
    }

    public static int f(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (-268435456 & i) == 0 ? 4 : 5;
    }

    public static int f(int i, int i2) {
        return d(i) + 4;
    }

    public static int f(long j) {
        return 8;
    }

    public static int g(int i) {
        return f(l(i));
    }

    public static int g(int i, int i2) {
        return d(i) + e(i2);
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i) {
        return 4;
    }

    private static long h(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static int i(int i) {
        return 4;
    }

    public static int j(int i) {
        return e(i);
    }

    @Deprecated
    public static int k(int i) {
        return f(i);
    }

    private static int l(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public abstract int a();

    public abstract void a(byte b2);

    public abstract void a(int i);

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, age age);

    public abstract void a(int i, aid aid);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    public abstract void a(age age);

    public abstract void a(aid aid);

    public abstract void a(String str);

    /* access modifiers changed from: package-private */
    public final void a(String str, ajm ajm) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ajm);
        byte[] bytes = str.getBytes(ahe.a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new b(e);
        } catch (b e2) {
            throw e2;
        }
    }

    public final void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public abstract void b(int i, long j);

    public abstract void b(int i, age age);

    public abstract void b(int i, aid aid);

    public abstract void b(long j);

    public abstract void c(int i);

    public abstract void c(int i, int i2);

    public abstract void c(byte[] bArr, int i, int i2);

    public abstract void d(int i, int i2);
}
