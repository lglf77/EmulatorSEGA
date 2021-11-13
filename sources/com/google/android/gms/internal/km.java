package com.google.android.gms.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class km implements pc {
    private final Map<String, ln> a;
    private long b;
    private final File c;
    private final int d;

    public km(File file) {
        this(file, 5242880);
    }

    private km(File file, int i) {
        this.a = new LinkedHashMap(16, 0.75f, true);
        this.b = 0;
        this.c = file;
        this.d = 5242880;
    }

    static int a(InputStream inputStream) {
        return c(inputStream) | 0 | (c(inputStream) << 8) | (c(inputStream) << 16) | (c(inputStream) << 24);
    }

    private static InputStream a(File file) {
        return new FileInputStream(file);
    }

    static String a(mo moVar) {
        return new String(a(moVar, b((InputStream) moVar)), "UTF-8");
    }

    static void a(OutputStream outputStream, int i) {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    static void a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private final void a(String str, ln lnVar) {
        if (!this.a.containsKey(str)) {
            this.b += lnVar.a;
        } else {
            this.b = (lnVar.a - this.a.get(str).a) + this.b;
        }
        this.a.put(str, lnVar);
    }

    private static byte[] a(mo moVar, long j) {
        long a2 = moVar.a();
        if (j < 0 || j > a2 || ((long) ((int) j)) != j) {
            throw new IOException(new StringBuilder(73).append("streamToBytes length=").append(j).append(", maxLength=").append(a2).toString());
        }
        byte[] bArr = new byte[((int) j)];
        new DataInputStream(moVar).readFully(bArr);
        return bArr;
    }

    static long b(InputStream inputStream) {
        return 0 | (((long) c(inputStream)) & 255) | ((((long) c(inputStream)) & 255) << 8) | ((((long) c(inputStream)) & 255) << 16) | ((((long) c(inputStream)) & 255) << 24) | ((((long) c(inputStream)) & 255) << 32) | ((((long) c(inputStream)) & 255) << 40) | ((((long) c(inputStream)) & 255) << 48) | ((((long) c(inputStream)) & 255) << 56);
    }

    static List<aqo> b(mo moVar) {
        int a2 = a((InputStream) moVar);
        List<aqo> emptyList = a2 == 0 ? Collections.emptyList() : new ArrayList<>(a2);
        for (int i = 0; i < a2; i++) {
            emptyList.add(new aqo(a(moVar).intern(), a(moVar).intern()));
        }
        return emptyList;
    }

    private final synchronized void b(String str) {
        boolean delete = d(str).delete();
        e(str);
        if (!delete) {
            df.b("Could not delete cache entry for key=%s, filename=%s", str, c(str));
        }
    }

    private static int c(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static String c(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File d(String str) {
        return new File(this.c, c(str));
    }

    private final void e(String str) {
        ln remove = this.a.remove(str);
        if (remove != null) {
            this.b -= remove.a;
        }
    }

    public final synchronized qe a(String str) {
        qe qeVar;
        mo moVar;
        ln lnVar = this.a.get(str);
        if (lnVar == null) {
            qeVar = null;
        } else {
            File d2 = d(str);
            try {
                moVar = new mo(new BufferedInputStream(a(d2)), d2.length());
                ln a2 = ln.a(moVar);
                if (!TextUtils.equals(str, a2.b)) {
                    df.b("%s: key=%s, found=%s", d2.getAbsolutePath(), str, a2.b);
                    e(str);
                    moVar.close();
                    qeVar = null;
                } else {
                    byte[] a3 = a(moVar, moVar.a());
                    qe qeVar2 = new qe();
                    qeVar2.a = a3;
                    qeVar2.b = lnVar.c;
                    qeVar2.c = lnVar.d;
                    qeVar2.d = lnVar.e;
                    qeVar2.e = lnVar.f;
                    qeVar2.f = lnVar.g;
                    qeVar2.g = np.a(lnVar.h);
                    qeVar2.h = Collections.unmodifiableList(lnVar.h);
                    moVar.close();
                    qeVar = qeVar2;
                }
            } catch (IOException e) {
                df.b("%s: %s", d2.getAbsolutePath(), e.toString());
                b(str);
                qeVar = null;
            } catch (Throwable th) {
                moVar.close();
                throw th;
            }
        }
        return qeVar;
    }

    public final synchronized void a() {
        mo moVar;
        if (this.c.exists()) {
            File[] listFiles = this.c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        moVar = new mo(new BufferedInputStream(a(file)), length);
                        ln a2 = ln.a(moVar);
                        a2.a = length;
                        a(a2.b, a2);
                        moVar.close();
                    } catch (IOException e) {
                        file.delete();
                    } catch (Throwable th) {
                        moVar.close();
                        throw th;
                    }
                }
            }
        } else if (!this.c.mkdirs()) {
            df.c("Unable to create cache dir %s", this.c.getAbsolutePath());
        }
    }

    public final synchronized void a(String str, qe qeVar) {
        int i;
        int i2 = 0;
        synchronized (this) {
            int length = qeVar.a.length;
            if (this.b + ((long) length) >= ((long) this.d)) {
                if (df.a) {
                    df.a("Pruning old cache entries.", new Object[0]);
                }
                long j = this.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator<Map.Entry<String, ln>> it = this.a.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = i2;
                        break;
                    }
                    ln lnVar = (ln) it.next().getValue();
                    if (d(lnVar.b).delete()) {
                        this.b -= lnVar.a;
                    } else {
                        df.b("Could not delete cache entry for key=%s, filename=%s", lnVar.b, c(lnVar.b));
                    }
                    it.remove();
                    i = i2 + 1;
                    if (((float) (this.b + ((long) length))) < ((float) this.d) * 0.9f) {
                        break;
                    }
                    i2 = i;
                }
                if (df.a) {
                    df.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                }
            }
            File d2 = d(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d2));
                ln lnVar2 = new ln(str, qeVar);
                if (!lnVar2.a((OutputStream) bufferedOutputStream)) {
                    bufferedOutputStream.close();
                    df.b("Failed to write header for %s", d2.getAbsolutePath());
                    throw new IOException();
                }
                bufferedOutputStream.write(qeVar.a);
                bufferedOutputStream.close();
                a(str, lnVar2);
            } catch (IOException e) {
                if (!d2.delete()) {
                    df.b("Could not clean up file %s", d2.getAbsolutePath());
                }
            }
        }
    }
}
