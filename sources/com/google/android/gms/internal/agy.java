package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.aha;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class agy<FieldDescriptorType extends aha<FieldDescriptorType>> {
    private static final agy d = new agy(true);
    private final air<FieldDescriptorType, Object> a = air.a(16);
    private boolean b;
    private boolean c = false;

    private agy() {
    }

    private agy(boolean z) {
        if (!this.b) {
            this.a.a();
            this.b = true;
        }
    }

    static int a(ajp ajp, int i, Object obj) {
        int i2;
        int d2 = agq.d(i);
        if (ajp == ajp.GROUP) {
            ahe.a((aid) obj);
            i2 = d2 << 1;
        } else {
            i2 = d2;
        }
        return i2 + b(ajp, obj);
    }

    private static int a(Map.Entry<FieldDescriptorType, Object> entry) {
        aha aha = (aha) entry.getKey();
        Object value = entry.getValue();
        return (aha.c() != aju.MESSAGE || aha.d() || aha.e()) ? b((aha<?>) aha, value) : value instanceof ahk ? agq.b(((aha) entry.getKey()).a(), (aho) (ahk) value) : agq.d(((aha) entry.getKey()).a(), (aid) value);
    }

    public static <T extends aha<T>> agy<T> a() {
        return new agy<>();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(FieldDescriptorType r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7.d()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r8 instanceof java.util.List
            if (r0 != 0) goto L_0x0012
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Wrong object type used with protocol message reflection."
            r0.<init>(r1)
            throw r0
        L_0x0012:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r8 = (java.util.List) r8
            r1.addAll(r8)
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            r2 = 0
        L_0x0024:
            if (r2 >= r3) goto L_0x003c
            java.lang.Object r4 = r0.get(r2)
            int r2 = r2 + 1
            com.google.android.gms.internal.ajp r5 = r7.b()
            a((com.google.android.gms.internal.ajp) r5, (java.lang.Object) r4)
            goto L_0x0024
        L_0x0034:
            com.google.android.gms.internal.ajp r0 = r7.b()
            a((com.google.android.gms.internal.ajp) r0, (java.lang.Object) r8)
            r1 = r8
        L_0x003c:
            boolean r0 = r1 instanceof com.google.android.gms.internal.ahk
            if (r0 == 0) goto L_0x0043
            r0 = 1
            r6.c = r0
        L_0x0043:
            com.google.android.gms.internal.air<FieldDescriptorType, java.lang.Object> r0 = r6.a
            r0.put(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.agy.a(com.google.android.gms.internal.aha, java.lang.Object):void");
    }

    private static void a(ajp ajp, Object obj) {
        boolean z = false;
        ahe.a(obj);
        switch (agz.a[ajp.a().ordinal()]) {
            case a.b.AdsAttrs_adSizes:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof age) || (obj instanceof byte[])) {
                    z = true;
                    break;
                }
            case 8:
                if ((obj instanceof Integer) || (obj instanceof ahf)) {
                    z = true;
                    break;
                }
            case 9:
                if ((obj instanceof aid) || (obj instanceof ahk)) {
                    z = true;
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static int b(aha<?> aha, Object obj) {
        int i = 0;
        ajp b2 = aha.b();
        int a2 = aha.a();
        if (!aha.d()) {
            return a(b2, a2, obj);
        }
        if (aha.e()) {
            for (Object b3 : (List) obj) {
                i += b(b2, b3);
            }
            return agq.k(i) + agq.d(a2) + i;
        }
        for (Object a3 : (List) obj) {
            i += a(b2, a2, a3);
        }
        return i;
    }

    private static int b(ajp ajp, Object obj) {
        switch (agz.b[ajp.ordinal()]) {
            case a.b.AdsAttrs_adSizes:
                return agq.a(((Double) obj).doubleValue());
            case 2:
                return agq.a(((Float) obj).floatValue());
            case 3:
                return agq.c(((Long) obj).longValue());
            case 4:
                return agq.d(((Long) obj).longValue());
            case 5:
                return agq.e(((Integer) obj).intValue());
            case 6:
                return agq.f(((Long) obj).longValue());
            case 7:
                return agq.h(((Integer) obj).intValue());
            case 8:
                return agq.a(((Boolean) obj).booleanValue());
            case 9:
                return agq.c((aid) obj);
            case 10:
                return obj instanceof ahk ? agq.a((aho) (ahk) obj) : agq.b((aid) obj);
            case 11:
                return obj instanceof age ? agq.b((age) obj) : agq.b((String) obj);
            case 12:
                return obj instanceof age ? agq.b((age) obj) : agq.b((byte[]) obj);
            case 13:
                return agq.f(((Integer) obj).intValue());
            case 14:
                return agq.i(((Integer) obj).intValue());
            case 15:
                return agq.g(((Long) obj).longValue());
            case 16:
                return agq.g(((Integer) obj).intValue());
            case 17:
                return agq.e(((Long) obj).longValue());
            case 18:
                return obj instanceof ahf ? agq.j(((ahf) obj).a()) : agq.j(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> b() {
        return this.c ? new ahn(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final int c() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.c(); i2++) {
            i += a(this.a.b(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> a2 : this.a.d()) {
            i += a(a2);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        agy agy = new agy();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.c()) {
                break;
            }
            Map.Entry<FieldDescriptorType, Object> b2 = this.a.b(i2);
            agy.a((aha) b2.getKey(), b2.getValue());
            i = i2 + 1;
        }
        for (Map.Entry next : this.a.d()) {
            agy.a((aha) next.getKey(), next.getValue());
        }
        agy.c = this.c;
        return agy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agy)) {
            return false;
        }
        return this.a.equals(((agy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
