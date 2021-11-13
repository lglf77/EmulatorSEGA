package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;
import com.google.android.gms.internal.ahc.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class ahc<MessageType extends ahc<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends afz<MessageType, BuilderType> {
    private static Map<Object, ahc<?, ?>> d = new ConcurrentHashMap();
    protected ajf b = ajf.a();
    protected int c = -1;

    public static abstract class a<MessageType extends ahc<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends aga<MessageType, BuilderType> {
        protected MessageType a;
        private final MessageType b;
        private boolean c = false;

        protected a(MessageType messagetype) {
            this.b = messagetype;
            this.a = (ahc) messagetype.a(g.g, (Object) null, (Object) null);
        }

        private static void a(MessageType messagetype, MessageType messagetype2) {
            f fVar = f.a;
            messagetype.a(g.b, (Object) fVar, (Object) messagetype2);
            messagetype.b = fVar.a(messagetype.b, messagetype2.b);
        }

        public final /* synthetic */ aga a() {
            return (a) clone();
        }

        public final BuilderType a(MessageType messagetype) {
            b();
            a(this.a, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public final void b() {
            if (this.c) {
                MessageType messagetype = (ahc) this.a.a(g.g, (Object) null, (Object) null);
                a(messagetype, this.a);
                this.a = messagetype;
                this.c = false;
            }
        }

        public final MessageType c() {
            if (this.c) {
                return this.a;
            }
            MessageType messagetype = this.a;
            messagetype.a(g.f, (Object) null, (Object) null);
            messagetype.b.c();
            this.c = true;
            return this.a;
        }

        public /* synthetic */ Object clone() {
            MessageType messagetype;
            a aVar = (a) ((ahc) this.b).a(g.h, (Object) null, (Object) null);
            if (this.c) {
                messagetype = this.a;
            } else {
                MessageType messagetype2 = this.a;
                messagetype2.a(g.f, (Object) null, (Object) null);
                messagetype2.b.c();
                this.c = true;
                messagetype = this.a;
            }
            aVar.a((ahc) messagetype);
            return aVar;
        }

        public final MessageType d() {
            MessageType messagetype;
            boolean z;
            boolean z2 = true;
            if (this.c) {
                messagetype = this.a;
            } else {
                MessageType messagetype2 = this.a;
                messagetype2.a(g.f, (Object) null, (Object) null);
                messagetype2.b.c();
                this.c = true;
                messagetype = this.a;
            }
            MessageType messagetype3 = (ahc) messagetype;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype3.a(g.c, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                if (messagetype3.a(g.a, (Object) Boolean.FALSE, (Object) null) == null) {
                    z2 = false;
                }
                if (booleanValue) {
                    messagetype3.a(g.d, (Object) z2 ? messagetype3 : null, (Object) null);
                }
                z = z2;
            }
            if (z) {
                return messagetype3;
            }
            throw new ajd(messagetype3);
        }

        public final /* synthetic */ aid e() {
            MessageType messagetype;
            boolean z;
            boolean z2 = true;
            if (this.c) {
                messagetype = this.a;
            } else {
                MessageType messagetype2 = this.a;
                messagetype2.a(g.f, (Object) null, (Object) null);
                messagetype2.b.c();
                this.c = true;
                messagetype = this.a;
            }
            ahc ahc = (ahc) messagetype;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) ahc.a(g.c, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                if (ahc.a(g.a, (Object) Boolean.FALSE, (Object) null) == null) {
                    z2 = false;
                }
                if (booleanValue) {
                    ahc.a(g.d, (Object) z2 ? ahc : null, (Object) null);
                }
                z = z2;
            }
            if (z) {
                return ahc;
            }
            throw new ajd(ahc);
        }

        public final /* synthetic */ aid n() {
            return this.b;
        }
    }

    public static class b<T extends ahc<T, ?>> extends agb<T> {
        private T a;

        public b(T t) {
            this.a = t;
        }
    }

    static class c implements h {
        static final c a = new c();
        private static ahd b = new ahd();

        private c() {
        }

        public final int a(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw b;
        }

        public final age a(boolean z, age age, boolean z2, age age2) {
            if (z == z2 && age.equals(age2)) {
                return age;
            }
            throw b;
        }

        public final <T> ahh<T> a(ahh<T> ahh, ahh<T> ahh2) {
            if (ahh.equals(ahh2)) {
                return ahh;
            }
            throw b;
        }

        public final <T extends aid> T a(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw b;
            }
            T t3 = (ahc) t;
            if (t3 == t2 || !((ahc) t3.a(g.i, (Object) null, (Object) null)).getClass().isInstance(t2)) {
                return t;
            }
            ahc ahc = (ahc) t2;
            t3.a(g.b, (Object) this, (Object) ahc);
            t3.b = a(t3.b, ahc.b);
            return t;
        }

        public final ajf a(ajf ajf, ajf ajf2) {
            if (ajf.equals(ajf2)) {
                return ajf;
            }
            throw b;
        }

        public final String a(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw b;
        }

        public final boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw b;
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends ahc<MessageType, BuilderType> implements aif {
        protected agy<Object> d = agy.a();
    }

    static class e implements h {
        int a = 0;

        e() {
        }

        public final int a(boolean z, int i, boolean z2, int i2) {
            this.a = (this.a * 53) + i;
            return i;
        }

        public final age a(boolean z, age age, boolean z2, age age2) {
            this.a = (this.a * 53) + age.hashCode();
            return age;
        }

        public final <T> ahh<T> a(ahh<T> ahh, ahh<T> ahh2) {
            this.a = (this.a * 53) + ahh.hashCode();
            return ahh;
        }

        public final <T extends aid> T a(T t, T t2) {
            int i;
            if (t == null) {
                i = 37;
            } else if (t instanceof ahc) {
                ahc ahc = (ahc) t;
                if (ahc.a == 0) {
                    int i2 = this.a;
                    this.a = 0;
                    ahc.a(g.b, (Object) this, (Object) ahc);
                    ahc.b = a(ahc.b, ahc.b);
                    ahc.a = this.a;
                    this.a = i2;
                }
                i = ahc.a;
            } else {
                i = t.hashCode();
            }
            this.a = i + (this.a * 53);
            return t;
        }

        public final ajf a(ajf ajf, ajf ajf2) {
            this.a = (this.a * 53) + ajf.hashCode();
            return ajf;
        }

        public final String a(boolean z, String str, boolean z2, String str2) {
            this.a = (this.a * 53) + str.hashCode();
            return str;
        }

        public final boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = (this.a * 53) + ahe.a(z2);
            return z2;
        }
    }

    public static class f implements h {
        public static final f a = new f();

        private f() {
        }

        public final int a(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        public final age a(boolean z, age age, boolean z2, age age2) {
            return z2 ? age2 : age;
        }

        public final <T> ahh<T> a(ahh<T> ahh, ahh<T> ahh2) {
            int size = ahh.size();
            int size2 = ahh2.size();
            if (size > 0 && size2 > 0) {
                if (!ahh.a()) {
                    ahh = ahh.a(size2 + size);
                }
                ahh.addAll(ahh2);
            }
            return size > 0 ? ahh : ahh2;
        }

        public final <T extends aid> T a(T t, T t2) {
            return (t == null || t2 == null) ? t == null ? t2 : t : t.m().a(t2).e();
        }

        public final ajf a(ajf ajf, ajf ajf2) {
            return ajf2 == ajf.a() ? ajf : ajf.a(ajf, ajf2);
        }

        public final String a(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        public final boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }
    }

    /* 'enum' modifier removed */
    public static final class g {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final int h = 8;
        public static final int i = 9;
        public static final int j = 10;
        public static final int k = 1;
        public static final int l = 2;
        private static final /* synthetic */ int[] m = {a, b, c, d, e, f, g, h, i, j};
        private static final /* synthetic */ int[] n = {k, l};

        public static int[] a() {
            return (int[]) m.clone();
        }
    }

    public interface h {
        int a(boolean z, int i, boolean z2, int i2);

        age a(boolean z, age age, boolean z2, age age2);

        <T> ahh<T> a(ahh<T> ahh, ahh<T> ahh2);

        <T extends aid> T a(T t, T t2);

        ajf a(ajf ajf, ajf ajf2);

        String a(boolean z, String str, boolean z2, String str2);

        boolean a(boolean z, boolean z2, boolean z3, boolean z4);
    }

    protected static <T extends ahc<T, ?>> T a(T t, age age) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        T a2 = a(t, age, agu.a());
        if (a2 != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a2.a(g.c, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z2 = true;
            } else if (byteValue == 0) {
                z2 = false;
            } else {
                boolean z4 = a2.a(g.a, (Object) Boolean.FALSE, (Object) null) != null;
                if (booleanValue) {
                    a2.a(g.d, (Object) z4 ? a2 : null, (Object) null);
                }
                z2 = z4;
            }
            if (!z2) {
                throw new ajd(a2).a().a(a2);
            }
        }
        if (a2 != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) a2.a(g.c, (Object) null, (Object) null)).byteValue();
            if (byteValue2 == 1) {
                z = true;
            } else if (byteValue2 == 0) {
                z = false;
            } else {
                if (a2.a(g.a, (Object) Boolean.FALSE, (Object) null) == null) {
                    z3 = false;
                }
                if (booleanValue2) {
                    a2.a(g.d, (Object) z3 ? a2 : null, (Object) null);
                }
                z = z3;
            }
            if (!z) {
                throw new ajd(a2).a().a(a2);
            }
        }
        return a2;
    }

    private static <T extends ahc<T, ?>> T a(T t, age age, agu agu) {
        T a2;
        try {
            agn d2 = age.d();
            a2 = a(t, d2, agu);
            d2.a(0);
            return a2;
        } catch (ahi e2) {
            throw e2.a(a2);
        } catch (ahi e3) {
            throw e3;
        }
    }

    static <T extends ahc<T, ?>> T a(T t, agn agn, agu agu) {
        T t2 = (ahc) t.a(g.g, (Object) null, (Object) null);
        try {
            t2.a(g.e, (Object) agn, (Object) agu);
            t2.a(g.f, (Object) null, (Object) null);
            t2.b.c();
            return t2;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof ahi) {
                throw ((ahi) e2.getCause());
            }
            throw e2;
        }
    }

    protected static <T extends ahc<T, ?>> T a(T t, byte[] bArr) {
        boolean z;
        boolean z2 = true;
        T a2 = a(t, bArr, agu.a());
        if (a2 != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a2.a(g.c, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                if (a2.a(g.a, (Object) Boolean.FALSE, (Object) null) == null) {
                    z2 = false;
                }
                if (booleanValue) {
                    a2.a(g.d, (Object) z2 ? a2 : null, (Object) null);
                }
                z = z2;
            }
            if (!z) {
                throw new ajd(a2).a().a(a2);
            }
        }
        return a2;
    }

    private static <T extends ahc<T, ?>> T a(T t, byte[] bArr, agu agu) {
        T a2;
        try {
            agn a3 = agn.a(bArr);
            a2 = a(t, a3, agu);
            a3.a(0);
            return a2;
        } catch (ahi e2) {
            throw e2.a(a2);
        } catch (ahi e3) {
            throw e3;
        }
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static <E> ahh<E> l() {
        return aim.d();
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj, Object obj2);

    public void a(agq agq) {
        ail.a().a(getClass()).a(this, ags.a(agq));
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, agn agn) {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.b == ajf.a()) {
            this.b = ajf.b();
        }
        return this.b.a(i, agn);
    }

    public int d() {
        if (this.c == -1) {
            this.c = ail.a().a(getClass()).a(this);
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((ahc) a(g.i, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        try {
            c cVar = c.a;
            ahc ahc = (ahc) obj;
            a(g.b, (Object) cVar, (Object) ahc);
            this.b = cVar.a(this.b, ahc.b);
            return true;
        } catch (ahd e2) {
            return false;
        }
    }

    public int hashCode() {
        if (this.a != 0) {
            return this.a;
        }
        e eVar = new e();
        a(g.b, (Object) eVar, (Object) this);
        this.b = eVar.a(this.b, this.b);
        this.a = eVar.a;
        return this.a;
    }

    public final /* synthetic */ aie m() {
        a aVar = (a) a(g.h, (Object) null, (Object) null);
        aVar.a(this);
        return aVar;
    }

    public final /* synthetic */ aid n() {
        return (ahc) a(g.i, (Object) null, (Object) null);
    }

    public String toString() {
        return aig.a(this, super.toString());
    }
}
