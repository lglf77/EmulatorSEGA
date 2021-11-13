package com.google.android.gms.internal;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;

final class ea implements Runnable {
    private /* synthetic */ kh a;
    private /* synthetic */ dy b;

    ea(dy dyVar, kh khVar) {
        this.b = dyVar;
        this.a = khVar;
    }

    public final void run() {
        Throwable th;
        try {
            this.b.a((Map<String, String>) (Map) this.a.get());
            if (this.b.a) {
                synchronized (this.b.g) {
                    this.b.b.a = 9;
                }
            }
            this.b.e();
            return;
        } catch (InterruptedException e) {
            th = e;
        } catch (ExecutionException e2) {
            th = e2;
        } catch (JSONException e3) {
            th = e3;
        }
        if (((Boolean) app.f().a(asw.cl)).booleanValue()) {
            fn.a("Failed to get SafeBrowsing metadata", th);
        }
    }
}
