package com.google.android.gms.internal;

import android.util.JsonWriter;
import java.util.Map;

final /* synthetic */ class ji implements jm {
    private final int a;
    private final Map b;

    ji(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    public final void a(JsonWriter jsonWriter) {
        jg.a(this.a, this.b, jsonWriter);
    }
}
