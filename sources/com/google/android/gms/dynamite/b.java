package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class b implements DynamiteModule.d {
    b() {
    }

    public final j a(Context context, String str, i iVar) {
        j jVar = new j();
        jVar.b = iVar.a(context, str, true);
        if (jVar.b != 0) {
            jVar.c = 1;
        } else {
            jVar.a = iVar.a(context, str);
            if (jVar.a != 0) {
                jVar.c = -1;
            }
        }
        return jVar;
    }
}
