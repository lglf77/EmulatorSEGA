package com.google.android.gms.ads.b;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.internal.avq;
import com.google.android.gms.internal.jn;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class f {
    public static WeakHashMap<View, f> a = new WeakHashMap<>();
    private avq b;
    private WeakReference<View> c;

    public final void a(c cVar) {
        View view = this.c != null ? (View) this.c.get() : null;
        if (view == null) {
            jn.e("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!a.containsKey(view)) {
            a.put(view, this);
        }
        if (this.b != null) {
            try {
                this.b.a((a) cVar.a());
            } catch (RemoteException e) {
                jn.b("Unable to call setNativeAd on delegate", e);
            }
        }
    }
}
