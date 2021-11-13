package com.google.android.gms.common.util;

import android.support.v4.c.b;
import com.google.android.gms.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class e {
    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        Map b = b(3, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        return Collections.unmodifiableMap(b);
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map b = b(6, false);
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        b.put(k4, v4);
        b.put(k5, v5);
        b.put(k6, v6);
        return Collections.unmodifiableMap(b);
    }

    private static <T> Set<T> a(int i, boolean z) {
        return i <= 256 ? new b(i) : new HashSet(i, 1.0f);
    }

    public static <T> Set<T> a(T t, T t2, T t3) {
        Set a = a(3, false);
        a.add(t);
        a.add(t2);
        a.add(t3);
        return Collections.unmodifiableSet(a);
    }

    public static <T> Set<T> a(T... tArr) {
        switch (tArr.length) {
            case a.b.AdsAttrs_adSize:
                return Collections.emptySet();
            case a.b.AdsAttrs_adSizes:
                return Collections.singleton(tArr[0]);
            case 2:
                T t = tArr[0];
                T t2 = tArr[1];
                Set a = a(2, false);
                a.add(t);
                a.add(t2);
                return Collections.unmodifiableSet(a);
            case 3:
                return a(tArr[0], tArr[1], tArr[2]);
            case 4:
                T t3 = tArr[0];
                T t4 = tArr[1];
                T t5 = tArr[2];
                T t6 = tArr[3];
                Set a2 = a(4, false);
                a2.add(t3);
                a2.add(t4);
                a2.add(t5);
                a2.add(t6);
                return Collections.unmodifiableSet(a2);
            default:
                Set a3 = a(tArr.length, false);
                Collections.addAll(a3, tArr);
                return Collections.unmodifiableSet(a3);
        }
    }

    private static <K, V> Map<K, V> b(int i, boolean z) {
        return i <= 256 ? new android.support.v4.c.a(i) : new HashMap(i, 1.0f);
    }
}
