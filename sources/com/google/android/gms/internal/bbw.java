package com.google.android.gms.internal;

import com.google.ads.a;
import com.google.ads.b;
import com.google.android.gms.a;
import com.google.android.gms.ads.l;
import java.util.Date;
import java.util.HashSet;

@bfk
public final class bbw {
    public static int a(a.C0012a aVar) {
        switch (bbx.a[aVar.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    public static b a(apc apc) {
        b[] bVarArr = {b.a, b.b, b.c, b.d, b.e, b.f};
        for (int i = 0; i < 6; i++) {
            if (bVarArr[i].a() == apc.e && bVarArr[i].b() == apc.b) {
                return bVarArr[i];
            }
        }
        return new b(l.a(apc.e, apc.b, apc.a));
    }

    public static com.google.ads.mediation.a a(aoy aoy, boolean z) {
        a.b bVar;
        HashSet hashSet = aoy.e != null ? new HashSet(aoy.e) : null;
        Date date = new Date(aoy.b);
        switch (aoy.d) {
            case a.b.AdsAttrs_adSizes:
                bVar = a.b.MALE;
                break;
            case 2:
                bVar = a.b.FEMALE;
                break;
            default:
                bVar = a.b.UNKNOWN;
                break;
        }
        return new com.google.ads.mediation.a(date, bVar, hashSet, z, aoy.k);
    }
}
