package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class df {
    public static boolean a = Log.isLoggable("Volley", 2);
    private static String b = "Volley";

    static class a {
        public static final boolean a = df.a;
        private final List<eg> b = new ArrayList();
        private boolean c = false;

        a() {
        }

        public final synchronized void a(String str) {
            long j;
            this.c = true;
            if (this.b.size() == 0) {
                j = 0;
            } else {
                j = this.b.get(this.b.size() - 1).c - this.b.get(0).c;
            }
            if (j > 0) {
                long j2 = this.b.get(0).c;
                df.b("(%-4d ms) %s", Long.valueOf(j), str);
                long j3 = j2;
                for (eg next : this.b) {
                    long j4 = next.c;
                    df.b("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(next.b), next.a);
                    j3 = j4;
                }
            }
        }

        public final synchronized void a(String str, long j) {
            if (this.c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.b.add(new eg(str, j, SystemClock.elapsedRealtime()));
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            if (!this.c) {
                a("Request on the loose");
                df.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        if (a) {
            Log.v(b, d(str, objArr));
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(b, d(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        Log.d(b, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(b, d(str, objArr));
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClass().equals(df.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                str2 = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length()).append(substring2).append(".").append(methodName).toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
