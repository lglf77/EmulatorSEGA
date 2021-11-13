package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class aqh extends afv implements aqg {
    public aqh() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static aqg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof aqg ? (aqg) queryLocalInterface : new aqi(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v22, types: [com.google.android.gms.internal.aqs] */
    /* JADX WARNING: type inference failed for: r0v27, types: [com.google.android.gms.internal.aps] */
    /* JADX WARNING: type inference failed for: r0v43, types: [com.google.android.gms.internal.aql] */
    /* JADX WARNING: type inference failed for: r0v48, types: [com.google.android.gms.internal.apv] */
    /* JADX WARNING: type inference failed for: r0v56 */
    /* JADX WARNING: type inference failed for: r0v57 */
    /* JADX WARNING: type inference failed for: r0v58 */
    /* JADX WARNING: type inference failed for: r0v59 */
    /* JADX WARNING: type inference failed for: r0v60 */
    /* JADX WARNING: type inference failed for: r0v61 */
    /* JADX WARNING: type inference failed for: r0v62 */
    /* JADX WARNING: type inference failed for: r0v63 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            r1 = 1
            r0 = 0
            boolean r2 = r4.zza(r5, r6, r7, r8)
            if (r2 == 0) goto L_0x000a
            r0 = r1
        L_0x0009:
            return r0
        L_0x000a:
            switch(r5) {
                case 1: goto L_0x000f;
                case 2: goto L_0x001b;
                case 3: goto L_0x0022;
                case 4: goto L_0x002d;
                case 5: goto L_0x0040;
                case 6: goto L_0x0047;
                case 7: goto L_0x004e;
                case 8: goto L_0x006e;
                case 9: goto L_0x008e;
                case 10: goto L_0x0095;
                case 11: goto L_0x009d;
                case 12: goto L_0x00a5;
                case 13: goto L_0x00b1;
                case 14: goto L_0x00c1;
                case 15: goto L_0x00d1;
                case 16: goto L_0x000d;
                case 17: goto L_0x000d;
                case 18: goto L_0x00e5;
                case 19: goto L_0x00f1;
                case 20: goto L_0x0101;
                case 21: goto L_0x0122;
                case 22: goto L_0x0143;
                case 23: goto L_0x014f;
                case 24: goto L_0x015b;
                case 25: goto L_0x016b;
                case 26: goto L_0x0177;
                case 27: goto L_0x000d;
                case 28: goto L_0x000d;
                case 29: goto L_0x0183;
                case 30: goto L_0x0193;
                case 31: goto L_0x01a3;
                case 32: goto L_0x01af;
                case 33: goto L_0x01bb;
                case 34: goto L_0x01c7;
                case 35: goto L_0x01d3;
                default: goto L_0x000d;
            }
        L_0x000d:
            r0 = 0
            goto L_0x0009
        L_0x000f:
            com.google.android.gms.a.a r0 = r4.j()
            r7.writeNoException()
            com.google.android.gms.internal.afw.a((android.os.Parcel) r7, (android.os.IInterface) r0)
        L_0x0019:
            r0 = r1
            goto L_0x0009
        L_0x001b:
            r4.i()
            r7.writeNoException()
            goto L_0x0019
        L_0x0022:
            boolean r0 = r4.l()
            r7.writeNoException()
            com.google.android.gms.internal.afw.a((android.os.Parcel) r7, (boolean) r0)
            goto L_0x0019
        L_0x002d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.aoy> r0 = com.google.android.gms.internal.aoy.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.afw.a((android.os.Parcel) r6, r0)
            com.google.android.gms.internal.aoy r0 = (com.google.android.gms.internal.aoy) r0
            boolean r0 = r4.b((com.google.android.gms.internal.aoy) r0)
            r7.writeNoException()
            com.google.android.gms.internal.afw.a((android.os.Parcel) r7, (boolean) r0)
            goto L_0x0019
        L_0x0040:
            r4.n()
            r7.writeNoException()
            goto L_0x0019
        L_0x0047:
            r4.o()
            r7.writeNoException()
            goto L_0x0019
        L_0x004e:
            android.os.IBinder r2 = r6.readStrongBinder()
            if (r2 != 0) goto L_0x005b
        L_0x0054:
            r4.a((com.google.android.gms.internal.apv) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x005b:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.internal.apv
            if (r3 == 0) goto L_0x0068
            com.google.android.gms.internal.apv r0 = (com.google.android.gms.internal.apv) r0
            goto L_0x0054
        L_0x0068:
            com.google.android.gms.internal.apx r0 = new com.google.android.gms.internal.apx
            r0.<init>(r2)
            goto L_0x0054
        L_0x006e:
            android.os.IBinder r2 = r6.readStrongBinder()
            if (r2 != 0) goto L_0x007b
        L_0x0074:
            r4.a((com.google.android.gms.internal.aql) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x007b:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.internal.aql
            if (r3 == 0) goto L_0x0088
            com.google.android.gms.internal.aql r0 = (com.google.android.gms.internal.aql) r0
            goto L_0x0074
        L_0x0088:
            com.google.android.gms.internal.aqn r0 = new com.google.android.gms.internal.aqn
            r0.<init>(r2)
            goto L_0x0074
        L_0x008e:
            r4.D()
            r7.writeNoException()
            goto L_0x0019
        L_0x0095:
            r4.p()
            r7.writeNoException()
            goto L_0x0019
        L_0x009d:
            r4.m()
            r7.writeNoException()
            goto L_0x0019
        L_0x00a5:
            com.google.android.gms.internal.apc r0 = r4.k()
            r7.writeNoException()
            com.google.android.gms.internal.afw.b(r7, r0)
            goto L_0x0019
        L_0x00b1:
            android.os.Parcelable$Creator<com.google.android.gms.internal.apc> r0 = com.google.android.gms.internal.apc.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.afw.a((android.os.Parcel) r6, r0)
            com.google.android.gms.internal.apc r0 = (com.google.android.gms.internal.apc) r0
            r4.a((com.google.android.gms.internal.apc) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x00c1:
            android.os.IBinder r0 = r6.readStrongBinder()
            com.google.android.gms.internal.bcy r0 = com.google.android.gms.internal.bcz.a(r0)
            r4.a((com.google.android.gms.internal.bcy) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x00d1:
            android.os.IBinder r0 = r6.readStrongBinder()
            com.google.android.gms.internal.bde r0 = com.google.android.gms.internal.bdf.a(r0)
            java.lang.String r2 = r6.readString()
            r4.a(r0, r2)
            r7.writeNoException()
            goto L_0x0019
        L_0x00e5:
            java.lang.String r0 = r4.a()
            r7.writeNoException()
            r7.writeString(r0)
            goto L_0x0019
        L_0x00f1:
            android.os.IBinder r0 = r6.readStrongBinder()
            com.google.android.gms.internal.atq r0 = com.google.android.gms.internal.atr.a(r0)
            r4.a((com.google.android.gms.internal.atq) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x0101:
            android.os.IBinder r2 = r6.readStrongBinder()
            if (r2 != 0) goto L_0x010f
        L_0x0107:
            r4.a((com.google.android.gms.internal.aps) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x010f:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.internal.aps
            if (r3 == 0) goto L_0x011c
            com.google.android.gms.internal.aps r0 = (com.google.android.gms.internal.aps) r0
            goto L_0x0107
        L_0x011c:
            com.google.android.gms.internal.apu r0 = new com.google.android.gms.internal.apu
            r0.<init>(r2)
            goto L_0x0107
        L_0x0122:
            android.os.IBinder r2 = r6.readStrongBinder()
            if (r2 != 0) goto L_0x0130
        L_0x0128:
            r4.a((com.google.android.gms.internal.aqs) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x0130:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r3 = r0 instanceof com.google.android.gms.internal.aqs
            if (r3 == 0) goto L_0x013d
            com.google.android.gms.internal.aqs r0 = (com.google.android.gms.internal.aqs) r0
            goto L_0x0128
        L_0x013d:
            com.google.android.gms.internal.aqu r0 = new com.google.android.gms.internal.aqu
            r0.<init>(r2)
            goto L_0x0128
        L_0x0143:
            boolean r0 = com.google.android.gms.internal.afw.a(r6)
            r4.b((boolean) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x014f:
            boolean r0 = r4.q()
            r7.writeNoException()
            com.google.android.gms.internal.afw.a((android.os.Parcel) r7, (boolean) r0)
            goto L_0x0019
        L_0x015b:
            android.os.IBinder r0 = r6.readStrongBinder()
            com.google.android.gms.internal.cu r0 = com.google.android.gms.internal.cv.a(r0)
            r4.a((com.google.android.gms.internal.cu) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x016b:
            java.lang.String r0 = r6.readString()
            r4.a((java.lang.String) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x0177:
            com.google.android.gms.internal.ara r0 = r4.r()
            r7.writeNoException()
            com.google.android.gms.internal.afw.a((android.os.Parcel) r7, (android.os.IInterface) r0)
            goto L_0x0019
        L_0x0183:
            android.os.Parcelable$Creator<com.google.android.gms.internal.asf> r0 = com.google.android.gms.internal.asf.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.afw.a((android.os.Parcel) r6, r0)
            com.google.android.gms.internal.asf r0 = (com.google.android.gms.internal.asf) r0
            r4.a((com.google.android.gms.internal.asf) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x0193:
            android.os.Parcelable$Creator<com.google.android.gms.internal.arg> r0 = com.google.android.gms.internal.arg.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.afw.a((android.os.Parcel) r6, r0)
            com.google.android.gms.internal.arg r0 = (com.google.android.gms.internal.arg) r0
            r4.a((com.google.android.gms.internal.arg) r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x01a3:
            java.lang.String r0 = r4.A()
            r7.writeNoException()
            r7.writeString(r0)
            goto L_0x0019
        L_0x01af:
            com.google.android.gms.internal.aql r0 = r4.B()
            r7.writeNoException()
            com.google.android.gms.internal.afw.a((android.os.Parcel) r7, (android.os.IInterface) r0)
            goto L_0x0019
        L_0x01bb:
            com.google.android.gms.internal.apv r0 = r4.C()
            r7.writeNoException()
            com.google.android.gms.internal.afw.a((android.os.Parcel) r7, (android.os.IInterface) r0)
            goto L_0x0019
        L_0x01c7:
            boolean r0 = com.google.android.gms.internal.afw.a(r6)
            r4.c(r0)
            r7.writeNoException()
            goto L_0x0019
        L_0x01d3:
            java.lang.String r0 = r4.d_()
            r7.writeNoException()
            r7.writeString(r0)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aqh.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
