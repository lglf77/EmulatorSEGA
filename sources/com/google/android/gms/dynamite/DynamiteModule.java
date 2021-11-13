package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final d a = new b();
    public static final d b = new d();
    public static final d c = new e();
    public static final d d = new f();
    public static final d e = new g();
    private static Boolean f;
    private static k g;
    private static m h;
    private static String i;
    private static final ThreadLocal<a> j = new ThreadLocal<>();
    private static final i k = new a();
    private static d l = new c();
    private final Context m;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    static class a {
        public Cursor a;

        private a() {
        }

        /* synthetic */ a(a aVar) {
            this();
        }
    }

    static class b implements i {
        private final int a;
        private final int b = 0;

        public b(int i, int i2) {
            this.a = i;
        }

        public final int a(Context context, String str) {
            return this.a;
        }

        public final int a(Context context, String str, boolean z) {
            return 0;
        }
    }

    public static class c extends Exception {
        private c(String str) {
            super(str);
        }

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        private c(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ c(String str, Throwable th, a aVar) {
            this(str, th);
        }
    }

    public interface d {
        j a(Context context, String str, i iVar);
    }

    private DynamiteModule(Context context) {
        this.m = (Context) y.a(context);
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(new StringBuilder(String.valueOf("com.google.android.gms.dynamite.descriptors.").length() + 1 + String.valueOf(str).length() + String.valueOf("ModuleDescriptor").length()).append("com.google.android.gms.dynamite.descriptors.").append(str).append(".").append("ModuleDescriptor").toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length()).append("Module descriptor id '").append(valueOf).append("' didn't match expected id '").append(str).append("'").toString());
            return 0;
        } catch (ClassNotFoundException e2) {
            Log.w("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
            return 0;
        } catch (Exception e3) {
            String valueOf2 = String.valueOf(e3.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x0071=Splitter:B:35:0x0071, B:25:0x0043=Splitter:B:25:0x0043} */
    public static int a(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)
            java.lang.Boolean r0 = f     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x0034
            android.content.Context r0 = r7.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            java.lang.Class r2 = r0.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            java.lang.String r0 = "sClassLoader"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r0)     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            r0 = 0
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x009c }
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0046
            java.lang.ClassLoader r3 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            if (r0 != r3) goto L_0x0040
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
        L_0x0031:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
        L_0x0032:
            f = r0     // Catch:{ all -> 0x0074 }
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ed
            int r0 = c((android.content.Context) r7, (java.lang.String) r8, (boolean) r9)     // Catch:{ c -> 0x00ca }
        L_0x003f:
            return r0
        L_0x0040:
            a((java.lang.ClassLoader) r0)     // Catch:{ c -> 0x00f3 }
        L_0x0043:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            goto L_0x0031
        L_0x0046:
            java.lang.String r0 = "com.google.android.gms"
            android.content.Context r4 = r7.getApplicationContext()     // Catch:{ all -> 0x009c }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x009c }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0061
            r0 = 0
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r3.set(r0, r4)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x0031
        L_0x0061:
            int r0 = c((android.content.Context) r7, (java.lang.String) r8, (boolean) r9)     // Catch:{ c -> 0x0090 }
            java.lang.String r4 = i     // Catch:{ c -> 0x0090 }
            if (r4 == 0) goto L_0x0071
            java.lang.String r4 = i     // Catch:{ c -> 0x0090 }
            boolean r4 = r4.isEmpty()     // Catch:{ c -> 0x0090 }
            if (r4 == 0) goto L_0x0077
        L_0x0071:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            goto L_0x003f
        L_0x0074:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0077:
            com.google.android.gms.dynamite.h r4 = new com.google.android.gms.dynamite.h     // Catch:{ c -> 0x0090 }
            java.lang.String r5 = i     // Catch:{ c -> 0x0090 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ c -> 0x0090 }
            r4.<init>(r5, r6)     // Catch:{ c -> 0x0090 }
            a((java.lang.ClassLoader) r4)     // Catch:{ c -> 0x0090 }
            r5 = 0
            r3.set(r5, r4)     // Catch:{ c -> 0x0090 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ c -> 0x0090 }
            f = r4     // Catch:{ c -> 0x0090 }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            goto L_0x003f
        L_0x0090:
            r0 = move-exception
            r0 = 0
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r3.set(r0, r4)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x0031
        L_0x009c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
        L_0x009f:
            r0 = move-exception
        L_0x00a0:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0074 }
            int r3 = r3.length()     // Catch:{ all -> 0x0074 }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r4.<init>(r3)     // Catch:{ all -> 0x0074 }
            java.lang.String r3 = "Failed to load module via V2: "
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0074 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0074 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0074 }
            goto L_0x0032
        L_0x00ca:
            r0 = move-exception
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r2 = "Failed to retrieve remote module version: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x00e7
            java.lang.String r0 = r2.concat(r0)
        L_0x00e1:
            android.util.Log.w(r1, r0)
            r0 = 0
            goto L_0x003f
        L_0x00e7:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x00e1
        L_0x00ed:
            int r0 = b((android.content.Context) r7, (java.lang.String) r8, (boolean) r9)
            goto L_0x003f
        L_0x00f3:
            r0 = move-exception
            goto L_0x0043
        L_0x00f6:
            r0 = move-exception
            goto L_0x00a0
        L_0x00f8:
            r0 = move-exception
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    private static Context a(Context context, String str, int i2, Cursor cursor, m mVar) {
        try {
            return (Context) com.google.android.gms.a.c.a(mVar.a(com.google.android.gms.a.c.a(context), str, i2, com.google.android.gms.a.c.a(cursor)));
        } catch (Exception e2) {
            String valueOf = String.valueOf(e2.toString());
            Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load DynamiteLoader: ".concat(valueOf) : new String("Failed to load DynamiteLoader: "));
            return null;
        }
    }

    public static DynamiteModule a(Context context, d dVar, String str) {
        j a2;
        a aVar = j.get();
        a aVar2 = new a((a) null);
        j.set(aVar2);
        try {
            a2 = dVar.a(context, str, k);
            Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(a2.a).append(" and remote module ").append(str).append(":").append(a2.b).toString());
            if (a2.c == 0 || ((a2.c == -1 && a2.a == 0) || (a2.c == 1 && a2.b == 0))) {
                throw new c(new StringBuilder(91).append("No acceptable module found. Local version is ").append(a2.a).append(" and remote version is ").append(a2.b).append(".").toString(), (a) null);
            } else if (a2.c == -1) {
                DynamiteModule c2 = c(context, str);
                if (aVar2.a != null) {
                    aVar2.a.close();
                }
                j.set(aVar);
                return c2;
            } else if (a2.c == 1) {
                DynamiteModule a3 = a(context, str, a2.b);
                if (aVar2.a != null) {
                    aVar2.a.close();
                }
                j.set(aVar);
                return a3;
            } else {
                throw new c(new StringBuilder(47).append("VersionPolicy returned invalid code:").append(a2.c).toString(), (a) null);
            }
        } catch (c e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            if (a2.a == 0 || dVar.a(context, str, new b(a2.a, 0)).c != -1) {
                throw new c("Remote load failed. No local fallback found.", e2, (a) null);
            }
            DynamiteModule c3 = c(context, str);
            if (aVar2.a != null) {
                aVar2.a.close();
            }
            j.set(aVar);
            return c3;
        } catch (Throwable th) {
            if (aVar2.a != null) {
                aVar2.a.close();
            }
            j.set(aVar);
            throw th;
        }
    }

    private static DynamiteModule a(Context context, String str, int i2) {
        Boolean bool;
        synchronized (DynamiteModule.class) {
            bool = f;
        }
        if (bool != null) {
            return bool.booleanValue() ? c(context, str, i2) : b(context, str, i2);
        }
        throw new c("Failed to determine which loading route to use.", (a) null);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.dynamite.k a(android.content.Context r7) {
        /*
            r3 = 0
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)
            com.google.android.gms.dynamite.k r1 = g     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x000c
            com.google.android.gms.dynamite.k r1 = g     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
        L_0x000b:
            return r1
        L_0x000c:
            com.google.android.gms.common.i r1 = com.google.android.gms.common.i.a()     // Catch:{ all -> 0x0039 }
            int r1 = r1.a(r7)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            r1 = r3
            goto L_0x000b
        L_0x0019:
            java.lang.String r1 = "com.google.android.gms"
            r2 = 3
            android.content.Context r1 = r7.createPackageContext(r1, r2)     // Catch:{ Exception -> 0x0052 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ Exception -> 0x0052 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Exception -> 0x0052 }
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ Exception -> 0x0052 }
            if (r1 != 0) goto L_0x003c
            r1 = r3
        L_0x0033:
            if (r1 == 0) goto L_0x006c
            g = r1     // Catch:{ Exception -> 0x0052 }
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            goto L_0x000b
        L_0x0039:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            throw r1
        L_0x003c:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ Exception -> 0x0052 }
            boolean r5 = r2 instanceof com.google.android.gms.dynamite.k     // Catch:{ Exception -> 0x0052 }
            if (r5 == 0) goto L_0x004b
            r0 = r2
            com.google.android.gms.dynamite.k r0 = (com.google.android.gms.dynamite.k) r0     // Catch:{ Exception -> 0x0052 }
            r1 = r0
            goto L_0x0033
        L_0x004b:
            com.google.android.gms.dynamite.l r2 = new com.google.android.gms.dynamite.l     // Catch:{ Exception -> 0x0052 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0052 }
            r1 = r2
            goto L_0x0033
        L_0x0052:
            r1 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r5 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0039 }
            int r6 = r1.length()     // Catch:{ all -> 0x0039 }
            if (r6 == 0) goto L_0x006f
            java.lang.String r1 = r5.concat(r1)     // Catch:{ all -> 0x0039 }
        L_0x0069:
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x0039 }
        L_0x006c:
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            r1 = r3
            goto L_0x000b
        L_0x006f:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0039 }
            r1.<init>(r5)     // Catch:{ all -> 0x0039 }
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context):com.google.android.gms.dynamite.k");
    }

    private static void a(ClassLoader classLoader) {
        m nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new n(iBinder);
            }
            h = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new c("Failed to instantiate dynamite loader", e2, (a) null);
        }
    }

    public static int b(Context context, String str) {
        return a(context, str, false);
    }

    private static int b(Context context, String str, boolean z) {
        k a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            return a2.a(com.google.android.gms.a.c.a(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    private static DynamiteModule b(Context context, String str, int i2) {
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i2).toString());
        k a2 = a(context);
        if (a2 == null) {
            throw new c("Failed to create IDynamiteLoader.", (a) null);
        }
        try {
            com.google.android.gms.a.a a3 = a2.a(com.google.android.gms.a.c.a(context), str, i2);
            if (com.google.android.gms.a.c.a(a3) != null) {
                return new DynamiteModule((Context) com.google.android.gms.a.c.a(a3));
            }
            throw new c("Failed to load remote module.", (a) null);
        } catch (RemoteException e2) {
            throw new c("Failed to load remote module.", e2, (a) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            r6 = 0
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            if (r9 == 0) goto L_0x0073
            java.lang.String r1 = "api_force_staging"
        L_0x0009:
            java.lang.String r2 = "content://com.google.android.gms.chimera/"
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r3 = r3.length()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r3 = r3 + 1
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            if (r1 == 0) goto L_0x0056
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x0066 }
            if (r0 != 0) goto L_0x0076
        L_0x0056:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r2 = "Failed to retrieve remote module version."
            android.util.Log.w(r0, r2)     // Catch:{ Exception -> 0x0066 }
            com.google.android.gms.dynamite.DynamiteModule$c r0 = new com.google.android.gms.dynamite.DynamiteModule$c     // Catch:{ Exception -> 0x0066 }
            java.lang.String r2 = "Failed to connect to dynamite module ContentResolver."
            r3 = 0
            r0.<init>((java.lang.String) r2, (com.google.android.gms.dynamite.a) r3)     // Catch:{ Exception -> 0x0066 }
            throw r0     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            r0 = move-exception
        L_0x0067:
            boolean r2 = r0 instanceof com.google.android.gms.dynamite.DynamiteModule.c     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x00a2
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
        L_0x006d:
            if (r1 == 0) goto L_0x0072
            r1.close()
        L_0x0072:
            throw r0
        L_0x0073:
            java.lang.String r1 = "api"
            goto L_0x0009
        L_0x0076:
            r0 = 0
            int r2 = r1.getInt(r0)     // Catch:{ Exception -> 0x0066 }
            if (r2 <= 0) goto L_0x0099
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r3 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r3)     // Catch:{ Exception -> 0x0066 }
            r0 = 2
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x009f }
            i = r0     // Catch:{ all -> 0x009f }
            monitor-exit(r3)     // Catch:{ all -> 0x009f }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$a> r0 = j     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0066 }
            com.google.android.gms.dynamite.DynamiteModule$a r0 = (com.google.android.gms.dynamite.DynamiteModule.a) r0     // Catch:{ Exception -> 0x0066 }
            if (r0 == 0) goto L_0x0099
            android.database.Cursor r3 = r0.a     // Catch:{ Exception -> 0x0066 }
            if (r3 != 0) goto L_0x0099
            r0.a = r1     // Catch:{ Exception -> 0x0066 }
            r1 = r6
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.close()
        L_0x009e:
            return r2
        L_0x009f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009f }
            throw r0     // Catch:{ Exception -> 0x0066 }
        L_0x00a2:
            com.google.android.gms.dynamite.DynamiteModule$c r2 = new com.google.android.gms.dynamite.DynamiteModule$c     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "V2 version check failed"
            r4 = 0
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x006c }
            throw r2     // Catch:{ all -> 0x006c }
        L_0x00ab:
            r0 = move-exception
            r1 = r6
            goto L_0x006d
        L_0x00ae:
            r0 = move-exception
            r1 = r6
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule c(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule c(Context context, String str, int i2) {
        m mVar;
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i2).toString());
        synchronized (DynamiteModule.class) {
            mVar = h;
        }
        if (mVar == null) {
            throw new c("DynamiteLoaderV2 was not cached.", (a) null);
        }
        a aVar = j.get();
        if (aVar == null || aVar.a == null) {
            throw new c("No result cursor", (a) null);
        }
        Context a2 = a(context.getApplicationContext(), str, i2, aVar.a, mVar);
        if (a2 != null) {
            return new DynamiteModule(a2);
        }
        throw new c("Failed to get module context", (a) null);
    }

    public final Context a() {
        return this.m;
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.m.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new c(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2, (a) null);
        }
    }
}
