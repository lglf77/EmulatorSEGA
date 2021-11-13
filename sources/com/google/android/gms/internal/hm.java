package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
public class hm extends hk {
    public final boolean a(View view) {
        return view.isAttachedToWindow();
    }

    public final ViewGroup.LayoutParams d() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
