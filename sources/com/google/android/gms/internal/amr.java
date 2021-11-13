package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import java.util.ArrayList;

@bfk
public final class amr {
    private final int a;
    private final int b;
    private final int c;
    private final ane d;
    private final ano e;
    private final Object f = new Object();
    private ArrayList<String> g = new ArrayList<>();
    private ArrayList<String> h = new ArrayList<>();
    private ArrayList<anc> i = new ArrayList<>();
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m;
    private String n = "";
    private String o = "";
    private String p = "";

    public amr(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = new ane(i5);
        this.e = new ano(i6, i7, i8);
    }

    private static String a(ArrayList<String> arrayList, int i2) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            stringBuffer.append((String) obj);
            stringBuffer.append(' ');
            if (stringBuffer.length() > 100) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= 100 ? stringBuffer2.substring(0, 100) : stringBuffer2;
    }

    private final void c(String str, boolean z, float f2, float f3, float f4, float f5) {
        if (str != null && str.length() >= this.c) {
            synchronized (this.f) {
                this.g.add(str);
                this.j += str.length();
                if (z) {
                    this.h.add(str);
                    this.i.add(new anc(f2, f3, f4, f5, this.h.size() - 1));
                }
            }
        }
    }

    public final void a(int i2) {
        this.k = i2;
    }

    public final void a(String str, boolean z, float f2, float f3, float f4, float f5) {
        c(str, z, f2, f3, f4, f5);
        synchronized (this.f) {
            if (this.l < 0) {
                fn.b("ActivityContent: negative number of WebViews.");
            }
            h();
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f) {
            z = this.l == 0;
        }
        return z;
    }

    public final String b() {
        return this.n;
    }

    public final void b(String str, boolean z, float f2, float f3, float f4, float f5) {
        c(str, z, f2, f3, f4, f5);
    }

    public final String c() {
        return this.o;
    }

    public final String d() {
        return this.p;
    }

    public final void e() {
        synchronized (this.f) {
            this.m -= 100;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        amr amr = (amr) obj;
        return amr.n != null && amr.n.equals(this.n);
    }

    public final void f() {
        synchronized (this.f) {
            this.l--;
        }
    }

    public final void g() {
        synchronized (this.f) {
            this.l++;
        }
    }

    public final void h() {
        synchronized (this.f) {
            int i2 = (this.j * this.a) + (this.k * this.b);
            if (i2 > this.m) {
                this.m = i2;
                if (((Boolean) app.f().a(asw.Q)).booleanValue() && !au.i().a()) {
                    this.n = this.d.a(this.g);
                    this.o = this.d.a(this.h);
                }
                if (((Boolean) app.f().a(asw.S)).booleanValue() && !au.i().b()) {
                    this.p = this.e.a(this.h, this.i);
                }
            }
        }
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final int i() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return this.j;
    }

    public final String toString() {
        int i2 = this.k;
        int i3 = this.m;
        int i4 = this.j;
        String a2 = a(this.g, 100);
        String a3 = a(this.h, 100);
        String str = this.n;
        String str2 = this.o;
        String str3 = this.p;
        return new StringBuilder(String.valueOf(a2).length() + 165 + String.valueOf(a3).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append("ActivityContent fetchId: ").append(i2).append(" score:").append(i3).append(" total_length:").append(i4).append("\n text: ").append(a2).append("\n viewableText").append(a3).append("\n signture: ").append(str).append("\n viewableSignture: ").append(str2).append("\n viewableSignatureForVertical: ").append(str3).toString();
    }
}
