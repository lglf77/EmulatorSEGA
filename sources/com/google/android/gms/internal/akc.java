package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class akc implements Cloneable {
    private aka<?, ?> a;
    private Object b;
    private List<akh> c = new ArrayList();

    akc() {
    }

    private final byte[] b() {
        byte[] bArr = new byte[a()];
        a(ajx.a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public akc clone() {
        int i = 0;
        akc akc = new akc();
        try {
            akc.a = this.a;
            if (this.c == null) {
                akc.c = null;
            } else {
                akc.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof akf) {
                    akc.b = (akf) ((akf) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    akc.b = ((byte[]) this.b).clone();
                } else if (this.b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.b;
                    byte[][] bArr2 = new byte[bArr.length][];
                    akc.b = bArr2;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        bArr2[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.b instanceof boolean[]) {
                    akc.b = ((boolean[]) this.b).clone();
                } else if (this.b instanceof int[]) {
                    akc.b = ((int[]) this.b).clone();
                } else if (this.b instanceof long[]) {
                    akc.b = ((long[]) this.b).clone();
                } else if (this.b instanceof float[]) {
                    akc.b = ((float[]) this.b).clone();
                } else if (this.b instanceof double[]) {
                    akc.b = ((double[]) this.b).clone();
                } else if (this.b instanceof akf[]) {
                    akf[] akfArr = (akf[]) this.b;
                    akf[] akfArr2 = new akf[akfArr.length];
                    akc.b = akfArr2;
                    while (true) {
                        int i3 = i;
                        if (i3 >= akfArr.length) {
                            break;
                        }
                        akfArr2[i3] = (akf) akfArr[i3].clone();
                        i = i3 + 1;
                    }
                }
            }
            return akc;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int i = 0;
        if (this.b != null) {
            aka<?, ?> aka = this.a;
            Object obj = this.b;
            if (!aka.c) {
                return aka.a(obj);
            }
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                if (Array.get(obj, i2) != null) {
                    i += aka.a(Array.get(obj, i2));
                }
            }
            return i;
        }
        Iterator<akh> it = this.c.iterator();
        while (true) {
            int i3 = i;
            if (!it.hasNext()) {
                return i3;
            }
            akh next = it.next();
            i = next.b.length + ajx.d(next.a) + 0 + i3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ajx ajx) {
        if (this.b != null) {
            aka<?, ?> aka = this.a;
            Object obj = this.b;
            if (aka.c) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        aka.a(obj2, ajx);
                    }
                }
                return;
            }
            aka.a(obj, ajx);
            return;
        }
        for (akh next : this.c) {
            ajx.c(next.a);
            ajx.c(next.b);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(akh akh) {
        this.c.add(akh);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akc)) {
            return false;
        }
        akc akc = (akc) obj;
        if (this.b == null || akc.b == null) {
            if (this.c != null && akc.c != null) {
                return this.c.equals(akc.c);
            }
            try {
                return Arrays.equals(b(), akc.b());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.a == akc.a) {
            return !this.a.a.isArray() ? this.b.equals(akc.b) : this.b instanceof byte[] ? Arrays.equals((byte[]) this.b, (byte[]) akc.b) : this.b instanceof int[] ? Arrays.equals((int[]) this.b, (int[]) akc.b) : this.b instanceof long[] ? Arrays.equals((long[]) this.b, (long[]) akc.b) : this.b instanceof float[] ? Arrays.equals((float[]) this.b, (float[]) akc.b) : this.b instanceof double[] ? Arrays.equals((double[]) this.b, (double[]) akc.b) : this.b instanceof boolean[] ? Arrays.equals((boolean[]) this.b, (boolean[]) akc.b) : Arrays.deepEquals((Object[]) this.b, (Object[]) akc.b);
        } else {
            return false;
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(b()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
