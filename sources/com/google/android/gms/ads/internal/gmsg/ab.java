package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.js.a;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import java.util.Map;
import org.json.JSONObject;

final class ab implements Runnable {
    final /* synthetic */ a a;
    private /* synthetic */ Map b;
    private /* synthetic */ HttpClient c;

    ab(HttpClient httpClient, Map map, a aVar) {
        this.c = httpClient;
        this.b = map;
        this.a = aVar;
    }

    public final void run() {
        fn.b("Received Http request.");
        try {
            JSONObject send = this.c.send(new JSONObject((String) this.b.get("http_request")));
            if (send == null) {
                fn.c("Response should not be null.");
            } else {
                gw.a.post(new ac(this, send));
            }
        } catch (Exception e) {
            fn.b("Error converting request to json.", e);
        }
    }
}
