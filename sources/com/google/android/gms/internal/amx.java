package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.util.j;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
@TargetApi(14)
public final class amx extends Thread {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private final Object d;
    private final ams e;
    private final bfi f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final String o;
    private final boolean p;

    public amx(ams ams, bfi bfi) {
        this.e = ams;
        this.f = bfi;
        this.d = new Object();
        this.h = ((Integer) app.f().a(asw.L)).intValue();
        this.i = ((Integer) app.f().a(asw.M)).intValue();
        this.j = ((Integer) app.f().a(asw.N)).intValue();
        this.k = ((Integer) app.f().a(asw.O)).intValue();
        this.l = ((Integer) app.f().a(asw.R)).intValue();
        this.m = ((Integer) app.f().a(asw.T)).intValue();
        this.n = ((Integer) app.f().a(asw.U)).intValue();
        this.g = ((Integer) app.f().a(asw.P)).intValue();
        this.o = (String) app.f().a(asw.W);
        this.p = ((Boolean) app.f().a(asw.Y)).booleanValue();
        setName("ContentFetchTask");
    }

    private final anb a(View view, amr amr) {
        boolean z;
        int i2 = 0;
        if (view == null) {
            return new anb(this, 0, 0);
        }
        Context b2 = au.h().b();
        if (b2 != null) {
            String str = (String) view.getTag(b2.getResources().getIdentifier((String) app.f().a(asw.V), "id", b2.getPackageName()));
            if (!TextUtils.isEmpty(this.o) && str != null && str.equals(this.o)) {
                return new anb(this, 0, 0);
            }
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new anb(this, 0, 0);
            }
            amr.b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new anb(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof mw)) {
            amr.g();
            WebView webView = (WebView) view;
            if (!j.e()) {
                z = false;
            } else {
                amr.g();
                webView.post(new amz(this, amr, webView, globalVisibleRect));
                z = true;
            }
            return z ? new anb(this, 0, 1) : new anb(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new anb(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i3 = 0;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                anb a2 = a(viewGroup.getChildAt(i4), amr);
                i3 += a2.a;
                i2 += a2.b;
            }
            return new anb(this, i3, i2);
        }
    }

    private static boolean e() {
        try {
            Context b2 = au.h().b();
            if (b2 == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b2.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b2.getSystemService("keyguard");
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
                        PowerManager powerManager = (PowerManager) b2.getSystemService("power");
                        if (powerManager == null ? false : powerManager.isScreenOn()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            au.i().a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void f() {
        synchronized (this.d) {
            this.b = true;
            fn.b(new StringBuilder(42).append("ContentFetchThread: paused, mPause = ").append(this.b).toString());
        }
    }

    public final void a() {
        synchronized (this.d) {
            if (this.a) {
                fn.b("Content hash thread already started, quiting...");
                return;
            }
            this.a = true;
            start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        try {
            amr amr = new amr(this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            anb a2 = a(view, amr);
            amr.h();
            if (a2.a != 0 || a2.b != 0) {
                if (a2.b != 0 || amr.j() != 0) {
                    if (a2.b != 0 || !this.e.a(amr)) {
                        this.e.c(amr);
                    }
                }
            }
        } catch (Exception e2) {
            fn.b("Exception in fetchContentOnUIThread", e2);
            this.f.a(e2, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(amr amr, WebView webView, String str, boolean z) {
        amr.f();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.p || TextUtils.isEmpty(webView.getTitle())) {
                    amr.a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    amr.a(new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length()).append(title).append("\n").append(optString).toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (amr.a()) {
                this.e.b(amr);
            }
        } catch (JSONException e2) {
            fn.b("Json string may be malformed.");
        } catch (Throwable th) {
            fn.a("Failed to get webview content.", th);
            this.f.a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final amr b() {
        return this.e.a();
    }

    public final void c() {
        synchronized (this.d) {
            this.b = false;
            this.d.notifyAll();
            fn.b("ContentFetchThread: wakeup");
        }
    }

    public final boolean d() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        com.google.android.gms.internal.fn.b("Error in ContentFetchTask", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.google.android.gms.ads.internal.au.i().a((java.lang.Throwable) r1, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.fn.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[ExcHandler: InterruptedException (r0v1 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = e()     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            if (r0 == 0) goto L_0x0088
            com.google.android.gms.internal.amt r0 = com.google.android.gms.ads.internal.au.h()     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            android.app.Activity r1 = r0.a()     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            if (r1 != 0) goto L_0x0034
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.fn.b(r0)     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            r4.f()     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
        L_0x0018:
            int r0 = r4.g     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
        L_0x0020:
            java.lang.Object r1 = r4.d
            monitor-enter(r1)
        L_0x0023:
            boolean r0 = r4.b     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.fn.b(r0)     // Catch:{ InterruptedException -> 0x0032 }
            java.lang.Object r0 = r4.d     // Catch:{ InterruptedException -> 0x0032 }
            r0.wait()     // Catch:{ InterruptedException -> 0x0032 }
            goto L_0x0023
        L_0x0032:
            r0 = move-exception
            goto L_0x0023
        L_0x0034:
            if (r1 == 0) goto L_0x0018
            r0 = 0
            android.view.Window r2 = r1.getWindow()     // Catch:{ Exception -> 0x006a, InterruptedException -> 0x0063 }
            if (r2 == 0) goto L_0x0056
            android.view.Window r2 = r1.getWindow()     // Catch:{ Exception -> 0x006a, InterruptedException -> 0x0063 }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x006a, InterruptedException -> 0x0063 }
            if (r2 == 0) goto L_0x0056
            android.view.Window r1 = r1.getWindow()     // Catch:{ Exception -> 0x006a, InterruptedException -> 0x0063 }
            android.view.View r1 = r1.getDecorView()     // Catch:{ Exception -> 0x006a, InterruptedException -> 0x0063 }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r2)     // Catch:{ Exception -> 0x006a, InterruptedException -> 0x0063 }
        L_0x0056:
            if (r0 == 0) goto L_0x0018
            if (r0 == 0) goto L_0x0018
            com.google.android.gms.internal.amy r1 = new com.google.android.gms.internal.amy     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            r1.<init>(r4, r0)     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            r0.post(r1)     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            goto L_0x0018
        L_0x0063:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.fn.b(r1, r0)
            goto L_0x0020
        L_0x006a:
            r1 = move-exception
            com.google.android.gms.internal.fa r2 = com.google.android.gms.ads.internal.au.i()     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.a((java.lang.Throwable) r1, (java.lang.String) r3)     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            java.lang.String r1 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.fn.b(r1)     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            goto L_0x0056
        L_0x007a:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.fn.b(r1, r0)
            com.google.android.gms.internal.bfi r1 = r4.f
            java.lang.String r2 = "ContentFetchTask.run"
            r1.a(r0, r2)
            goto L_0x0020
        L_0x0088:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.fn.b(r0)     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            r4.f()     // Catch:{ InterruptedException -> 0x0063, Exception -> 0x007a }
            goto L_0x0018
        L_0x0091:
            monitor-exit(r1)     // Catch:{ all -> 0x0094 }
            goto L_0x0000
        L_0x0094:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0094 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.amx.run():void");
    }
}
