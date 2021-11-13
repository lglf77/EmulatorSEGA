package com.google.android.gms.internal;

import android.webkit.ValueCallback;

final class ana implements ValueCallback<String> {
    private /* synthetic */ amz a;

    ana(amz amz) {
        this.a = amz;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        this.a.d.a(this.a.a, this.a.b, (String) obj, this.a.c);
    }
}
