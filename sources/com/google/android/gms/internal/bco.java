package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@bfk
public class bco {
    private final mw a;
    private final String b;

    public bco(mw mwVar) {
        this(mwVar, "");
    }

    public bco(mw mwVar, String str) {
        this.a = mwVar;
        this.b = str;
    }

    public final void a(int i, int i2, int i3, int i4) {
        try {
            this.a.a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            fn.b("Error occured while dispatching size change.", e);
        }
    }

    public final void a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.a.a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            fn.b("Error occured while obtaining screen information.", e);
        }
    }

    public final void a(String str) {
        try {
            this.a.a("onError", new JSONObject().put("message", str).put("action", this.b));
        } catch (JSONException e) {
            fn.b("Error occurred while dispatching error event.", e);
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        try {
            this.a.a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            fn.b("Error occured while dispatching default position.", e);
        }
    }

    public final void b(String str) {
        try {
            this.a.a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            fn.b("Error occured while dispatching ready Event.", e);
        }
    }

    public final void c(String str) {
        try {
            this.a.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            fn.b("Error occured while dispatching state change.", e);
        }
    }
}
