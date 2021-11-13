package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@bfk
public final class ane {
    private final int a;
    private final int b;
    private final int c;
    private final and d = new ani();

    public ane(int i) {
        this.b = i;
        this.a = 6;
        this.c = 0;
    }

    private final String a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        ang ang = new ang();
        PriorityQueue priorityQueue = new PriorityQueue(this.b, new anf(this));
        for (String a2 : split) {
            String[] a3 = anh.a(a2, false);
            if (a3.length != 0) {
                ank.a(a3, this.b, this.a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ang.a(this.d.a(((anl) it.next()).b));
            } catch (IOException e) {
                fn.b("Error while writing hash to byteStream", e);
            }
        }
        return ang.toString();
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            stringBuffer.append(((String) obj).toLowerCase(Locale.US));
            stringBuffer.append(10);
        }
        return a(stringBuffer.toString());
    }
}
