package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public final class l {
    private static String a = null;
    private static final int b = Process.myPid();

    public static String a() {
        if (a == null) {
            a = a(b);
        }
        return a;
    }

    private static String a(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String str = null;
        if (i > 0) {
            try {
                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                bufferedReader = new BufferedReader(new FileReader(new StringBuilder(25).append("/proc/").append(i).append("/cmdline").toString()));
                try {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    str = bufferedReader.readLine().trim();
                    i.a(bufferedReader);
                } catch (IOException e) {
                    i.a(bufferedReader);
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    i.a(bufferedReader);
                    throw th;
                }
            } catch (IOException e2) {
                bufferedReader = null;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bufferedReader = null;
                th = th4;
                i.a(bufferedReader);
                throw th;
            }
        }
        return str;
    }
}
