package com.google.android.gms.internal;

public abstract class aqc extends afv implements aqb {
    public aqc() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v14, types: [com.google.android.gms.internal.aqs] */
    /* JADX WARNING: type inference failed for: r0v27, types: [com.google.android.gms.internal.apv] */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: type inference failed for: r0v31 */
    /* JADX WARNING: type inference failed for: r0v32 */
    /* JADX WARNING: type inference failed for: r0v33 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            boolean r2 = r4.zza(r5, r6, r7, r8)
            if (r2 == 0) goto L_0x000a
            r0 = r1
        L_0x0009:
            return r0
        L_0x000a:
            switch(r5) {
                case 1: goto L_0x000f;
                case 2: goto L_0x001b;
                case 3: goto L_0x003b;
                case 4: goto L_0x004a;
                case 5: goto L_0x0059;
                case 6: goto L_0x0074;
                case 7: goto L_0x0083;
                case 8: goto L_0x00a3;
                case 9: goto L_0x00bb;
                case 10: goto L_0x00cb;
                default: goto L_0x000d;
            }
        L_0x000d:
            r0 = 0
            goto L_0x0009
        L_0x000f:
            com.google.android.gms.internal.apy r0 = r4.a()
            r7.writeNoException()
            com.google.android.gms.internal.afw.a((android.os.Parcel) r7, (android.os.IInterface) r0)
        L_0x0019:
            r0 = r1
            goto L_0x0009
        L_0x001b:
            android.os.IBinder r2 = r6.readStrongBinder()
            if (r2 != 0) goto L_0x0028
        L_0x0021:
            r4.a((com.google.android.gms.internal.apv) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x0028:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.internal.apv
            if (r3 == 0) goto L_0x0035
            com.google.android.gms.internal.apv r0 = (com.google.android.gms.internal.apv) r0
            goto L_0x0021
        L_0x0035:
            com.google.android.gms.internal.apx r0 = new com.google.android.gms.internal.apx
            r0.<init>(r2)
            goto L_0x0021
        L_0x003b:
            android.os.IBinder r0 = r6.readStrongBinder()
            com.google.android.gms.internal.awi r0 = com.google.android.gms.internal.awj.a(r0)
            r4.a((com.google.android.gms.internal.awi) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x004a:
            android.os.IBinder r0 = r6.readStrongBinder()
            com.google.android.gms.internal.awl r0 = com.google.android.gms.internal.awm.a(r0)
            r4.a((com.google.android.gms.internal.awl) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x0059:
            java.lang.String r0 = r6.readString()
            android.os.IBinder r2 = r6.readStrongBinder()
            com.google.android.gms.internal.awr r2 = com.google.android.gms.internal.awt.a(r2)
            android.os.IBinder r3 = r6.readStrongBinder()
            com.google.android.gms.internal.awo r3 = com.google.android.gms.internal.awp.a(r3)
            r4.a(r0, r2, r3)
            r7.writeNoException()
            goto L_0x0019
        L_0x0074:
            android.os.Parcelable$Creator<com.google.android.gms.internal.auv> r0 = com.google.android.gms.internal.auv.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.afw.a((android.os.Parcel) r6, r0)
            com.google.android.gms.internal.auv r0 = (com.google.android.gms.internal.auv) r0
            r4.a((com.google.android.gms.internal.auv) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x0083:
            android.os.IBinder r2 = r6.readStrongBinder()
            if (r2 != 0) goto L_0x0090
        L_0x0089:
            r4.a((com.google.android.gms.internal.aqs) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x0090:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.internal.aqs
            if (r3 == 0) goto L_0x009d
            com.google.android.gms.internal.aqs r0 = (com.google.android.gms.internal.aqs) r0
            goto L_0x0089
        L_0x009d:
            com.google.android.gms.internal.aqu r0 = new com.google.android.gms.internal.aqu
            r0.<init>(r2)
            goto L_0x0089
        L_0x00a3:
            android.os.IBinder r0 = r6.readStrongBinder()
            com.google.android.gms.internal.awy r2 = com.google.android.gms.internal.awz.a(r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.apc> r0 = com.google.android.gms.internal.apc.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.afw.a((android.os.Parcel) r6, r0)
            com.google.android.gms.internal.apc r0 = (com.google.android.gms.internal.apc) r0
            r4.a(r2, r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x00bb:
            android.os.Parcelable$Creator<com.google.android.gms.ads.b.j> r0 = com.google.android.gms.ads.b.j.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.afw.a((android.os.Parcel) r6, r0)
            com.google.android.gms.ads.b.j r0 = (com.google.android.gms.ads.b.j) r0
            r4.a((com.google.android.gms.ads.b.j) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x00cb:
            android.os.IBinder r0 = r6.readStrongBinder()
            com.google.android.gms.internal.awv r0 = com.google.android.gms.internal.aww.a(r0)
            r4.a((com.google.android.gms.internal.awv) r0)
            r7.writeNoException()
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aqc.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
