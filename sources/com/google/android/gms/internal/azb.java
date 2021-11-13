package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;
import java.util.Iterator;
import java.util.LinkedList;

@bfk
final class azb {
    private final LinkedList<azc> a = new LinkedList<>();
    /* access modifiers changed from: private */
    public aoy b;
    /* access modifiers changed from: private */
    public final String c;
    private final int d;
    private boolean e;

    azb(aoy aoy, String str, int i) {
        y.a(aoy);
        y.a(str);
        this.b = aoy;
        this.c = str;
        this.d = i;
    }

    /* access modifiers changed from: package-private */
    public final aoy a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final azc a(aoy aoy) {
        if (aoy != null) {
            this.b = aoy;
        }
        return this.a.remove();
    }

    /* access modifiers changed from: package-private */
    public final void a(axv axv, aoy aoy) {
        this.a.add(new azc(this, axv, aoy));
    }

    /* access modifiers changed from: package-private */
    public final boolean a(axv axv) {
        azc azc = new azc(this, axv);
        this.a.add(azc);
        return azc.a();
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.a.size();
    }

    /* access modifiers changed from: package-private */
    public final int e() {
        int i = 0;
        Iterator it = this.a.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = ((azc) it.next()).e ? i2 + 1 : i2;
        }
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        int i = 0;
        Iterator it = this.a.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = ((azc) it.next()).a() ? i2 + 1 : i2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.e = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        return this.e;
    }
}
