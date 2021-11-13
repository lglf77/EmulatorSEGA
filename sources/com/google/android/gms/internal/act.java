package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.acf;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class act extends ahc<act, a> implements aif {
    /* access modifiers changed from: private */
    public static final act f;
    private static volatile aij<act> g;
    private String d = "";
    private acf e;

    public static final class a extends ahc.a<act, a> implements aif {
        private a() {
            super(act.f);
        }

        /* synthetic */ a(acu acu) {
            this();
        }
    }

    static {
        act act = new act();
        f = act;
        act.a(ahc.g.f, (Object) null, (Object) null);
        act.b.c();
    }

    private act() {
    }

    public static act a(age age) {
        return (act) ahc.a(f, age);
    }

    public static act c() {
        return f;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        acf.a aVar;
        boolean z = true;
        switch (acu.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new act();
            case 2:
                return f;
            case 3:
                return null;
            case 4:
                return new a((acu) null);
            case 5:
                ahc.h hVar = (ahc.h) obj;
                act act = (act) obj2;
                boolean z2 = !this.d.isEmpty();
                String str = this.d;
                if (act.d.isEmpty()) {
                    z = false;
                }
                this.d = hVar.a(z2, str, z, act.d);
                this.e = (acf) hVar.a(this.e, act.e);
                return this;
            case 6:
                agn agn = (agn) obj;
                agu agu = (agu) obj2;
                if (agu != null) {
                    boolean z3 = false;
                    while (!z3) {
                        try {
                            int a2 = agn.a();
                            switch (a2) {
                                case a.b.AdsAttrs_adSize:
                                    z3 = true;
                                    break;
                                case 10:
                                    this.d = agn.f();
                                    break;
                                case 18:
                                    if (this.e != null) {
                                        acf acf = this.e;
                                        ahc.a aVar2 = (ahc.a) acf.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar2.a(acf);
                                        aVar = (acf.a) aVar2;
                                    } else {
                                        aVar = null;
                                    }
                                    this.e = (acf) agn.a(acf.c(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.e);
                                        this.e = (acf) aVar.c();
                                        break;
                                    }
                                default:
                                    if (a(a2, agn)) {
                                        break;
                                    } else {
                                        z3 = true;
                                        break;
                                    }
                            }
                        } catch (ahi e2) {
                            throw new RuntimeException(e2.a(this));
                        } catch (IOException e3) {
                            throw new RuntimeException(new ahi(e3.getMessage()).a(this));
                        }
                    }
                    break;
                } else {
                    throw new NullPointerException();
                }
            case 7:
                break;
            case 8:
                if (g == null) {
                    synchronized (act.class) {
                        if (g == null) {
                            g = new ahc.b(f);
                        }
                    }
                }
                return g;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    public final String a() {
        return this.d;
    }

    public final void a(agq agq) {
        if (!this.d.isEmpty()) {
            agq.a(1, this.d);
        }
        if (this.e != null) {
            agq.a(2, (aid) this.e == null ? acf.c() : this.e);
        }
        this.b.a(agq);
    }

    public final acf b() {
        return this.e == null ? acf.c() : this.e;
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.d.isEmpty()) {
            i2 = agq.b(1, this.d) + 0;
        }
        if (this.e != null) {
            i2 += agq.c(2, (aid) this.e == null ? acf.c() : this.e);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
