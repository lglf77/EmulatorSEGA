package com.google.android.gms.ads.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.internal.ark;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.jn;

@bfk
public final class b extends ViewGroup {
    private final ark a;

    public final a getAdListener() {
        return this.a.b();
    }

    public final d getAdSize() {
        return this.a.c();
    }

    public final String getAdUnitId() {
        return this.a.e();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        d dVar;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                dVar = getAdSize();
            } catch (NullPointerException e) {
                jn.b("Unable to retrieve ad size.", e);
                dVar = null;
            }
            if (dVar != null) {
                Context context = getContext();
                i3 = dVar.b(context);
                i4 = dVar.a(context);
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i3 = childAt.getMeasuredWidth();
            i4 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i3, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i4, getSuggestedMinimumHeight()), i2));
    }

    public final void setAdListener(a aVar) {
        this.a.a(aVar);
    }

    public final void setAdSize(d dVar) {
        this.a.a(dVar);
    }

    public final void setAdUnitId(String str) {
        this.a.a(str);
    }
}
