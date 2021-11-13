package com.google.android.gms.internal;

import com.google.android.gms.a.a;
import com.google.android.gms.a.c;

@bfk
public final class dm extends dt {
    private volatile dk a;
    private volatile dn b;
    private volatile dl c;

    public dm(dl dlVar) {
        this.c = dlVar;
    }

    public final void a(a aVar) {
        if (this.a != null) {
            this.a.g();
        }
    }

    public final void a(a aVar, int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }

    public final void a(a aVar, dw dwVar) {
        if (this.c != null) {
            this.c.a(dwVar);
        }
    }

    public final void a(dk dkVar) {
        this.a = dkVar;
    }

    public final void a(dn dnVar) {
        this.b = dnVar;
    }

    public final void b(a aVar) {
        if (this.b != null) {
            this.b.a(c.a(aVar).getClass().getName());
        }
    }

    public final void b(a aVar, int i) {
        if (this.b != null) {
            this.b.a(c.a(aVar).getClass().getName(), i);
        }
    }

    public final void c(a aVar) {
        if (this.c != null) {
            this.c.H();
        }
    }

    public final void d(a aVar) {
        if (this.c != null) {
            this.c.I();
        }
    }

    public final void e(a aVar) {
        if (this.c != null) {
            this.c.J();
        }
    }

    public final void f(a aVar) {
        if (this.c != null) {
            this.c.K();
        }
    }

    public final void g(a aVar) {
        if (this.c != null) {
            this.c.L();
        }
    }
}
