package com.google.android.gms.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.y;
import java.util.Iterator;

public final class rr {
    final String a;
    final String b;
    final long c;
    final long d;
    final rt e;
    private String f;

    rr(tk tkVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        y.a(str2);
        y.a(str3);
        this.a = str2;
        this.b = str3;
        this.f = TextUtils.isEmpty(str) ? null : str;
        this.c = j;
        this.d = j2;
        if (this.d != 0 && this.d > this.c) {
            tkVar.f().A().a("Event created with reverse previous/current timestamps. appId", sj.a(str2));
        }
        this.e = a(tkVar, bundle);
    }

    private rr(tk tkVar, String str, String str2, String str3, long j, long j2, rt rtVar) {
        y.a(str2);
        y.a(str3);
        y.a(rtVar);
        this.a = str2;
        this.b = str3;
        this.f = TextUtils.isEmpty(str) ? null : str;
        this.c = j;
        this.d = j2;
        if (this.d != 0 && this.d > this.c) {
            tkVar.f().A().a("Event created with reverse previous/current timestamps. appId", sj.a(str2));
        }
        this.e = rtVar;
    }

    private static rt a(tk tkVar, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new rt(new Bundle());
        }
        Bundle bundle2 = new Bundle(bundle);
        Iterator it = bundle2.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                tkVar.f().y().a("Param name can't be null");
                it.remove();
            } else {
                Object a2 = tkVar.o().a(str, bundle2.get(str));
                if (a2 == null) {
                    tkVar.f().A().a("Param value can't be null", tkVar.p().b(str));
                    it.remove();
                } else {
                    tkVar.o().a(bundle2, str, a2);
                }
            }
        }
        return new rt(bundle2);
    }

    /* access modifiers changed from: package-private */
    public final rr a(tk tkVar, long j) {
        return new rr(tkVar, this.f, this.a, this.b, this.c, j, this.e);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.e);
        return new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("Event{appId='").append(str).append("', name='").append(str2).append("', params=").append(valueOf).append("}").toString();
    }
}
