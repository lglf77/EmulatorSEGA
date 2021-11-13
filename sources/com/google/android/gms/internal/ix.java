package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class ix implements Callable<String> {
    private /* synthetic */ Context a;
    private /* synthetic */ Context b;

    ix(iw iwVar, Context context, Context context2) {
        this.a = context;
        this.b = context2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.a != null) {
            fn.a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.a.getSharedPreferences("admob_user_agent", 0);
        } else {
            fn.a("Attempting to read user agent from local cache.");
            sharedPreferences = this.b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            fn.a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                fn.a("Persisting user agent.");
            }
        }
        return string;
    }
}
