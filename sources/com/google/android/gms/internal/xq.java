package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class xq extends xp {
    private xq(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static xq a(String str, Context context, boolean z) {
        a(context, z);
        return new xq(context, str, z);
    }

    /* access modifiers changed from: protected */
    public final List<Callable<Void>> a(yj yjVar, pb pbVar, oy oyVar) {
        if (yjVar.c() == null || !this.q) {
            return super.a(yjVar, pbVar, oyVar);
        }
        int n = yjVar.n();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.a(yjVar, pbVar, oyVar));
        arrayList.add(new afd(yjVar, "VywbbfxE2QuRqZ5xcIwapO7AdSzfVaSWnmJxmUg+0adJ3QBAH5P7EgXr1uzyY+u6", "JgKAyQW0PWqOrZHk4ZNT0IJH02FdSWTXOOjBnF9RRok=", pbVar, n, 24));
        return arrayList;
    }
}
