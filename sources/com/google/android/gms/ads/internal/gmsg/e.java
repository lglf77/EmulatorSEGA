package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.bfk;
import java.util.HashMap;
import java.util.Map;

@bfk
public final class e implements aa<Object> {
    private final Object a = new Object();
    private final Map<String, f> b = new HashMap();

    public final void a(String str, f fVar) {
        synchronized (this.a) {
            this.b.put(str, fVar);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.Object r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "id"
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "fail"
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "fail_reason"
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "result"
            java.lang.Object r3 = r8.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r6.a
            monitor-enter(r5)
            java.util.Map<java.lang.String, com.google.android.gms.ads.internal.gmsg.f> r4 = r6.b     // Catch:{ all -> 0x0048 }
            java.lang.Object r4 = r4.remove(r0)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.ads.internal.gmsg.f r4 = (com.google.android.gms.ads.internal.gmsg.f) r4     // Catch:{ all -> 0x0048 }
            if (r4 != 0) goto L_0x004b
            java.lang.String r1 = "Received result for unexpected method invocation: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0048 }
            int r2 = r0.length()     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0042
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x0048 }
        L_0x003d:
            com.google.android.gms.internal.fn.e(r0)     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
        L_0x0041:
            return
        L_0x0042:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0048 }
            r0.<init>(r1)     // Catch:{ all -> 0x0048 }
            goto L_0x003d
        L_0x0048:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            throw r0
        L_0x004b:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0056
            r4.a((java.lang.String) r2)     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0041
        L_0x0056:
            if (r3 != 0) goto L_0x005e
            r0 = 0
            r4.a((org.json.JSONObject) r0)     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0041
        L_0x005e:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008c }
            r1.<init>(r3)     // Catch:{ JSONException -> 0x008c }
            boolean r0 = com.google.android.gms.internal.fn.a()     // Catch:{ JSONException -> 0x008c }
            if (r0 == 0) goto L_0x0081
            java.lang.String r2 = "Result GMSG: "
            r0 = 2
            java.lang.String r0 = r1.toString(r0)     // Catch:{ JSONException -> 0x008c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x008c }
            int r3 = r0.length()     // Catch:{ JSONException -> 0x008c }
            if (r3 == 0) goto L_0x0086
            java.lang.String r0 = r2.concat(r0)     // Catch:{ JSONException -> 0x008c }
        L_0x007e:
            com.google.android.gms.internal.fn.a(r0)     // Catch:{ JSONException -> 0x008c }
        L_0x0081:
            r4.a((org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x008c }
        L_0x0084:
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0041
        L_0x0086:
            java.lang.String r0 = new java.lang.String     // Catch:{ JSONException -> 0x008c }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x008c }
            goto L_0x007e
        L_0x008c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0048 }
            r4.a((java.lang.String) r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.e.zza(java.lang.Object, java.util.Map):void");
    }
}
