package com.google.android.gms.internal;

public abstract class af extends afv implements ae {
    public af() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.google.android.gms.internal.ak] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.gms.internal.ah] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
        /*
            r5 = this;
            r1 = 0
            r2 = 1
            boolean r0 = r5.zza(r6, r7, r8, r9)
            if (r0 == 0) goto L_0x000a
            r0 = r2
        L_0x0009:
            return r0
        L_0x000a:
            switch(r6) {
                case 1: goto L_0x000f;
                case 2: goto L_0x0023;
                case 3: goto L_0x000d;
                case 4: goto L_0x004b;
                default: goto L_0x000d;
            }
        L_0x000d:
            r0 = 0
            goto L_0x0009
        L_0x000f:
            android.os.Parcelable$Creator<com.google.android.gms.internal.v> r0 = com.google.android.gms.internal.v.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.afw.a((android.os.Parcel) r7, r0)
            com.google.android.gms.internal.v r0 = (com.google.android.gms.internal.v) r0
            com.google.android.gms.internal.z r0 = r5.a(r0)
            r8.writeNoException()
            com.google.android.gms.internal.afw.b(r8, r0)
        L_0x0021:
            r0 = r2
            goto L_0x0009
        L_0x0023:
            android.os.Parcelable$Creator<com.google.android.gms.internal.v> r0 = com.google.android.gms.internal.v.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.afw.a((android.os.Parcel) r7, r0)
            com.google.android.gms.internal.v r0 = (com.google.android.gms.internal.v) r0
            android.os.IBinder r3 = r7.readStrongBinder()
            if (r3 != 0) goto L_0x0038
        L_0x0031:
            r5.a((com.google.android.gms.internal.v) r0, (com.google.android.gms.internal.ah) r1)
            r8.writeNoException()
            goto L_0x0021
        L_0x0038:
            java.lang.String r1 = "com.google.android.gms.ads.internal.request.IAdResponseListener"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)
            boolean r4 = r1 instanceof com.google.android.gms.internal.ah
            if (r4 == 0) goto L_0x0045
            com.google.android.gms.internal.ah r1 = (com.google.android.gms.internal.ah) r1
            goto L_0x0031
        L_0x0045:
            com.google.android.gms.internal.aj r1 = new com.google.android.gms.internal.aj
            r1.<init>(r3)
            goto L_0x0031
        L_0x004b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ap> r0 = com.google.android.gms.internal.ap.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.afw.a((android.os.Parcel) r7, r0)
            com.google.android.gms.internal.ap r0 = (com.google.android.gms.internal.ap) r0
            android.os.IBinder r3 = r7.readStrongBinder()
            if (r3 != 0) goto L_0x0060
        L_0x0059:
            r5.a((com.google.android.gms.internal.ap) r0, (com.google.android.gms.internal.ak) r1)
            r8.writeNoException()
            goto L_0x0021
        L_0x0060:
            java.lang.String r1 = "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)
            boolean r4 = r1 instanceof com.google.android.gms.internal.ak
            if (r4 == 0) goto L_0x006d
            com.google.android.gms.internal.ak r1 = (com.google.android.gms.internal.ak) r1
            goto L_0x0059
        L_0x006d:
            com.google.android.gms.internal.al r1 = new com.google.android.gms.internal.al
            r1.<init>(r3)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.af.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
