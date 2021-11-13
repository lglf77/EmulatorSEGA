package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.internal.xr;
import java.util.ArrayList;
import java.util.List;

public final class d {
    private final Context a;
    private final xr b;
    private final View c;

    public d(Context context, xr xrVar, View view) {
        this.a = context;
        this.b = xrVar;
        this.c = view;
    }

    private static Intent a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    private static Intent a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    private final ResolveInfo a(Intent intent) {
        return a(intent, (ArrayList<ResolveInfo>) new ArrayList());
    }

    private final ResolveInfo a(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo;
        Throwable th;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= queryIntentActivities.size()) {
                        break;
                    }
                    ResolveInfo resolveInfo2 = queryIntentActivities.get(i2);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i = i2 + 1;
                }
                arrayList.addAll(queryIntentActivities);
                return resolveInfo;
            }
            resolveInfo = null;
            try {
                arrayList.addAll(queryIntentActivities);
                return resolveInfo;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            resolveInfo = null;
            th = th4;
            au.i().a(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
            return resolveInfo;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent a(java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            r12 = this;
            r3 = 0
            r4 = 0
            android.content.Context r0 = r12.a
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.lang.String r1 = "u"
            java.lang.Object r1 = r13.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x001b
        L_0x001a:
            return r3
        L_0x001b:
            com.google.android.gms.ads.internal.au.e()
            android.content.Context r2 = r12.a
            com.google.android.gms.internal.xr r5 = r12.b
            android.view.View r6 = r12.c
            java.lang.String r1 = com.google.android.gms.internal.gw.a((android.content.Context) r2, (com.google.android.gms.internal.xr) r5, (java.lang.String) r1, (android.view.View) r6, (android.app.Activity) r3)
            android.net.Uri r5 = android.net.Uri.parse(r1)
            java.lang.String r1 = "use_first_package"
            java.lang.Object r1 = r13.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r7 = java.lang.Boolean.parseBoolean(r1)
            java.lang.String r1 = "use_running_process"
            java.lang.Object r1 = r13.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r6 = java.lang.Boolean.parseBoolean(r1)
            java.lang.String r1 = "use_custom_tabs"
            java.lang.Object r1 = r13.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            if (r1 != 0) goto L_0x0064
            com.google.android.gms.internal.asl<java.lang.Boolean> r1 = com.google.android.gms.internal.asw.cw
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00ac
        L_0x0064:
            r1 = 1
            r2 = r1
        L_0x0066:
            java.lang.String r1 = "http"
            java.lang.String r8 = r5.getScheme()
            boolean r1 = r1.equalsIgnoreCase(r8)
            if (r1 == 0) goto L_0x00ae
            android.net.Uri$Builder r1 = r5.buildUpon()
            java.lang.String r3 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r3)
            android.net.Uri r1 = r1.build()
            r3 = r1
        L_0x0081:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.Intent r5 = a((android.net.Uri) r5)
            android.content.Intent r3 = a((android.net.Uri) r3)
            if (r2 == 0) goto L_0x00a0
            com.google.android.gms.ads.internal.au.e()
            android.content.Context r2 = r12.a
            com.google.android.gms.internal.gw.b((android.content.Context) r2, (android.content.Intent) r5)
            com.google.android.gms.ads.internal.au.e()
            android.content.Context r2 = r12.a
            com.google.android.gms.internal.gw.b((android.content.Context) r2, (android.content.Intent) r3)
        L_0x00a0:
            android.content.pm.ResolveInfo r2 = r12.a((android.content.Intent) r5, (java.util.ArrayList<android.content.pm.ResolveInfo>) r1)
            if (r2 == 0) goto L_0x00ca
            android.content.Intent r3 = a((android.content.Intent) r5, (android.content.pm.ResolveInfo) r2)
            goto L_0x001a
        L_0x00ac:
            r2 = r4
            goto L_0x0066
        L_0x00ae:
            java.lang.String r1 = "https"
            java.lang.String r8 = r5.getScheme()
            boolean r1 = r1.equalsIgnoreCase(r8)
            if (r1 == 0) goto L_0x0081
            android.net.Uri$Builder r1 = r5.buildUpon()
            java.lang.String r3 = "http"
            android.net.Uri$Builder r1 = r1.scheme(r3)
            android.net.Uri r1 = r1.build()
            r3 = r1
            goto L_0x0081
        L_0x00ca:
            if (r3 == 0) goto L_0x00dc
            android.content.pm.ResolveInfo r2 = r12.a((android.content.Intent) r3)
            if (r2 == 0) goto L_0x00dc
            android.content.Intent r3 = a((android.content.Intent) r5, (android.content.pm.ResolveInfo) r2)
            android.content.pm.ResolveInfo r2 = r12.a((android.content.Intent) r3)
            if (r2 != 0) goto L_0x001a
        L_0x00dc:
            int r2 = r1.size()
            if (r2 != 0) goto L_0x00e5
            r3 = r5
            goto L_0x001a
        L_0x00e5:
            if (r6 == 0) goto L_0x0125
            if (r0 == 0) goto L_0x0125
            java.util.List r8 = r0.getRunningAppProcesses()
            if (r8 == 0) goto L_0x0125
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            r3 = r4
        L_0x00f7:
            if (r3 >= r9) goto L_0x0125
            java.lang.Object r2 = r0.get(r3)
            int r6 = r3 + 1
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            java.util.Iterator r10 = r8.iterator()
        L_0x0105:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0123
            java.lang.Object r3 = r10.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            java.lang.String r3 = r3.processName
            android.content.pm.ActivityInfo r11 = r2.activityInfo
            java.lang.String r11 = r11.packageName
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x0105
            android.content.Intent r3 = a((android.content.Intent) r5, (android.content.pm.ResolveInfo) r2)
            goto L_0x001a
        L_0x0123:
            r3 = r6
            goto L_0x00f7
        L_0x0125:
            if (r7 == 0) goto L_0x0133
            java.lang.Object r0 = r1.get(r4)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.Intent r3 = a((android.content.Intent) r5, (android.content.pm.ResolveInfo) r0)
            goto L_0x001a
        L_0x0133:
            r3 = r5
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.d.a(java.util.Map):android.content.Intent");
    }
}
