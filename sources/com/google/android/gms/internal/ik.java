package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class ik {
    private static Comparator<byte[]> e = new jl();
    private final List<byte[]> a = new LinkedList();
    private final List<byte[]> b = new ArrayList(64);
    private int c = 0;
    private final int d = 4096;

    public ik(int i) {
    }

    private final synchronized void a() {
        while (this.c > this.d) {
            byte[] remove = this.a.remove(0);
            this.b.remove(remove);
            this.c -= remove.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.a.add(bArr);
                int binarySearch = Collections.binarySearch(this.b, bArr, e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.b.add(binarySearch, bArr);
                this.c += bArr.length;
                a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = new byte[r5];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized byte[] a(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = r0
        L_0x0003:
            java.util.List<byte[]> r0 = r4.b     // Catch:{ all -> 0x002f }
            int r0 = r0.size()     // Catch:{ all -> 0x002f }
            if (r1 >= r0) goto L_0x002c
            java.util.List<byte[]> r0 = r4.b     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x002f }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x002f }
            int r2 = r0.length     // Catch:{ all -> 0x002f }
            if (r2 < r5) goto L_0x0028
            int r2 = r4.c     // Catch:{ all -> 0x002f }
            int r3 = r0.length     // Catch:{ all -> 0x002f }
            int r2 = r2 - r3
            r4.c = r2     // Catch:{ all -> 0x002f }
            java.util.List<byte[]> r2 = r4.b     // Catch:{ all -> 0x002f }
            r2.remove(r1)     // Catch:{ all -> 0x002f }
            java.util.List<byte[]> r1 = r4.a     // Catch:{ all -> 0x002f }
            r1.remove(r0)     // Catch:{ all -> 0x002f }
        L_0x0026:
            monitor-exit(r4)
            return r0
        L_0x0028:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0003
        L_0x002c:
            byte[] r0 = new byte[r5]     // Catch:{ all -> 0x002f }
            goto L_0x0026
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ik.a(int):byte[]");
    }
}
