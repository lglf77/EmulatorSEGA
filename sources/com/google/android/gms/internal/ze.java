package com.google.android.gms.internal;

final class ze implements yo {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.yu a(java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r6 = this;
            r3 = 2
            r0 = -1
            r2 = 1
            r1 = 0
            java.lang.String r4 = r8.toLowerCase()
            int r5 = r4.hashCode()
            switch(r5) {
                case 2989895: goto L_0x0023;
                default: goto L_0x000f;
            }
        L_0x000f:
            r4 = r0
        L_0x0010:
            switch(r4) {
                case 0: goto L_0x002d;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r3 = "No support for primitive '%s'."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r8
            java.lang.String r1 = java.lang.String.format(r3, r2)
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.lang.String r5 = "aead"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x000f
            r4 = r1
            goto L_0x0010
        L_0x002d:
            int r4 = r7.hashCode()
            switch(r4) {
                case 360753376: goto L_0x0065;
                case 1215885937: goto L_0x0047;
                case 1469984853: goto L_0x006f;
                case 1797113348: goto L_0x0051;
                case 1855890991: goto L_0x005b;
                case 2079211877: goto L_0x0079;
                default: goto L_0x0034;
            }
        L_0x0034:
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x00a0;
                case 2: goto L_0x00a6;
                case 3: goto L_0x00ac;
                case 4: goto L_0x00b2;
                case 5: goto L_0x00b8;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r3 = "No support for primitive 'Aead' with key type '%s'."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            java.lang.String r1 = java.lang.String.format(r3, r2)
            r0.<init>(r1)
            throw r0
        L_0x0047:
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0034
            r0 = r1
            goto L_0x0034
        L_0x0051:
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.AesEaxKey"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0034
            r0 = r2
            goto L_0x0034
        L_0x005b:
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0034
            r0 = r3
            goto L_0x0034
        L_0x0065:
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0034
        L_0x006f:
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.KmsAeadKey"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0034
            r0 = 4
            goto L_0x0034
        L_0x0079:
            java.lang.String r4 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0034
            r0 = 5
            goto L_0x0034
        L_0x0083:
            com.google.android.gms.internal.zg r0 = new com.google.android.gms.internal.zg
            r0.<init>()
        L_0x0088:
            if (r9 <= 0) goto L_0x00be
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r4 = "No key manager for key type '%s' with version at least %d."
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r3[r2] = r1
            java.lang.String r1 = java.lang.String.format(r4, r3)
            r0.<init>(r1)
            throw r0
        L_0x00a0:
            com.google.android.gms.internal.zi r0 = new com.google.android.gms.internal.zi
            r0.<init>()
            goto L_0x0088
        L_0x00a6:
            com.google.android.gms.internal.zj r0 = new com.google.android.gms.internal.zj
            r0.<init>()
            goto L_0x0088
        L_0x00ac:
            com.google.android.gms.internal.zk r0 = new com.google.android.gms.internal.zk
            r0.<init>()
            goto L_0x0088
        L_0x00b2:
            com.google.android.gms.internal.zl r0 = new com.google.android.gms.internal.zl
            r0.<init>()
            goto L_0x0088
        L_0x00b8:
            com.google.android.gms.internal.zn r0 = new com.google.android.gms.internal.zn
            r0.<init>()
            goto L_0x0088
        L_0x00be:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ze.a(java.lang.String, java.lang.String, int):com.google.android.gms.internal.yu");
    }
}
