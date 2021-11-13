package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class bcj {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    private bcj(bcl bcl) {
        this.a = bcl.a;
        this.b = bcl.b;
        this.c = bcl.c;
        this.d = bcl.d;
        this.e = bcl.e;
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.a).put("tel", this.b).put("calendar", this.c).put("storePicture", this.d).put("inlineVideo", this.e);
        } catch (JSONException e2) {
            fn.b("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }
}
