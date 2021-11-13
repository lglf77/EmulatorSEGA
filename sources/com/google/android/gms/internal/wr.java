package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.a;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.AppMeasurement;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.security.auth.x500.X500Principal;

public final class wr extends uk {
    private static String[] a = {"firebase_"};
    private SecureRandom b;
    private final AtomicLong c = new AtomicLong(0);
    private int d;

    wr(tk tkVar) {
        super(tkVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(java.lang.String r8, java.lang.Object r9, boolean r10) {
        /*
            r7 = this;
            r1 = 1
            r6 = 0
            if (r10 == 0) goto L_0x0039
            java.lang.String r2 = "param"
            boolean r0 = r9 instanceof android.os.Parcelable[]
            if (r0 == 0) goto L_0x0029
            r0 = r9
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0
            int r0 = r0.length
        L_0x000e:
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r3) goto L_0x0037
            com.google.android.gms.internal.sj r1 = r7.t()
            com.google.android.gms.internal.sl r1 = r1.A()
            java.lang.String r3 = "Parameter array is too long; discarded. Value kind, name, array length"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.a(r3, r2, r8, r0)
            r0 = r6
        L_0x0024:
            if (r0 != 0) goto L_0x0039
            r0 = 17
        L_0x0028:
            return r0
        L_0x0029:
            boolean r0 = r9 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0035
            r0 = r9
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            goto L_0x000e
        L_0x0035:
            r0 = r1
            goto L_0x0024
        L_0x0037:
            r0 = r1
            goto L_0x0024
        L_0x0039:
            boolean r0 = i(r8)
            if (r0 == 0) goto L_0x004f
            java.lang.String r1 = "param"
            r3 = 256(0x100, float:3.59E-43)
            r0 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            boolean r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.Object) r4, (boolean) r5)
        L_0x004b:
            if (r0 == 0) goto L_0x005c
            r0 = r6
            goto L_0x0028
        L_0x004f:
            java.lang.String r1 = "param"
            r3 = 100
            r0 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            boolean r0 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r3, (java.lang.Object) r4, (boolean) r5)
            goto L_0x004b
        L_0x005c:
            r0 = 4
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wr.a(java.lang.String, java.lang.Object, boolean):int");
    }

    private static Object a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return a(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    public static Object a(xd xdVar, String str) {
        for (xe xeVar : xdVar.a) {
            if (xeVar.a.equals(str)) {
                if (xeVar.b != null) {
                    return xeVar.b;
                }
                if (xeVar.c != null) {
                    return xeVar.c;
                }
                if (xeVar.d != null) {
                    return xeVar.d;
                }
            }
        }
        return null;
    }

    public static String a(String str, int i, boolean z) {
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public static String a(String str, String[] strArr, String[] strArr2) {
        y.a(strArr);
        y.a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            if (a(str, strArr[i])) {
                return strArr2[i];
            }
        }
        return null;
    }

    private static void a(Bundle bundle, Object obj) {
        y.a(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r1 = r1.getServiceInfo(new android.content.ComponentName(r4, r5), 4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001a }
            if (r1 != 0) goto L_0x0008
        L_0x0007:
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x001a }
            r2.<init>(r4, r5)     // Catch:{ NameNotFoundException -> 0x001a }
            r3 = 4
            android.content.pm.ServiceInfo r1 = r1.getServiceInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x001a }
            if (r1 == 0) goto L_0x0007
            boolean r1 = r1.enabled     // Catch:{ NameNotFoundException -> 0x001a }
            if (r1 == 0) goto L_0x0007
            r0 = 1
            goto L_0x0007
        L_0x001a:
            r1 = move-exception
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wr.a(android.content.Context, java.lang.String):boolean");
    }

    public static boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    private static boolean a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    static boolean a(rx rxVar, re reVar) {
        y.a(rxVar);
        y.a(reVar);
        return !TextUtils.isEmpty(reVar.b);
    }

    static boolean a(String str) {
        y.a(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private final boolean a(String str, int i, String str2) {
        if (str2 == null) {
            t().y().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            t().y().a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    public static boolean a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    private final boolean a(String str, String str2, int i, Object obj, boolean z) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) <= i) {
                return true;
            }
            t().A().a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
            return false;
        } else if ((obj instanceof Bundle) && z) {
            return true;
        } else {
            if ((obj instanceof Parcelable[]) && z) {
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (!(parcelable instanceof Bundle)) {
                        t().A().a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof ArrayList) || !z) {
                return false;
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (!(obj2 instanceof Bundle)) {
                        t().A().a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
        }
    }

    private final boolean a(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            t().y().a("Name is required and can't be null. Type", str);
            return false;
        }
        y.a(str2);
        int i = 0;
        while (true) {
            if (i >= a.length) {
                z = false;
                break;
            } else if (str2.startsWith(a[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            t().y().a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            y.a(strArr);
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    z2 = false;
                    break;
                } else if (a(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                t().y().a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    public static boolean a(long[] jArr, int i) {
        return i < (jArr.length << 6) && (jArr[i / 64] & (1 << (i % 64))) != 0;
    }

    static byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static long[] a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        int i = 0;
        while (i < length) {
            jArr[i] = 0;
            int i2 = 0;
            while (i2 < 64 && (i << 6) + i2 < bitSet.length()) {
                if (bitSet.get((i << 6) + i2)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
                i2++;
            }
            i++;
        }
        return jArr;
    }

    public static Bundle[] a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            return (Bundle[]) Arrays.copyOf((Parcelable[]) obj, ((Parcelable[]) obj).length, Bundle[].class);
        } else {
            if (!(obj instanceof ArrayList)) {
                return null;
            }
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    static xe[] a(xe[] xeVarArr, String str, Object obj) {
        int length = xeVarArr.length;
        int i = 0;
        while (i < length) {
            xe xeVar = xeVarArr[i];
            if (Objects.equals(xeVar.a, str)) {
                xeVar.c = null;
                xeVar.b = null;
                xeVar.d = null;
                if (obj instanceof Long) {
                    xeVar.c = (Long) obj;
                    return xeVarArr;
                } else if (obj instanceof String) {
                    xeVar.b = (String) obj;
                    return xeVarArr;
                } else if (!(obj instanceof Double)) {
                    return xeVarArr;
                } else {
                    xeVar.d = (Double) obj;
                    return xeVarArr;
                }
            } else {
                i++;
            }
        }
        xe[] xeVarArr2 = new xe[(xeVarArr.length + 1)];
        System.arraycopy(xeVarArr, 0, xeVarArr2, 0, xeVarArr.length);
        xe xeVar2 = new xe();
        xeVar2.a = str;
        if (obj instanceof Long) {
            xeVar2.c = (Long) obj;
        } else if (obj instanceof String) {
            xeVar2.b = (String) obj;
        } else if (obj instanceof Double) {
            xeVar2.d = (Double) obj;
        }
        xeVarArr2[xeVarArr.length] = xeVar2;
        return xeVarArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[Catch:{ IOException | ClassNotFoundException -> 0x003c }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038 A[Catch:{ IOException | ClassNotFoundException -> 0x003c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object b(java.lang.Object r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
        L_0x0003:
            return r0
        L_0x0004:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x002e }
            r1.<init>()     // Catch:{ all -> 0x002e }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x002e }
            r3.<init>(r1)     // Catch:{ all -> 0x002e }
            r3.writeObject(r5)     // Catch:{ all -> 0x0040 }
            r3.flush()     // Catch:{ all -> 0x0040 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0040 }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0040 }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x0040 }
            r4.<init>(r1)     // Catch:{ all -> 0x0040 }
            r2.<init>(r4)     // Catch:{ all -> 0x0040 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ all -> 0x0043 }
            r3.close()     // Catch:{ IOException -> 0x003c, ClassNotFoundException -> 0x003e }
            r2.close()     // Catch:{ IOException -> 0x003c, ClassNotFoundException -> 0x003e }
            r0 = r1
            goto L_0x0003
        L_0x002e:
            r1 = move-exception
            r2 = r0
            r3 = r0
        L_0x0031:
            if (r3 == 0) goto L_0x0036
            r3.close()     // Catch:{ IOException -> 0x003c, ClassNotFoundException -> 0x003e }
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r2.close()     // Catch:{ IOException -> 0x003c, ClassNotFoundException -> 0x003e }
        L_0x003b:
            throw r1     // Catch:{ IOException -> 0x003c, ClassNotFoundException -> 0x003e }
        L_0x003c:
            r1 = move-exception
            goto L_0x0003
        L_0x003e:
            r1 = move-exception
            goto L_0x0003
        L_0x0040:
            r1 = move-exception
            r2 = r0
            goto L_0x0031
        L_0x0043:
            r1 = move-exception
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wr.b(java.lang.Object):java.lang.Object");
    }

    private final boolean b(String str, String str2) {
        if (str2 == null) {
            t().y().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            t().y().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                t().y().a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    t().y().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    static long c(byte[] bArr) {
        int i = 0;
        y.a(bArr);
        y.a(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    private final boolean c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b2 = pw.a(context).b(str, 64);
            if (!(b2 == null || b2.signatures == null || b2.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b2.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            t().y().a("Error obtaining certificate", e);
        } catch (PackageManager.NameNotFoundException e2) {
            t().y().a("Package name not found", e2);
        }
        return true;
    }

    private final boolean c(String str, String str2) {
        if (str2 == null) {
            t().y().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            t().y().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        t().y().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            t().y().a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    static MessageDigest g(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 2) {
                return null;
            }
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i = i2 + 1;
            } catch (NoSuchAlgorithmException e) {
            }
        }
    }

    public static boolean i(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    static boolean k(String str) {
        return str != null && str.matches("(\\+|-)?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean n(String str) {
        y.a(str);
        char c2 = 65535;
        switch (str.hashCode()) {
            case 94660:
                if (str.equals("_in")) {
                    c2 = 0;
                    break;
                }
                break;
            case 95025:
                if (str.equals("_ug")) {
                    c2 = 2;
                    break;
                }
                break;
            case 95027:
                if (str.equals("_ui")) {
                    c2 = 1;
                    break;
                }
                break;
        }
        switch (c2) {
            case a.b.AdsAttrs_adSize:
            case a.b.AdsAttrs_adSizes:
            case 2:
                return true;
            default:
                return false;
        }
    }

    private final int o(String str) {
        if (!b("event param", str)) {
            return 3;
        }
        if (!a("event param", (String[]) null, str)) {
            return 14;
        }
        return a("event param", 40, str) ? 0 : 3;
    }

    private final int p(String str) {
        if (!c("event param", str)) {
            return 3;
        }
        if (!a("event param", (String[]) null, str)) {
            return 14;
        }
        return a("event param", 40, str) ? 0 : 3;
    }

    private static int q(String str) {
        return "_ldl".equals(str) ? 2048 : 36;
    }

    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        Bundle bundle = null;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                if (!TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str)) {
                    bundle = new Bundle();
                    if (!TextUtils.isEmpty(str4)) {
                        bundle.putString("campaign", str4);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bundle.putString("source", str3);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        bundle.putString("medium", str2);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putString("gclid", str);
                    }
                    String queryParameter = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("term", queryParameter);
                    }
                    String queryParameter2 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("content", queryParameter2);
                    }
                    String queryParameter3 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("aclid", queryParameter3);
                    }
                    String queryParameter4 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("cp1", queryParameter4);
                    }
                    String queryParameter5 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("anid", queryParameter5);
                    }
                }
            } catch (UnsupportedOperationException e) {
                t().A().a("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a2 = a(str, bundle.get(str));
                if (a2 == null) {
                    t().A().a("Param value can't be null", o().b(str));
                } else {
                    a(bundle2, str, a2);
                }
            }
        }
        return bundle2;
    }

    public final Bundle a(String str, Bundle bundle, List<String> list, boolean z, boolean z2) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int i = 0;
        for (String str2 : bundle.keySet()) {
            int i2 = 0;
            if (list == null || !list.contains(str2)) {
                if (z) {
                    i2 = o(str2);
                }
                if (i2 == 0) {
                    i2 = p(str2);
                }
            }
            if (i2 != 0) {
                if (a(bundle2, i2)) {
                    bundle2.putString("_ev", a(str2, 40, true));
                    if (i2 == 3) {
                        a(bundle2, (Object) str2);
                    }
                }
                bundle2.remove(str2);
            } else {
                int a2 = a(str2, bundle.get(str2), z2);
                if (a2 != 0 && !"_ev".equals(str2)) {
                    if (a(bundle2, a2)) {
                        bundle2.putString("_ev", a(str2, 40, true));
                        a(bundle2, bundle.get(str2));
                    }
                    bundle2.remove(str2);
                } else if (!a(str2) || (i = i + 1) <= 25) {
                    i = i;
                } else {
                    t().y().a(new StringBuilder(48).append("Event can't contain more then 25 params").toString(), o().a(str), o().a(bundle));
                    a(bundle2, 5);
                    bundle2.remove(str2);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final <T extends Parcelable> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            T t = (Parcelable) creator.createFromParcel(obtain);
            obtain.recycle();
            return t;
        } catch (pr e) {
            t().y().a("Failed to load parcelable from buffer");
            obtain.recycle();
            return null;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final rx a(String str, Bundle bundle, String str2, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (c(str) != 0) {
            t().y().a("Invalid conditional property event name", o().c(str));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        return new rx(str, new rt(a(a(str, bundle2, (List<String>) Collections.singletonList("_o"), false, false))), str2, j);
    }

    public final Object a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return a(256, obj, true);
        }
        if (!i(str)) {
            i = 100;
        }
        return a(i, obj, false);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(int i, String str, String str2, int i2) {
        a((String) null, i, str, str2, i2);
    }

    public final void a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (str != null) {
                t().B().a("Not putting event parameter. Invalid value type. name, type", o().b(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void a(xe xeVar, Object obj) {
        y.a(obj);
        xeVar.b = null;
        xeVar.c = null;
        xeVar.d = null;
        if (obj instanceof String) {
            xeVar.b = (String) obj;
        } else if (obj instanceof Long) {
            xeVar.c = (Long) obj;
        } else if (obj instanceof Double) {
            xeVar.d = (Double) obj;
        } else {
            t().y().a("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void a(xi xiVar, Object obj) {
        y.a(obj);
        xiVar.c = null;
        xiVar.d = null;
        xiVar.e = null;
        if (obj instanceof String) {
            xiVar.c = (String) obj;
        } else if (obj instanceof Long) {
            xiVar.d = (Long) obj;
        } else if (obj instanceof Double) {
            xiVar.e = (Double) obj;
        } else {
            t().y().a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        a(bundle, i);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.p.l().a("auto", "_err", bundle);
    }

    public final boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(k().a() - j) > j2;
    }

    public final byte[] a(xf xfVar) {
        try {
            byte[] bArr = new byte[xfVar.f()];
            ajx a2 = ajx.a(bArr, 0, bArr.length);
            xfVar.a(a2);
            a2.a();
            return bArr;
        } catch (IOException e) {
            t().y().a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    public final byte[] a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            t().y().a("Failed to gzip content", e);
            throw e;
        }
    }

    public final int b(String str) {
        if (!b("event", str)) {
            return 2;
        }
        if (!a("event", AppMeasurement.a.a, str)) {
            return 13;
        }
        return a("event", 40, str) ? 0 : 2;
    }

    public final int b(String str, Object obj) {
        return "_ldl".equals(str) ? a("user property referrer", str, q(str), obj, false) : a("user property", str, q(str), obj, false) ? 0 : 7;
    }

    /* access modifiers changed from: package-private */
    public final long b(Context context, String str) {
        c();
        y.a(context);
        y.a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest g = g("MD5");
        if (g == null) {
            t().y().a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!c(context, str)) {
                    PackageInfo b2 = pw.a(context).b(l().getPackageName(), 64);
                    if (b2.signatures != null && b2.signatures.length > 0) {
                        return c(g.digest(b2.signatures[0].toByteArray()));
                    }
                    t().A().a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e) {
                t().y().a("Package name not found", e);
            }
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final byte[] b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            t().y().a("Failed to ungzip content", e);
            throw e;
        }
    }

    public final int c(String str) {
        if (!c("event", str)) {
            return 2;
        }
        if (!a("event", AppMeasurement.a.a, str)) {
            return 13;
        }
        return a("event", 40, str) ? 0 : 2;
    }

    public final Object c(String str, Object obj) {
        return "_ldl".equals(str) ? a(q(str), obj, true) : a(q(str), obj, false);
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final int d(String str) {
        if (!b("user property", str)) {
            return 6;
        }
        if (!a("user property", AppMeasurement.e.a, str)) {
            return 15;
        }
        return a("user property", 24, str) ? 0 : 6;
    }

    public final /* bridge */ /* synthetic */ qz d() {
        return super.d();
    }

    public final int e(String str) {
        if (!c("user property", str)) {
            return 6;
        }
        if (!a("user property", AppMeasurement.e.a, str)) {
            return 15;
        }
        return a("user property", 24, str) ? 0 : 6;
    }

    public final /* bridge */ /* synthetic */ rg e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ um f() {
        return super.f();
    }

    public final boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            t().y().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        y.a(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        t().y().a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", str);
        return false;
    }

    public final /* bridge */ /* synthetic */ se g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ rq h() {
        return super.h();
    }

    public final boolean h(String str) {
        c();
        if (pw.a(l()).a(str) == 0) {
            return true;
        }
        t().D().a("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: protected */
    public final void h_() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                t().A().a("Utils falling back to Random for random id");
            }
        }
        this.c.set(nextLong);
    }

    public final /* bridge */ /* synthetic */ vg i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ vc j() {
        return super.j();
    }

    public final boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return v().A().equals(str);
    }

    public final /* bridge */ /* synthetic */ d k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Context l() {
        return super.l();
    }

    /* access modifiers changed from: package-private */
    public final boolean l(String str) {
        return "1".equals(q().a(str, "measurement.upload.blacklist_internal"));
    }

    public final /* bridge */ /* synthetic */ sf m() {
        return super.m();
    }

    /* access modifiers changed from: package-private */
    public final boolean m(String str) {
        return "1".equals(q().a(str, "measurement.upload.blacklist_public"));
    }

    public final /* bridge */ /* synthetic */ rk n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ sh o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ wr p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ te q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ wg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ tf s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ sj t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ su u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ rj v() {
        return super.v();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return true;
    }

    public final long y() {
        long andIncrement;
        if (this.c.get() == 0) {
            synchronized (this.c) {
                long nextLong = new Random(System.nanoTime() ^ k().a()).nextLong();
                int i = this.d + 1;
                this.d = i;
                andIncrement = nextLong + ((long) i);
            }
        } else {
            synchronized (this.c) {
                this.c.compareAndSet(-1, 1);
                andIncrement = this.c.getAndIncrement();
            }
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    public final SecureRandom z() {
        c();
        if (this.b == null) {
            this.b = new SecureRandom();
        }
        return this.b;
    }
}
