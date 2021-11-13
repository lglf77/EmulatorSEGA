package com.google.android.gms.internal;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

@bfk
public final class ano {
    private final and a;
    private final int b;
    private String c;
    private String d;
    private final boolean e = false;
    private final int f;
    private final int g;

    public ano(int i, int i2, int i3) {
        this.b = i;
        if (i2 > 64 || i2 < 0) {
            this.f = 64;
        } else {
            this.f = i2;
        }
        if (i3 <= 0) {
            this.g = 1;
        } else {
            this.g = i3;
        }
        this.a = new anm(this.f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00dc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(java.lang.String r12, java.util.HashSet<java.lang.String> r13) {
        /*
            r11 = this;
            r10 = 32
            r3 = 1
            r1 = 0
            java.lang.String r0 = "\n"
            java.lang.String[] r6 = r12.split(r0)
            int r0 = r6.length
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            return r3
        L_0x000e:
            r0 = r1
        L_0x000f:
            int r2 = r6.length
            if (r0 >= r2) goto L_0x000d
            r5 = r6[r0]
            java.lang.String r2 = "'"
            int r2 = r5.indexOf(r2)
            r4 = -1
            if (r2 == r4) goto L_0x00e2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            r2 = r3
            r4 = r1
        L_0x0024:
            int r8 = r2 + 2
            int r9 = r7.length()
            if (r8 > r9) goto L_0x006d
            char r8 = r7.charAt(r2)
            r9 = 39
            if (r8 != r9) goto L_0x0066
            int r4 = r2 + -1
            char r4 = r7.charAt(r4)
            if (r4 == r10) goto L_0x0069
            int r4 = r2 + 1
            char r4 = r7.charAt(r4)
            r8 = 115(0x73, float:1.61E-43)
            if (r4 == r8) goto L_0x0050
            int r4 = r2 + 1
            char r4 = r7.charAt(r4)
            r8 = 83
            if (r4 != r8) goto L_0x0069
        L_0x0050:
            int r4 = r2 + 2
            int r8 = r7.length()
            if (r4 == r8) goto L_0x0060
            int r4 = r2 + 2
            char r4 = r7.charAt(r4)
            if (r4 != r10) goto L_0x0069
        L_0x0060:
            r7.insert(r2, r10)
            int r2 = r2 + 2
        L_0x0065:
            r4 = r3
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0024
        L_0x0069:
            r7.setCharAt(r2, r10)
            goto L_0x0065
        L_0x006d:
            if (r4 == 0) goto L_0x00a1
            java.lang.String r2 = r7.toString()
        L_0x0073:
            if (r2 == 0) goto L_0x00e2
            r11.d = r2
        L_0x0077:
            java.lang.String[] r7 = com.google.android.gms.internal.anh.a(r2, r3)
            int r2 = r7.length
            int r4 = r11.g
            if (r2 < r4) goto L_0x00dc
            r2 = r1
        L_0x0081:
            int r4 = r7.length
            if (r2 >= r4) goto L_0x00d1
            java.lang.String r4 = ""
            r5 = r1
        L_0x0087:
            int r8 = r11.g
            if (r5 >= r8) goto L_0x00e0
            int r8 = r2 + r5
            int r9 = r7.length
            if (r8 < r9) goto L_0x00a3
            r5 = r1
        L_0x0091:
            if (r5 == 0) goto L_0x00d1
            r13.add(r4)
            int r4 = r13.size()
            int r5 = r11.b
            if (r4 < r5) goto L_0x00ce
            r3 = r1
            goto L_0x000d
        L_0x00a1:
            r2 = 0
            goto L_0x0073
        L_0x00a3:
            if (r5 <= 0) goto L_0x00af
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r8 = " "
            java.lang.String r4 = r4.concat(r8)
        L_0x00af:
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r4 = r2 + r5
            r4 = r7[r4]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r9 = r4.length()
            if (r9 == 0) goto L_0x00c8
            java.lang.String r4 = r8.concat(r4)
        L_0x00c5:
            int r5 = r5 + 1
            goto L_0x0087
        L_0x00c8:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
            goto L_0x00c5
        L_0x00ce:
            int r2 = r2 + 1
            goto L_0x0081
        L_0x00d1:
            int r2 = r13.size()
            int r4 = r11.b
            if (r2 < r4) goto L_0x00dc
            r3 = r1
            goto L_0x000d
        L_0x00dc:
            int r0 = r0 + 1
            goto L_0x000f
        L_0x00e0:
            r5 = r3
            goto L_0x0091
        L_0x00e2:
            r2 = r5
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ano.a(java.lang.String, java.util.HashSet):boolean");
    }

    public final String a(ArrayList<String> arrayList, ArrayList<anc> arrayList2) {
        Collections.sort(arrayList2, new anp(this));
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList2.size() || !a(Normalizer.normalize(arrayList.get(arrayList2.get(i2).e()), Normalizer.Form.NFKC).toLowerCase(Locale.US), (HashSet<String>) hashSet)) {
                ang ang = new ang();
                this.c = "";
                Iterator it = hashSet.iterator();
            } else {
                i = i2 + 1;
            }
        }
        ang ang2 = new ang();
        this.c = "";
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            try {
                ang2.a(this.a.a((String) it2.next()));
            } catch (IOException e2) {
                fn.b("Error while writing hash to byteStream", e2);
            }
        }
        return ang2.toString();
    }
}
