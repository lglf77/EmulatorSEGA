package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.f;
import com.google.android.gms.ads.internal.js.b;
import org.json.JSONException;
import org.json.JSONObject;

final class azx implements f {
    private final b a;
    private final ks b;
    private /* synthetic */ azu c;

    public azx(azu azu, b bVar, ks ksVar) {
        this.c = azu;
        this.a = bVar;
        this.b = ksVar;
    }

    public final void a(String str) {
        if (str == null) {
            try {
                this.b.a(new azh());
            } catch (IllegalStateException e) {
                this.a.a();
                return;
            } catch (Throwable th) {
                this.a.a();
                throw th;
            }
        } else {
            this.b.a(new azh(str));
        }
        this.a.a();
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.b.b(this.c.a.a(jSONObject));
        } catch (IllegalStateException e) {
        } catch (JSONException e2) {
            this.b.b(e2);
        } finally {
            this.a.a();
        }
    }
}
