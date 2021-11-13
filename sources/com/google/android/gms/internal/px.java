package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public abstract class px<K, V> {
    private static final String a = px.class.getSimpleName();

    protected static <K, V> HashMap<K, V> b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            Log.d(a, "decode object failure");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract HashMap<K, V> a();

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    public String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(a());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e) {
            return null;
        }
    }
}
