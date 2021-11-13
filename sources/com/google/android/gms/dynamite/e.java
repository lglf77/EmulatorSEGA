package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class e implements DynamiteModule.d {
    e() {
    }

    public final j a(Context context, String str, i iVar) {
        j jVar = new j();
        jVar.a = iVar.a(context, str);
        if (jVar.a != 0) {
            jVar.b = iVar.a(context, str, false);
        } else {
            jVar.b = iVar.a(context, str, true);
        }
        if (jVar.a == 0 && jVar.b == 0) {
            jVar.c = 0;
        } else if (jVar.a >= jVar.b) {
            jVar.c = -1;
        } else {
            jVar.c = 1;
        }
        return jVar;
    }
}
