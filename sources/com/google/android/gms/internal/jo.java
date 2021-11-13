package com.google.android.gms.internal;

@bfk
public final class jo implements jf {
    private final String a;

    public jo() {
        this((String) null);
    }

    public jo(String str) {
        this.a = str;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r1 = "Pinging URL: "
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
            int r2 = r0.length()     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
            if (r2 == 0) goto L_0x006d
            java.lang.String r0 = r1.concat(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
        L_0x0010:
            com.google.android.gms.internal.jn.b(r0)     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
            java.net.URL r0 = new java.net.URL     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
            r0.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
            com.google.android.gms.internal.app.a()     // Catch:{ all -> 0x00ac }
            r1 = 1
            java.lang.String r2 = r4.a     // Catch:{ all -> 0x00ac }
            com.google.android.gms.internal.jc.a((boolean) r1, (java.net.HttpURLConnection) r0, (java.lang.String) r2)     // Catch:{ all -> 0x00ac }
            com.google.android.gms.internal.jg r1 = new com.google.android.gms.internal.jg     // Catch:{ all -> 0x00ac }
            r1.<init>()     // Catch:{ all -> 0x00ac }
            r2 = 0
            r1.a((java.net.HttpURLConnection) r0, (byte[]) r2)     // Catch:{ all -> 0x00ac }
            int r2 = r0.getResponseCode()     // Catch:{ all -> 0x00ac }
            r1.a((java.net.HttpURLConnection) r0, (int) r2)     // Catch:{ all -> 0x00ac }
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 < r1) goto L_0x003f
            r1 = 300(0x12c, float:4.2E-43)
            if (r2 < r1) goto L_0x0069
        L_0x003f:
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00ac }
            int r1 = r1.length()     // Catch:{ all -> 0x00ac }
            int r1 = r1 + 65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r3.<init>(r1)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "Received non-success response code "
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = " from pinging URL: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x00ac }
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ac }
            com.google.android.gms.internal.jn.e(r1)     // Catch:{ all -> 0x00ac }
        L_0x0069:
            r0.disconnect()     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r0 = new java.lang.String     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
            r0.<init>(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
            goto L_0x0010
        L_0x0073:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            int r1 = r1 + 32
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Error while parsing ping URL: "
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ". "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.jn.e(r0)
            goto L_0x006c
        L_0x00ac:
            r1 = move-exception
            r0.disconnect()     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
            throw r1     // Catch:{ IndexOutOfBoundsException -> 0x0073, IOException -> 0x00b1, RuntimeException -> 0x00ea }
        L_0x00b1:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            int r1 = r1 + 27
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Error while pinging URL: "
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ". "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.jn.e(r0)
            goto L_0x006c
        L_0x00ea:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            int r1 = r1 + 27
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Error while pinging URL: "
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ". "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.jn.e(r0)
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jo.a(java.lang.String):void");
    }
}
