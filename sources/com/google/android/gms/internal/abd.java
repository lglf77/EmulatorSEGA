package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.acf;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class abd extends ahc<abd, a> implements aif {
    /* access modifiers changed from: private */
    public static final abd e;
    private static volatile aij<abd> f;
    private acf d;

    public static final class a extends ahc.a<abd, a> implements aif {
        private a() {
            super(abd.e);
        }

        /* synthetic */ a(abe abe) {
            this();
        }
    }

    static {
        abd abd = new abd();
        e = abd;
        abd.a(ahc.g.f, (Object) null, (Object) null);
        abd.b.c();
    }

    private abd() {
    }

    public static abd b() {
        return e;
    }

    public final acf a() {
        return this.d == null ? acf.c() : this.d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        acf.a aVar;
        switch (abe.a[i - 1]) {
            case a.b.AdsAttrs_adSizes:
                return new abd();
            case 2:
                return e;
            case 3:
                return null;
            case 4:
                return new a((abe) null);
            case 5:
                this.d = (acf) ((ahc.h) obj).a(this.d, ((abd) obj2).d);
                return this;
            case 6:
                agn agn = (agn) obj;
                agu agu = (agu) obj2;
                if (agu != null) {
                    boolean z = false;
                    while (!z) {
                        try {
                            int a2 = agn.a();
                            switch (a2) {
                                case a.b.AdsAttrs_adSize:
                                    z = true;
                                    break;
                                case 18:
                                    if (this.d != null) {
                                        acf acf = this.d;
                                        ahc.a aVar2 = (ahc.a) acf.a(ahc.g.h, (Object) null, (Object) null);
                                        aVar2.a(acf);
                                        aVar = (acf.a) aVar2;
                                    } else {
                                        aVar = null;
                                    }
                                    this.d = (acf) agn.a(acf.c(), agu);
                                    if (aVar == null) {
                                        break;
                                    } else {
                                        aVar.a(this.d);
                                        this.d = (acf) aVar.c();
                                        break;
                                    }
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
                if (f == null) {
                    synchronized (abd.class) {
                        if (f == null) {
                            f = new ahc.b(e);
                        }
                    }
                }
                return f;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return e;
    }

    public final void a(agq agq) {
        if (this.d != null) {
            agq.a(2, (aid) this.d == null ? acf.c() : this.d);
        }
        this.b.a(agq);
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.d != null) {
            i2 = agq.c(2, (aid) this.d == null ? acf.c() : this.d) + 0;
        }
        int e2 = i2 + this.b.e();
        this.c = e2;
        return e2;
    }
}
