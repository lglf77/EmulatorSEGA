package android.support.v4.c;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class f<K, V> {
    static Object[] b;
    static int c;
    static Object[] d;
    static int e;
    int[] f;
    Object[] g;
    int h;

    public f() {
        this.f = c.a;
        this.g = c.c;
        this.h = 0;
    }

    public f(int i) {
        if (i == 0) {
            this.f = c.a;
            this.g = c.c;
        } else {
            e(i);
        }
        this.h = 0;
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return c.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (a.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (a.class) {
                if (c < 10) {
                    objArr[0] = b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    b = objArr;
                    c++;
                }
            }
        }
    }

    private void e(int i) {
        if (i == 8) {
            synchronized (a.class) {
                if (d != null) {
                    Object[] objArr = d;
                    this.g = objArr;
                    d = (Object[]) objArr[0];
                    this.f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (a.class) {
                if (b != null) {
                    Object[] objArr2 = b;
                    this.g = objArr2;
                    b = (Object[]) objArr2[0];
                    this.f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    c--;
                    return;
                }
            }
        }
        this.f = new int[i];
        this.g = new Object[(i << 1)];
    }

    /* access modifiers changed from: package-private */
    public int a() {
        int i = this.h;
        if (i == 0) {
            return -1;
        }
        int a = a(this.f, i, 0);
        if (a < 0 || this.g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f[i2] == 0) {
            if (this.g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f[i3] == 0) {
            if (this.g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int a(Object obj, int i) {
        int i2 = this.h;
        if (i2 == 0) {
            return -1;
        }
        int a = a(this.f, i2, i);
        if (a < 0 || obj.equals(this.g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f[i3] == i) {
            if (obj.equals(this.g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f[i4] == i) {
            if (obj.equals(this.g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public V a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.g[i2];
        this.g[i2] = v;
        return v2;
    }

    public void a(int i) {
        int i2 = this.h;
        if (this.f.length < i) {
            int[] iArr = this.f;
            Object[] objArr = this.g;
            e(i);
            if (this.h > 0) {
                System.arraycopy(iArr, 0, this.f, 0, i2);
                System.arraycopy(objArr, 0, this.g, 0, i2 << 1);
            }
            a(iArr, objArr, i2);
        }
        if (this.h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    public int b(Object obj) {
        int i = 1;
        int i2 = this.h * 2;
        Object[] objArr = this.g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public K b(int i) {
        return this.g[i << 1];
    }

    public V c(int i) {
        return this.g[(i << 1) + 1];
    }

    public void clear() {
        if (this.h > 0) {
            int[] iArr = this.f;
            Object[] objArr = this.g;
            int i = this.h;
            this.f = c.a;
            this.g = c.c;
            this.h = 0;
            a(iArr, objArr, i);
        }
        if (this.h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public V d(int i) {
        int i2;
        int i3 = 8;
        V v = this.g[(i << 1) + 1];
        int i4 = this.h;
        if (i4 <= 1) {
            a(this.f, this.g, i4);
            this.f = c.a;
            this.g = c.c;
            i2 = 0;
        } else {
            int i5 = i4 - 1;
            if (this.f.length <= 8 || this.h >= this.f.length / 3) {
                if (i < i5) {
                    System.arraycopy(this.f, i + 1, this.f, i, i5 - i);
                    System.arraycopy(this.g, (i + 1) << 1, this.g, i << 1, (i5 - i) << 1);
                }
                this.g[i5 << 1] = null;
                this.g[(i5 << 1) + 1] = null;
                i2 = i5;
            } else {
                if (i4 > 8) {
                    i3 = (i4 >> 1) + i4;
                }
                int[] iArr = this.f;
                Object[] objArr = this.g;
                e(i3);
                if (i4 != this.h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f, 0, i);
                    System.arraycopy(objArr, 0, this.g, 0, i << 1);
                }
                if (i < i5) {
                    System.arraycopy(iArr, i + 1, this.f, i, i5 - i);
                    System.arraycopy(objArr, (i + 1) << 1, this.g, i << 1, (i5 - i) << 1);
                }
                i2 = i5;
            }
        }
        if (i4 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = i2;
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (size() != fVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.h) {
                try {
                    Object b2 = b(i);
                    Object c2 = c(i);
                    Object obj2 = fVar.get(b2);
                    if (c2 == null) {
                        if (obj2 != null || !fVar.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e2) {
                    return false;
                } catch (ClassCastException e3) {
                    return false;
                }
            }
            return true;
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.h) {
                try {
                    Object b3 = b(i2);
                    Object c3 = c(i2);
                    Object obj3 = map.get(b3);
                    if (c3 == null) {
                        if (obj3 != null || !map.containsKey(b3)) {
                            return false;
                        }
                    } else if (!c3.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (NullPointerException e4) {
                    return false;
                } catch (ClassCastException e5) {
                    return false;
                }
            }
            return true;
        }
    }

    public V get(Object obj) {
        int a = a(obj);
        if (a >= 0) {
            return this.g[(a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f;
        Object[] objArr = this.g;
        int i = this.h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.h <= 0;
    }

    public V put(K k, V v) {
        int hashCode;
        int a;
        int i = 8;
        int i2 = this.h;
        if (k == null) {
            a = a();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            a = a((Object) k, hashCode);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            V v2 = this.g[i3];
            this.g[i3] = v;
            return v2;
        }
        int i4 = a ^ -1;
        if (i2 >= this.f.length) {
            if (i2 >= 8) {
                i = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i = 4;
            }
            int[] iArr = this.f;
            Object[] objArr = this.g;
            e(i);
            if (i2 != this.h) {
                throw new ConcurrentModificationException();
            }
            if (this.f.length > 0) {
                System.arraycopy(iArr, 0, this.f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.g, 0, objArr.length);
            }
            a(iArr, objArr, i2);
        }
        if (i4 < i2) {
            System.arraycopy(this.f, i4, this.f, i4 + 1, i2 - i4);
            System.arraycopy(this.g, i4 << 1, this.g, (i4 + 1) << 1, (this.h - i4) << 1);
        }
        if (i2 != this.h || i4 >= this.f.length) {
            throw new ConcurrentModificationException();
        }
        this.f[i4] = hashCode;
        this.g[i4 << 1] = k;
        this.g[(i4 << 1) + 1] = v;
        this.h++;
        return null;
    }

    public V remove(Object obj) {
        int a = a(obj);
        if (a >= 0) {
            return d(a);
        }
        return null;
    }

    public int size() {
        return this.h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        for (int i = 0; i < this.h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c2 = c(i);
            if (c2 != this) {
                sb.append(c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
