package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.amf;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.ara;
import com.google.android.gms.internal.bar;
import com.google.android.gms.internal.bbe;
import com.google.android.gms.internal.bbh;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.ei;
import com.google.android.gms.internal.el;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.nf;
import com.google.android.gms.internal.or;
import java.lang.ref.WeakReference;
import java.util.List;

@bfk
public final class bs extends bd implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private boolean j;
    private WeakReference<Object> k = new WeakReference<>((Object) null);

    public bs(Context context, apc apc, String str, bar bar, jp jpVar, bq bqVar) {
        super(context, apc, str, bar, jpVar, bqVar);
    }

    private final boolean b(ev evVar, ev evVar2) {
        if (evVar2.m) {
            View a = r.a(evVar2);
            if (a == null) {
                fn.e("Could not get mediation view");
                return false;
            }
            View nextView = this.e.f.getNextView();
            if (nextView != null) {
                if (nextView instanceof mw) {
                    ((mw) nextView).destroy();
                }
                this.e.f.removeView(nextView);
            }
            if (!r.b(evVar2)) {
                try {
                    if (au.z().b(this.e.c)) {
                        new amb(this.e.c, a).a((amf) new el(this.e.c, this.e.b));
                    }
                    if (evVar2.t != null) {
                        this.e.f.setMinimumWidth(evVar2.t.f);
                        this.e.f.setMinimumHeight(evVar2.t.c);
                    }
                    a(a);
                } catch (Exception e) {
                    au.i().a((Throwable) e, "BannerAdManager.swapViews");
                    fn.c("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(evVar2.t == null || evVar2.b == null)) {
            evVar2.b.a(or.a(evVar2.t));
            this.e.f.removeAllViews();
            this.e.f.setMinimumWidth(evVar2.t.f);
            this.e.f.setMinimumHeight(evVar2.t.c);
            mw mwVar = evVar2.b;
            if (mwVar == null) {
                throw null;
            }
            a((View) mwVar);
        }
        if (this.e.f.getChildCount() > 1) {
            this.e.f.showNext();
        }
        if (evVar != null) {
            View nextView2 = this.e.f.getNextView();
            if (nextView2 instanceof mw) {
                ((mw) nextView2).destroy();
            } else if (nextView2 != null) {
                this.e.f.removeView(nextView2);
            }
            this.e.c();
        }
        this.e.f.setVisibility(0);
        return true;
    }

    public final void D() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    /* access modifiers changed from: protected */
    public final boolean R() {
        boolean z = true;
        au.e();
        if (!gw.a(this.e.c, this.e.c.getPackageName(), "android.permission.INTERNET")) {
            app.a().a(this.e.f, this.e.i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        au.e();
        if (!gw.a(this.e.c)) {
            app.a().a(this.e.f, this.e.i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && this.e.f != null) {
            this.e.f.setVisibility(0);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final mw a(ew ewVar, br brVar, ei eiVar) {
        d b;
        apc apc;
        if (this.e.i.g == null && this.e.i.i) {
            av avVar = this.e;
            if (ewVar.b.y) {
                apc = this.e.i;
            } else {
                String str = ewVar.b.l;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    b = new d(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    b = this.e.i.b();
                }
                apc = new apc(this.e.c, b);
            }
            avVar.i = apc;
        }
        return super.a(ewVar, brVar, eiVar);
    }

    /* access modifiers changed from: protected */
    public final void a(ev evVar, boolean z) {
        View view;
        super.a(evVar, z);
        if (r.b(evVar)) {
            c cVar = new c(this);
            if (evVar != null && r.b(evVar)) {
                mw mwVar = evVar.b;
                if (mwVar == null) {
                    view = null;
                } else if (mwVar == null) {
                    throw null;
                } else {
                    view = (View) mwVar;
                }
                if (view == null) {
                    fn.e("AdWebView is null");
                    return;
                }
                try {
                    List<String> list = evVar.n != null ? evVar.n.p : null;
                    if (list == null || list.isEmpty()) {
                        fn.e("No template ids present in mediation response");
                        return;
                    }
                    bbe h = evVar.o != null ? evVar.o.h() : null;
                    bbh i = evVar.o != null ? evVar.o.i() : null;
                    if (list.contains("2") && h != null) {
                        h.b(c.a(view));
                        if (!h.j()) {
                            h.i();
                        }
                        mwVar.w().a("/nativeExpressViewClicked", (aa<? super mw>) r.a(h, (bbh) null, cVar));
                    } else if (!list.contains("1") || i == null) {
                        fn.e("No matching template id and mapper");
                    } else {
                        i.b(c.a(view));
                        if (!i.h()) {
                            i.g();
                        }
                        mwVar.w().a("/nativeExpressViewClicked", (aa<? super mw>) r.a((bbe) null, i, cVar));
                    }
                } catch (RemoteException e) {
                    fn.c("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.app.f().a(com.google.android.gms.internal.asw.bJ)).booleanValue() != false) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.google.android.gms.internal.ev r6, com.google.android.gms.internal.ev r7) {
        /*
            r5 = this;
            r1 = 0
            r2 = 0
            boolean r0 = super.a((com.google.android.gms.internal.ev) r6, (com.google.android.gms.internal.ev) r7)
            if (r0 != 0) goto L_0x000a
            r0 = r2
        L_0x0009:
            return r0
        L_0x000a:
            com.google.android.gms.ads.internal.av r0 = r5.e
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0028
            boolean r0 = r5.b(r6, r7)
            if (r0 != 0) goto L_0x0028
            com.google.android.gms.internal.aog r0 = r7.H
            if (r0 == 0) goto L_0x0023
            com.google.android.gms.internal.aog r0 = r7.H
            com.google.android.gms.internal.aoi$a$b r1 = com.google.android.gms.internal.aoi.a.b.AD_FAILED_TO_LOAD
            r0.a((com.google.android.gms.internal.aoi.a.b) r1)
        L_0x0023:
            r5.a((int) r2)
            r0 = r2
            goto L_0x0009
        L_0x0028:
            boolean r0 = r7.k
            if (r0 == 0) goto L_0x00a4
            r5.d(r7)
            com.google.android.gms.ads.internal.au.y()
            com.google.android.gms.ads.internal.av r0 = r5.e
            com.google.android.gms.ads.internal.aw r0 = r0.f
            com.google.android.gms.internal.la.a((android.view.View) r0, (android.view.ViewTreeObserver.OnGlobalLayoutListener) r5)
            com.google.android.gms.ads.internal.au.y()
            com.google.android.gms.ads.internal.av r0 = r5.e
            com.google.android.gms.ads.internal.aw r0 = r0.f
            com.google.android.gms.internal.la.a((android.view.View) r0, (android.view.ViewTreeObserver.OnScrollChangedListener) r5)
            boolean r0 = r7.l
            if (r0 != 0) goto L_0x0060
            com.google.android.gms.ads.internal.bt r2 = new com.google.android.gms.ads.internal.bt
            r2.<init>(r5)
            com.google.android.gms.internal.mw r0 = r7.b
            if (r0 == 0) goto L_0x00a2
            com.google.android.gms.internal.mw r0 = r7.b
            com.google.android.gms.internal.mx r0 = r0.w()
        L_0x0056:
            if (r0 == 0) goto L_0x0060
            com.google.android.gms.ads.internal.bu r3 = new com.google.android.gms.ads.internal.bu
            r3.<init>(r5, r7, r2)
            r0.a((com.google.android.gms.internal.nf) r3)
        L_0x0060:
            com.google.android.gms.internal.mw r0 = r7.b
            if (r0 == 0) goto L_0x0084
            com.google.android.gms.internal.mw r0 = r7.b
            com.google.android.gms.internal.nq r0 = r0.b()
            com.google.android.gms.internal.mw r2 = r7.b
            com.google.android.gms.internal.mx r2 = r2.w()
            if (r2 == 0) goto L_0x0075
            r2.h()
        L_0x0075:
            com.google.android.gms.ads.internal.av r2 = r5.e
            com.google.android.gms.internal.asf r2 = r2.v
            if (r2 == 0) goto L_0x0084
            if (r0 == 0) goto L_0x0084
            com.google.android.gms.ads.internal.av r2 = r5.e
            com.google.android.gms.internal.asf r2 = r2.v
            r0.a((com.google.android.gms.internal.asf) r2)
        L_0x0084:
            com.google.android.gms.ads.internal.av r0 = r5.e
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0123
            com.google.android.gms.internal.mw r0 = r7.b
            if (r0 == 0) goto L_0x013f
            org.json.JSONObject r0 = r7.j
            if (r0 == 0) goto L_0x009d
            com.google.android.gms.internal.ala r0 = r5.g
            com.google.android.gms.ads.internal.av r2 = r5.e
            com.google.android.gms.internal.apc r2 = r2.i
            r0.a(r2, r7)
        L_0x009d:
            com.google.android.gms.internal.mw r0 = r7.b
            if (r0 != 0) goto L_0x00c2
            throw r1
        L_0x00a2:
            r0 = r1
            goto L_0x0056
        L_0x00a4:
            com.google.android.gms.ads.internal.av r0 = r5.e
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x00be
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.bJ
            com.google.android.gms.internal.asu r3 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0060
        L_0x00be:
            r5.a((com.google.android.gms.internal.ev) r7, (boolean) r2)
            goto L_0x0060
        L_0x00c2:
            android.view.View r0 = (android.view.View) r0
            com.google.android.gms.internal.amb r1 = new com.google.android.gms.internal.amb
            com.google.android.gms.ads.internal.av r2 = r5.e
            android.content.Context r2 = r2.c
            r1.<init>(r2, r0)
            com.google.android.gms.internal.em r2 = com.google.android.gms.ads.internal.au.z()
            com.google.android.gms.ads.internal.av r3 = r5.e
            android.content.Context r3 = r3.c
            boolean r2 = r2.b(r3)
            if (r2 == 0) goto L_0x00fd
            com.google.android.gms.internal.aoy r2 = r7.a
            boolean r2 = a((com.google.android.gms.internal.aoy) r2)
            if (r2 == 0) goto L_0x00fd
            com.google.android.gms.ads.internal.av r2 = r5.e
            java.lang.String r2 = r2.b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00fd
            com.google.android.gms.internal.el r2 = new com.google.android.gms.internal.el
            com.google.android.gms.ads.internal.av r3 = r5.e
            android.content.Context r3 = r3.c
            com.google.android.gms.ads.internal.av r4 = r5.e
            java.lang.String r4 = r4.b
            r2.<init>(r3, r4)
            r1.a((com.google.android.gms.internal.amf) r2)
        L_0x00fd:
            boolean r2 = r7.a()
            if (r2 == 0) goto L_0x0114
            com.google.android.gms.internal.mw r2 = r7.b
            r1.a((com.google.android.gms.internal.amf) r2)
        L_0x0108:
            boolean r1 = r7.m
            if (r1 != 0) goto L_0x0111
            com.google.android.gms.ads.internal.av r1 = r5.e
            r1.a((android.view.View) r0)
        L_0x0111:
            r0 = 1
            goto L_0x0009
        L_0x0114:
            com.google.android.gms.internal.mw r2 = r7.b
            com.google.android.gms.internal.mx r2 = r2.w()
            com.google.android.gms.ads.internal.b r3 = new com.google.android.gms.ads.internal.b
            r3.<init>(r5, r1, r7)
            r2.a((com.google.android.gms.internal.nd) r3)
            goto L_0x0108
        L_0x0123:
            com.google.android.gms.ads.internal.av r0 = r5.e
            android.view.View r0 = r0.E
            if (r0 == 0) goto L_0x013f
            org.json.JSONObject r0 = r7.j
            if (r0 == 0) goto L_0x013f
            com.google.android.gms.internal.ala r0 = r5.g
            com.google.android.gms.ads.internal.av r1 = r5.e
            com.google.android.gms.internal.apc r1 = r1.i
            com.google.android.gms.ads.internal.av r2 = r5.e
            android.view.View r2 = r2.E
            r0.a(r1, r7, r2)
            com.google.android.gms.ads.internal.av r0 = r5.e
            android.view.View r0 = r0.E
            goto L_0x0108
        L_0x013f:
            r0 = r1
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.bs.a(com.google.android.gms.internal.ev, com.google.android.gms.internal.ev):boolean");
    }

    public final void b(boolean z) {
        y.b("setManualImpressionsEnabled must be called from the main thread.");
        this.j = z;
    }

    public final boolean b(aoy aoy) {
        if (aoy.h != this.j) {
            aoy = new aoy(aoy.a, aoy.b, aoy.c, aoy.d, aoy.e, aoy.f, aoy.g, aoy.h || this.j, aoy.i, aoy.j, aoy.k, aoy.l, aoy.m, aoy.n, aoy.o, aoy.p, aoy.q, aoy.r);
        }
        return super.b(aoy);
    }

    /* access modifiers changed from: package-private */
    public final void d(ev evVar) {
        if (evVar != null && !evVar.l && this.e.f != null && au.e().a((View) this.e.f, this.e.c) && this.e.f.getGlobalVisibleRect(new Rect(), (Point) null)) {
            if (!(evVar == null || evVar.b == null || evVar.b.w() == null)) {
                evVar.b.w().a((nf) null);
            }
            a(evVar, false);
            evVar.l = true;
        }
    }

    public final void onGlobalLayout() {
        d(this.e.j);
    }

    public final void onScrollChanged() {
        d(this.e.j);
    }

    public final ara r() {
        y.b("getVideoController must be called from the main thread.");
        if (this.e.j == null || this.e.j.b == null) {
            return null;
        }
        return this.e.j.b.b();
    }
}
