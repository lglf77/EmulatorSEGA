package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.qh;

@DynamiteApi
public class FlagProviderImpl extends qh {
    private boolean a = false;
    private SharedPreferences b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return !this.a ? z : b.a(this.b, str, Boolean.valueOf(z)).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        return !this.a ? i : d.a(this.b, str, Integer.valueOf(i)).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        return !this.a ? j : f.a(this.b, str, Long.valueOf(j)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        return !this.a ? str2 : h.a(this.b, str, str2);
    }

    public void init(a aVar) {
        Context context = (Context) c.a(aVar);
        if (!this.a) {
            try {
                this.b = j.a(context.createPackageContext("com.google.android.gms", 0));
                this.a = true;
            } catch (PackageManager.NameNotFoundException e) {
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
            }
        }
    }
}
