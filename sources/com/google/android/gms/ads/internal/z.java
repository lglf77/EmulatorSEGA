package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.bab;
import com.google.android.gms.internal.bac;
import com.google.android.gms.internal.bav;
import com.google.android.gms.internal.cj;
import com.google.android.gms.internal.dr;
import com.google.android.gms.internal.ds;
import com.google.android.gms.internal.fn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class z implements Runnable {
    private /* synthetic */ y a;

    z(y yVar) {
        this.a = yVar;
    }

    public final void run() {
        Context a2 = this.a.b.a;
        Runnable runnable = this.a.a;
        y.b("Adapters must be initialized on the main thread.");
        Map<String, bac> e = au.i().r().e();
        if (e != null && !e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    fn.c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            cj E = cj.E();
            if (E != null) {
                Collection<bac> values = e.values();
                HashMap hashMap = new HashMap();
                a a3 = c.a(a2);
                for (bac bac : values) {
                    for (bab next : bac.a) {
                        String str = next.j;
                        for (String next2 : next.c) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        dr b = E.b(str2);
                        if (b != null) {
                            bav a4 = b.a();
                            if (!a4.g() && a4.m()) {
                                a4.a(a3, (ds) b.b(), (List<String>) (List) entry.getValue());
                                String valueOf = String.valueOf(str2);
                                fn.b(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                            }
                        }
                    } catch (Throwable th2) {
                        fn.c(new StringBuilder(String.valueOf(str2).length() + 56).append("Failed to initialize rewarded video mediation adapter \"").append(str2).append("\"").toString(), th2);
                    }
                }
            }
        }
    }
}
