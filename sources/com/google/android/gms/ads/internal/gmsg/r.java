package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.mw;
import java.util.HashMap;
import java.util.Map;

final class r implements aa<mw> {
    r() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        mw mwVar = (mw) obj;
        au.e();
        DisplayMetrics a = gw.a((WindowManager) mwVar.getContext().getSystemService("window"));
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) mwVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        mwVar.a("locationReady", (Map<String, ?>) hashMap);
        fn.e("GET LOCATION COMPILED");
    }
}
