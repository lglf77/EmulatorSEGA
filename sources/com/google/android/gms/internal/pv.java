package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.j;

public final class pv {
    private Context a;

    public pv(Context context) {
        this.a = context;
    }

    public final int a(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public final int a(String str, String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    public final ApplicationInfo a(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final boolean a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return pu.a(this.a);
        }
        if (!j.i() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean a(int i, String str) {
        if (j.e()) {
            try {
                ((AppOpsManager) this.a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        } else {
            String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
            if (str == null || packagesForUid == null) {
                return false;
            }
            for (String equals : packagesForUid) {
                if (str.equals(equals)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final String[] a(int i) {
        return this.a.getPackageManager().getPackagesForUid(i);
    }

    public final PackageInfo b(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final CharSequence b(String str) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }
}
