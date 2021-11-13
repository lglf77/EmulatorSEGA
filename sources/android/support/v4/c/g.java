package android.support.v4.c;

public class g<E> implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private int[] c;
    private Object[] d;
    private int e;

    public g() {
        this(10);
    }

    public g(int i) {
        this.b = false;
        if (i == 0) {
            this.c = c.a;
            this.d = c.c;
        } else {
            int a2 = c.a(i);
            this.c = new int[a2];
            this.d = new Object[a2];
        }
        this.e = 0;
    }

    private void c() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public int a(int i) {
        if (this.b) {
            c();
        }
        return this.c[i];
    }

    /* renamed from: a */
    public g<E> clone() {
        try {
            g<E> gVar = (g) super.clone();
            try {
                gVar.c = (int[]) this.c.clone();
                gVar.d = (Object[]) this.d.clone();
                return gVar;
            } catch (CloneNotSupportedException e2) {
                return gVar;
            }
        } catch (CloneNotSupportedException e3) {
            return null;
        }
    }

    public int b() {
        if (this.b) {
            c();
        }
        return this.e;
    }

    public E b(int i) {
        if (this.b) {
            c();
        }
        return this.d[i];
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            Object b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
