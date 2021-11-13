package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class aaw extends ahc<aaw, a> implements aif {
    /* access modifiers changed from: private */
    public static final aaw d;
    private static volatile aij<aaw> e;

    public static final class a extends ahc.a<aaw, a> implements aif {
        private a() {
            super(aaw.d);
        }

        /* synthetic */ a(aax aax) {
            this();
        }
    }

    static {
        aaw aaw = new aaw();
        d = aaw;
        aaw.a(ahc.g.f, (Object) null, (Object) null);
        aaw.b.c();
    }

    private aaw() {
    }

    public static aaw a() {
        return d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (aax.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new aaw();
            case 2:
                return d;
            case 3:
                return null;
            case 4:
                return new a((aax) null);
            case 5:
                return this;
            case 6:
                agn agn = (agn) obj;
                if (((agu) obj2) != null) {
                    boolean z = false;
                    while (!z) {
                        try {
                            int a2 = agn.a();
                            switch (a2) {
                                case a.b.AdsAttrs_adSize:
                                    z = true;
                                    break;
                                default:
                                    if (a(a2, agn)) {
                                        break;
                                    } else {
                                        z = true;
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
                if (e == null) {
                    synchronized (aaw.class) {
                        if (e == null) {
                            e = new ahc.b(d);
                        }
                    }
                }
                return e;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return d;
    }

    public final void a(agq agq) {
        this.b.a(agq);
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int e2 = this.b.e() + 0;
        this.c = e2;
        return e2;
    }
}
