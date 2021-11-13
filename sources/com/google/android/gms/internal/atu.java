package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import java.util.List;

@bfk
public final class atu implements ale {
    private CustomTabsClient a;
    private CustomTabsServiceConnection b;
    private atv c;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || resolveActivity == null) {
            return false;
        }
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                return resolveActivity.activityInfo.packageName.equals(alc.a(context));
            }
        }
        return false;
    }

    public final void a(Activity activity) {
        String a2;
        if (this.a == null && (a2 = alc.a(activity)) != null) {
            this.b = new ald(this);
            CustomTabsClient.bindCustomTabsService(activity, a2, this.b);
        }
    }

    public final void a(atv atv) {
        this.c = atv;
    }
}
