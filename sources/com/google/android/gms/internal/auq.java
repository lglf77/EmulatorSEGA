package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class auq {
    public final int a;
    public final byte[] b;
    public final Map<String, String> c;
    public final List<aqo> d;
    public final boolean e;
    private long f;

    private auq(int i, byte[] bArr, Map<String, String> map, List<aqo> list, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        if (list == null) {
            this.d = null;
        } else {
            this.d = Collections.unmodifiableList(list);
        }
        this.e = z;
        this.f = j;
    }

    @Deprecated
    public auq(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, a(map), z, j);
    }

    public auq(int i, byte[] bArr, boolean z, long j, List<aqo> list) {
        this(i, bArr, a(list), list, z, j);
    }

    @Deprecated
    public auq(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }

    private static List<aqo> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new aqo((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    private static Map<String, String> a(List<aqo> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (aqo next : list) {
            treeMap.put(next.a(), next.b());
        }
        return treeMap;
    }
}
