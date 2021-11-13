package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@bfk
public final class mn implements Iterable<ml> {
    private final List<ml> a = new LinkedList();

    public static boolean a(md mdVar) {
        ml b = b(mdVar);
        if (b == null) {
            return false;
        }
        b.b.a();
        return true;
    }

    static ml b(md mdVar) {
        Iterator<ml> it = au.x().iterator();
        while (it.hasNext()) {
            ml next = it.next();
            if (next.a == mdVar) {
                return next;
            }
        }
        return null;
    }

    public final int a() {
        return this.a.size();
    }

    public final void a(ml mlVar) {
        this.a.add(mlVar);
    }

    public final void b(ml mlVar) {
        this.a.remove(mlVar);
    }

    public final Iterator<ml> iterator() {
        return this.a.iterator();
    }
}
