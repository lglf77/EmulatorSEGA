package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.i;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class yj {
    private static final String b = yj.class.getSimpleName();
    protected Context a;
    private ExecutorService c;
    private DexClassLoader d;
    private xt e;
    private byte[] f;
    private volatile com.google.android.gms.ads.c.a g = null;
    private volatile boolean h = false;
    private Future i = null;
    private boolean j;
    /* access modifiers changed from: private */
    public volatile pb k = null;
    private Future l = null;
    private xl m;
    private boolean n = false;
    private boolean o = false;
    private Map<Pair<String, String>, afr> p;
    private boolean q = false;
    /* access modifiers changed from: private */
    public boolean r = true;
    private boolean s = false;

    final class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(yj yjVar, yk ykVar) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                boolean unused = yj.this.r = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = yj.this.r = false;
            }
        }
    }

    private yj(Context context) {
        boolean z = true;
        Context applicationContext = context.getApplicationContext();
        this.j = applicationContext == null ? false : z;
        this.a = this.j ? applicationContext : context;
        this.p = new HashMap();
    }

    public static yj a(Context context, String str, String str2, boolean z) {
        File file;
        File file2;
        boolean z2 = true;
        yj yjVar = new yj(context);
        try {
            yjVar.c = Executors.newCachedThreadPool();
            yjVar.h = z;
            if (z) {
                yjVar.i = yjVar.c.submit(new yk(yjVar));
            }
            yjVar.c.execute(new ym(yjVar));
            try {
                i a2 = i.a();
                yjVar.n = i.b(yjVar.a) > 0;
                if (a2.a(yjVar.a) != 0) {
                    z2 = false;
                }
                yjVar.o = z2;
            } catch (Throwable th) {
            }
            yjVar.a(0, true);
            if (zz.b()) {
                if (((Boolean) app.f().a(asw.bz)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            yjVar.e = new xt((SecureRandom) null);
            yjVar.f = yjVar.e.a(str);
            File cacheDir = yjVar.a.getCacheDir();
            if (cacheDir == null && (cacheDir = yjVar.a.getDir("dex", 0)) == null) {
                throw new yg();
            }
            file = cacheDir;
            file2 = new File(String.format("%s/%s.jar", new Object[]{file, "1505450608132"}));
            if (!file2.exists()) {
                byte[] a3 = yjVar.e.a(yjVar.f, str2);
                file2.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(a3, 0, a3.length);
                fileOutputStream.close();
            }
            yjVar.b(file, "1505450608132");
            yjVar.d = new DexClassLoader(file2.getAbsolutePath(), file.getAbsolutePath(), (String) null, yjVar.a.getClassLoader());
            a(file2);
            yjVar.a(file, "1505450608132");
            a(String.format("%s/%s.dex", new Object[]{file, "1505450608132"}));
            if (((Boolean) app.f().a(asw.br)).booleanValue() && !yjVar.s) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                yjVar.a.registerReceiver(new a(yjVar, (yk) null), intentFilter);
                yjVar.s = true;
            }
            yjVar.m = new xl(yjVar);
            yjVar.q = true;
            return yjVar;
        } catch (xu e2) {
            throw new yg(e2);
        } catch (FileNotFoundException e3) {
            throw new yg(e3);
        } catch (IOException e4) {
            throw new yg(e4);
        } catch (xu e5) {
            throw new yg(e5);
        } catch (NullPointerException e6) {
            throw new yg(e6);
        } catch (yg e7) {
        } catch (Throwable th2) {
            a(file2);
            yjVar.a(file, "1505450608132");
            a(String.format("%s/%s.dex", new Object[]{file, "1505450608132"}));
            throw th2;
        }
    }

    private static void a(File file) {
        if (!file.exists()) {
            Log.d(b, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b A[SYNTHETIC, Splitter:B:27:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0 A[SYNTHETIC, Splitter:B:30:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac A[SYNTHETIC, Splitter:B:36:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1 A[SYNTHETIC, Splitter:B:39:0x00b1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.io.File r12, java.lang.String r13) {
        /*
            r11 = this;
            r1 = 0
            r7 = 2
            r6 = 1
            r5 = 0
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "%s/%s.tmp"
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r5] = r12
            r2[r6] = r13
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r3.<init>(r0)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            java.io.File r4 = new java.io.File
            java.lang.String r0 = "%s/%s.dex"
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r5] = r12
            r2[r6] = r13
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r4.<init>(r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x001b
            long r6 = r4.length()
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x001b
            int r0 = (int) r6
            byte[] r0 = new byte[r0]
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00d4, NoSuchAlgorithmException -> 0x0097, xu -> 0x00de, all -> 0x00a8 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x00d4, NoSuchAlgorithmException -> 0x0097, xu -> 0x00de, all -> 0x00a8 }
            int r5 = r2.read(r0)     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            if (r5 > 0) goto L_0x0052
            r2.close()     // Catch:{ IOException -> 0x00b8 }
        L_0x004e:
            a((java.io.File) r4)
            goto L_0x001b
        L_0x0052:
            com.google.android.gms.internal.pg r5 = new com.google.android.gms.internal.pg     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            r5.<init>()     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            byte[] r6 = r6.getBytes()     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            r5.d = r6     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            byte[] r6 = r13.getBytes()     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            r5.c = r6     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            com.google.android.gms.internal.xt r6 = r11.e     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            byte[] r7 = r11.f     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            java.lang.String r0 = r6.a((byte[]) r7, (byte[]) r0)     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            r5.a = r0     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            byte[] r0 = com.google.android.gms.internal.qa.a((byte[]) r0)     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            r5.b = r0     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            r3.createNewFile()     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x00d7, NoSuchAlgorithmException -> 0x00cd, xu -> 0x00e1, all -> 0x00c6 }
            byte[] r1 = com.google.android.gms.internal.akf.a((com.google.android.gms.internal.akf) r5)     // Catch:{ IOException -> 0x00db, NoSuchAlgorithmException -> 0x00d1, xu -> 0x00e5, all -> 0x00c8 }
            r3 = 0
            int r5 = r1.length     // Catch:{ IOException -> 0x00db, NoSuchAlgorithmException -> 0x00d1, xu -> 0x00e5, all -> 0x00c8 }
            r0.write(r1, r3, r5)     // Catch:{ IOException -> 0x00db, NoSuchAlgorithmException -> 0x00d1, xu -> 0x00e5, all -> 0x00c8 }
            r0.close()     // Catch:{ IOException -> 0x00db, NoSuchAlgorithmException -> 0x00d1, xu -> 0x00e5, all -> 0x00c8 }
            r2.close()     // Catch:{ IOException -> 0x00ba }
        L_0x0090:
            r0.close()     // Catch:{ IOException -> 0x00bc }
        L_0x0093:
            a((java.io.File) r4)
            goto L_0x001b
        L_0x0097:
            r0 = move-exception
            r0 = r1
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.close()     // Catch:{ IOException -> 0x00be }
        L_0x009e:
            if (r0 == 0) goto L_0x00a3
            r0.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00a3:
            a((java.io.File) r4)
            goto L_0x001b
        L_0x00a8:
            r0 = move-exception
            r2 = r1
        L_0x00aa:
            if (r2 == 0) goto L_0x00af
            r2.close()     // Catch:{ IOException -> 0x00c2 }
        L_0x00af:
            if (r1 == 0) goto L_0x00b4
            r1.close()     // Catch:{ IOException -> 0x00c4 }
        L_0x00b4:
            a((java.io.File) r4)
            throw r0
        L_0x00b8:
            r0 = move-exception
            goto L_0x004e
        L_0x00ba:
            r1 = move-exception
            goto L_0x0090
        L_0x00bc:
            r0 = move-exception
            goto L_0x0093
        L_0x00be:
            r1 = move-exception
            goto L_0x009e
        L_0x00c0:
            r0 = move-exception
            goto L_0x00a3
        L_0x00c2:
            r2 = move-exception
            goto L_0x00af
        L_0x00c4:
            r1 = move-exception
            goto L_0x00b4
        L_0x00c6:
            r0 = move-exception
            goto L_0x00aa
        L_0x00c8:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x00aa
        L_0x00cd:
            r0 = move-exception
            r0 = r1
            r1 = r2
            goto L_0x0099
        L_0x00d1:
            r1 = move-exception
            r1 = r2
            goto L_0x0099
        L_0x00d4:
            r0 = move-exception
            r0 = r1
            goto L_0x0099
        L_0x00d7:
            r0 = move-exception
            r0 = r1
            r1 = r2
            goto L_0x0099
        L_0x00db:
            r1 = move-exception
            r1 = r2
            goto L_0x0099
        L_0x00de:
            r0 = move-exception
            r0 = r1
            goto L_0x0099
        L_0x00e1:
            r0 = move-exception
            r0 = r1
            r1 = r2
            goto L_0x0099
        L_0x00e5:
            r1 = move-exception
            r1 = r2
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.yj.a(java.io.File, java.lang.String):void");
    }

    private static void a(String str) {
        a(new File(str));
    }

    /* access modifiers changed from: private */
    public static boolean b(int i2, pb pbVar) {
        if (i2 < 4) {
            if (pbVar == null) {
                return true;
            }
            if (((Boolean) app.f().a(asw.bC)).booleanValue() && (pbVar.n == null || pbVar.n.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) app.f().a(asw.bD)).booleanValue() && (pbVar.W == null || pbVar.W.a == null || pbVar.W.a.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9 A[SYNTHETIC, Splitter:B:42:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce A[SYNTHETIC, Splitter:B:45:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d8 A[SYNTHETIC, Splitter:B:51:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dd A[SYNTHETIC, Splitter:B:54:0x00dd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(java.io.File r13, java.lang.String r14) {
        /*
            r12 = this;
            r3 = 0
            r7 = 2
            r1 = 1
            r2 = 0
            java.io.File r5 = new java.io.File
            java.lang.String r0 = "%s/%s.tmp"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r2] = r13
            r4[r1] = r14
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r5.<init>(r0)
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x001d
            r0 = r2
        L_0x001c:
            return r0
        L_0x001d:
            java.io.File r6 = new java.io.File
            java.lang.String r0 = "%s/%s.dex"
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r2] = r13
            r4[r1] = r14
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r6.<init>(r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0036
            r0 = r2
            goto L_0x001c
        L_0x0036:
            long r8 = r5.length()     // Catch:{ IOException -> 0x00ff, NoSuchAlgorithmException -> 0x00c4, xu -> 0x010a, all -> 0x00d4 }
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0045
            a((java.io.File) r5)     // Catch:{ IOException -> 0x00ff, NoSuchAlgorithmException -> 0x00c4, xu -> 0x010a, all -> 0x00d4 }
            r0 = r2
            goto L_0x001c
        L_0x0045:
            int r0 = (int) r8     // Catch:{ IOException -> 0x00ff, NoSuchAlgorithmException -> 0x00c4, xu -> 0x010a, all -> 0x00d4 }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x00ff, NoSuchAlgorithmException -> 0x00c4, xu -> 0x010a, all -> 0x00d4 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00ff, NoSuchAlgorithmException -> 0x00c4, xu -> 0x010a, all -> 0x00d4 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x00ff, NoSuchAlgorithmException -> 0x00c4, xu -> 0x010a, all -> 0x00d4 }
            int r7 = r4.read(r0)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            if (r7 > 0) goto L_0x0062
            java.lang.String r0 = b     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r0, r1)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            a((java.io.File) r5)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            r4.close()     // Catch:{ IOException -> 0x00e1 }
        L_0x0060:
            r0 = r2
            goto L_0x001c
        L_0x0062:
            com.google.android.gms.internal.pg r7 = new com.google.android.gms.internal.pg     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            r7.<init>()     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            com.google.android.gms.internal.akf r0 = com.google.android.gms.internal.akf.a(r7, r0)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            com.google.android.gms.internal.pg r0 = (com.google.android.gms.internal.pg) r0     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            byte[] r8 = r0.c     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            boolean r7 = r14.equals(r7)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            if (r7 == 0) goto L_0x0096
            byte[] r7 = r0.b     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            byte[] r8 = r0.a     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            byte[] r8 = com.google.android.gms.internal.qa.a((byte[]) r8)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            boolean r7 = java.util.Arrays.equals(r7, r8)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            if (r7 == 0) goto L_0x0096
            byte[] r7 = r0.d     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            java.lang.String r8 = android.os.Build.VERSION.SDK     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            byte[] r8 = r8.getBytes()     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            boolean r7 = java.util.Arrays.equals(r7, r8)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            if (r7 != 0) goto L_0x009f
        L_0x0096:
            a((java.io.File) r5)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            r4.close()     // Catch:{ IOException -> 0x00e4 }
        L_0x009c:
            r0 = r2
            goto L_0x001c
        L_0x009f:
            com.google.android.gms.internal.xt r5 = r12.e     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            byte[] r7 = r12.f     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            java.lang.String r8 = new java.lang.String     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            byte[] r0 = r0.a     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            byte[] r5 = r5.a((byte[]) r7, (java.lang.String) r8)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            r6.createNewFile()     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0103, NoSuchAlgorithmException -> 0x00f8, xu -> 0x010e, all -> 0x00f2 }
            r3 = 0
            int r6 = r5.length     // Catch:{ IOException -> 0x0107, NoSuchAlgorithmException -> 0x00fc, xu -> 0x0112, all -> 0x00f4 }
            r0.write(r5, r3, r6)     // Catch:{ IOException -> 0x0107, NoSuchAlgorithmException -> 0x00fc, xu -> 0x0112, all -> 0x00f4 }
            r4.close()     // Catch:{ IOException -> 0x00e6 }
        L_0x00be:
            r0.close()     // Catch:{ IOException -> 0x00e8 }
        L_0x00c1:
            r0 = r1
            goto L_0x001c
        L_0x00c4:
            r0 = move-exception
            r0 = r3
            r1 = r3
        L_0x00c7:
            if (r1 == 0) goto L_0x00cc
            r1.close()     // Catch:{ IOException -> 0x00ea }
        L_0x00cc:
            if (r0 == 0) goto L_0x00d1
            r0.close()     // Catch:{ IOException -> 0x00ec }
        L_0x00d1:
            r0 = r2
            goto L_0x001c
        L_0x00d4:
            r0 = move-exception
            r4 = r3
        L_0x00d6:
            if (r4 == 0) goto L_0x00db
            r4.close()     // Catch:{ IOException -> 0x00ee }
        L_0x00db:
            if (r3 == 0) goto L_0x00e0
            r3.close()     // Catch:{ IOException -> 0x00f0 }
        L_0x00e0:
            throw r0
        L_0x00e1:
            r0 = move-exception
            goto L_0x0060
        L_0x00e4:
            r0 = move-exception
            goto L_0x009c
        L_0x00e6:
            r2 = move-exception
            goto L_0x00be
        L_0x00e8:
            r0 = move-exception
            goto L_0x00c1
        L_0x00ea:
            r1 = move-exception
            goto L_0x00cc
        L_0x00ec:
            r0 = move-exception
            goto L_0x00d1
        L_0x00ee:
            r1 = move-exception
            goto L_0x00db
        L_0x00f0:
            r1 = move-exception
            goto L_0x00e0
        L_0x00f2:
            r0 = move-exception
            goto L_0x00d6
        L_0x00f4:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L_0x00d6
        L_0x00f8:
            r0 = move-exception
            r0 = r3
            r1 = r4
            goto L_0x00c7
        L_0x00fc:
            r1 = move-exception
            r1 = r4
            goto L_0x00c7
        L_0x00ff:
            r0 = move-exception
            r0 = r3
            r1 = r3
            goto L_0x00c7
        L_0x0103:
            r0 = move-exception
            r0 = r3
            r1 = r4
            goto L_0x00c7
        L_0x0107:
            r1 = move-exception
            r1 = r4
            goto L_0x00c7
        L_0x010a:
            r0 = move-exception
            r0 = r3
            r1 = r3
            goto L_0x00c7
        L_0x010e:
            r0 = move-exception
            r0 = r3
            r1 = r4
            goto L_0x00c7
        L_0x0112:
            r1 = move-exception
            r1 = r4
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.yj.b(java.io.File, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    public final void o() {
        try {
            if (this.g == null && this.j) {
                com.google.android.gms.ads.c.a aVar = new com.google.android.gms.ads.c.a(this.a);
                aVar.a();
                this.g = aVar;
            }
        } catch (b | c | IOException e2) {
            this.g = null;
        }
    }

    private final pb p() {
        try {
            return ql.a(this.a, this.a.getPackageName(), Integer.toString(this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode));
        } catch (Throwable th) {
            return null;
        }
    }

    public final Context a() {
        return this.a;
    }

    public final Method a(String str, String str2) {
        afr afr = this.p.get(new Pair(str, str2));
        if (afr == null) {
            return null;
        }
        return afr.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        if (this.o) {
            Future<?> submit = this.c.submit(new yl(this, i2, z));
            if (i2 == 0) {
                this.l = submit;
            }
        }
    }

    public final boolean a(String str, String str2, Class<?>... clsArr) {
        if (this.p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.p.put(new Pair(str, str2), new afr(this, str, str2, clsArr));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final pb b(int i2, boolean z) {
        if (i2 > 0 && z) {
            try {
                Thread.sleep((long) (i2 * 1000));
            } catch (InterruptedException e2) {
            }
        }
        return p();
    }

    public final boolean b() {
        return this.q;
    }

    public final ExecutorService c() {
        return this.c;
    }

    public final DexClassLoader d() {
        return this.d;
    }

    public final xt e() {
        return this.e;
    }

    public final byte[] f() {
        return this.f;
    }

    public final boolean g() {
        return this.n;
    }

    public final xl h() {
        return this.m;
    }

    public final boolean i() {
        return this.o;
    }

    public final boolean j() {
        return this.r;
    }

    public final pb k() {
        return this.k;
    }

    public final Future l() {
        return this.l;
    }

    public final com.google.android.gms.ads.c.a m() {
        if (!this.h) {
            return null;
        }
        if (this.g != null) {
            return this.g;
        }
        if (this.i != null) {
            try {
                this.i.get(2000, TimeUnit.MILLISECONDS);
                this.i = null;
            } catch (InterruptedException | ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.i.cancel(true);
            }
        }
        return this.g;
    }

    public final int n() {
        if (this.m != null) {
            return xl.a();
        }
        return Integer.MIN_VALUE;
    }
}
