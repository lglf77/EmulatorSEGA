package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.y;

public final class AdView extends e {
    public AdView(Context context) {
        super(context, 0);
        y.a(context, (Object) "Context cannot be null");
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void a(c cVar) {
        super.a(cVar);
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ a getAdListener() {
        return super.getAdListener();
    }

    public final /* bridge */ /* synthetic */ d getAdSize() {
        return super.getAdSize();
    }

    public final /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    public final /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public final i getVideoController() {
        if (this.a != null) {
            return this.a.k();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void setAdListener(a aVar) {
        super.setAdListener(aVar);
    }

    public final /* bridge */ /* synthetic */ void setAdSize(d dVar) {
        super.setAdSize(dVar);
    }

    public final /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }
}
