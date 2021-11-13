package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ab;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.ei;
import com.google.android.gms.internal.gw;
import java.util.Map;

@bfk
public final class br {
    private final Context a;
    private boolean b;
    private ei c;
    private ab d;

    public br(Context context, ei eiVar, ab abVar) {
        this.a = context;
        this.c = eiVar;
        this.d = abVar;
        if (this.d == null) {
            this.d = new ab();
        }
    }

    private final boolean c() {
        return (this.c != null && this.c.a().f) || this.d.a;
    }

    public final void a() {
        this.b = true;
    }

    public final void a(String str) {
        if (c()) {
            if (str == null) {
                str = "";
            }
            if (this.c != null) {
                this.c.a(str, (Map<String, String>) null, 3);
            } else if (this.d.a && this.d.b != null) {
                for (String next : this.d.b) {
                    if (!TextUtils.isEmpty(next)) {
                        String replace = next.replace("{NAVIGATION_URL}", Uri.encode(str));
                        au.e();
                        gw.b(this.a, "", replace);
                    }
                }
            }
        }
    }

    public final boolean b() {
        return !c() || this.b;
    }
}
