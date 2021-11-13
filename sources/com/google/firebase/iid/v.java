package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.j;
import com.google.firebase.a;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

final class v {
    private final Context a;
    private String b;
    private String c;
    private int d;
    private int e = 0;

    public v(Context context) {
        this.a = context;
    }

    private final PackageInfo a(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Failed to find package ").append(valueOf).toString());
            return null;
        }
    }

    public static String a(a aVar) {
        String b2 = aVar.c().b();
        if (b2 != null) {
            return b2;
        }
        String a2 = aVar.c().a();
        if (!a2.startsWith("1:")) {
            return a2;
        }
        String[] split = a2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e2) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private final synchronized void e() {
        PackageInfo a2 = a(this.a.getPackageName());
        if (a2 != null) {
            this.b = Integer.toString(a2.versionCode);
            this.c = a2.versionName;
        }
    }

    public final synchronized int a() {
        int i = 0;
        synchronized (this) {
            if (this.e != 0) {
                i = this.e;
            } else {
                PackageManager packageManager = this.a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                } else {
                    if (!j.i()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.e = 1;
                            i = this.e;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                        if (j.i()) {
                            this.e = 2;
                        } else {
                            this.e = 1;
                        }
                        i = this.e;
                    } else {
                        this.e = 2;
                        i = this.e;
                    }
                }
            }
        }
        return i;
    }

    public final synchronized String b() {
        if (this.b == null) {
            e();
        }
        return this.b;
    }

    public final synchronized String c() {
        if (this.c == null) {
            e();
        }
        return this.c;
    }

    public final synchronized int d() {
        PackageInfo a2;
        if (this.d == 0 && (a2 = a("com.google.android.gms")) != null) {
            this.d = a2.versionCode;
        }
        return this.d;
    }
}
