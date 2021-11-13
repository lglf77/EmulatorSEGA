package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.mw;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class v implements aa<mw> {
    private /* synthetic */ CountDownLatch a;

    v(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        fn.e("Adapter returned an ad, but assets substitution failed");
        this.a.countDown();
        ((mw) obj).destroy();
    }
}
