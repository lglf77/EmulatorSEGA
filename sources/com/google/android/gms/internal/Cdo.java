package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Future;

@bfk
/* renamed from: com.google.android.gms.internal.do  reason: invalid class name */
public final class Cdo extends fj implements dn {
    private final ew a;
    private final Context b;
    private final ArrayList<Future> c;
    private final ArrayList<String> d;
    private final HashMap<String, dd> e;
    private final List<dh> f;
    private final HashSet<String> g;
    private final Object h;
    /* access modifiers changed from: private */
    public final cj i;
    private final long j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Cdo(android.content.Context r7, com.google.android.gms.internal.ew r8, com.google.android.gms.internal.cj r9) {
        /*
            r6 = this;
            com.google.android.gms.internal.asl<java.lang.Long> r0 = com.google.android.gms.internal.asw.at
            com.google.android.gms.internal.asu r1 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.Cdo.<init>(android.content.Context, com.google.android.gms.internal.ew, com.google.android.gms.internal.cj):void");
    }

    private Cdo(Context context, ew ewVar, cj cjVar, long j2) {
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.e = new HashMap<>();
        this.f = new ArrayList();
        this.g = new HashSet<>();
        this.h = new Object();
        this.b = context;
        this.a = ewVar;
        this.i = cjVar;
        this.j = j2;
    }

    private final ev a(int i2, String str, bab bab) {
        return new ev(this.a.a.c, (mw) null, this.a.b.c, i2, this.a.b.e, this.a.b.i, this.a.b.k, this.a.b.j, this.a.a.i, this.a.b.g, bab, (bav) null, str, this.a.c, (bae) null, this.a.b.h, this.a.d, this.a.b.f, this.a.f, this.a.b.m, this.a.b.n, this.a.h, (auk) null, this.a.b.A, this.a.b.B, this.a.b.C, this.a.b.D, this.a.b.E, e(), this.a.b.H, this.a.b.L, this.a.i, this.a.b.O, this.a.j);
    }

    private final String e() {
        int i2;
        StringBuilder sb = new StringBuilder("");
        if (this.f == null) {
            return sb.toString();
        }
        for (dh next : this.f) {
            if (next != null && !TextUtils.isEmpty(next.a)) {
                String str = next.a;
                switch (next.b) {
                    case 3:
                        i2 = 1;
                        break;
                    case 4:
                        i2 = 2;
                        break;
                    case 5:
                        i2 = 4;
                        break;
                    case 6:
                        i2 = 0;
                        break;
                    case 7:
                        i2 = 3;
                        break;
                    default:
                        i2 = 6;
                        break;
                }
                sb.append(String.valueOf(new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(i2).append(".").append(next.c).toString()).concat("_"));
            }
        }
        return sb.substring(0, Math.max(0, sb.length() - 1));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void a() {
        /*
            r14 = this;
            r10 = 0
            com.google.android.gms.internal.ew r0 = r14.a
            com.google.android.gms.internal.bac r0 = r0.c
            java.util.List<com.google.android.gms.internal.bab> r0 = r0.a
            java.util.Iterator r11 = r0.iterator()
        L_0x000b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r4 = r11.next()
            com.google.android.gms.internal.bab r4 = (com.google.android.gms.internal.bab) r4
            java.lang.String r3 = r4.j
            java.util.List<java.lang.String> r0 = r4.c
            java.util.Iterator r12 = r0.iterator()
        L_0x001f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x003b
            java.lang.String r1 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01d1
        L_0x003b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r1 = "class_name"
            java.lang.String r2 = r0.getString(r1)     // Catch:{ JSONException -> 0x0085 }
        L_0x0046:
            java.lang.Object r13 = r14.h
            monitor-enter(r13)
            com.google.android.gms.internal.cj r0 = r14.i     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.dr r6 = r0.b((java.lang.String) r2)     // Catch:{ all -> 0x0082 }
            if (r6 == 0) goto L_0x005d
            com.google.android.gms.internal.dm r0 = r6.b()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x005d
            com.google.android.gms.internal.bav r0 = r6.a()     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x008c
        L_0x005d:
            java.util.List<com.google.android.gms.internal.dh> r0 = r14.f     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.dj r1 = new com.google.android.gms.internal.dj     // Catch:{ all -> 0x0082 }
            r1.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = r4.d     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.dj r1 = r1.b((java.lang.String) r5)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.dj r1 = r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0082 }
            r6 = 0
            com.google.android.gms.internal.dj r1 = r1.a((long) r6)     // Catch:{ all -> 0x0082 }
            r2 = 7
            com.google.android.gms.internal.dj r1 = r1.a((int) r2)     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.dh r1 = r1.a()     // Catch:{ all -> 0x0082 }
            r0.add(r1)     // Catch:{ all -> 0x0082 }
            monitor-exit(r13)     // Catch:{ all -> 0x0082 }
            goto L_0x001f
        L_0x0082:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0082 }
            throw r0
        L_0x0085:
            r0 = move-exception
            java.lang.String r1 = "Unable to determine custom event class name, skipping..."
            com.google.android.gms.internal.fn.b(r1, r0)
            goto L_0x001f
        L_0x008c:
            com.google.android.gms.internal.dd r0 = new com.google.android.gms.internal.dd     // Catch:{ all -> 0x0082 }
            android.content.Context r1 = r14.b     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.ew r5 = r14.a     // Catch:{ all -> 0x0082 }
            long r8 = r14.j     // Catch:{ all -> 0x0082 }
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0082 }
            java.util.ArrayList<java.util.concurrent.Future> r5 = r14.c     // Catch:{ all -> 0x0082 }
            java.lang.Object r1 = r0.d()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.internal.kh r1 = (com.google.android.gms.internal.kh) r1     // Catch:{ all -> 0x0082 }
            r5.add(r1)     // Catch:{ all -> 0x0082 }
            java.util.ArrayList<java.lang.String> r1 = r14.d     // Catch:{ all -> 0x0082 }
            r1.add(r2)     // Catch:{ all -> 0x0082 }
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.dd> r1 = r14.e     // Catch:{ all -> 0x0082 }
            r1.put(r2, r0)     // Catch:{ all -> 0x0082 }
            monitor-exit(r13)     // Catch:{ all -> 0x0082 }
            goto L_0x001f
        L_0x00b0:
            r0 = 0
            r1 = r0
        L_0x00b2:
            java.util.ArrayList<java.util.concurrent.Future> r0 = r14.c
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0158
            java.util.ArrayList<java.util.concurrent.Future> r0 = r14.c     // Catch:{ InterruptedException -> 0x012b, Exception -> 0x016b }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ InterruptedException -> 0x012b, Exception -> 0x016b }
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0     // Catch:{ InterruptedException -> 0x012b, Exception -> 0x016b }
            r0.get()     // Catch:{ InterruptedException -> 0x012b, Exception -> 0x016b }
            java.lang.Object r2 = r14.h
            monitor-enter(r2)
            java.util.ArrayList<java.lang.String> r0 = r14.d     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0128 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0128 }
            if (r3 != 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.dd> r3 = r14.e     // Catch:{ all -> 0x0128 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x0128 }
            com.google.android.gms.internal.dd r0 = (com.google.android.gms.internal.dd) r0     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00e9
            java.util.List<com.google.android.gms.internal.dh> r3 = r14.f     // Catch:{ all -> 0x0128 }
            com.google.android.gms.internal.dh r0 = r0.e()     // Catch:{ all -> 0x0128 }
            r3.add(r0)     // Catch:{ all -> 0x0128 }
        L_0x00e9:
            monitor-exit(r2)     // Catch:{ all -> 0x0128 }
            java.lang.Object r2 = r14.h
            monitor-enter(r2)
            java.util.HashSet<java.lang.String> r0 = r14.g     // Catch:{ all -> 0x01ce }
            java.util.ArrayList<java.lang.String> r3 = r14.d     // Catch:{ all -> 0x01ce }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x01ce }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01cc
            java.util.ArrayList<java.lang.String> r0 = r14.d     // Catch:{ all -> 0x01ce }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01ce }
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.dd> r1 = r14.e     // Catch:{ all -> 0x01ce }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x01ce }
            if (r1 == 0) goto L_0x01c9
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.dd> r1 = r14.e     // Catch:{ all -> 0x01ce }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x01ce }
            com.google.android.gms.internal.dd r1 = (com.google.android.gms.internal.dd) r1     // Catch:{ all -> 0x01ce }
            com.google.android.gms.internal.bab r1 = r1.f()     // Catch:{ all -> 0x01ce }
        L_0x0117:
            r3 = -2
            com.google.android.gms.internal.ev r0 = r14.a(r3, r0, r1)     // Catch:{ all -> 0x01ce }
            android.os.Handler r1 = com.google.android.gms.internal.jc.a     // Catch:{ all -> 0x01ce }
            com.google.android.gms.internal.dp r3 = new com.google.android.gms.internal.dp     // Catch:{ all -> 0x01ce }
            r3.<init>(r14, r0)     // Catch:{ all -> 0x01ce }
            r1.post(r3)     // Catch:{ all -> 0x01ce }
            monitor-exit(r2)     // Catch:{ all -> 0x01ce }
        L_0x0127:
            return
        L_0x0128:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0128 }
            throw r0
        L_0x012b:
            r0 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x019e }
            r0.interrupt()     // Catch:{ all -> 0x019e }
            java.lang.Object r2 = r14.h
            monitor-enter(r2)
            java.util.ArrayList<java.lang.String> r0 = r14.d     // Catch:{ all -> 0x0168 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0168 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0168 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0168 }
            if (r1 != 0) goto L_0x0157
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.dd> r1 = r14.e     // Catch:{ all -> 0x0168 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0168 }
            com.google.android.gms.internal.dd r0 = (com.google.android.gms.internal.dd) r0     // Catch:{ all -> 0x0168 }
            if (r0 == 0) goto L_0x0157
            java.util.List<com.google.android.gms.internal.dh> r1 = r14.f     // Catch:{ all -> 0x0168 }
            com.google.android.gms.internal.dh r0 = r0.e()     // Catch:{ all -> 0x0168 }
            r1.add(r0)     // Catch:{ all -> 0x0168 }
        L_0x0157:
            monitor-exit(r2)     // Catch:{ all -> 0x0168 }
        L_0x0158:
            r0 = 3
            com.google.android.gms.internal.ev r0 = r14.a(r0, r10, r10)
            android.os.Handler r1 = com.google.android.gms.internal.jc.a
            com.google.android.gms.internal.dq r2 = new com.google.android.gms.internal.dq
            r2.<init>(r14, r0)
            r1.post(r2)
            goto L_0x0127
        L_0x0168:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0168 }
            throw r0
        L_0x016b:
            r0 = move-exception
            java.lang.String r2 = "Unable to resolve rewarded adapter."
            com.google.android.gms.internal.fn.c(r2, r0)     // Catch:{ all -> 0x019e }
            java.lang.Object r2 = r14.h
            monitor-enter(r2)
            java.util.ArrayList<java.lang.String> r0 = r14.d     // Catch:{ all -> 0x019b }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x019b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x019b }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x019b }
            if (r3 != 0) goto L_0x0195
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.dd> r3 = r14.e     // Catch:{ all -> 0x019b }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x019b }
            com.google.android.gms.internal.dd r0 = (com.google.android.gms.internal.dd) r0     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0195
            java.util.List<com.google.android.gms.internal.dh> r3 = r14.f     // Catch:{ all -> 0x019b }
            com.google.android.gms.internal.dh r0 = r0.e()     // Catch:{ all -> 0x019b }
            r3.add(r0)     // Catch:{ all -> 0x019b }
        L_0x0195:
            monitor-exit(r2)     // Catch:{ all -> 0x019b }
        L_0x0196:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x00b2
        L_0x019b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x019b }
            throw r0
        L_0x019e:
            r0 = move-exception
            r2 = r0
            java.lang.Object r3 = r14.h
            monitor-enter(r3)
            java.util.ArrayList<java.lang.String> r0 = r14.d     // Catch:{ all -> 0x01c6 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01c6 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x01c6 }
            if (r1 != 0) goto L_0x01c4
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.dd> r1 = r14.e     // Catch:{ all -> 0x01c6 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x01c6 }
            com.google.android.gms.internal.dd r0 = (com.google.android.gms.internal.dd) r0     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x01c4
            java.util.List<com.google.android.gms.internal.dh> r1 = r14.f     // Catch:{ all -> 0x01c6 }
            com.google.android.gms.internal.dh r0 = r0.e()     // Catch:{ all -> 0x01c6 }
            r1.add(r0)     // Catch:{ all -> 0x01c6 }
        L_0x01c4:
            monitor-exit(r3)     // Catch:{ all -> 0x01c6 }
            throw r2
        L_0x01c6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01c6 }
            throw r0
        L_0x01c9:
            r1 = r10
            goto L_0x0117
        L_0x01cc:
            monitor-exit(r2)     // Catch:{ all -> 0x01ce }
            goto L_0x0196
        L_0x01ce:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ce }
            throw r0
        L_0x01d1:
            r2 = r0
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.Cdo.a():void");
    }

    public final void a(String str) {
        synchronized (this.h) {
            this.g.add(str);
        }
    }

    public final void a(String str, int i2) {
    }

    public final void b() {
    }
}
