package com.google.android.gms.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.s;
import com.google.android.gms.common.t;
import com.google.android.gms.common.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class tp extends sc {
    /* access modifiers changed from: private */
    public final tk a;
    private Boolean b;
    private String c;

    public tp(tk tkVar) {
        this(tkVar, (String) null);
    }

    private tp(tk tkVar, String str) {
        y.a(tkVar);
        this.a = tkVar;
        this.c = null;
    }

    private final void a(String str, boolean z) {
        boolean z2 = false;
        if (TextUtils.isEmpty(str)) {
            this.a.f().y().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    if ("com.google.android.gms".equals(this.c) || p.a(this.a.t(), Binder.getCallingUid()) || t.a(this.a.t()).a(Binder.getCallingUid())) {
                        z2 = true;
                    }
                    this.b = Boolean.valueOf(z2);
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.a.f().y().a("Measurement Service called with invalid calling package. appId", sj.a(str));
                throw e;
            }
        }
        if (this.c == null && s.a(this.a.t(), Binder.getCallingUid(), str)) {
            this.c = str;
        }
        if (!str.equals(this.c)) {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
        }
    }

    private final void b(re reVar, boolean z) {
        y.a(reVar);
        a(reVar.a, false);
        this.a.o().f(reVar.b);
    }

    public final List<wo> a(re reVar, boolean z) {
        b(reVar, false);
        try {
            List<wq> list = (List) this.a.h().a(new ug(this, reVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (wq wqVar : list) {
                if (z || !wr.i(wqVar.c)) {
                    arrayList.add(new wo(wqVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.f().y().a("Failed to get user attributes. appId", sj.a(reVar.a), e);
            return null;
        }
    }

    public final List<rh> a(String str, String str2, re reVar) {
        b(reVar, false);
        try {
            return (List) this.a.h().a(new tx(this, reVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.f().y().a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List<rh> a(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.a.h().a(new tz(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.f().y().a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List<wo> a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<wq> list = (List) this.a.h().a(new tw(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (wq wqVar : list) {
                if (z || !wr.i(wqVar.c)) {
                    arrayList.add(new wo(wqVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.f().y().a("Failed to get user attributes. appId", sj.a(str), e);
            return Collections.emptyList();
        }
    }

    public final List<wo> a(String str, String str2, boolean z, re reVar) {
        b(reVar, false);
        try {
            List<wq> list = (List) this.a.h().a(new tv(this, reVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (wq wqVar : list) {
                if (z || !wr.i(wqVar.c)) {
                    arrayList.add(new wo(wqVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.f().y().a("Failed to get user attributes. appId", sj.a(reVar.a), e);
            return Collections.emptyList();
        }
    }

    public final void a(long j, String str, String str2, String str3) {
        this.a.h().a((Runnable) new ui(this, str2, str3, str, j));
    }

    public final void a(re reVar) {
        b(reVar, false);
        uh uhVar = new uh(this, reVar);
        if (this.a.h().z()) {
            uhVar.run();
        } else {
            this.a.h().a((Runnable) uhVar);
        }
    }

    public final void a(rh rhVar) {
        y.a(rhVar);
        y.a(rhVar.c);
        a(rhVar.a, true);
        rh rhVar2 = new rh(rhVar);
        if (rhVar.c.a() == null) {
            this.a.h().a((Runnable) new tt(this, rhVar2));
        } else {
            this.a.h().a((Runnable) new tu(this, rhVar2));
        }
    }

    public final void a(rh rhVar, re reVar) {
        y.a(rhVar);
        y.a(rhVar.c);
        b(reVar, false);
        rh rhVar2 = new rh(rhVar);
        rhVar2.a = reVar.a;
        if (rhVar.c.a() == null) {
            this.a.h().a((Runnable) new tr(this, rhVar2, reVar));
        } else {
            this.a.h().a((Runnable) new ts(this, rhVar2, reVar));
        }
    }

    public final void a(rx rxVar, re reVar) {
        y.a(rxVar);
        b(reVar, false);
        this.a.h().a((Runnable) new ub(this, rxVar, reVar));
    }

    public final void a(rx rxVar, String str, String str2) {
        y.a(rxVar);
        y.a(str);
        a(str, true);
        this.a.h().a((Runnable) new uc(this, rxVar, str));
    }

    public final void a(wo woVar, re reVar) {
        y.a(woVar);
        b(reVar, false);
        if (woVar.a() == null) {
            this.a.h().a((Runnable) new ue(this, woVar, reVar));
        } else {
            this.a.h().a((Runnable) new uf(this, woVar, reVar));
        }
    }

    public final byte[] a(rx rxVar, String str) {
        y.a(str);
        y.a(rxVar);
        a(str, true);
        this.a.f().D().a("Log and bundle. event", this.a.p().a(rxVar.a));
        long c2 = this.a.u().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.h().b(new ud(this, rxVar, str)).get();
            if (bArr == null) {
                this.a.f().y().a("Log and bundle returned null. appId", sj.a(str));
                bArr = new byte[0];
            }
            this.a.f().D().a("Log and bundle processed. event, size, time_ms", this.a.p().a(rxVar.a), Integer.valueOf(bArr.length), Long.valueOf((this.a.u().c() / 1000000) - c2));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.f().y().a("Failed to log and bundle. appId, event, error", sj.a(str), this.a.p().a(rxVar.a), e);
            return null;
        }
    }

    public final void b(re reVar) {
        b(reVar, false);
        this.a.h().a((Runnable) new tq(this, reVar));
    }

    public final String c(re reVar) {
        b(reVar, false);
        return this.a.a(reVar.a);
    }

    public final void d(re reVar) {
        a(reVar.a, false);
        this.a.h().a((Runnable) new ua(this, reVar));
    }
}
