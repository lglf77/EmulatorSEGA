package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.internal.beq;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@bfk
public abstract class bdy<T extends beq> implements beq<T> {
    private final HashMap<String, List<aa<? super T>>> a = new HashMap<>();

    public void a(String str, aa<? super T> aaVar) {
        List list = this.a.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            this.a.put(str, list);
        }
        list.add(aaVar);
    }

    public void b(String str, aa<? super T> aaVar) {
        List list = this.a.get(str);
        if (list != null) {
            list.remove(aaVar);
        }
    }
}
