package com.google.android.gms.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class ajh {
    private static final Logger a = Logger.getLogger(ajh.class.getName());
    private static final Unsafe b = d();
    private static final Class<?> c = a("libcore.io.Memory");
    private static final boolean d = (a("org.robolectric.Robolectric") != null);
    private static final boolean e = c(Long.TYPE);
    private static final boolean f = c(Integer.TYPE);
    private static final d g = (b == null ? null : g() ? e ? new b(b) : f ? new a(b) : null : new c(b));
    private static final boolean h = f();
    private static final boolean i = e();
    private static final long j = ((long) a((Class<?>) byte[].class));
    private static final long k = ((long) a((Class<?>) boolean[].class));
    private static final long l = ((long) b(boolean[].class));
    private static final long m = ((long) a((Class<?>) int[].class));
    private static final long n = ((long) b(int[].class));
    private static final long o = ((long) a((Class<?>) long[].class));
    private static final long p = ((long) b(long[].class));
    private static final long q = ((long) a((Class<?>) float[].class));
    private static final long r = ((long) b(float[].class));
    private static final long s = ((long) a((Class<?>) double[].class));
    private static final long t = ((long) b(double[].class));
    private static final long u = ((long) a((Class<?>) Object[].class));
    private static final long v = ((long) b(Object[].class));
    private static final long w;
    /* access modifiers changed from: private */
    public static final boolean x;

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return ajh.x ? ajh.d(obj, j) : ajh.e(obj, j);
        }

        public final void a(Object obj, long j, byte b) {
            if (ajh.x) {
                ajh.c(obj, j, b);
            } else {
                ajh.d(obj, j, b);
            }
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return ajh.x ? ajh.d(obj, j) : ajh.e(obj, j);
        }

        public final void a(Object obj, long j, byte b) {
            if (ajh.x) {
                ajh.c(obj, j, b);
            } else {
                ajh.d(obj, j, b);
            }
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        public final void a(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }
    }

    static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void a(Object obj, long j, byte b);

        public final int b(Object obj, long j) {
            return this.a.getInt(obj, j);
        }
    }

    static {
        Field a2;
        boolean z = true;
        if (!g() || (a2 = a((Class<?>) Buffer.class, "effectiveDirectAddress")) == null) {
            a2 = a((Class<?>) Buffer.class, "address");
        }
        w = (a2 == null || g == null) ? -1 : g.a.objectFieldOffset(a2);
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            z = false;
        }
        x = z;
    }

    private ajh() {
    }

    static byte a(byte[] bArr, long j2) {
        return g.a(bArr, j + j2);
    }

    private static int a(Class<?> cls) {
        if (i) {
            return g.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int a(Object obj, long j2) {
        return g.b(obj, j2);
    }

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }

    private static Field a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    private static void a(Object obj, long j2, int i2) {
        g.a.putInt(obj, j2, i2);
    }

    static void a(byte[] bArr, long j2, byte b2) {
        g.a(bArr, j + j2, b2);
    }

    static boolean a() {
        return i;
    }

    private static int b(Class<?> cls) {
        if (i) {
            return g.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static boolean b() {
        return h;
    }

    /* access modifiers changed from: private */
    public static void c(Object obj, long j2, byte b2) {
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        a(obj, j2 & -4, (a(obj, j2 & -4) & ((255 << i2) ^ -1)) | ((b2 & 255) << i2));
    }

    private static boolean c(Class<?> cls) {
        if (!g()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static byte d(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((-1 ^ j2) & 3) << 3)));
    }

    private static Unsafe d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new aji());
        } catch (Throwable th) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void d(Object obj, long j2, byte b2) {
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j2 & -4, (a(obj, j2 & -4) & ((255 << i2) ^ -1)) | ((b2 & 255) << i2));
    }

    /* access modifiers changed from: private */
    public static byte e(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((3 & j2) << 3)));
    }

    private static boolean e() {
        if (b == null) {
            return false;
        }
        try {
            Class<?> cls = b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (g()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean f() {
        if (b == null) {
            return false;
        }
        try {
            Class<?> cls = b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (g()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean g() {
        return c != null && !d;
    }
}
