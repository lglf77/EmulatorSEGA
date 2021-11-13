package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

@bfk
public final class azn {
    public static final azm<JSONObject> a = new azp();
    private static final Charset b = Charset.forName("UTF-8");
    private static azk<InputStream> c = azo.a;

    static final /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(b));
    }
}
