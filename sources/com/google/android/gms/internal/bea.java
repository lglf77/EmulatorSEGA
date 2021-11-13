package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ac;
import com.google.android.gms.ads.internal.au;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class bea implements Callable<ev> {
    private static long a = 10;
    private final Context b;
    private final Cif c;
    /* access modifiers changed from: private */
    public final ac d;
    private final xr e;
    private final beq f;
    private final Object g = new Object();
    private final ew h;
    private final atj i;
    private boolean j;
    private int k;
    private List<String> l;
    private JSONObject m;
    private String n;

    public bea(Context context, ac acVar, Cif ifVar, xr xrVar, ew ewVar, atj atj) {
        this.b = context;
        this.d = acVar;
        this.c = ifVar;
        this.h = ewVar;
        this.e = xrVar;
        this.i = atj;
        this.f = acVar.F();
        this.j = false;
        this.k = -2;
        this.l = null;
        this.n = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r2.length() != 0) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f A[Catch:{ InterruptedException | CancellationException -> 0x0152, ExecutionException -> 0x0165, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0157  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ev call() {
        /*
            r13 = this;
            r11 = 0
            r12 = 0
            com.google.android.gms.ads.internal.ac r2 = r13.d     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.String r10 = r2.g_()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            boolean r2 = r13.b()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 != 0) goto L_0x00ad
            com.google.android.gms.internal.ks r2 = new com.google.android.gms.internal.ks     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r2.<init>()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.bdz r2 = new com.google.android.gms.internal.bdz     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r2.<init>()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.ew r2 = r13.h     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.z r2 = r2.b     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.String r2 = r2.b     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r3.<init>(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.ew r4 = r13.h     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.z r4 = r4.b     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.String r4 = r4.b     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r2.<init>(r4)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            int r4 = r2.length()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r4 == 0) goto L_0x0049
            java.lang.String r4 = "ads"
            org.json.JSONArray r2 = r2.optJSONArray(r4)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 == 0) goto L_0x00ab
            r4 = 0
            org.json.JSONObject r2 = r2.optJSONObject(r4)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
        L_0x0041:
            if (r2 == 0) goto L_0x0049
            int r2 = r2.length()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 != 0) goto L_0x004d
        L_0x0049:
            r2 = 3
            r13.a((int) r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
        L_0x004d:
            com.google.android.gms.internal.beq r2 = r13.f     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.kh r2 = r2.a(r3)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            long r4 = a     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.Object r2 = r2.get(r4, r3)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.String r3 = "success"
            r4 = 0
            boolean r3 = r2.optBoolean(r3, r4)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = "json"
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.String r3 = "ads"
            org.json.JSONArray r2 = r2.optJSONArray(r3)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r3 = 0
            org.json.JSONObject r7 = r2.getJSONObject(r3)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
        L_0x0077:
            boolean r2 = r13.b()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 != 0) goto L_0x007f
            if (r7 != 0) goto L_0x00af
        L_0x007f:
            r3 = r11
        L_0x0080:
            boolean r2 = r13.b()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 != 0) goto L_0x008a
            if (r3 == 0) goto L_0x008a
            if (r7 != 0) goto L_0x0167
        L_0x008a:
            r3 = r11
        L_0x008b:
            boolean r2 = r3 instanceof com.google.android.gms.internal.aud     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 == 0) goto L_0x00a6
            r0 = r3
            com.google.android.gms.internal.aud r0 = (com.google.android.gms.internal.aud) r0     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r2 = r0
            com.google.android.gms.internal.bdz r4 = new com.google.android.gms.internal.bdz     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r4.<init>()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.bec r5 = new com.google.android.gms.internal.bec     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r5.<init>(r13, r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r4.a = r5     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.beq r2 = r13.f     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.String r4 = "/nativeAdCustomClick"
            r2.a((java.lang.String) r4, r5)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
        L_0x00a6:
            com.google.android.gms.internal.ev r2 = r13.a((com.google.android.gms.internal.auk) r3)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
        L_0x00aa:
            return r2
        L_0x00ab:
            r2 = r11
            goto L_0x0041
        L_0x00ad:
            r7 = r11
            goto L_0x0077
        L_0x00af:
            java.lang.String r2 = "template_id"
            java.lang.String r5 = r7.getString(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.ew r2 = r13.h     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.v r2 = r2.a     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.auv r2 = r2.y     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 == 0) goto L_0x00ea
            com.google.android.gms.internal.ew r2 = r13.h     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.v r2 = r2.a     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.auv r2 = r2.y     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            boolean r2 = r2.b     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r4 = r2
        L_0x00c6:
            com.google.android.gms.internal.ew r2 = r13.h     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.v r2 = r2.a     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.auv r2 = r2.y     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 == 0) goto L_0x00ec
            com.google.android.gms.internal.ew r2 = r13.h     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.v r2 = r2.a     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.auv r2 = r2.y     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            boolean r2 = r2.d     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r3 = r2
        L_0x00d7:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r5)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 == 0) goto L_0x00ee
            com.google.android.gms.internal.ber r2 = new com.google.android.gms.internal.ber     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.ew r5 = r13.h     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            boolean r5 = r5.j     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r2.<init>(r4, r3, r5)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r3 = r2
            goto L_0x0080
        L_0x00ea:
            r4 = r12
            goto L_0x00c6
        L_0x00ec:
            r3 = r12
            goto L_0x00d7
        L_0x00ee:
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r5)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 == 0) goto L_0x0101
            com.google.android.gms.internal.bes r2 = new com.google.android.gms.internal.bes     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.ew r5 = r13.h     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            boolean r5 = r5.j     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r2.<init>(r4, r3, r5)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r3 = r2
            goto L_0x0080
        L_0x0101:
            java.lang.String r2 = "3"
            boolean r2 = r2.equals(r5)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 == 0) goto L_0x0160
            java.lang.String r2 = "custom_template_id"
            java.lang.String r2 = r7.getString(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.ks r3 = new com.google.android.gms.internal.ks     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r3.<init>()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            android.os.Handler r5 = com.google.android.gms.internal.gw.a     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.beb r6 = new com.google.android.gms.internal.beb     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r6.<init>(r13, r3, r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r5.post(r6)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            long r8 = a     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.Object r2 = r3.get(r8, r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 == 0) goto L_0x0130
            com.google.android.gms.internal.bet r2 = new com.google.android.gms.internal.bet     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r2.<init>(r4)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r3 = r2
            goto L_0x0080
        L_0x0130:
            java.lang.String r3 = "No handler for custom template: "
            java.lang.String r2 = "custom_template_id"
            java.lang.String r2 = r7.getString(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            int r4 = r2.length()     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r4 == 0) goto L_0x014c
            java.lang.String r2 = r3.concat(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
        L_0x0146:
            com.google.android.gms.internal.fn.c(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
        L_0x0149:
            r3 = r11
            goto L_0x0080
        L_0x014c:
            java.lang.String r2 = new java.lang.String     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r2.<init>(r3)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            goto L_0x0146
        L_0x0152:
            r2 = move-exception
        L_0x0153:
            boolean r2 = r13.j
            if (r2 != 0) goto L_0x015a
            r13.a((int) r12)
        L_0x015a:
            com.google.android.gms.internal.ev r2 = r13.a((com.google.android.gms.internal.auk) r11)
            goto L_0x00aa
        L_0x0160:
            r2 = 0
            r13.a((int) r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            goto L_0x0149
        L_0x0165:
            r2 = move-exception
            goto L_0x0153
        L_0x0167:
            java.lang.String r2 = "tracking_urls_and_actions"
            org.json.JSONObject r4 = r7.getJSONObject(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.String r2 = "impression_tracking_urls"
            java.lang.String[] r2 = c(r4, r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            if (r2 != 0) goto L_0x01a5
            r2 = r11
        L_0x0176:
            r13.l = r2     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.String r2 = "active_view"
            org.json.JSONObject r2 = r4.optJSONObject(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r13.m = r2     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            java.lang.String r2 = "debug_signals"
            java.lang.String r2 = r7.optString(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r13.n = r2     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.auk r8 = r3.a(r13, r7)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.aum r2 = new com.google.android.gms.internal.aum     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            android.content.Context r3 = r13.b     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.ads.internal.ac r4 = r13.d     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.beq r5 = r13.f     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.xr r6 = r13.e     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.ew r9 = r13.h     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.v r9 = r9.a     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            com.google.android.gms.internal.jp r9 = r9.k     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r8.a(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            r3 = r8
            goto L_0x008b
        L_0x01a5:
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ CancellationException -> 0x0152, ExecutionException -> 0x0165, InterruptedException -> 0x01bf, JSONException -> 0x01aa, TimeoutException -> 0x01b1, Exception -> 0x01b8 }
            goto L_0x0176
        L_0x01aa:
            r2 = move-exception
            java.lang.String r3 = "Malformed native JSON response."
            com.google.android.gms.internal.fn.c(r3, r2)
            goto L_0x0153
        L_0x01b1:
            r2 = move-exception
            java.lang.String r3 = "Timeout when loading native ad."
            com.google.android.gms.internal.fn.c(r3, r2)
            goto L_0x0153
        L_0x01b8:
            r2 = move-exception
            java.lang.String r3 = "Error occured while doing native ads initialization."
            com.google.android.gms.internal.fn.c(r3, r2)
            goto L_0x0153
        L_0x01bf:
            r2 = move-exception
            goto L_0x0153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bea.call():com.google.android.gms.internal.ev");
    }

    private final ev a(auk auk) {
        int i2;
        synchronized (this.g) {
            i2 = this.k;
            if (auk == null && this.k == -2) {
                i2 = 0;
            }
        }
        return new ev(this.h.a.c, (mw) null, this.h.b.c, i2, this.h.b.e, this.l, this.h.b.k, this.h.b.j, this.h.a.i, false, (bab) null, (bav) null, (String) null, (bac) null, (bae) null, 0, this.h.d, this.h.b.f, this.h.f, this.h.g, this.h.b.n, this.m, i2 != -2 ? null : auk, (dw) null, (List<String>) null, (List<String>) null, this.h.b.D, this.h.b.E, (String) null, this.h.b.H, this.n, this.h.i, this.h.b.O, this.h.j);
    }

    private final kh<aty> a(JSONObject jSONObject, boolean z, boolean z2) {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? jx.a(new aty((Drawable) null, Uri.parse(string), optDouble)) : this.c.a(string, new bee(this, z, optDouble, optBoolean, string));
        }
        a(0, z);
        return jx.a(null);
    }

    static mw a(kh<mw> khVar) {
        try {
            return (mw) khVar.get((long) ((Integer) app.f().a(asw.bP)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            fn.c("InterruptedException occurred while waiting for video to load", e2);
            Thread.currentThread().interrupt();
        } catch (CancellationException | ExecutionException | TimeoutException e3) {
            fn.c("Exception occurred while waiting for video to load", e3);
        }
        return null;
    }

    private final void a(int i2) {
        synchronized (this.g) {
            this.j = true;
            this.k = i2;
        }
    }

    /* access modifiers changed from: private */
    public final void a(awe awe, String str) {
        try {
            awo b2 = this.d.b(awe.l());
            if (b2 != null) {
                b2.a(awe, str);
            }
        } catch (RemoteException e2) {
            fn.c(new StringBuilder(String.valueOf(str).length() + 40).append("Failed to call onCustomClick for asset ").append(str).append(".").toString(), e2);
        }
    }

    private static <V> kh<List<V>> b(List<kh<V>> list) {
        ks ksVar = new ks();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (kh<V> a2 : list) {
            a2.a(new bef(atomicInteger, size, ksVar, list), gq.a);
        }
        return ksVar;
    }

    private static Integer b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e2) {
            return null;
        }
    }

    private final boolean b() {
        boolean z;
        synchronized (this.g) {
            z = this.j;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public static <V> List<V> c(List<kh<V>> list) {
        ArrayList arrayList = new ArrayList();
        for (kh<V> khVar : list) {
            Object obj = khVar.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static String[] c(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            strArr[i2] = optJSONArray.getString(i2);
        }
        return strArr;
    }

    public final kh<atw> a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return jx.a(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b2 = b(optJSONObject, "text_color");
        Integer b3 = b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i2 = (this.h.a.y == null || this.h.a.y.a < 2) ? 1 : this.h.a.y.e;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(a(optJSONObject, "image", false, false));
        }
        return jx.a(b(arrayList), new bed(this, optString, b3, b2, optInt, optInt3, optInt2, i2, optBoolean), (Executor) gq.a);
    }

    public final kh<mw> a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return jx.a(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            fn.e("Required field 'vast_xml' is missing");
            return jx.a(null);
        }
        beh beh = new beh(this.b, this.e, this.h, this.i, this.d);
        ks ksVar = new ks();
        au.e();
        gw.a((Runnable) new bei(beh, optJSONObject, ksVar));
        return ksVar;
    }

    public final kh<aty> a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return a(jSONObject2, z, z2);
    }

    public final List<kh<aty>> a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            a(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(a(jSONObject2, false, z2));
        }
        return arrayList;
    }

    public final Future<aty> a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return a(jSONObject2, optBoolean, z);
    }

    public final void a(int i2, boolean z) {
        if (z) {
            a(i2);
        }
    }
}
