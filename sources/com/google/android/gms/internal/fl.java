package com.google.android.gms.internal;

import android.content.Context;

@bfk
public final class fl {
    public static void a(Context context) {
        if (jg.a(context) && !jg.b()) {
            fn.d("Updating ad debug logging enablement.");
            jv.a((kh) new fm(context).d(), "AdDebugLogUpdater.updateEnablement");
        }
    }
}
