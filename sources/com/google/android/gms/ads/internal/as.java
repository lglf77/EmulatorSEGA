package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.xr;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class as extends AsyncTask<Void, Void, String> {
    private /* synthetic */ ao a;

    private as(ao aoVar) {
        this.a = aoVar;
    }

    /* synthetic */ as(ao aoVar, ap apVar) {
        this(aoVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            xr unused = this.a.h = (xr) this.a.c.get(((Long) app.f().a(asw.cj)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            fn.c("Failed to load ad data", e);
        } catch (TimeoutException e2) {
            fn.e("Timed out waiting for ad data");
        }
        return this.a.c();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.a.f != null && str != null) {
            this.a.f.loadUrl(str);
        }
    }
}
