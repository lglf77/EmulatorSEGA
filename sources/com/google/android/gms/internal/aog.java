package com.google.android.gms.internal;

import com.google.android.gms.internal.aoi;
import java.util.ArrayList;
import java.util.List;

@bfk
public final class aog {
    private final aol a;
    private final aor b;
    private final boolean c;

    private aog() {
        this.c = false;
        this.a = new aol();
        this.b = new aor();
        b();
    }

    public aog(aol aol, boolean z) {
        this.a = aol;
        this.c = z;
        this.b = new aor();
        b();
    }

    public static aog a() {
        return new aog();
    }

    private final synchronized void b() {
        this.b.d = new aop();
        this.b.c = new aoq();
    }

    private static long[] c() {
        int i = 0;
        List<String> b2 = asw.b();
        ArrayList arrayList = new ArrayList();
        for (String split : b2) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException e) {
                    fn.a("Experiment ID is not a number");
                }
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }

    public final synchronized void a(aoh aoh) {
        if (this.c) {
            aoh.a(this.b);
        }
    }

    public final synchronized void a(aoi.a.b bVar) {
        if (this.c) {
            this.b.b = c();
            this.a.a(akf.a((akf) this.b)).b(bVar.a()).a();
            String valueOf = String.valueOf(Integer.toString(bVar.a(), 10));
            fn.a(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
        }
    }
}
