package com.google.android.gms.internal;

import java.util.PriorityQueue;

@bfk
public final class ank {
    private static long a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        return i != 1 ? i % 2 == 0 ? a((j * j) % 1073807359, i / 2) % 1073807359 : ((a((j * j) % 1073807359, i / 2) % 1073807359) * j) % 1073807359 : j;
    }

    private static String a(String[] strArr, int i, int i2) {
        if (strArr.length < i + i2) {
            fn.c("Unable to construct shingle");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < (i + i2) - 1; i3++) {
            stringBuffer.append(strArr[i3]);
            stringBuffer.append(' ');
        }
        stringBuffer.append(strArr[(i + i2) - 1]);
        return stringBuffer.toString();
    }

    private static void a(int i, long j, String str, int i2, PriorityQueue<anl> priorityQueue) {
        anl anl = new anl(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().c <= anl.c && priorityQueue.peek().a <= anl.a)) && !priorityQueue.contains(anl)) {
            priorityQueue.add(anl);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void a(String[] strArr, int i, int i2, PriorityQueue<anl> priorityQueue) {
        if (strArr.length < i2) {
            a(i, b(strArr, 0, strArr.length), a(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long b = b(strArr, 0, i2);
        a(i, b, a(strArr, 0, i2), i2, priorityQueue);
        long a = a(16785407, i2 - 1);
        for (int i3 = 1; i3 < (strArr.length - i2) + 1; i3++) {
            long j = b + 1073807359;
            b = (((((j - ((((((long) anh.a(strArr[i3 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) anh.a(strArr[(i3 + i2) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            a(i, b, a(strArr, i3, i2), strArr.length, priorityQueue);
        }
    }

    private static long b(String[] strArr, int i, int i2) {
        long a = (((long) anh.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) anh.a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
