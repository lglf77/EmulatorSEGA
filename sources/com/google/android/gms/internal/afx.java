package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class afx implements ays {
    private final Map<String, List<aws<?>>> a = new HashMap();
    private final xw b;

    afx(xw xwVar) {
        this.b = xwVar;
    }

    /* access modifiers changed from: private */
    public final synchronized boolean b(aws<?> aws) {
        boolean z = false;
        synchronized (this) {
            String e = aws.e();
            if (this.a.containsKey(e)) {
                List list = this.a.get(e);
                if (list == null) {
                    list = new ArrayList();
                }
                aws.b("waiting-for-response");
                list.add(aws);
                this.a.put(e, list);
                if (df.a) {
                    df.b("Request for cacheKey=%s is in flight, putting on hold.", e);
                }
                z = true;
            } else {
                this.a.put(e, (Object) null);
                aws.a((ays) this);
                if (df.a) {
                    df.b("new request, sending to network %s", e);
                }
            }
        }
        return z;
    }

    public final synchronized void a(aws<?> aws) {
        String e = aws.e();
        List remove = this.a.remove(e);
        if (remove != null && !remove.isEmpty()) {
            if (df.a) {
                df.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), e);
            }
            aws aws2 = (aws) remove.remove(0);
            this.a.put(e, remove);
            aws2.a((ays) this);
            try {
                this.b.c.put(aws2);
            } catch (InterruptedException e2) {
                df.c("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.b.a();
            }
        }
        return;
    }

    public final void a(aws<?> aws, bbt<?> bbt) {
        List<aws> remove;
        if (bbt.b == null || bbt.b.a()) {
            a(aws);
            return;
        }
        String e = aws.e();
        synchronized (this) {
            remove = this.a.remove(e);
        }
        if (remove != null) {
            if (df.a) {
                df.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), e);
            }
            for (aws a2 : remove) {
                this.b.e.a((aws<?>) a2, bbt);
            }
        }
    }
}
