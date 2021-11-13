package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

final class ln {
    long a;
    final String b;
    final String c;
    final long d;
    final long e;
    final long f;
    final long g;
    final List<aqo> h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    ln(String str, qe qeVar) {
        this(str, qeVar.b, qeVar.c, qeVar.d, qeVar.e, qeVar.f, qeVar.h != null ? qeVar.h : np.b(qeVar.g));
        this.a = (long) qeVar.a.length;
    }

    private ln(String str, String str2, long j, long j2, long j3, long j4, List<aqo> list) {
        this.b = str;
        this.c = "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    static ln a(mo moVar) {
        if (km.a((InputStream) moVar) == 538247942) {
            return new ln(km.a(moVar), km.a(moVar), km.b((InputStream) moVar), km.b((InputStream) moVar), km.b((InputStream) moVar), km.b((InputStream) moVar), km.b(moVar));
        }
        throw new IOException();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(OutputStream outputStream) {
        try {
            km.a(outputStream, 538247942);
            km.a(outputStream, this.b);
            km.a(outputStream, this.c == null ? "" : this.c);
            km.a(outputStream, this.d);
            km.a(outputStream, this.e);
            km.a(outputStream, this.f);
            km.a(outputStream, this.g);
            List<aqo> list = this.h;
            if (list != null) {
                km.a(outputStream, list.size());
                for (aqo next : list) {
                    km.a(outputStream, next.a());
                    km.a(outputStream, next.b());
                }
            } else {
                km.a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e2) {
            df.b("%s", e2.toString());
            return false;
        }
    }
}
