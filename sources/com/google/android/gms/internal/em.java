package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@bfk
public final class em {
    private final AtomicReference<ThreadPoolExecutor> a = new AtomicReference<>((Object) null);
    private final Object b = new Object();
    private String c = null;
    private AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicInteger e = new AtomicInteger(-1);
    private final AtomicReference<Object> f = new AtomicReference<>((Object) null);
    private final AtomicReference<Object> g = new AtomicReference<>((Object) null);
    private ConcurrentMap<String, Method> h = new ConcurrentHashMap(9);

    private static Bundle a(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e2) {
            String valueOf = String.valueOf(str);
            fn.b(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e2);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Object a(String str, Context context) {
        if (!a(context, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
            return null;
        }
        try {
            return h(context, str).invoke(this.f.get(), new Object[0]);
        } catch (Exception e2) {
            a(e2, str, true);
            return null;
        }
    }

    private final void a(Context context, String str, Bundle bundle) {
        if (a(context) && a(context, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
            Method k = k(context);
            try {
                k.invoke(this.f.get(), new Object[]{"am", str, bundle});
            } catch (Exception e2) {
                a(e2, "logEventInternal", true);
            }
        }
    }

    private final void a(Exception exc, String str, boolean z) {
        if (!this.d.get()) {
            fn.e(new StringBuilder(String.valueOf(str).length() + 30).append("Invoke Firebase method ").append(str).append(" error.").toString());
            if (z) {
                fn.e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.d.set(true);
            }
        }
    }

    private final boolean a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception e2) {
                a(e2, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final void b(Context context, String str, String str2) {
        if (a(context, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
            Method g2 = g(context, str2);
            try {
                g2.invoke(this.f.get(), new Object[]{str});
                fn.a(new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length()).append("Invoke Firebase method ").append(str2).append(", Ad Unit Id: ").append(str).toString());
            } catch (Exception e2) {
                a(e2, str2, false);
            }
        }
    }

    private final Method g(Context context, String str) {
        Method method = (Method) this.h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, str, false);
            return null;
        }
    }

    private final Method h(Context context, String str) {
        Method method = (Method) this.h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, str, false);
            return null;
        }
    }

    private final Method i(Context context, String str) {
        Method method = (Method) this.h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, str, false);
            return null;
        }
    }

    private final Method k(Context context) {
        Method method = (Method) this.h.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.h.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, "logEventInternal", true);
            return null;
        }
    }

    public final void a(Context context, String str) {
        if (a(context)) {
            b(context, str, "beginAdUnitExposure");
        }
    }

    public final void a(Context context, String str, String str2) {
        if (a(context)) {
            a(context, str, a(context, str2, "_ac".equals(str)));
        }
    }

    public final void a(Context context, String str, String str2, String str3, int i) {
        if (a(context)) {
            Bundle a2 = a(context, str, false);
            a2.putString("_ai", str2);
            a2.putString("type", str3);
            a2.putInt("value", i);
            a(context, "_ar", a2);
            fn.a(new StringBuilder(String.valueOf(str3).length() + 75).append("Log a Firebase reward video event, reward type: ").append(str3).append(", reward value: ").append(i).toString());
        }
    }

    public final boolean a(Context context) {
        if (!((Boolean) app.f().a(asw.af)).booleanValue() || this.d.get()) {
            return false;
        }
        if (this.e.get() == -1) {
            app.a();
            if (!jc.c(context)) {
                app.a();
                if (jc.f(context)) {
                    fn.e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.e.set(0);
                }
            }
            this.e.set(1);
        }
        return this.e.get() == 1;
    }

    public final void b(Context context, String str) {
        if (a(context)) {
            b(context, str, "endAdUnitExposure");
        }
    }

    public final boolean b(Context context) {
        return ((Boolean) app.f().a(asw.ag)).booleanValue() && a(context);
    }

    public final void c(Context context, String str) {
        if (a(context) && (context instanceof Activity) && a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.g, false)) {
            Method i = i(context, "setCurrentScreen");
            try {
                i.invoke(this.g.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception e2) {
                a(e2, "setCurrentScreen", false);
            }
        }
    }

    public final boolean c(Context context) {
        return ((Boolean) app.f().a(asw.ah)).booleanValue() && a(context);
    }

    public final void d(Context context, String str) {
        a(context, "_ac", str);
    }

    public final boolean d(Context context) {
        return ((Boolean) app.f().a(asw.ai)).booleanValue() && a(context);
    }

    public final void e(Context context, String str) {
        a(context, "_ai", str);
    }

    public final boolean e(Context context) {
        return ((Boolean) app.f().a(asw.aj)).booleanValue() && a(context);
    }

    public final String f(Context context) {
        if (!a(context) || !a(context, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
            return "";
        }
        try {
            String str = (String) h(context, "getCurrentScreenName").invoke(this.f.get(), new Object[0]);
            if (str == null) {
                str = (String) h(context, "getCurrentScreenClass").invoke(this.f.get(), new Object[0]);
            }
            return str == null ? "" : str;
        } catch (Exception e2) {
            a(e2, "getCurrentScreenName", false);
            return "";
        }
    }

    public final void f(Context context, String str) {
        a(context, "_aq", str);
    }

    public final String g(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.b) {
            if (this.c != null) {
                String str = this.c;
                return str;
            }
            this.c = (String) a("getGmpAppId", context);
            String str2 = this.c;
            return str2;
        }
    }

    public final String h(Context context) {
        if (!a(context)) {
            return null;
        }
        long longValue = ((Long) app.f().a(asw.ap)).longValue();
        if (longValue < 0) {
            return (String) a("getAppInstanceId", context);
        }
        if (this.a.get() == null) {
            this.a.compareAndSet((Object) null, new ThreadPoolExecutor(((Integer) app.f().a(asw.aq)).intValue(), ((Integer) app.f().a(asw.aq)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new eo(this)));
        }
        Future submit = this.a.get().submit(new en(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            submit.cancel(true);
            if (e2 instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    public final String i(Context context) {
        Object a2;
        if (a(context) && (a2 = a("generateEventId", context)) != null) {
            return a2.toString();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String j(Context context) {
        return (String) a("getAppInstanceId", context);
    }
}
