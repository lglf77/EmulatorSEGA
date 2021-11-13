package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.jp;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@bfk
@KeepName
public class HttpClient implements aa<com.google.android.gms.ads.internal.js.a> {
    private final Context mContext;
    private final jp zzapr;

    @bfk
    static class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }
    }

    @bfk
    static class b {
        private final String a;
        private final URL b;
        private final ArrayList<a> c;
        private final String d;

        b(String str, URL url, ArrayList<a> arrayList, String str2) {
            this.a = str;
            this.b = url;
            this.c = arrayList;
            this.d = str2;
        }

        public final String a() {
            return this.a;
        }

        public final URL b() {
            return this.b;
        }

        public final ArrayList<a> c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }
    }

    @bfk
    class c {
        private final d a;
        private final boolean b;
        private final String c;

        public c(HttpClient httpClient, boolean z, d dVar, String str) {
            this.b = z;
            this.a = dVar;
            this.c = str;
        }

        public final String a() {
            return this.c;
        }

        public final d b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }
    }

    @bfk
    static class d {
        private final String a;
        private final int b;
        private final List<a> c;
        private final String d;

        d(String str, int i, List<a> list, String str2) {
            this.a = str;
            this.b = i;
            this.c = list;
            this.d = str2;
        }

        public final String a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final Iterable<a> c() {
            return this.c;
        }

        public final String d() {
            return this.d;
        }
    }

    public HttpClient(Context context, jp jpVar) {
        this.mContext = context;
        this.zzapr = jpVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.ads.internal.gmsg.HttpClient.c zza(com.google.android.gms.ads.internal.gmsg.HttpClient.b r10) {
        /*
            r9 = this;
            r2 = 0
            r3 = 0
            java.net.URL r0 = r10.b()     // Catch:{ Exception -> 0x010f, all -> 0x010a }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x010f, all -> 0x010a }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x010f, all -> 0x010a }
            com.google.android.gms.internal.gw r1 = com.google.android.gms.ads.internal.au.e()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            android.content.Context r4 = r9.mContext     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            com.google.android.gms.internal.jp r5 = r9.zzapr     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.String r5 = r5.a     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r6 = 0
            r1.a((android.content.Context) r4, (java.lang.String) r5, (boolean) r6, (java.net.HttpURLConnection) r0)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.util.ArrayList r1 = r10.c()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            int r5 = r1.size()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r4 = r2
        L_0x0025:
            if (r4 >= r5) goto L_0x004e
            java.lang.Object r2 = r1.get(r4)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            int r4 = r4 + 1
            com.google.android.gms.ads.internal.gmsg.HttpClient$a r2 = (com.google.android.gms.ads.internal.gmsg.HttpClient.a) r2     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.String r6 = r2.a()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r0.addRequestProperty(r6, r2)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            goto L_0x0025
        L_0x003b:
            r1 = move-exception
            r2 = r0
        L_0x003d:
            com.google.android.gms.ads.internal.gmsg.HttpClient$c r0 = new com.google.android.gms.ads.internal.gmsg.HttpClient$c     // Catch:{ all -> 0x010c }
            r3 = 0
            r4 = 0
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x010c }
            r0.<init>(r9, r3, r4, r1)     // Catch:{ all -> 0x010c }
            if (r2 == 0) goto L_0x004d
            r2.disconnect()
        L_0x004d:
            return r0
        L_0x004e:
            java.lang.String r1 = r10.d()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            if (r1 != 0) goto L_0x0077
            r1 = 1
            r0.setDoOutput(r1)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.String r1 = r10.d()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            byte[] r3 = r1.getBytes()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            int r1 = r3.length     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r0.setFixedLengthStreamingMode(r1)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.io.OutputStream r2 = r0.getOutputStream()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r1.write(r3)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r1.close()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
        L_0x0077:
            com.google.android.gms.internal.jg r4 = new com.google.android.gms.internal.jg     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r4.<init>()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r4.a((java.net.HttpURLConnection) r0, (byte[]) r3)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r5.<init>()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.util.Map r1 = r0.getHeaderFields()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            if (r1 == 0) goto L_0x00d0
            java.util.Map r1 = r0.getHeaderFields()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
        L_0x0096:
            boolean r1 = r6.hasNext()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            if (r1 == 0) goto L_0x00d0
            java.lang.Object r1 = r6.next()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
        L_0x00ac:
            boolean r2 = r7.hasNext()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r7.next()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            com.google.android.gms.ads.internal.gmsg.HttpClient$a r8 = new com.google.android.gms.ads.internal.gmsg.HttpClient$a     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r8.<init>(r3, r2)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r5.add(r8)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            goto L_0x00ac
        L_0x00c7:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L_0x00ca:
            if (r3 == 0) goto L_0x00cf
            r3.disconnect()
        L_0x00cf:
            throw r0
        L_0x00d0:
            com.google.android.gms.ads.internal.gmsg.HttpClient$d r2 = new com.google.android.gms.ads.internal.gmsg.HttpClient$d     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.String r1 = r10.a()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            int r3 = r0.getResponseCode()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            com.google.android.gms.ads.internal.au.e()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.io.InputStream r7 = r0.getInputStream()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.String r6 = com.google.android.gms.internal.gw.a((java.io.InputStreamReader) r6)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r2.<init>(r1, r3, r5, r6)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            int r1 = r2.b()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r4.a((java.net.HttpURLConnection) r0, (int) r1)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            java.lang.String r1 = r2.d()     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r4.a((java.lang.String) r1)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            com.google.android.gms.ads.internal.gmsg.HttpClient$c r1 = new com.google.android.gms.ads.internal.gmsg.HttpClient$c     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            r3 = 1
            r4 = 0
            r1.<init>(r9, r3, r2, r4)     // Catch:{ Exception -> 0x003b, all -> 0x00c7 }
            if (r0 == 0) goto L_0x0107
            r0.disconnect()
        L_0x0107:
            r0 = r1
            goto L_0x004d
        L_0x010a:
            r0 = move-exception
            goto L_0x00ca
        L_0x010c:
            r0 = move-exception
            r3 = r2
            goto L_0x00ca
        L_0x010f:
            r0 = move-exception
            r1 = r0
            r2 = r3
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.HttpClient.zza(com.google.android.gms.ads.internal.gmsg.HttpClient$b):com.google.android.gms.ads.internal.gmsg.HttpClient$c");
    }

    private static JSONObject zza(d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", dVar.a());
            if (dVar.d() != null) {
                jSONObject.put("body", dVar.d());
            }
            JSONArray jSONArray = new JSONArray();
            for (a next : dVar.c()) {
                jSONArray.put(new JSONObject().put("key", next.a()).put("value", next.b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", dVar.b());
        } catch (JSONException e) {
            fn.b("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    private static b zzd(JSONObject jSONObject) {
        URL url;
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        String optString3 = jSONObject.optString("post_body", (String) null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            fn.b("Error constructing http request.", e);
            url = null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new b(optString, url, arrayList, optString3);
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            String optString = jSONObject.optString("http_request_id");
            c zza = zza(zzd(jSONObject));
            if (zza.c()) {
                jSONObject2.put("response", zza(zza.b()));
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", zza.a());
            }
        } catch (Exception e) {
            fn.b("Error executing http request.", e);
            try {
                jSONObject2.put("response", new JSONObject().put("http_request_id", ""));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", e.toString());
            } catch (JSONException e2) {
                fn.b("Error executing http request.", e2);
            }
        }
        return jSONObject2;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        gq.a((Runnable) new ab(this, map, (com.google.android.gms.ads.internal.js.a) obj));
    }
}
