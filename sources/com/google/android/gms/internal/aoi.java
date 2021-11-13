package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.ahc;
import java.io.IOException;

public final class aoi {

    public static final class a extends ahc<a, C0016a> implements aif {
        /* access modifiers changed from: private */
        public static final a d;
        private static volatile aij<a> e;

        /* renamed from: com.google.android.gms.internal.aoi$a$a  reason: collision with other inner class name */
        public static final class C0016a extends ahc.a<a, C0016a> implements aif {
            private C0016a() {
                super(a.d);
            }

            /* synthetic */ C0016a(aoj aoj) {
                this();
            }
        }

        public enum b implements ahf {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(1001),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(1002),
            REQUEST_FAILED_TO_BUILD_URL(1003),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005);
            
            private static final ahg<b> A = null;
            private final int B;

            static {
                A = new aok();
            }

            private b(int i) {
                this.B = i;
            }

            public final int a() {
                return this.B;
            }
        }

        static {
            a aVar = new a();
            d = aVar;
            aVar.a(ahc.g.f, (Object) null, (Object) null);
            aVar.b.c();
        }

        private a() {
        }

        /* access modifiers changed from: protected */
        public final Object a(int i, Object obj, Object obj2) {
            switch (aoj.a[i - 1]) {
                case a.b.AdsAttrs_adSizes:
                    return new a();
                case 2:
                    return d;
                case 3:
                    return null;
                case 4:
                    return new C0016a((aoj) null);
                case 5:
                    return this;
                case 6:
                    agn agn = (agn) obj;
                    if (((agu) obj2) != null) {
                        boolean z = false;
                        while (!z) {
                            try {
                                int a = agn.a();
                                switch (a) {
                                    case a.b.AdsAttrs_adSize:
                                        z = true;
                                        break;
                                    default:
                                        if (a(a, agn)) {
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
                        synchronized (a.class) {
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
}
