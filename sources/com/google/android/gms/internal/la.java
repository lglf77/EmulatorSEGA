package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;

@bfk
public final class la {
    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new lb(view, onGlobalLayoutListener).a();
    }

    public static void a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new lc(view, onScrollChangedListener).a();
    }
}
