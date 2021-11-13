package com.google.android.gms.internal;

import java.io.PrintWriter;
import java.util.List;

final class aet extends aeq {
    private final aer a = new aer();

    aet() {
    }

    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable printStackTrace : a2) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }
}
