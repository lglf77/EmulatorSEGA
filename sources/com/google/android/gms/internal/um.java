package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.c.a;
import android.text.TextUtils;
import com.google.android.gms.b.g;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class um extends uk {
    protected vb a;
    private AppMeasurement.b b;
    private final Set<AppMeasurement.c> c = new CopyOnWriteArraySet();
    private boolean d;
    private final AtomicReference<String> e = new AtomicReference<>();

    protected um(tk tkVar) {
        super(tkVar);
    }

    private final void a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
            for (String str4 : bundle2.keySet()) {
                Object obj = bundle2.get(str4);
                if (obj instanceof Bundle) {
                    bundle2.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= parcelableArr.length) {
                            break;
                        }
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i = i2 + 1;
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= arrayList.size()) {
                            break;
                        }
                        Object obj2 = arrayList.get(i4);
                        if (obj2 instanceof Bundle) {
                            arrayList.set(i4, new Bundle((Bundle) obj2));
                        }
                        i3 = i4 + 1;
                    }
                }
            }
        }
        s().a((Runnable) new uu(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    private final void a(String str, String str2, long j, Object obj) {
        s().a((Runnable) new uv(this, str, str2, obj, j));
    }

    private final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        a(str, str2, k().a(), bundle, true, z2, z3, (String) null);
    }

    /* access modifiers changed from: private */
    public final void a(String str, String str2, Object obj, long j) {
        y.a(str);
        y.a(str2);
        c();
        Q();
        if (!this.p.B()) {
            t().D().a("User property not set since app measurement is disabled");
        } else if (this.p.b()) {
            t().D().a("Setting user property (FE)", o().a(str2), obj);
            i().a(new wo(str2, j, obj, str));
        }
    }

    private final List<AppMeasurement.ConditionalUserProperty> b(String str, String str2, String str3) {
        if (s().z()) {
            t().y().a("Cannot get conditional user properties from analytics worker thread");
            return Collections.emptyList();
        }
        s();
        if (tf.y()) {
            t().y().a("Cannot get conditional user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.p.h().a((Runnable) new uq(this, atomicReference, str, str2, str3));
            try {
                atomicReference.wait(5000);
            } catch (InterruptedException e2) {
                t().A().a("Interrupted waiting for get conditional user properties", str, e2);
            }
        }
        List<rh> list = (List) atomicReference.get();
        if (list == null) {
            t().A().a("Timed out waiting for get conditional user properties", str);
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (rh rhVar : list) {
            AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
            conditionalUserProperty.mAppId = str;
            conditionalUserProperty.mOrigin = str2;
            conditionalUserProperty.mCreationTimestamp = rhVar.d;
            conditionalUserProperty.mName = rhVar.c.a;
            conditionalUserProperty.mValue = rhVar.c.a();
            conditionalUserProperty.mActive = rhVar.e;
            conditionalUserProperty.mTriggerEventName = rhVar.f;
            if (rhVar.g != null) {
                conditionalUserProperty.mTimedOutEventName = rhVar.g.a;
                if (rhVar.g.b != null) {
                    conditionalUserProperty.mTimedOutEventParams = rhVar.g.b.b();
                }
            }
            conditionalUserProperty.mTriggerTimeout = rhVar.h;
            if (rhVar.i != null) {
                conditionalUserProperty.mTriggeredEventName = rhVar.i.a;
                if (rhVar.i.b != null) {
                    conditionalUserProperty.mTriggeredEventParams = rhVar.i.b.b();
                }
            }
            conditionalUserProperty.mTriggeredTimestamp = rhVar.c.b;
            conditionalUserProperty.mTimeToLive = rhVar.j;
            if (rhVar.k != null) {
                conditionalUserProperty.mExpiredEventName = rhVar.k.a;
                if (rhVar.k.b != null) {
                    conditionalUserProperty.mExpiredEventParams = rhVar.k.b.b();
                }
            }
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    private final Map<String, Object> b(String str, String str2, String str3, boolean z) {
        if (s().z()) {
            t().y().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        s();
        if (tf.y()) {
            t().y().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.p.h().a((Runnable) new ur(this, atomicReference, str, str2, str3, z));
            try {
                atomicReference.wait(5000);
            } catch (InterruptedException e2) {
                t().A().a("Interrupted waiting for get user properties", e2);
            }
        }
        List<wo> list = (List) atomicReference.get();
        if (list == null) {
            t().A().a("Timed out waiting for get user properties");
            return Collections.emptyMap();
        }
        a aVar = new a(list.size());
        for (wo woVar : list) {
            aVar.put(woVar.a, woVar.a());
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    public final void b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        int i;
        y.a(str);
        y.a(str2);
        y.a(bundle);
        c();
        Q();
        if (!this.p.B()) {
            t().D().a("Event not sent since app measurement is disabled");
            return;
        }
        if (!this.d) {
            this.d = true;
            try {
                try {
                    Class.forName("com.google.android.gms.tagmanager.TagManagerService").getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{l()});
                } catch (Exception e2) {
                    t().A().a("Failed to invoke Tag Manager's initialize() method", e2);
                }
            } catch (ClassNotFoundException e3) {
                t().C().a("Tag Manager is not found and thus will not be used");
            }
        }
        boolean equals = "am".equals(str);
        boolean i2 = wr.i(str2);
        if (z && this.b != null && !i2 && !equals) {
            t().D().a("Passing event to registered event handler (FE)", o().a(str2), o().a(bundle));
            this.b.a(str, str2, bundle, j);
        } else if (this.p.b()) {
            int c2 = p().c(str2);
            if (c2 != 0) {
                p();
                this.p.o().a(str3, c2, "_ev", wr.a(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            List singletonList = Collections.singletonList("_o");
            Bundle a2 = p().a(str2, bundle, (List<String>) singletonList, z3, true);
            ArrayList arrayList = new ArrayList();
            arrayList.add(a2);
            long nextLong = p().z().nextLong();
            int i3 = 0;
            String[] strArr = (String[]) a2.keySet().toArray(new String[bundle.size()]);
            Arrays.sort(strArr);
            int length = strArr.length;
            int i4 = 0;
            while (i4 < length) {
                String str4 = strArr[i4];
                Object obj = a2.get(str4);
                p();
                Bundle[] a3 = wr.a(obj);
                if (a3 != null) {
                    a2.putInt(str4, a3.length);
                    int i5 = 0;
                    while (true) {
                        int i6 = i5;
                        if (i6 >= a3.length) {
                            break;
                        }
                        Bundle a4 = p().a("_ep", a3[i6], (List<String>) singletonList, z3, false);
                        a4.putString("_en", str2);
                        a4.putLong("_eid", nextLong);
                        a4.putString("_gn", str4);
                        a4.putInt("_ll", a3.length);
                        a4.putInt("_i", i6);
                        arrayList.add(a4);
                        i5 = i6 + 1;
                    }
                    i = a3.length + i3;
                } else {
                    i = i3;
                }
                i4++;
                i3 = i;
            }
            if (i3 != 0) {
                a2.putLong("_eid", nextLong);
                a2.putInt("_epc", i3);
            }
            vf y = j().y();
            if (y != null && !a2.containsKey("_sc")) {
                y.a = true;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 >= arrayList.size()) {
                    break;
                }
                Bundle bundle2 = (Bundle) arrayList.get(i8);
                String str5 = i8 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str);
                if (!bundle2.containsKey("_sc")) {
                    vc.a((AppMeasurement.g) y, bundle2);
                }
                Bundle a5 = z2 ? p().a(bundle2) : bundle2;
                t().D().a("Logging event (FE)", o().a(str2), o().a(a5));
                i().a(new rx(str5, new rt(a5), str, j), str3);
                if (!equals) {
                    for (AppMeasurement.c a6 : this.c) {
                        a6.a(str, str2, new Bundle(a5), j);
                    }
                }
                i7 = i8 + 1;
            }
            if (j().y() != null && "_ae".equals(str2)) {
                r().a(true);
            }
        }
    }

    private final void b(String str, String str2, String str3, Bundle bundle) {
        long a2 = k().a();
        y.a(str2);
        AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a2;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        s().a((Runnable) new up(this, conditionalUserProperty));
    }

    private final void c(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        long a2 = k().a();
        y.a(conditionalUserProperty);
        y.a(conditionalUserProperty.mName);
        y.a(conditionalUserProperty.mOrigin);
        y.a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a2;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (p().e(str) != 0) {
            t().y().a("Invalid conditional user property name", o().c(str));
        } else if (p().b(str, obj) != 0) {
            t().y().a("Invalid conditional user property value", o().c(str), obj);
        } else {
            Object c2 = p().c(str, obj);
            if (c2 == null) {
                t().y().a("Unable to normalize conditional user property value", o().c(str), obj);
                return;
            }
            conditionalUserProperty.mValue = c2;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j <= 15552000000L && j >= 1)) {
                long j2 = conditionalUserProperty.mTimeToLive;
                if (j2 > 15552000000L || j2 < 1) {
                    t().y().a("Invalid conditional user property time to live", o().c(str), Long.valueOf(j2));
                } else {
                    s().a((Runnable) new uo(this, conditionalUserProperty));
                }
            } else {
                t().y().a("Invalid conditional user property timeout", o().c(str), Long.valueOf(j));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void c(boolean z) {
        c();
        Q();
        t().D().a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        u().b(z);
        i().z();
    }

    /* access modifiers changed from: private */
    public final void d(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        c();
        Q();
        y.a(conditionalUserProperty);
        y.a(conditionalUserProperty.mName);
        y.a(conditionalUserProperty.mOrigin);
        y.a(conditionalUserProperty.mValue);
        if (!this.p.B()) {
            t().D().a("Conditional property not sent since Firebase Analytics is disabled");
            return;
        }
        wo woVar = new wo(conditionalUserProperty.mName, conditionalUserProperty.mTriggeredTimestamp, conditionalUserProperty.mValue, conditionalUserProperty.mOrigin);
        try {
            rx a2 = p().a(conditionalUserProperty.mTriggeredEventName, conditionalUserProperty.mTriggeredEventParams, conditionalUserProperty.mOrigin, 0, true, false);
            i().a(new rh(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, woVar, conditionalUserProperty.mCreationTimestamp, false, conditionalUserProperty.mTriggerEventName, p().a(conditionalUserProperty.mTimedOutEventName, conditionalUserProperty.mTimedOutEventParams, conditionalUserProperty.mOrigin, 0, true, false), conditionalUserProperty.mTriggerTimeout, a2, conditionalUserProperty.mTimeToLive, p().a(conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, 0, true, false)));
        } catch (IllegalArgumentException e2) {
        }
    }

    /* access modifiers changed from: private */
    public final void e(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        c();
        Q();
        y.a(conditionalUserProperty);
        y.a(conditionalUserProperty.mName);
        if (!this.p.B()) {
            t().D().a("Conditional property not cleared since Firebase Analytics is disabled");
            return;
        }
        wo woVar = new wo(conditionalUserProperty.mName, 0, (Object) null, (String) null);
        try {
            i().a(new rh(conditionalUserProperty.mAppId, conditionalUserProperty.mOrigin, woVar, conditionalUserProperty.mCreationTimestamp, conditionalUserProperty.mActive, conditionalUserProperty.mTriggerEventName, (rx) null, conditionalUserProperty.mTriggerTimeout, (rx) null, conditionalUserProperty.mTimeToLive, p().a(conditionalUserProperty.mExpiredEventName, conditionalUserProperty.mExpiredEventParams, conditionalUserProperty.mOrigin, conditionalUserProperty.mCreationTimestamp, true, false)));
        } catch (IllegalArgumentException e2) {
        }
    }

    public final void A() {
        s().a((Runnable) new va(this));
    }

    public final List<AppMeasurement.ConditionalUserProperty> a(String str, String str2) {
        return b((String) null, str, str2);
    }

    public final List<AppMeasurement.ConditionalUserProperty> a(String str, String str2, String str3) {
        y.a(str);
        a();
        return b(str, str2, str3);
    }

    public final Map<String, Object> a(String str, String str2, String str3, boolean z) {
        y.a(str);
        a();
        return b(str, str2, str3, z);
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        return b((String) null, str, str2, z);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(long j) {
        s().a((Runnable) new us(this, j));
    }

    public final void a(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        y.a(conditionalUserProperty);
        AppMeasurement.ConditionalUserProperty conditionalUserProperty2 = new AppMeasurement.ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            t().A().a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        c(conditionalUserProperty2);
    }

    public final void a(AppMeasurement.b bVar) {
        c();
        Q();
        if (!(bVar == null || bVar == this.b)) {
            y.a(this.b == null, (Object) "EventInterceptor already set.");
        }
        this.b = bVar;
    }

    public final void a(AppMeasurement.c cVar) {
        Q();
        y.a(cVar);
        if (!this.c.add(cVar)) {
            t().A().a("OnEventListener already registered");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.e.set(str);
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, this.b == null || wr.i(str2), false, (String) null);
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        a(str, str2, j, bundle, false, true, true, (String) null);
    }

    public final void a(String str, String str2, Bundle bundle, boolean z) {
        a(str, str2, bundle, true, this.b == null || wr.i(str2), true, (String) null);
    }

    public final void a(String str, String str2, Object obj) {
        int i = 0;
        y.a(str);
        long a2 = k().a();
        int e2 = p().e(str2);
        if (e2 != 0) {
            p();
            String a3 = wr.a(str2, 24, true);
            if (str2 != null) {
                i = str2.length();
            }
            this.p.o().a(e2, "_ev", a3, i);
        } else if (obj != null) {
            int b2 = p().b(str2, obj);
            if (b2 != 0) {
                p();
                String a4 = wr.a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i = String.valueOf(obj).length();
                }
                this.p.o().a(b2, "_ev", a4, i);
                return;
            }
            Object c2 = p().c(str2, obj);
            if (c2 != null) {
                a(str, str2, a2, c2);
            }
        } else {
            a(str, str2, a2, (Object) null);
        }
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        y.a(str);
        a();
        b(str, str2, str3, bundle);
    }

    public final void a(boolean z) {
        Q();
        s().a((Runnable) new un(this, z));
    }

    public final List<wo> b(boolean z) {
        Q();
        t().D().a("Fetching user attributes (FE)");
        if (s().z()) {
            t().y().a("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        s();
        if (tf.y()) {
            t().y().a("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            this.p.h().a((Runnable) new uw(this, atomicReference, z));
            try {
                atomicReference.wait(5000);
            } catch (InterruptedException e2) {
                t().A().a("Interrupted waiting for get user properties", e2);
            }
        }
        List<wo> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        t().A().a("Timed out waiting for get user properties");
        return Collections.emptyList();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final void b(long j) {
        s().a((Runnable) new ut(this, j));
    }

    public final void b(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        y.a(conditionalUserProperty);
        y.a(conditionalUserProperty.mAppId);
        a();
        c(new AppMeasurement.ConditionalUserProperty(conditionalUserProperty));
    }

    public final void b(AppMeasurement.c cVar) {
        Q();
        y.a(cVar);
        if (!this.c.remove(cVar)) {
            t().A().a("OnEventListener had not been registered");
        }
    }

    public final void b(String str, String str2, Bundle bundle) {
        b((String) null, str, str2, bundle);
    }

    /* access modifiers changed from: package-private */
    public final String c(long j) {
        AtomicReference atomicReference = new AtomicReference();
        synchronized (atomicReference) {
            s().a((Runnable) new uy(this, atomicReference));
            try {
                atomicReference.wait(j);
            } catch (InterruptedException e2) {
                t().A().a("Interrupted waiting for app instance id");
                return null;
            }
        }
        return (String) atomicReference.get();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ qz d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ rg e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ um f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ se g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ rq h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ vg i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ vc j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ d k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Context l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ sf m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ rk n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ sh o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ wr p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ te q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ wg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ tf s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ sj t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ su u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ rj v() {
        return super.v();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    public final com.google.android.gms.b.d<String> y() {
        try {
            String z = u().z();
            return z != null ? g.a(z) : g.a((Executor) s().A(), new ux(this));
        } catch (Exception e2) {
            t().A().a("Failed to schedule task for getAppInstanceId");
            return g.a(e2);
        }
    }

    public final String z() {
        return this.e.get();
    }
}
