package com.google.android.gms.internal;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

@bfk
public final class hz extends hj {
    private final Context a;

    private hz(Context context, os osVar) {
        super(osVar);
        this.a = context;
    }

    public static bau a(Context context) {
        bau bau = new bau(new km(new File(context.getCacheDir(), "admob_volley")), new hz(context, new ot()));
        bau.a();
        return bau;
    }

    public final auq a(aws<?> aws) {
        if (aws.g() && aws.c() == 0) {
            if (Pattern.matches((String) app.f().a(asw.ct), aws.e())) {
                app.a();
                if (jc.c(this.a)) {
                    auq a2 = new axo(this.a).a(aws);
                    if (a2 != null) {
                        String valueOf = String.valueOf(aws.e());
                        fn.a(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return a2;
                    }
                    String valueOf2 = String.valueOf(aws.e());
                    fn.a(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.a(aws);
    }
}
