package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.internal.mw;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class u implements aa<mw> {
    private /* synthetic */ CountDownLatch a;

    u(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        mw mwVar = (mw) obj;
        this.a.countDown();
        if (mwVar == null) {
            throw null;
        }
        ((View) mwVar).setVisibility(0);
    }
}
