package com.google.android.gms.internal;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@bfk
public final class ass {
    private final Collection<asl<?>> a = new ArrayList();
    private final Collection<asl<String>> b = new ArrayList();
    private final Collection<asl<String>> c = new ArrayList();

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (asl<String> a2 : this.b) {
            String str = (String) app.f().a(a2);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void a(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (asl next : this.a) {
            if (next.c() == 1) {
                next.a(editor, next.a(jSONObject));
            }
        }
    }

    public final void a(asl asl) {
        this.a.add(asl);
    }

    public final List<String> b() {
        List<String> a2 = a();
        for (asl<String> a3 : this.c) {
            String str = (String) app.f().a(a3);
            if (str != null) {
                a2.add(str);
            }
        }
        return a2;
    }

    public final void b(asl<String> asl) {
        this.b.add(asl);
    }

    public final void c(asl<String> asl) {
        this.c.add(asl);
    }
}
