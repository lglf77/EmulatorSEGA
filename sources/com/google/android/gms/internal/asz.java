package com.google.android.gms.internal;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@bfk
public final class asz {
    private BlockingQueue<atj> a;
    private ExecutorService b;
    private LinkedHashMap<String, String> c = new LinkedHashMap<>();
    private Map<String, atd> d = new HashMap();
    private String e;
    private Context f;
    private String g;
    private AtomicBoolean h;
    private File i;

    public asz(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f = context;
        this.g = str;
        this.e = str2;
        this.h = new AtomicBoolean(false);
        this.h.set(((Boolean) app.f().a(asw.J)).booleanValue());
        if (this.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.c.put((String) next.getKey(), (String) next.getValue());
        }
        this.a = new ArrayBlockingQueue(30);
        this.b = Executors.newSingleThreadExecutor();
        this.b.execute(new ata(this));
        this.d.put("action", atd.b);
        this.d.put("ad_format", atd.b);
        this.d.put("e", atd.c);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0 A[SYNTHETIC, Splitter:B:30:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1 A[SYNTHETIC, Splitter:B:37:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0000 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r5 = this;
        L_0x0000:
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.atj> r0 = r5.a     // Catch:{ InterruptedException -> 0x004a }
            java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x004a }
            com.google.android.gms.internal.atj r0 = (com.google.android.gms.internal.atj) r0     // Catch:{ InterruptedException -> 0x004a }
            java.lang.String r2 = r0.b()     // Catch:{ InterruptedException -> 0x004a }
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0000
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r5.c
            java.util.Map r0 = r0.c()
            java.util.Map r0 = r5.a(r1, r0)
            java.lang.String r1 = r5.e
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r3 = r1.buildUpon()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x002e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.appendQueryParameter(r1, r0)
            goto L_0x002e
        L_0x004a:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter:reporter interrupted"
            com.google.android.gms.internal.fn.c(r1, r0)
            return
        L_0x0051:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            android.net.Uri r1 = r3.build()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.String r1 = "&it="
            java.lang.StringBuilder r1 = r0.append(r1)
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.h
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x00c3
            java.io.File r3 = r5.i
            if (r3 == 0) goto L_0x00bc
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0097, all -> 0x00ad }
            r4 = 1
            r1.<init>(r3, r4)     // Catch:{ IOException -> 0x0097, all -> 0x00ad }
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x00d1 }
            r1.write(r0)     // Catch:{ IOException -> 0x00d1 }
            r0 = 10
            r1.write(r0)     // Catch:{ IOException -> 0x00d1 }
            r1.close()     // Catch:{ IOException -> 0x008f }
            goto L_0x0000
        L_0x008f:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.fn.c(r1, r0)
            goto L_0x0000
        L_0x0097:
            r0 = move-exception
            r1 = r2
        L_0x0099:
            java.lang.String r2 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.fn.c(r2, r0)     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x0000
            r1.close()     // Catch:{ IOException -> 0x00a5 }
            goto L_0x0000
        L_0x00a5:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.fn.c(r1, r0)
            goto L_0x0000
        L_0x00ad:
            r0 = move-exception
            r1 = r2
        L_0x00af:
            if (r1 == 0) goto L_0x00b4
            r1.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b4:
            throw r0
        L_0x00b5:
            r1 = move-exception
            java.lang.String r2 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.fn.c(r2, r1)
            goto L_0x00b4
        L_0x00bc:
            java.lang.String r0 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.fn.e(r0)
            goto L_0x0000
        L_0x00c3:
            com.google.android.gms.ads.internal.au.e()
            android.content.Context r1 = r5.f
            java.lang.String r2 = r5.g
            com.google.android.gms.internal.gw.b(r1, r2, r0)
            goto L_0x0000
        L_0x00cf:
            r0 = move-exception
            goto L_0x00af
        L_0x00d1:
            r0 = move-exception
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.asz.a():void");
    }

    public final atd a(String str) {
        atd atd = this.d.get(str);
        return atd != null ? atd : atd.a;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, a(str).a(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    public final void a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.c.put("e", TextUtils.join(",", list));
        }
    }

    public final boolean a(atj atj) {
        return this.a.offer(atj);
    }
}
