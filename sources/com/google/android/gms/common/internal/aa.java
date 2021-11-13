package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.a;

public final class aa {
    private final Resources a;
    private final String b = this.a.getResourcePackageName(a.C0013a.common_google_play_services_unknown_issue);

    public aa(Context context) {
        y.a(context);
        this.a = context.getResources();
    }

    public final String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
