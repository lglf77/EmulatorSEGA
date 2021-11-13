package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.j;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class gw {
    public static final Handler a = new fo(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public boolean c = true;
    /* access modifiers changed from: private */
    public String d;
    private boolean e = false;
    private boolean f = false;
    private Pattern g;
    private Pattern h;

    public static Bitmap a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(str.substring(0, indexOf + 1) + str2 + "=" + str3 + "&" + str.substring(indexOf + 1)) : Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    public static Bundle a(amx amx) {
        String str;
        String g2;
        String h2;
        if (amx == null) {
            return null;
        }
        if (!((Boolean) app.f().a(asw.Q)).booleanValue()) {
            if (!((Boolean) app.f().a(asw.S)).booleanValue()) {
                return null;
            }
        }
        if (au.i().a() && au.i().b()) {
            return null;
        }
        if (amx.d()) {
            amx.c();
        }
        amr b2 = amx.b();
        if (b2 != null) {
            String b3 = b2.b();
            String c2 = b2.c();
            String d2 = b2.d();
            if (b3 != null) {
                au.i().a(b3);
            }
            if (d2 != null) {
                au.i().b(d2);
                g2 = b3;
                str = c2;
                h2 = d2;
            } else {
                g2 = b3;
                str = c2;
                h2 = d2;
            }
        } else {
            str = null;
            g2 = au.i().g();
            h2 = au.i().h();
        }
        Bundle bundle = new Bundle(1);
        if (h2 != null) {
            if (((Boolean) app.f().a(asw.S)).booleanValue() && !au.i().b()) {
                bundle.putString("v_fp_vertical", h2);
            }
        }
        if (g2 != null) {
            if (((Boolean) app.f().a(asw.Q)).booleanValue() && !au.i().a()) {
                bundle.putString("fingerprint", g2);
                if (!g2.equals(str)) {
                    bundle.putString("v_fp", str);
                }
            }
        }
        if (!bundle.isEmpty()) {
            return bundle;
        }
        return null;
    }

    public static DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static PopupWindow a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    public static String a(Context context, View view, apc apc) {
        if (!((Boolean) app.f().a(asw.ae)).booleanValue()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", apc.e);
            jSONObject2.put("height", apc.b);
            jSONObject.put("size", jSONObject2);
            jSONObject.put("activity", p(context));
            if (!apc.d) {
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        int i = -1;
                        if (parent instanceof ViewGroup) {
                            i = ((ViewGroup) parent).indexOfChild(view);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", parent.getClass().getName());
                        jSONObject3.put("index_of_child", i);
                        jSONArray.put(jSONObject3);
                    }
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("parents", jSONArray);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            fn.c("Fail to get view hierarchy json", e2);
            return null;
        }
    }

    public static String a(Context context, xr xrVar, String str, View view, Activity activity) {
        if (xrVar == null) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (xrVar.b(parse)) {
                parse = xrVar.a(parse, context, view, activity);
            }
            return parse.toString();
        } catch (Exception e2) {
            return str;
        }
    }

    public static String a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public static String a(String str) {
        return Uri.parse(str).buildUpon().query((String) null).build().toString();
    }

    public static Map<String, String> a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : au.g().a(uri)) {
            hashMap.put(next, uri.getQueryParameter(next));
        }
        return hashMap;
    }

    private final JSONArray a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a2 : collection) {
            a(jSONArray, (Object) a2);
        }
        return jSONArray;
    }

    private final JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static void a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void a(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public static void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    public static void a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            if (((Boolean) app.f().a(asw.cv)).booleanValue()) {
                b(context, intent);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            fn.b(new StringBuilder(String.valueOf(uri2).length() + 26).append("Opening ").append(uri2).append(" in a new browser.").toString());
        } catch (ActivityNotFoundException e2) {
            fn.b("No browser is found.", e2);
        }
    }

    public static void a(Context context, String str, List<String> list) {
        for (String isVar : list) {
            new is(context, str, isVar).d();
        }
    }

    public static void a(aoy aoy, boolean z) {
        Bundle bundle;
        Bundle bundle2 = aoy.m != null ? aoy.m : new Bundle();
        if (bundle2.getBundle(AdMobAdapter.class.getName()) != null) {
            bundle = bundle2.getBundle(AdMobAdapter.class.getName());
        } else {
            Bundle bundle3 = new Bundle();
            bundle2.putBundle(AdMobAdapter.class.getName(), bundle3);
            bundle = bundle3;
        }
        bundle.putBoolean("render_test_label", true);
    }

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            a.post(runnable);
        }
    }

    private final void a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(a((Map<String, ?>) (Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(a((Collection<?>) (Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object a2 : (Object[]) obj) {
                a(jSONArray2, a2);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    private final void a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, a((Map<String, ?>) (Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, a((Collection<?>) (Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, a((Collection<?>) Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    private static boolean a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @TargetApi(24)
    public static boolean a(Activity activity, Configuration configuration) {
        app.a();
        int a2 = jc.a((Context) activity, configuration.screenHeightDp);
        int a3 = jc.a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a4 = a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a4.heightPixels;
        int i2 = a4.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int intValue = ((Integer) app.f().a(asw.cF)).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
        return a(i, dimensionPixelSize + a2, intValue) && a(i2, a3, intValue);
    }

    public static boolean a(Context context) {
        boolean z;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            fn.e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
            fn.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"keyboard"}));
            z = false;
        } else {
            z = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
            fn.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"keyboardHidden"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
            fn.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"orientation"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
            fn.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"screenLayout"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
            fn.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"uiMode"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
            fn.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"screenSize"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
            return z;
        }
        fn.e(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[]{"smallestScreenSize"}));
        return false;
    }

    public static boolean a(Context context, String str, String str2) {
        return pw.a(context).a(str2, str) == 0;
    }

    public static boolean a(aoy aoy) {
        Bundle bundle = aoy.m != null ? aoy.m : new Bundle();
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }

    public static boolean a(ClassLoader classLoader, Class<?> cls, String str) {
        try {
            return cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
            return false;
        }
    }

    public static int[] a(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return g();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            String valueOf = String.valueOf(e2);
            fn.e(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Could not parse value:").append(valueOf).toString());
            return 0;
        }
    }

    public static Bitmap b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap f2 = f(view);
        return f2 == null ? e(view) : f2;
    }

    public static String b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
    }

    public static String b(Context context, String str) {
        try {
            return new String(i.a(context.openFileInput(str), true), "UTF-8");
        } catch (IOException e2) {
            fn.b("Error reading from internal storage.");
            return "";
        }
    }

    public static void b(Activity activity, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    @TargetApi(18)
    public static void b(Context context, Intent intent) {
        if (intent != null && j.d()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void b(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        a(context, str, (List<String>) arrayList);
    }

    public static void b(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            gq.a(runnable);
        }
    }

    public static float c() {
        return au.B().a();
    }

    public static void c(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e2) {
            fn.b("Error writing to file in internal storage.", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(android.view.View r4) {
        /*
            r2 = 0
            r1 = 0
            android.view.View r0 = r4.getRootView()
            if (r0 == 0) goto L_0x0016
            android.content.Context r0 = r0.getContext()
            boolean r3 = r0 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0016
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0012:
            if (r0 != 0) goto L_0x0018
            r0 = r1
        L_0x0015:
            return r0
        L_0x0016:
            r0 = r2
            goto L_0x0012
        L_0x0018:
            android.view.Window r0 = r0.getWindow()
            if (r0 != 0) goto L_0x002a
            r0 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x002f
            int r0 = r0.flags
            r2 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x002f
            r0 = 1
            goto L_0x0015
        L_0x002a:
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            goto L_0x001f
        L_0x002f:
            r0 = r1
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gw.c(android.view.View):boolean");
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static int d(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    protected static String d(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            return f();
        }
    }

    public static boolean d() {
        return au.B().b();
    }

    public static AlertDialog.Builder e(Context context) {
        return new AlertDialog.Builder(context);
    }

    private static Bitmap e(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width == 0 || height == 0) {
                fn.e("Width or height of view is zero");
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            view.layout(0, 0, width, height);
            view.draw(canvas);
            return createBitmap;
        } catch (RuntimeException e2) {
            fn.b("Fail to capture the webview", e2);
            return null;
        }
    }

    public static Bundle e() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) app.f().a(asw.y)).booleanValue()) {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) app.f().a(asw.z)).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", au.i().y());
        } catch (Exception e2) {
            fn.c("Unable to gather memory stats", e2);
        }
        return bundle;
    }

    private static Bitmap f(View view) {
        RuntimeException e2;
        Bitmap bitmap;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
            try {
                view.setDrawingCacheEnabled(isDrawingCacheEnabled);
            } catch (RuntimeException e3) {
                e2 = e3;
                fn.b("Fail to capture the web view", e2);
                return bitmap;
            }
        } catch (RuntimeException e4) {
            RuntimeException runtimeException = e4;
            bitmap = null;
            e2 = runtimeException;
            fn.b("Fail to capture the web view", e2);
            return bitmap;
        }
        return bitmap;
    }

    public static ash f(Context context) {
        return new ash(context);
    }

    private static String f() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            stringBuffer.append(" ").append(Build.VERSION.RELEASE);
        }
        stringBuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    public static String f(String str) {
        return TextUtils.isEmpty(str) ? "" : str.split(";")[0].trim();
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split(";");
        if (split.length == 1) {
            return "";
        }
        for (int i = 1; i < split.length; i++) {
            if (split[i].trim().startsWith("charset")) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length > 1) {
                    return split2[1].trim();
                }
            }
        }
        return "";
    }

    public static boolean g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (Process.myPid() == next.pid) {
                    if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (powerManager == null ? false : powerManager.isScreenOn()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    private static int[] g() {
        return new int[]{0, 0};
    }

    public static Bitmap h(Context context) {
        Bitmap bitmap;
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            if (((Boolean) app.f().a(asw.bF)).booleanValue()) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    bitmap = f(window.getDecorView().getRootView());
                }
                bitmap = null;
            } else {
                bitmap = e(((Activity) context).getWindow().getDecorView());
            }
        } catch (RuntimeException e2) {
            fn.b("Fail to capture screen shot", e2);
        }
        return bitmap;
    }

    public static AudioManager i(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    public static float j(Context context) {
        AudioManager i = i(context);
        if (i == null) {
            return 0.0f;
        }
        int streamMaxVolume = i.getStreamMaxVolume(3);
        int streamVolume = i.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return ((float) streamVolume) / ((float) streamMaxVolume);
        }
        return 0.0f;
    }

    public static int k(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = q(r2);
     */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean l(android.content.Context r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0009
            boolean r1 = com.google.android.gms.common.util.j.b()
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            android.app.KeyguardManager r1 = q(r2)
            if (r1 == 0) goto L_0x0009
            boolean r1 = r1.isKeyguardLocked()
            if (r1 == 0) goto L_0x0009
            r0 = 1
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gw.l(android.content.Context):boolean");
    }

    public static boolean m(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException e2) {
            return true;
        } catch (Throwable th) {
            fn.b("Error loading class.", th);
            au.i().a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static int n(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    public static int o(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    private static String p(Context context) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
            if (!(runningTasks == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null)) {
                return runningTaskInfo.topActivity.getClassName();
            }
            return null;
        } catch (Exception e2) {
        }
    }

    private static KeyguardManager q(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public final String a(Context context, String str) {
        String str2;
        synchronized (this.b) {
            if (this.d != null) {
                str2 = this.d;
            } else if (str == null) {
                str2 = f();
            } else {
                try {
                    this.d = au.g().a(context);
                } catch (Exception e2) {
                }
                if (TextUtils.isEmpty(this.d)) {
                    app.a();
                    if (!jc.b()) {
                        this.d = null;
                        a.post(new gy(this, context));
                        while (this.d == null) {
                            try {
                                this.b.wait();
                            } catch (InterruptedException e3) {
                                this.d = f();
                                String valueOf = String.valueOf(this.d);
                                fn.e(valueOf.length() != 0 ? "Interrupted, use default user agent: ".concat(valueOf) : new String("Interrupted, use default user agent: "));
                            }
                        }
                    } else {
                        this.d = d(context);
                    }
                }
                String valueOf2 = String.valueOf(this.d);
                this.d = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(str).length()).append(valueOf2).append(" (Mobile; ").append(str).toString();
                try {
                    if (pw.a(context).a()) {
                        this.d = String.valueOf(this.d).concat(";aia");
                    }
                } catch (Exception e4) {
                    au.i().a((Throwable) e4, "AdUtil.getUserAgent");
                }
                this.d = String.valueOf(this.d).concat(")");
                str2 = this.d;
            }
        }
        return str2;
    }

    public final JSONObject a(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return a(bundle);
        } catch (JSONException e2) {
            fn.b("Error converting Bundle to JSON", e2);
            return null;
        }
    }

    public final JSONObject a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                a(jSONObject, next, (Object) map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final void a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            au.e();
            bundle.putString("device", b());
            bundle.putString("eids", TextUtils.join(",", asw.a()));
        }
        app.a();
        jc.a(context, str, str2, bundle, z, new gz(this, context, str));
    }

    public final void a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", a(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final void a(Context context, List<String> list) {
        if (!(context instanceof Activity) || TextUtils.isEmpty(alc.a((Activity) context))) {
            return;
        }
        if (list == null) {
            fn.a("Cannot ping urls: empty list.");
        } else if (!atu.a(context)) {
            fn.a("Cannot ping url because custom tabs is not supported");
        } else {
            atu atu = new atu();
            atu.a((atv) new gx(this, list, atu, context));
            atu.a((Activity) context);
        }
    }

    public final boolean a(View view, Context context) {
        PowerManager powerManager = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            powerManager = (PowerManager) applicationContext.getSystemService("power");
        }
        return a(view, powerManager, q(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.View r5, android.os.PowerManager r6, android.app.KeyguardManager r7) {
        /*
            r4 = this;
            r2 = 1
            r1 = 0
            com.google.android.gms.internal.gw r0 = com.google.android.gms.ads.internal.au.e()
            boolean r0 = r0.c
            if (r0 != 0) goto L_0x0027
            if (r7 != 0) goto L_0x006a
            r0 = r1
        L_0x000d:
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.ba
            com.google.android.gms.internal.asu r3 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006f
            boolean r0 = c((android.view.View) r5)
            if (r0 == 0) goto L_0x006f
        L_0x0027:
            r0 = r2
        L_0x0028:
            int r3 = r5.getVisibility()
            if (r3 != 0) goto L_0x0073
            boolean r3 = r5.isShown()
            if (r3 == 0) goto L_0x0073
            if (r6 == 0) goto L_0x003c
            boolean r3 = r6.isScreenOn()
            if (r3 == 0) goto L_0x0071
        L_0x003c:
            r3 = r2
        L_0x003d:
            if (r3 == 0) goto L_0x0073
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.aY
            com.google.android.gms.internal.asu r3 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0069
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r5.getLocalVisibleRect(r0)
            if (r0 != 0) goto L_0x0069
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r5.getGlobalVisibleRect(r0)
            if (r0 == 0) goto L_0x0073
        L_0x0069:
            return r2
        L_0x006a:
            boolean r0 = r7.inKeyguardRestrictedInputMode()
            goto L_0x000d
        L_0x006f:
            r0 = r1
            goto L_0x0028
        L_0x0071:
            r3 = r1
            goto L_0x003d
        L_0x0073:
            r2 = r1
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gw.a(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    public final void b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) app.f().a(asw.bd)).booleanValue()) {
            a(context, str, str2, bundle, z);
        }
    }

    public final boolean b(Context context) {
        if (this.e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new hb(this, (gx) null), intentFilter);
        this.e = true;
        return true;
    }

    public final int[] b(Activity activity) {
        int[] a2 = a(activity);
        app.a();
        app.a();
        return new int[]{jc.b((Context) activity, a2[0]), jc.b((Context) activity, a2[1])};
    }

    public final boolean c(Context context) {
        if (this.f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new ha(this, (gx) null), intentFilter);
        this.f = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] c(android.app.Activity r7) {
        /*
            r6 = this;
            r5 = 2
            r4 = 1
            r3 = 0
            android.view.Window r0 = r7.getWindow()
            if (r0 == 0) goto L_0x0039
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L_0x0039
            int[] r0 = new int[r5]
            int r2 = r1.getTop()
            r0[r3] = r2
            int r1 = r1.getBottom()
            r0[r4] = r1
        L_0x0020:
            int[] r1 = new int[r5]
            com.google.android.gms.internal.app.a()
            r2 = r0[r3]
            int r2 = com.google.android.gms.internal.jc.b((android.content.Context) r7, (int) r2)
            r1[r3] = r2
            com.google.android.gms.internal.app.a()
            r0 = r0[r4]
            int r0 = com.google.android.gms.internal.jc.b((android.content.Context) r7, (int) r0)
            r1[r4] = r0
            return r1
        L_0x0039:
            int[] r0 = g()
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gw.c(android.app.Activity):int[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (((java.lang.String) com.google.android.gms.internal.app.f().a(com.google.android.gms.internal.asw.ak)).equals(r3.g.pattern()) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.String r4) {
        /*
            r3 = this;
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0009
            r0 = r1
        L_0x0008:
            return r0
        L_0x0009:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0047 }
            java.util.regex.Pattern r0 = r3.g     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.internal.asl<java.lang.String> r0 = com.google.android.gms.internal.asw.ak     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0044 }
            java.util.regex.Pattern r2 = r3.g     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0038
        L_0x0026:
            com.google.android.gms.internal.asl<java.lang.String> r0 = com.google.android.gms.internal.asw.ak     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0044 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0044 }
            r3.g = r0     // Catch:{ all -> 0x0044 }
        L_0x0038:
            java.util.regex.Pattern r0 = r3.g     // Catch:{ all -> 0x0044 }
            java.util.regex.Matcher r0 = r0.matcher(r4)     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.matches()     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0008
        L_0x0044:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ PatternSyntaxException -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            r0 = r1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gw.d(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (((java.lang.String) com.google.android.gms.internal.app.f().a(com.google.android.gms.internal.asw.al)).equals(r3.h.pattern()) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.String r4) {
        /*
            r3 = this;
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0009
            r0 = r1
        L_0x0008:
            return r0
        L_0x0009:
            monitor-enter(r3)     // Catch:{ PatternSyntaxException -> 0x0047 }
            java.util.regex.Pattern r0 = r3.h     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0026
            com.google.android.gms.internal.asl<java.lang.String> r0 = com.google.android.gms.internal.asw.al     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0044 }
            java.util.regex.Pattern r2 = r3.h     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = r2.pattern()     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0038
        L_0x0026:
            com.google.android.gms.internal.asl<java.lang.String> r0 = com.google.android.gms.internal.asw.al     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0044 }
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x0044 }
            r3.h = r0     // Catch:{ all -> 0x0044 }
        L_0x0038:
            java.util.regex.Pattern r0 = r3.h     // Catch:{ all -> 0x0044 }
            java.util.regex.Matcher r0 = r0.matcher(r4)     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.matches()     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0008
        L_0x0044:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ PatternSyntaxException -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            r0 = r1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gw.e(java.lang.String):boolean");
    }
}
