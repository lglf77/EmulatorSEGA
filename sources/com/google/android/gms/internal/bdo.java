package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.ac;
import com.google.android.gms.common.util.j;

@bfk
public final class bdo {
    public static hp a(Context context, a aVar, ew ewVar, xr xrVar, mw mwVar, bar bar, bdp bdp, atj atj) {
        hp bdr;
        z zVar = ewVar.b;
        if (zVar.g) {
            bdr = new bdu(context, ewVar, bar, bdp, atj, mwVar);
        } else if (zVar.s || (aVar instanceof ac)) {
            bdr = (!zVar.s || !(aVar instanceof ac)) ? new bdr(ewVar, bdp) : new bdw(context, (ac) aVar, ewVar, xrVar, bdp, atj);
        } else {
            bdr = (!((Boolean) app.f().a(asw.ab)).booleanValue() || !j.e() || j.g() || mwVar == null || !mwVar.u().d()) ? new bdq(context, ewVar, mwVar, bdp) : new bdt(context, ewVar, mwVar, bdp);
        }
        String valueOf = String.valueOf(bdr.getClass().getName());
        fn.b(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
        bdr.d();
        return bdr;
    }
}
