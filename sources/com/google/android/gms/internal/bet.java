package com.google.android.gms.internal;

import android.support.v4.c.f;
import android.view.View;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@bfk
public final class bet implements beg<aud> {
    private final boolean a;

    public bet(boolean z) {
        this.a = z;
    }

    private static <K, V> f<K, V> a(f<K, Future<V>> fVar) {
        f<K, V> fVar2 = new f<>();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= fVar.size()) {
                return fVar2;
            }
            fVar2.put(fVar.b(i2), fVar.c(i2).get());
            i = i2 + 1;
        }
    }

    public final /* synthetic */ auk a(bea bea, JSONObject jSONObject) {
        View view;
        f fVar = new f();
        f fVar2 = new f();
        kh<atw> a2 = bea.a(jSONObject);
        kh<mw> a3 = bea.a(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                fVar2.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                fVar.put(jSONObject2.getString("name"), bea.a(jSONObject2, "image_value", this.a));
            } else {
                String valueOf = String.valueOf(string);
                fn.e(valueOf.length() != 0 ? "Unknown custom asset type: ".concat(valueOf) : new String("Unknown custom asset type: "));
            }
        }
        mw a4 = bea.a(a3);
        String string2 = jSONObject.getString("custom_template_id");
        f a5 = a(fVar);
        atw atw = (atw) a2.get();
        nq b = a4 != null ? a4.b() : null;
        if (a4 == null) {
            view = null;
        } else if (a4 == null) {
            throw null;
        } else {
            view = (View) a4;
        }
        return new aud(string2, a5, fVar2, atw, b, view);
    }
}
