package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.aaw;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class aau extends ahc<aau, a> implements aif {
    /* access modifiers changed from: private */
    public static final aau f;
    private static volatile aij<aau> g;
    private aaw d;
    private int e;

    public static final class a extends ahc.a<aau, a> implements aif {
        private a() {
            super(aau.f);
        }

        /* synthetic */ a(aav aav) {
            this();
        }
    }

    static {
        aau aau = new aau();
        f = aau;
        aau.a(ahc.g.f, (Object) null, (Object) null);
        aau.b.c();
    }

    private aau() {
    }

    public static aau a(age age) {
        return (aau) ahc.a(f, age);
    }

    public final aaw a() {
        return this.d == null ? aaw.a() : this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        aaw.a aVar;
        boolean z = true;
        switch (aav.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new aau();
            case 2:
                return f;
            case 3:
                return null;
            case 4:
                return new a((aav) null);
            case 5:
                ahc.h hVar = (ahc.h) obj;
                aau aau = (aau) obj2;
                this.d = (aaw) hVar.a(this.d, aau.d);
                boolean z2 = this.e != 0;
                int i2 = this.e;
                if (aau.e == 0) {
                    z = false;
                }
                this.e = hVar.a(z2, i2, z, aau.e);
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
                                    if (this.d != null) {
                                        aaw aaw = this.d;
                                        ahc.a aVar2 = (ahc.a) aaw.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar2.a(aaw);
                                        aVar = (aaw.a) aVar2;
                                    } else {
                                        aVar = null;
                                    }
                                    this.d = (aaw) agn.a(aaw.a(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.d);
                                        this.d = (aaw) aVar.c();
                                        break;
                                    }
                                case 16:
                                    this.e = agn.h();
                                    break;
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
                    synchronized (aau.class) {
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

    public final void a(agq agq) {
        if (this.d != null) {
            agq.a(1, (aid) this.d == null ? aaw.a() : this.d);
        }
        if (this.e != 0) {
            agq.c(2, this.e);
        }
        this.b.a(agq);
    }

    public final int b() {
        return this.e;
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d != null) {
            i2 = agq.c(1, (aid) this.d == null ? aaw.a() : this.d) + 0;
        }
        if (this.e != 0) {
            i2 += agq.e(2, this.e);
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
