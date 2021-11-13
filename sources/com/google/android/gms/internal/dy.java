package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.j;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@bfk
public final class dy implements ei {
    boolean a;
    /* access modifiers changed from: private */
    public final akj b;
    private final LinkedHashMap<String, akr> c;
    private final Context d;
    private final ek e;
    private final ee f;
    /* access modifiers changed from: private */
    public final Object g = new Object();
    private HashSet<String> h = new HashSet<>();
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;

    public dy(Context context, jp jpVar, ee eeVar, String str, ek ekVar) {
        y.a(eeVar, (Object) "SafeBrowsing config is not present.");
        this.d = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = new LinkedHashMap<>();
        this.e = ekVar;
        this.f = eeVar;
        for (String lowerCase : this.f.e) {
            this.h.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.h.remove("cookie".toLowerCase(Locale.ENGLISH));
        akj akj = new akj();
        akj.a = 8;
        akj.b = str;
        akj.c = str;
        akj.d = new akk();
        akj.d.a = this.f.a;
        aks aks = new aks();
        aks.a = jpVar.a;
        aks.c = Boolean.valueOf(pw.a(this.d).a());
        i.a();
        long b2 = (long) i.b(this.d);
        if (b2 > 0) {
            aks.b = Long.valueOf(b2);
        }
        akj.h = aks;
        this.b = akj;
    }

    private final akr b(String str) {
        akr akr;
        synchronized (this.g) {
            akr = this.c.get(str);
        }
        return akr;
    }

    public final ee a() {
        return this.f;
    }

    public final void a(View view) {
        if (this.f.c && !this.j) {
            au.e();
            Bitmap b2 = gw.b(view);
            if (b2 == null) {
                eh.a("Failed to capture the webview bitmap.");
                return;
            }
            this.j = true;
            gw.b((Runnable) new dz(this, b2));
        }
    }

    public final void a(String str) {
        synchronized (this.g) {
            this.b.f = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, int r11) {
        /*
            r8 = this;
            r1 = 3
            java.lang.Object r2 = r8.g
            monitor-enter(r2)
            if (r11 != r1) goto L_0x0009
            r0 = 1
            r8.k = r0     // Catch:{ all -> 0x00ac }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.akr> r0 = r8.c     // Catch:{ all -> 0x00ac }
            boolean r0 = r0.containsKey(r9)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0023
            if (r11 != r1) goto L_0x0021
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.akr> r0 = r8.c     // Catch:{ all -> 0x00ac }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x00ac }
            com.google.android.gms.internal.akr r0 = (com.google.android.gms.internal.akr) r0     // Catch:{ all -> 0x00ac }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00ac }
            r0.d = r1     // Catch:{ all -> 0x00ac }
        L_0x0021:
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
        L_0x0022:
            return
        L_0x0023:
            com.google.android.gms.internal.akr r3 = new com.google.android.gms.internal.akr     // Catch:{ all -> 0x00ac }
            r3.<init>()     // Catch:{ all -> 0x00ac }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00ac }
            r3.d = r0     // Catch:{ all -> 0x00ac }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.akr> r0 = r8.c     // Catch:{ all -> 0x00ac }
            int r0 = r0.size()     // Catch:{ all -> 0x00ac }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00ac }
            r3.a = r0     // Catch:{ all -> 0x00ac }
            r3.b = r9     // Catch:{ all -> 0x00ac }
            com.google.android.gms.internal.akm r0 = new com.google.android.gms.internal.akm     // Catch:{ all -> 0x00ac }
            r0.<init>()     // Catch:{ all -> 0x00ac }
            r3.c = r0     // Catch:{ all -> 0x00ac }
            java.util.HashSet<java.lang.String> r0 = r8.h     // Catch:{ all -> 0x00ac }
            int r0 = r0.size()     // Catch:{ all -> 0x00ac }
            if (r0 <= 0) goto L_0x00c2
            if (r10 == 0) goto L_0x00c2
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch:{ all -> 0x00ac }
            r4.<init>()     // Catch:{ all -> 0x00ac }
            java.util.Set r0 = r10.entrySet()     // Catch:{ all -> 0x00ac }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x00ac }
        L_0x005a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x00ac }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00ac }
            java.lang.Object r1 = r0.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            if (r1 == 0) goto L_0x00af
            java.lang.Object r1 = r0.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
        L_0x0072:
            java.lang.Object r6 = r0.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            if (r6 == 0) goto L_0x00b2
            java.lang.Object r0 = r0.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
        L_0x007e:
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            java.lang.String r6 = r1.toLowerCase(r6)     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            java.util.HashSet<java.lang.String> r7 = r8.h     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            boolean r6 = r7.contains(r6)     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            if (r6 == 0) goto L_0x005a
            com.google.android.gms.internal.akl r6 = new com.google.android.gms.internal.akl     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            java.lang.String r7 = "UTF-8"
            byte[] r1 = r1.getBytes(r7)     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            r6.a = r1     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            r6.b = r0     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            r4.add(r6)     // Catch:{ UnsupportedEncodingException -> 0x00a5 }
            goto L_0x005a
        L_0x00a5:
            r0 = move-exception
            java.lang.String r0 = "Cannot convert string to bytes, skip header."
            com.google.android.gms.internal.eh.a(r0)     // Catch:{ all -> 0x00ac }
            goto L_0x005a
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            throw r0
        L_0x00af:
            java.lang.String r1 = ""
            goto L_0x0072
        L_0x00b2:
            java.lang.String r0 = ""
            goto L_0x007e
        L_0x00b5:
            int r0 = r4.size()     // Catch:{ all -> 0x00ac }
            com.google.android.gms.internal.akl[] r0 = new com.google.android.gms.internal.akl[r0]     // Catch:{ all -> 0x00ac }
            r4.toArray(r0)     // Catch:{ all -> 0x00ac }
            com.google.android.gms.internal.akm r1 = r3.c     // Catch:{ all -> 0x00ac }
            r1.a = r0     // Catch:{ all -> 0x00ac }
        L_0x00c2:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.akr> r0 = r8.c     // Catch:{ all -> 0x00ac }
            r0.put(r9, r3)     // Catch:{ all -> 0x00ac }
            monitor-exit(r2)     // Catch:{ all -> 0x00ac }
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.dy.a(java.lang.String, java.util.Map, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<String, String> map) {
        if (map != null) {
            for (String next : map.keySet()) {
                JSONArray optJSONArray = new JSONObject(map.get(next)).optJSONArray("matches");
                if (optJSONArray != null) {
                    synchronized (this.g) {
                        int length = optJSONArray.length();
                        akr b2 = b(next);
                        if (b2 == null) {
                            String valueOf = String.valueOf(next);
                            eh.a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                        } else {
                            b2.e = new String[length];
                            for (int i2 = 0; i2 < length; i2++) {
                                b2.e[i2] = optJSONArray.getJSONObject(i2).getString("threat_type");
                            }
                            this.a = (length > 0) | this.a;
                        }
                    }
                }
            }
        }
    }

    public final boolean b() {
        return j.e() && this.f.c && !this.j;
    }

    public final void c() {
        this.i = true;
    }

    public final void d() {
        synchronized (this.g) {
            kh<Map<String, String>> a2 = this.e.a(this.d, this.c.keySet());
            a2.a(new ea(this, a2), gq.a);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        boolean z = true;
        if ((!this.a || !this.f.g) && ((!this.k || !this.f.f) && (this.a || !this.f.d))) {
            z = false;
        }
        if (z) {
            synchronized (this.g) {
                this.b.e = new akr[this.c.size()];
                this.c.values().toArray(this.b.e);
                if (eh.a()) {
                    String str = this.b.b;
                    String str2 = this.b.f;
                    StringBuilder sb = new StringBuilder(new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length()).append("Sending SB report\n  url: ").append(str).append("\n  clickUrl: ").append(str2).append("\n  resources: \n").toString());
                    for (akr akr : this.b.e) {
                        sb.append("    [");
                        sb.append(akr.e.length);
                        sb.append("] ");
                        sb.append(akr.b);
                    }
                    eh.a(sb.toString());
                }
                kh<String> a2 = new Cif(this.d).a(1, this.f.b, (Map<String, String>) null, akf.a((akf) this.b));
                if (eh.a()) {
                    a2.a(new eb(this), gq.a);
                }
            }
        }
    }
}
