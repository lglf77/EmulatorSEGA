package com.google.android.gms.ads.b;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.internal.avl;
import com.google.android.gms.internal.jn;

public class e extends FrameLayout {
    private final FrameLayout a;
    private final avl b;

    /* access modifiers changed from: protected */
    public final View a(String str) {
        try {
            a a2 = this.b.a(str);
            if (a2 != null) {
                return (View) c.a(a2);
            }
        } catch (RemoteException e) {
            jn.b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a(String str, View view) {
        try {
            this.b.a(str, c.a(view));
        } catch (RemoteException e) {
            jn.b("Unable to call setAssetView on delegate", e);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.a != view) {
            super.bringChildToFront(this.a);
        }
    }

    public a getAdChoicesView() {
        View a2 = a("1098");
        if (a2 instanceof a) {
            return (a) a2;
        }
        return null;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.b != null) {
            try {
                this.b.a(c.a(view), i);
            } catch (RemoteException e) {
                jn.b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.a);
    }

    public void removeView(View view) {
        if (this.a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(a aVar) {
        a("1098", aVar);
    }

    public void setNativeAd(c cVar) {
        try {
            this.b.a((a) cVar.a());
        } catch (RemoteException e) {
            jn.b("Unable to call setNativeAd on delegate", e);
        }
    }
}
