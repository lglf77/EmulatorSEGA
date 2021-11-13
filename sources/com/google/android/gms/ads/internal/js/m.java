package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@bfk
public final class m implements l {
    private final k a;
    private final HashSet<AbstractMap.SimpleEntry<String, aa<? super k>>> b = new HashSet<>();

    public m(k kVar) {
        this.a = kVar;
    }

    public final void a() {
        Iterator<AbstractMap.SimpleEntry<String, aa<? super k>>> it = this.b.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((aa) next.getValue()).toString());
            fn.a(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.a.b((String) next.getKey(), (aa) next.getValue());
        }
        this.b.clear();
    }

    public final void a(String str, aa<? super k> aaVar) {
        this.a.a(str, aaVar);
        this.b.add(new AbstractMap.SimpleEntry(str, aaVar));
    }

    public final void a(String str, Map<String, ?> map) {
        this.a.a(str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        this.a.a(str, jSONObject);
    }

    public final void b(String str, aa<? super k> aaVar) {
        this.a.b(str, aaVar);
        this.b.remove(new AbstractMap.SimpleEntry(str, aaVar));
    }

    public final void b(String str, JSONObject jSONObject) {
        this.a.b(str, jSONObject);
    }
}
