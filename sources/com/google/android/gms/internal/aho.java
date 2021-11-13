package com.google.android.gms.internal;

public class aho {
    private static final agu a = agu.a();
    private age b;
    private volatile aid c;
    private volatile age d;

    private aid b(aid aid) {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    try {
                        this.c = aid;
                        this.d = age.a;
                    } catch (ahi e) {
                        this.c = aid;
                        this.d = age.a;
                    }
                }
            }
        }
        return this.c;
    }

    public final aid a(aid aid) {
        aid aid2 = this.c;
        this.b = null;
        this.d = null;
        this.c = aid;
        return aid2;
    }

    public final int b() {
        if (this.d != null) {
            return this.d.a();
        }
        if (this.c != null) {
            return this.c.d();
        }
        return 0;
    }

    public final age c() {
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d != null) {
                age age = this.d;
                return age;
            }
            if (this.c == null) {
                this.d = age.a;
            } else {
                this.d = this.c.j();
            }
            age age2 = this.d;
            return age2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aho)) {
            return false;
        }
        aho aho = (aho) obj;
        aid aid = this.c;
        aid aid2 = aho.c;
        return (aid == null && aid2 == null) ? c().equals(aho.c()) : (aid == null || aid2 == null) ? aid != null ? aid.equals(aho.b(aid.n())) : b(aid2.n()).equals(aid2) : aid.equals(aid2);
    }

    public int hashCode() {
        return 1;
    }
}
