package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.v;
import java.lang.reflect.Array;
import java.util.Arrays;

public final class a {
    public static <T> T[] a(T[] tArr, T... tArr2) {
        int i;
        int i2;
        int i3;
        if (tArr == null) {
            return null;
        }
        if (tArr2.length == 0) {
            return Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length);
        if (tArr2.length == 1) {
            int length = tArr.length;
            int i4 = 0;
            i = 0;
            while (i4 < length) {
                T t = tArr[i4];
                if (!v.a(tArr2[0], t)) {
                    i3 = i + 1;
                    tArr3[i] = t;
                } else {
                    i3 = i;
                }
                i4++;
                i = i3;
            }
        } else {
            int length2 = tArr.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length2) {
                T t2 = tArr[i5];
                int length3 = tArr2.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length3) {
                        i7 = -1;
                        break;
                    } else if (v.a(tArr2[i7], t2)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (!(i7 >= 0)) {
                    i2 = i + 1;
                    tArr3[i] = t2;
                } else {
                    i2 = i;
                }
                i5++;
                i6 = i2;
            }
        }
        if (tArr3 == null) {
            return null;
        }
        return i != tArr3.length ? Arrays.copyOf(tArr3, i) : tArr3;
    }
}
