package com.google.android.gms.internal;

final class zq implements yo {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.yu a(java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            r0 = -1
            r3 = 1
            r1 = 0
            java.lang.String r2 = r7.toLowerCase()
            int r4 = r2.hashCode()
            switch(r4) {
                case 275448849: goto L_0x0022;
                case 1420614889: goto L_0x002c;
                default: goto L_0x000e;
            }
        L_0x000e:
            r2 = r0
        L_0x000f:
            switch(r2) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0078;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "No support for primitive '%s'."
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r7
            java.lang.String r1 = java.lang.String.format(r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x0022:
            java.lang.String r4 = "hybriddecrypt"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x002c:
            java.lang.String r4 = "hybridencrypt"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x000e
            r2 = r3
            goto L_0x000f
        L_0x0036:
            int r2 = r6.hashCode()
            switch(r2) {
                case -80133005: goto L_0x0050;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r0) {
                case 0: goto L_0x005a;
                default: goto L_0x0040;
            }
        L_0x0040:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "No support for primitive 'HybridEncrypt' with key type '%s'."
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            java.lang.String r1 = java.lang.String.format(r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x0050:
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x003d
            r0 = r1
            goto L_0x003d
        L_0x005a:
            com.google.android.gms.internal.zo r0 = new com.google.android.gms.internal.zo
            r0.<init>()
        L_0x005f:
            if (r8 <= 0) goto L_0x00a2
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "No key manager for key type '%s' with version at least %d."
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r4[r3] = r1
            java.lang.String r1 = java.lang.String.format(r2, r4)
            r0.<init>(r1)
            throw r0
        L_0x0078:
            int r2 = r6.hashCode()
            switch(r2) {
                case 396454335: goto L_0x0092;
                default: goto L_0x007f;
            }
        L_0x007f:
            switch(r0) {
                case 0: goto L_0x009c;
                default: goto L_0x0082;
            }
        L_0x0082:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "No support for primitive 'HybridEncrypt' with key type '%s'."
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            java.lang.String r1 = java.lang.String.format(r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x0092:
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x007f
            r0 = r1
            goto L_0x007f
        L_0x009c:
            com.google.android.gms.internal.zp r0 = new com.google.android.gms.internal.zp
            r0.<init>()
            goto L_0x005f
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zq.a(java.lang.String, java.lang.String, int):com.google.android.gms.internal.yu");
    }
}
