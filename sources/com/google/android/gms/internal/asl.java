package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

@bfk
public abstract class asl<T> {
    private final int a;
    private final String b;
    private final T c;

    private asl(int i, String str, T t) {
        this.a = i;
        this.b = str;
        this.c = t;
        app.e().a(this);
    }

    /* synthetic */ asl(int i, String str, Object obj, asm asm) {
        this(i, str, obj);
    }

    public static asl<String> a(int i, String str) {
        asl<String> a2 = a(i, str, (String) null);
        app.e().b(a2);
        return a2;
    }

    public static asl<Float> a(int i, String str, float f) {
        return new asq(i, str, Float.valueOf(0.0f));
    }

    public static asl<Integer> a(int i, String str, int i2) {
        return new asn(i, str, Integer.valueOf(i2));
    }

    public static asl<Long> a(int i, String str, long j) {
        return new asp(i, str, Long.valueOf(j));
    }

    public static asl<Boolean> a(int i, String str, Boolean bool) {
        return new asm(i, str, bool);
    }

    public static asl<String> a(int i, String str, String str2) {
        return new asr(i, str, str2);
    }

    public static asl<String> b(int i, String str) {
        asl<String> a2 = a(i, str, (String) null);
        app.e().c(a2);
        return a2;
    }

    /* access modifiers changed from: protected */
    public abstract T a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    public abstract T a(JSONObject jSONObject);

    public final String a() {
        return this.b;
    }

    public abstract void a(SharedPreferences.Editor editor, T t);

    public final T b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }
}
