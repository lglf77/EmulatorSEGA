package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.bfk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

@bfk
public final class bk {
    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public static Object[] a(String str, aoy aoy, String str2, int i, apc apc) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add((Object) null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(aoy.b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(aoy.c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(aoy.d));
        }
        if (hashSet.contains("keywords")) {
            if (aoy.e != null) {
                arrayList.add(aoy.e.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(aoy.f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(aoy.g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(aoy.h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(aoy.i);
        }
        if (hashSet.contains("location")) {
            if (aoy.k != null) {
                arrayList.add(aoy.k.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(aoy.l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(aoy.m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(aoy.n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (aoy.o != null) {
                arrayList.add(aoy.o.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(aoy.p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(aoy.q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(aoy.r));
        }
        return arrayList.toArray();
    }
}
