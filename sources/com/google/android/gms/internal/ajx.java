package com.google.android.gms.internal;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class ajx {
    private final ByteBuffer a;

    private ajx(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private ajx(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int a(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    private static int a(CharSequence charSequence) {
        int i;
        int i2 = 0;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                i = i4;
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3).toString());
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i = i4 + i2;
            }
        }
        if (i >= length) {
            return i;
        }
        throw new IllegalArgumentException(new StringBuilder(54).append("UTF-8 length does not fit in int: ").append(((long) i) + 4294967296L).toString());
    }

    private static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = 0;
        int i5 = i + i2;
        while (i4 < length && i4 + i < i5) {
            char charAt = charSequence.charAt(i4);
            if (charAt >= 128) {
                break;
            }
            bArr[i + i4] = (byte) charAt;
            i4++;
        }
        if (i4 == length) {
            return i + length;
        }
        int i6 = i + i4;
        while (i4 < length) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 < 128 && i6 < i5) {
                i3 = i6 + 1;
                bArr[i6] = (byte) charAt2;
            } else if (charAt2 < 2048 && i6 <= i5 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> 6) | 960);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i6 <= i5 - 3) {
                int i8 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> 12) | 480);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
            } else if (i6 <= i5 - 4) {
                if (i4 + 1 != charSequence.length()) {
                    i4++;
                    char charAt3 = charSequence.charAt(i4);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i10 = i6 + 1;
                        bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                        int i11 = i10 + 1;
                        bArr[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i3 = i12 + 1;
                        bArr[i12] = (byte) ((codePoint & 63) | 128);
                    }
                }
                throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i4 - 1).toString());
            } else {
                throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charAt2).append(" at index ").append(i6).toString());
            }
            i4++;
            i6 = i3;
        }
        return i6;
    }

    public static int a(String str) {
        int a2 = a((CharSequence) str);
        return a2 + d(a2);
    }

    public static ajx a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static ajx a(byte[] bArr, int i, int i2) {
        return new ajx(bArr, 0, i2);
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (ArrayIndexOutOfBoundsException e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            b(charSequence, byteBuffer);
        }
    }

    public static int b(int i) {
        return d(i << 3);
    }

    public static int b(int i, int i2) {
        return b(i) + a(i2);
    }

    public static int b(int i, akf akf) {
        int b = b(i);
        int f = akf.f();
        return b + f + d(f);
    }

    public static int b(int i, String str) {
        return b(i) + a(str);
    }

    public static int b(int i, byte[] bArr) {
        return b(i) + b(bArr);
    }

    public static int b(byte[] bArr) {
        return d(bArr.length) + bArr.length;
    }

    private final void b(long j) {
        while ((-128 & j) != 0) {
            e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        e((int) j);
    }

    private static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 128) {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 2048) {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else if (charAt < 55296 || 57343 < charAt) {
                byteBuffer.put((byte) ((charAt >>> 12) | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else {
                if (i + 1 != charSequence.length()) {
                    i++;
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int codePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((codePoint & 63) | 128));
                    }
                }
                throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i - 1).toString());
            }
            i++;
        }
    }

    public static int c(int i, long j) {
        return b(i) + a(j);
    }

    private final void c(long j) {
        if (this.a.remaining() < 8) {
            throw new ajy(this.a.position(), this.a.limit());
        }
        this.a.putLong(j);
    }

    public static int d(int i) {
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

    private final void e(int i) {
        byte b = (byte) i;
        if (!this.a.hasRemaining()) {
            throw new ajy(this.a.position(), this.a.limit());
        }
        this.a.put(b);
    }

    public final void a() {
        if (this.a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.a.remaining())}));
        }
    }

    public final void a(int i, double d) {
        c(i, 1);
        c(Double.doubleToLongBits(d));
    }

    public final void a(int i, float f) {
        c(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.a.remaining() < 4) {
            throw new ajy(this.a.position(), this.a.limit());
        }
        this.a.putInt(floatToIntBits);
    }

    public final void a(int i, int i2) {
        c(i, 0);
        if (i2 >= 0) {
            c(i2);
        } else {
            b((long) i2);
        }
    }

    public final void a(int i, long j) {
        c(i, 0);
        b(j);
    }

    public final void a(int i, akf akf) {
        c(i, 2);
        a(akf);
    }

    public final void a(int i, String str) {
        c(i, 2);
        try {
            int d = d(str.length());
            if (d == d(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() < d) {
                    throw new ajy(d + position, this.a.limit());
                }
                this.a.position(position + d);
                a((CharSequence) str, this.a);
                int position2 = this.a.position();
                this.a.position(position);
                c((position2 - position) - d);
                this.a.position(position2);
                return;
            }
            c(a((CharSequence) str));
            a((CharSequence) str, this.a);
        } catch (BufferOverflowException e) {
            ajy ajy = new ajy(this.a.position(), this.a.limit());
            ajy.initCause(e);
            throw ajy;
        }
    }

    public final void a(int i, boolean z) {
        int i2 = 0;
        c(i, 0);
        if (z) {
            i2 = 1;
        }
        byte b = (byte) i2;
        if (!this.a.hasRemaining()) {
            throw new ajy(this.a.position(), this.a.limit());
        }
        this.a.put(b);
    }

    public final void a(int i, byte[] bArr) {
        c(i, 2);
        c(bArr.length);
        c(bArr);
    }

    public final void a(akf akf) {
        c(akf.e());
        akf.a(this);
    }

    public final void b(int i, long j) {
        c(i, 0);
        b(j);
    }

    public final void c(int i) {
        while ((i & -128) != 0) {
            e((i & 127) | 128);
            i >>>= 7;
        }
        e(i);
    }

    public final void c(int i, int i2) {
        c((i << 3) | i2);
    }

    public final void c(byte[] bArr) {
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new ajy(this.a.position(), this.a.limit());
    }
}
