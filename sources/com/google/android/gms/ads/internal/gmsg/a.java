package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import java.util.Map;

@bfk
public final class a implements aa<Object> {
    private final i a;

    public a(i iVar) {
        this.a = iVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            fn.e("App event with no name parameter.");
        } else {
            this.a.a(str, map.get("info"));
        }
    }
}
