package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.arn;
import com.google.android.gms.internal.arq;

public class h {

    public static final class a {
        private final arq a;

        /* access modifiers changed from: package-private */
        public final arq a() {
            return this.a;
        }
    }

    public static void a(Context context, String str) {
        a(context, str, (a) null);
    }

    @Deprecated
    public static void a(Context context, String str, a aVar) {
        arn.a().a(context, str, aVar == null ? null : aVar.a());
    }
}
