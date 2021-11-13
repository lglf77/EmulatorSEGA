package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.l;
import com.google.firebase.a.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class a {
    static final Map<String, a> a = new android.support.v4.c.a();
    private static final List<String> b = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    private static final List<String> c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List<String> d = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    private static final List<String> e = Arrays.asList(new String[0]);
    private static final Set<String> f = Collections.emptySet();
    /* access modifiers changed from: private */
    public static final Object g = new Object();
    private final Context h;
    private final String i;
    private final b j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final AtomicBoolean l = new AtomicBoolean();
    private final List<Object> m = new CopyOnWriteArrayList();
    private final List<C0017a> n = new CopyOnWriteArrayList();
    private final List<Object> o = new CopyOnWriteArrayList();
    private b p;

    /* renamed from: com.google.firebase.a$a  reason: collision with other inner class name */
    public interface C0017a {
        void a(boolean z);
    }

    public interface b {
    }

    @TargetApi(24)
    static class c extends BroadcastReceiver {
        private static AtomicReference<c> a = new AtomicReference<>();
        private final Context b;

        private c(Context context) {
            this.b = context;
        }

        /* access modifiers changed from: private */
        public static void b(Context context) {
            if (a.get() == null) {
                c cVar = new c(context);
                if (a.compareAndSet((Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (a.g) {
                for (a a2 : a.a.values()) {
                    a2.h();
                }
            }
            this.b.unregisterReceiver(this);
        }
    }

    private a(Context context, String str, b bVar) {
        this.h = (Context) y.a(context);
        this.i = y.a(str);
        this.j = (b) y.a(bVar);
        this.p = new com.google.firebase.a.a();
    }

    public static a a(Context context) {
        a a2;
        synchronized (g) {
            if (a.containsKey("[DEFAULT]")) {
                a2 = d();
            } else {
                b a3 = b.a(context);
                a2 = a3 == null ? null : a(context, a3);
            }
        }
        return a2;
    }

    public static a a(Context context, b bVar) {
        return a(context, bVar, "[DEFAULT]");
    }

    public static a a(Context context, b bVar, String str) {
        a aVar;
        b.a(context);
        if (context.getApplicationContext() instanceof Application) {
            d.a((Application) context.getApplicationContext());
            d.a().a((e) new c());
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (g) {
            y.a(!a.containsKey(trim), (Object) new StringBuilder(String.valueOf(trim).length() + 33).append("FirebaseApp name ").append(trim).append(" already exists!").toString());
            y.a(context, (Object) "Application context cannot be null.");
            aVar = new a(context, trim, bVar);
            a.put(trim, aVar);
        }
        b.a(aVar);
        aVar.a(a.class, aVar, (Iterable<String>) b);
        if (aVar.e()) {
            aVar.a(a.class, aVar, (Iterable<String>) c);
            aVar.a(Context.class, aVar.a(), (Iterable<String>) d);
        }
        return aVar;
    }

    private final <T> void a(Class<T> cls, T t, Iterable<String> iterable) {
        boolean a2 = android.support.v4.a.a.a(this.h);
        if (a2) {
            c.b(this.h);
        }
        for (String next : iterable) {
            if (a2) {
                try {
                    if (!e.contains(next)) {
                    }
                } catch (ClassNotFoundException e2) {
                    if (f.contains(next)) {
                        throw new IllegalStateException(String.valueOf(next).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                    Log.d("FirebaseApp", String.valueOf(next).concat(" is not linked. Skipping initialization."));
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException(String.valueOf(next).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (InvocationTargetException e4) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e4);
                } catch (IllegalAccessException e5) {
                    String valueOf = String.valueOf(next);
                    Log.wtf("FirebaseApp", valueOf.length() != 0 ? "Failed to initialize ".concat(valueOf) : new String("Failed to initialize "), e5);
                }
            }
            Method method = Class.forName(next).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke((Object) null, new Object[]{t});
            }
        }
    }

    public static void a(boolean z) {
        synchronized (g) {
            ArrayList arrayList = new ArrayList(a.values());
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                a aVar = (a) obj;
                if (aVar.k.get()) {
                    aVar.b(z);
                }
            }
        }
    }

    private final void b(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C0017a a2 : this.n) {
            a2.a(z);
        }
    }

    public static a d() {
        a aVar;
        synchronized (g) {
            aVar = a.get("[DEFAULT]");
            if (aVar == null) {
                String a2 = l.a();
                throw new IllegalStateException(new StringBuilder(String.valueOf(a2).length() + 116).append("Default FirebaseApp is not initialized in this process ").append(a2).append(". Make sure to call FirebaseApp.initializeApp(Context) first.").toString());
            }
        }
        return aVar;
    }

    private final void g() {
        y.a(!this.l.get(), (Object) "FirebaseApp was deleted");
    }

    /* access modifiers changed from: private */
    public final void h() {
        a(a.class, this, (Iterable<String>) b);
        if (e()) {
            a(a.class, this, (Iterable<String>) c);
            a(Context.class, this.h, (Iterable<String>) d);
        }
    }

    public Context a() {
        g();
        return this.h;
    }

    public String b() {
        g();
        return this.i;
    }

    public b c() {
        g();
        return this.j;
    }

    public final boolean e() {
        return "[DEFAULT]".equals(b());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.i.equals(((a) obj).b());
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public String toString() {
        return v.a(this).a("name", this.i).a("options", this.j).toString();
    }
}
