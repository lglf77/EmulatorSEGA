package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.n;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

final class z {
    private SharedPreferences a;
    private Context b;

    public z(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    private z(Context context, String str) {
        this.b = context;
        this.a = context.getSharedPreferences(str, 0);
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("-no-backup");
        File file = new File(n.a(this.b), valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !c()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    b();
                    FirebaseInstanceId.a().h();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf3 = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf3.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf3) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    private static String a(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + String.valueOf("|S|").length() + String.valueOf(str2).length()).append(str).append("|S|").append(str2).toString();
    }

    private static String b(String str, String str2, String str3) {
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf("|T|").length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append("|T|").append(str2).append("|").append(str3).toString();
    }

    private final synchronized boolean c() {
        return this.a.getAll().isEmpty();
    }

    private final void f(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        for (String next : this.a.getAll().keySet()) {
            if (next.startsWith(str)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }

    public final synchronized aa a(String str, String str2, String str3) {
        return aa.a(this.a.getString(b(str, str2, str3), (String) null));
    }

    public final synchronized String a() {
        String str = null;
        synchronized (this) {
            String string = this.a.getString("topic_operaion_queue", (String) null);
            if (string != null) {
                String[] split = string.split(",");
                if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                    str = split[1];
                }
            }
        }
        return str;
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String a2 = aa.a(str4, str5, System.currentTimeMillis());
        if (a2 != null) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(b(str, str2, str3), a2);
            edit.commit();
        }
    }

    public final synchronized boolean a(String str) {
        boolean z;
        String string = this.a.getString("topic_operaion_queue", "");
        String valueOf = String.valueOf(",");
        String valueOf2 = String.valueOf(str);
        if (string.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
            String valueOf3 = String.valueOf(",");
            String valueOf4 = String.valueOf(str);
            this.a.edit().putString("topic_operaion_queue", string.substring((valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).length())).apply();
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final synchronized KeyPair b(String str) {
        KeyPair a2;
        a2 = a.a();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(a(str, "|P|"), Base64.encodeToString(a2.getPublic().getEncoded(), 11));
        edit.putString(a(str, "|K|"), Base64.encodeToString(a2.getPrivate().getEncoded(), 11));
        edit.putString(a(str, "cre"), Long.toString(currentTimeMillis));
        edit.commit();
        return a2;
    }

    public final synchronized void b() {
        this.a.edit().clear().commit();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(String str) {
        f(String.valueOf(str).concat("|"));
    }

    public final synchronized void d(String str) {
        f(String.valueOf(str).concat("|T|"));
    }

    public final synchronized KeyPair e(String str) {
        KeyPair keyPair;
        String string = this.a.getString(a(str, "|P|"), (String) null);
        String string2 = this.a.getString(a(str, "|K|"), (String) null);
        if (string == null || string2 == null) {
            keyPair = null;
        } else {
            try {
                byte[] decode = Base64.decode(string, 8);
                byte[] decode2 = Base64.decode(string2, 8);
                KeyFactory instance = KeyFactory.getInstance("RSA");
                keyPair = new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 19).append("Invalid key stored ").append(valueOf).toString());
                FirebaseInstanceId.a().h();
                keyPair = null;
            }
        }
        return keyPair;
    }
}
