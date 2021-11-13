package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.internal.aot;
import com.google.android.gms.internal.ark;
import com.google.android.gms.internal.jn;

class e extends ViewGroup {
    protected final ark a;

    public e(Context context, int i) {
        super(context);
        this.a = new ark(this, i);
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.a = new ark(this, attributeSet, false, i);
    }

    public e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.a = new ark(this, attributeSet, false, i2);
    }

    public void a() {
        this.a.i();
    }

    public void a(c cVar) {
        this.a.a(cVar.a());
    }

    public void b() {
        this.a.h();
    }

    public void c() {
        this.a.a();
    }

    public a getAdListener() {
        return this.a.b();
    }

    public d getAdSize() {
        return this.a.c();
    }

    public String getAdUnitId() {
        return this.a.e();
    }

    public String getMediationAdapterClassName() {
        return this.a.j();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMeasure(int i, int i2) {
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

    public void setAdListener(a aVar) {
        this.a.a(aVar);
        if (aVar == null) {
            this.a.a((aot) null);
            this.a.a((a) null);
            return;
        }
        if (aVar instanceof aot) {
            this.a.a((aot) aVar);
        }
        if (aVar instanceof a) {
            this.a.a((a) aVar);
        }
    }

    public void setAdSize(d dVar) {
        this.a.a(dVar);
    }

    public void setAdUnitId(String str) {
        this.a.a(str);
    }
}
