package com.google.android.gms.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.a;
import com.google.android.gms.common.internal.y;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class rk extends uk {
    /* access modifiers changed from: private */
    public static final String[] a = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] b = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */
    public static final String[] c = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] d = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] e = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;"};
    /* access modifiers changed from: private */
    public static final String[] f = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final rn g = new rn(this, l(), "google_app_measurement.db");
    /* access modifiers changed from: private */
    public final wl h = new wl(k());

    rk(tk tkVar) {
        super(tkVar);
    }

    private final boolean T() {
        return l().getDatabasePath("google_app_measurement.db").exists();
    }

    private final long a(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = A().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                j = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } else if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e2) {
            t().y().a("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final Object a(Cursor cursor, int i) {
        int type = cursor.getType(i);
        switch (type) {
            case a.b.AdsAttrs_adSize:
                t().y().a("Loaded invalid null value from database");
                return null;
            case a.b.AdsAttrs_adSizes:
                return Long.valueOf(cursor.getLong(i));
            case 2:
                return Double.valueOf(cursor.getDouble(i));
            case 3:
                return cursor.getString(i);
            case 4:
                t().y().a("Loaded invalid blob type value, ignoring it");
                return null;
            default:
                t().y().a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
        }
    }

    private static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), (String[]) null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    private static void a(ContentValues contentValues, String str, Object obj) {
        y.a(str);
        y.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    static void a(sj sjVar, SQLiteDatabase sQLiteDatabase) {
        if (sjVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            sjVar.A().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            sjVar.A().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            sjVar.A().a("Failed to turn on database read permission for owner");
        }
        if (!file.setWritable(true, true)) {
            sjVar.A().a("Failed to turn on database write permission for owner");
        }
    }

    static void a(sj sjVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (sjVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!a(sjVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            a(sjVar, sQLiteDatabase, str, str3, strArr);
        } catch (SQLiteException e2) {
            sjVar.y().a("Failed to verify columns on table that was just created", str);
            throw e2;
        }
    }

    private static void a(sj sjVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        if (sjVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Set<String> a2 = a(sQLiteDatabase, str);
        for (String str3 : str2.split(",")) {
            if (!a2.remove(str3)) {
                throw new SQLiteException(new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str3).length()).append("Table ").append(str).append(" is missing required column: ").append(str3).toString());
            }
        }
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i += 2) {
                if (!a2.remove(strArr[i])) {
                    sQLiteDatabase.execSQL(strArr[i + 1]);
                }
            }
        }
        if (!a2.isEmpty()) {
            sjVar.A().a("Table has extra columns. table, columns", str, TextUtils.join(", ", a2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.google.android.gms.internal.sj r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12) {
        /*
            r8 = 0
            r9 = 0
            if (r10 != 0) goto L_0x000c
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Monitor must not be null"
            r0.<init>(r1)
            throw r0
        L_0x000c:
            java.lang.String r1 = "SQLITE_MASTER"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0030, all -> 0x0042 }
            r0 = 0
            java.lang.String r3 = "name"
            r2[r0] = r3     // Catch:{ SQLiteException -> 0x0030, all -> 0x0042 }
            java.lang.String r3 = "name=?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0030, all -> 0x0042 }
            r0 = 0
            r4[r0] = r12     // Catch:{ SQLiteException -> 0x0030, all -> 0x0042 }
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r11
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0030, all -> 0x0042 }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x004c }
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        L_0x0030:
            r0 = move-exception
            r1 = r9
        L_0x0032:
            com.google.android.gms.internal.sl r2 = r10.A()     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "Error querying for table"
            r2.a(r3, r12, r0)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0040
            r1.close()
        L_0x0040:
            r0 = r8
            goto L_0x002f
        L_0x0042:
            r0 = move-exception
        L_0x0043:
            if (r9 == 0) goto L_0x0048
            r9.close()
        L_0x0048:
            throw r0
        L_0x0049:
            r0 = move-exception
            r9 = r1
            goto L_0x0043
        L_0x004c:
            r0 = move-exception
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.a(com.google.android.gms.internal.sj, android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    private final boolean a(String str, int i, wt wtVar) {
        Q();
        c();
        y.a(str);
        y.a(wtVar);
        if (TextUtils.isEmpty(wtVar.b)) {
            t().A().a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", sj.a(str), Integer.valueOf(i), String.valueOf(wtVar.a));
            return false;
        }
        try {
            byte[] bArr = new byte[wtVar.f()];
            ajx a2 = ajx.a(bArr, 0, bArr.length);
            wtVar.a(a2);
            a2.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", wtVar.a);
            contentValues.put("event_name", wtVar.b);
            contentValues.put("data", bArr);
            try {
                if (A().insertWithOnConflict("event_filters", (String) null, contentValues, 5) == -1) {
                    t().y().a("Failed to insert event filter (got -1). appId", sj.a(str));
                }
                return true;
            } catch (SQLiteException e2) {
                t().y().a("Error storing event filter. appId", sj.a(str), e2);
                return false;
            }
        } catch (IOException e3) {
            t().y().a("Configuration loss. Failed to serialize event filter. appId", sj.a(str), e3);
            return false;
        }
    }

    private final boolean a(String str, int i, ww wwVar) {
        Q();
        c();
        y.a(str);
        y.a(wwVar);
        if (TextUtils.isEmpty(wwVar.b)) {
            t().A().a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", sj.a(str), Integer.valueOf(i), String.valueOf(wwVar.a));
            return false;
        }
        try {
            byte[] bArr = new byte[wwVar.f()];
            ajx a2 = ajx.a(bArr, 0, bArr.length);
            wwVar.a(a2);
            a2.a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(i));
            contentValues.put("filter_id", wwVar.a);
            contentValues.put("property_name", wwVar.b);
            contentValues.put("data", bArr);
            try {
                if (A().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                    return true;
                }
                t().y().a("Failed to insert property filter (got -1). appId", sj.a(str));
                return false;
            } catch (SQLiteException e2) {
                t().y().a("Error storing property filter. appId", sj.a(str), e2);
                return false;
            }
        } catch (IOException e3) {
            t().y().a("Configuration loss. Failed to serialize property filter. appId", sj.a(str), e3);
            return false;
        }
    }

    private final boolean a(String str, List<Integer> list) {
        y.a(str);
        Q();
        c();
        SQLiteDatabase A = A();
        try {
            long b2 = b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, v().b(str, rz.H)));
            if (b2 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            String sb = new StringBuilder(String.valueOf(join).length() + 2).append("(").append(join).append(")").toString();
            return A.delete("audience_filter_values", new StringBuilder(String.valueOf(sb).length() + 140).append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(sb).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            t().y().a("Database error querying filters. appId", sj.a(str), e2);
            return false;
        }
    }

    private final long b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = A().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            t().y().a("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final SQLiteDatabase A() {
        c();
        try {
            return this.g.getWritableDatabase();
        } catch (SQLiteException e2) {
            t().A().a("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String B() {
        /*
            r5 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.A()
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            r3 = 0
            android.database.Cursor r2 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0023, all -> 0x0038 }
            boolean r1 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0043 }
            if (r1 == 0) goto L_0x001d
            r1 = 0
            java.lang.String r0 = r2.getString(r1)     // Catch:{ SQLiteException -> 0x0043 }
            if (r2 == 0) goto L_0x001c
            r2.close()
        L_0x001c:
            return r0
        L_0x001d:
            if (r2 == 0) goto L_0x001c
            r2.close()
            goto L_0x001c
        L_0x0023:
            r1 = move-exception
            r2 = r0
        L_0x0025:
            com.google.android.gms.internal.sj r3 = r5.t()     // Catch:{ all -> 0x0041 }
            com.google.android.gms.internal.sl r3 = r3.y()     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.a(r4, r1)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x001c
            r2.close()
            goto L_0x001c
        L_0x0038:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.close()
        L_0x0040:
            throw r0
        L_0x0041:
            r0 = move-exception
            goto L_0x003b
        L_0x0043:
            r1 = move-exception
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.B():java.lang.String");
    }

    public final boolean C() {
        return b("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: package-private */
    public final void D() {
        int delete;
        c();
        Q();
        if (T()) {
            long a2 = u().f.a();
            long b2 = k().b();
            if (Math.abs(b2 - a2) > rz.A.b().longValue()) {
                u().f.a(b2);
                c();
                Q();
                if (T() && (delete = A().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(k().a()), String.valueOf(rj.y())})) > 0) {
                    t().E().a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    public final long E() {
        return a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    public final long F() {
        return a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    public final boolean G() {
        return b("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean H() {
        return b("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final long I() {
        long j = -1;
        Cursor cursor = null;
        try {
            cursor = A().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (cursor.moveToFirst()) {
                j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
            } else if (cursor != null) {
                cursor.close();
            }
        } catch (SQLiteException e2) {
            t().y().a("Error querying raw events", e2);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return j;
    }

    public final long a(xg xgVar) {
        long c2;
        c();
        Q();
        y.a(xgVar);
        y.a(xgVar.o);
        try {
            byte[] bArr = new byte[xgVar.f()];
            ajx a2 = ajx.a(bArr, 0, bArr.length);
            xgVar.a(a2);
            a2.a();
            wr p = p();
            y.a(bArr);
            p.c();
            MessageDigest g2 = wr.g("MD5");
            if (g2 == null) {
                p.t().y().a("Failed to get MD5");
                c2 = 0;
            } else {
                c2 = wr.c(g2.digest(bArr));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", xgVar.o);
            contentValues.put("metadata_fingerprint", Long.valueOf(c2));
            contentValues.put("metadata", bArr);
            try {
                A().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
                return c2;
            } catch (SQLiteException e2) {
                t().y().a("Error storing raw event metadata. appId", sj.a(xgVar.o), e2);
                throw e2;
            }
        } catch (IOException e3) {
            t().y().a("Data loss. Failed to serialize event metadata. appId", sj.a(xgVar.o), e3);
            throw e3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.rl a(long r12, java.lang.String r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.y.a((java.lang.String) r14)
            r11.c()
            r11.Q()
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]
            r0 = 0
            r10[r0] = r14
            com.google.android.gms.internal.rl r8 = new com.google.android.gms.internal.rl
            r8.<init>()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r0 = r11.A()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            java.lang.String r1 = "apps"
            r2 = 6
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            r3 = 0
            java.lang.String r4 = "day"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            r3 = 1
            java.lang.String r4 = "daily_events_count"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            r3 = 2
            java.lang.String r4 = "daily_public_events_count"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            r3 = 3
            java.lang.String r4 = "daily_conversions_count"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            r3 = 4
            java.lang.String r4 = "daily_error_events_count"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            r3 = 5
            java.lang.String r4 = "daily_realtime_events_count"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            java.lang.String r3 = "app_id=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            r5 = 0
            r4[r5] = r14     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0131 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x013b }
            if (r2 != 0) goto L_0x0069
            com.google.android.gms.internal.sj r0 = r11.t()     // Catch:{ SQLiteException -> 0x013b }
            com.google.android.gms.internal.sl r0 = r0.A()     // Catch:{ SQLiteException -> 0x013b }
            java.lang.String r2 = "Not updating daily counts, app is not known. appId"
            java.lang.Object r3 = com.google.android.gms.internal.sj.a((java.lang.String) r14)     // Catch:{ SQLiteException -> 0x013b }
            r0.a(r2, r3)     // Catch:{ SQLiteException -> 0x013b }
            if (r1 == 0) goto L_0x0067
            r1.close()
        L_0x0067:
            r0 = r8
        L_0x0068:
            return r0
        L_0x0069:
            r2 = 0
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x013b }
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0095
            r2 = 1
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x013b }
            r8.b = r2     // Catch:{ SQLiteException -> 0x013b }
            r2 = 2
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x013b }
            r8.a = r2     // Catch:{ SQLiteException -> 0x013b }
            r2 = 3
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x013b }
            r8.c = r2     // Catch:{ SQLiteException -> 0x013b }
            r2 = 4
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x013b }
            r8.d = r2     // Catch:{ SQLiteException -> 0x013b }
            r2 = 5
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x013b }
            r8.e = r2     // Catch:{ SQLiteException -> 0x013b }
        L_0x0095:
            if (r15 == 0) goto L_0x009e
            long r2 = r8.b     // Catch:{ SQLiteException -> 0x013b }
            r4 = 1
            long r2 = r2 + r4
            r8.b = r2     // Catch:{ SQLiteException -> 0x013b }
        L_0x009e:
            if (r16 == 0) goto L_0x00a7
            long r2 = r8.a     // Catch:{ SQLiteException -> 0x013b }
            r4 = 1
            long r2 = r2 + r4
            r8.a = r2     // Catch:{ SQLiteException -> 0x013b }
        L_0x00a7:
            if (r17 == 0) goto L_0x00b0
            long r2 = r8.c     // Catch:{ SQLiteException -> 0x013b }
            r4 = 1
            long r2 = r2 + r4
            r8.c = r2     // Catch:{ SQLiteException -> 0x013b }
        L_0x00b0:
            if (r18 == 0) goto L_0x00b9
            long r2 = r8.d     // Catch:{ SQLiteException -> 0x013b }
            r4 = 1
            long r2 = r2 + r4
            r8.d = r2     // Catch:{ SQLiteException -> 0x013b }
        L_0x00b9:
            if (r19 == 0) goto L_0x00c2
            long r2 = r8.e     // Catch:{ SQLiteException -> 0x013b }
            r4 = 1
            long r2 = r2 + r4
            r8.e = r2     // Catch:{ SQLiteException -> 0x013b }
        L_0x00c2:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ SQLiteException -> 0x013b }
            r2.<init>()     // Catch:{ SQLiteException -> 0x013b }
            java.lang.String r3 = "day"
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x013b }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x013b }
            java.lang.String r3 = "daily_public_events_count"
            long r4 = r8.a     // Catch:{ SQLiteException -> 0x013b }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x013b }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x013b }
            java.lang.String r3 = "daily_events_count"
            long r4 = r8.b     // Catch:{ SQLiteException -> 0x013b }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x013b }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x013b }
            java.lang.String r3 = "daily_conversions_count"
            long r4 = r8.c     // Catch:{ SQLiteException -> 0x013b }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x013b }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x013b }
            java.lang.String r3 = "daily_error_events_count"
            long r4 = r8.d     // Catch:{ SQLiteException -> 0x013b }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x013b }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x013b }
            java.lang.String r3 = "daily_realtime_events_count"
            long r4 = r8.e     // Catch:{ SQLiteException -> 0x013b }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x013b }
            r2.put(r3, r4)     // Catch:{ SQLiteException -> 0x013b }
            java.lang.String r3 = "apps"
            java.lang.String r4 = "app_id=?"
            r0.update(r3, r2, r4, r10)     // Catch:{ SQLiteException -> 0x013b }
            if (r1 == 0) goto L_0x0113
            r1.close()
        L_0x0113:
            r0 = r8
            goto L_0x0068
        L_0x0116:
            r0 = move-exception
            r1 = r9
        L_0x0118:
            com.google.android.gms.internal.sj r2 = r11.t()     // Catch:{ all -> 0x0139 }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = "Error updating daily counts. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r14)     // Catch:{ all -> 0x0139 }
            r2.a(r3, r4, r0)     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x012e
            r1.close()
        L_0x012e:
            r0 = r8
            goto L_0x0068
        L_0x0131:
            r0 = move-exception
            r1 = r9
        L_0x0133:
            if (r1 == 0) goto L_0x0138
            r1.close()
        L_0x0138:
            throw r0
        L_0x0139:
            r0 = move-exception
            goto L_0x0133
        L_0x013b:
            r0 = move-exception
            goto L_0x0118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.a(long, java.lang.String, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.rl");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.rs a(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            com.google.android.gms.common.internal.y.a((java.lang.String) r19)
            com.google.android.gms.common.internal.y.a((java.lang.String) r20)
            r18.c()
            r18.Q()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r2 = r18.A()     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            java.lang.String r3 = "events"
            r4 = 7
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            r5 = 0
            java.lang.String r6 = "lifetime_count"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            r5 = 1
            java.lang.String r6 = "current_bundle_count"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            r5 = 2
            java.lang.String r6 = "last_fire_timestamp"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            r5 = 3
            java.lang.String r6 = "last_bundled_timestamp"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            r5 = 4
            java.lang.String r6 = "last_sampled_complex_event_id"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            r5 = 5
            java.lang.String r6 = "last_sampling_rate"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            r5 = 6
            java.lang.String r6 = "last_exempt_from_sampling"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            java.lang.String r5 = "app_id=? and name=?"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            r7 = 0
            r6[r7] = r19     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            r7 = 1
            r6[r7] = r20     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r17 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x00f1, all -> 0x0116 }
            boolean r2 = r17.moveToFirst()     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            if (r2 != 0) goto L_0x0058
            if (r17 == 0) goto L_0x0056
            r17.close()
        L_0x0056:
            r3 = 0
        L_0x0057:
            return r3
        L_0x0058:
            r2 = 0
            r0 = r17
            long r6 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            r2 = 1
            r0 = r17
            long r8 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            r2 = 2
            r0 = r17
            long r10 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            r2 = 3
            r0 = r17
            boolean r2 = r0.isNull(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            if (r2 == 0) goto L_0x00cf
            r12 = 0
        L_0x0078:
            r2 = 4
            r0 = r17
            boolean r2 = r0.isNull(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            if (r2 == 0) goto L_0x00d7
            r14 = 0
        L_0x0082:
            r2 = 5
            r0 = r17
            boolean r2 = r0.isNull(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            if (r2 == 0) goto L_0x00e3
            r15 = 0
        L_0x008c:
            r16 = 0
            r2 = 6
            r0 = r17
            boolean r2 = r0.isNull(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            if (r2 != 0) goto L_0x00a9
            r2 = 6
            r0 = r17
            long r2 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            r4 = 1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x00ef
            r2 = 1
        L_0x00a5:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
        L_0x00a9:
            com.google.android.gms.internal.rs r3 = new com.google.android.gms.internal.rs     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            r4 = r19
            r5 = r20
            r3.<init>(r4, r5, r6, r8, r10, r12, r14, r15, r16)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            boolean r2 = r17.moveToNext()     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            if (r2 == 0) goto L_0x00c9
            com.google.android.gms.internal.sj r2 = r18.t()     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            java.lang.String r4 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.internal.sj.a((java.lang.String) r19)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            r2.a(r4, r5)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
        L_0x00c9:
            if (r17 == 0) goto L_0x0057
            r17.close()
            goto L_0x0057
        L_0x00cf:
            r2 = 3
            r0 = r17
            long r12 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            goto L_0x0078
        L_0x00d7:
            r2 = 4
            r0 = r17
            long r2 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            java.lang.Long r14 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            goto L_0x0082
        L_0x00e3:
            r2 = 5
            r0 = r17
            long r2 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            java.lang.Long r15 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteException -> 0x0125, all -> 0x011f }
            goto L_0x008c
        L_0x00ef:
            r2 = 0
            goto L_0x00a5
        L_0x00f1:
            r2 = move-exception
            r3 = r10
        L_0x00f3:
            com.google.android.gms.internal.sj r4 = r18.t()     // Catch:{ all -> 0x0121 }
            com.google.android.gms.internal.sl r4 = r4.y()     // Catch:{ all -> 0x0121 }
            java.lang.String r5 = "Error querying events. appId"
            java.lang.Object r6 = com.google.android.gms.internal.sj.a((java.lang.String) r19)     // Catch:{ all -> 0x0121 }
            com.google.android.gms.internal.sh r7 = r18.o()     // Catch:{ all -> 0x0121 }
            r0 = r20
            java.lang.String r7 = r7.a((java.lang.String) r0)     // Catch:{ all -> 0x0121 }
            r4.a(r5, r6, r7, r2)     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x0113
            r3.close()
        L_0x0113:
            r3 = 0
            goto L_0x0057
        L_0x0116:
            r2 = move-exception
            r17 = r10
        L_0x0119:
            if (r17 == 0) goto L_0x011e
            r17.close()
        L_0x011e:
            throw r2
        L_0x011f:
            r2 = move-exception
            goto L_0x0119
        L_0x0121:
            r2 = move-exception
            r17 = r3
            goto L_0x0119
        L_0x0125:
            r2 = move-exception
            r3 = r17
            goto L_0x00f3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.a(java.lang.String, java.lang.String):com.google.android.gms.internal.rs");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(long r8) {
        /*
            r7 = this;
            r0 = 0
            r7.c()
            r7.Q()
            android.database.sqlite.SQLiteDatabase r1 = r7.A()     // Catch:{ SQLiteException -> 0x003f, all -> 0x0054 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x003f, all -> 0x0054 }
            r4 = 0
            java.lang.String r5 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x003f, all -> 0x0054 }
            r3[r4] = r5     // Catch:{ SQLiteException -> 0x003f, all -> 0x0054 }
            android.database.Cursor r2 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x003f, all -> 0x0054 }
            boolean r1 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x005f }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.internal.sj r1 = r7.t()     // Catch:{ SQLiteException -> 0x005f }
            com.google.android.gms.internal.sl r1 = r1.E()     // Catch:{ SQLiteException -> 0x005f }
            java.lang.String r3 = "No expired configs for apps with pending events"
            r1.a(r3)     // Catch:{ SQLiteException -> 0x005f }
            if (r2 == 0) goto L_0x0033
            r2.close()
        L_0x0033:
            return r0
        L_0x0034:
            r1 = 0
            java.lang.String r0 = r2.getString(r1)     // Catch:{ SQLiteException -> 0x005f }
            if (r2 == 0) goto L_0x0033
            r2.close()
            goto L_0x0033
        L_0x003f:
            r1 = move-exception
            r2 = r0
        L_0x0041:
            com.google.android.gms.internal.sj r3 = r7.t()     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.sl r3 = r3.y()     // Catch:{ all -> 0x005d }
            java.lang.String r4 = "Error selecting expired configs"
            r3.a(r4, r1)     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x0033
            r2.close()
            goto L_0x0033
        L_0x0054:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0057:
            if (r2 == 0) goto L_0x005c
            r2.close()
        L_0x005c:
            throw r0
        L_0x005d:
            r0 = move-exception
            goto L_0x0057
        L_0x005f:
            r1 = move-exception
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.a(long):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.wq> a(java.lang.String r12) {
        /*
            r11 = this;
            r10 = 0
            com.google.android.gms.common.internal.y.a((java.lang.String) r12)
            r11.c()
            r11.Q()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            android.database.sqlite.SQLiteDatabase r0 = r11.A()     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00a7 }
            java.lang.String r1 = "user_attributes"
            r2 = 4
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00a7 }
            r3 = 0
            java.lang.String r4 = "name"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00a7 }
            r3 = 1
            java.lang.String r4 = "origin"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00a7 }
            r3 = 2
            java.lang.String r4 = "set_timestamp"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00a7 }
            r3 = 3
            java.lang.String r4 = "value"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00a7 }
            java.lang.String r3 = "app_id=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00a7 }
            r5 = 0
            r4[r5] = r12     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00a7 }
            r5 = 0
            r6 = 0
            java.lang.String r7 = "rowid"
            java.lang.String r8 = "1000"
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00b4, all -> 0x00a7 }
            boolean r0 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            if (r0 != 0) goto L_0x004b
            if (r7 == 0) goto L_0x0049
            r7.close()
        L_0x0049:
            r0 = r9
        L_0x004a:
            return r0
        L_0x004b:
            r0 = 0
            java.lang.String r3 = r7.getString(r0)     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            r0 = 1
            java.lang.String r2 = r7.getString(r0)     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = ""
        L_0x0059:
            r0 = 2
            long r4 = r7.getLong(r0)     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            r0 = 3
            java.lang.Object r6 = r11.a((android.database.Cursor) r7, (int) r0)     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            if (r6 != 0) goto L_0x0083
            com.google.android.gms.internal.sj r0 = r11.t()     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            com.google.android.gms.internal.sl r0 = r0.y()     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            java.lang.String r1 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r2 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            r0.a(r1, r2)     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
        L_0x0076:
            boolean r0 = r7.moveToNext()     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            if (r0 != 0) goto L_0x004b
            if (r7 == 0) goto L_0x0081
            r7.close()
        L_0x0081:
            r0 = r9
            goto L_0x004a
        L_0x0083:
            com.google.android.gms.internal.wq r0 = new com.google.android.gms.internal.wq     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r6)     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            r9.add(r0)     // Catch:{ SQLiteException -> 0x008d, all -> 0x00ae }
            goto L_0x0076
        L_0x008d:
            r0 = move-exception
            r1 = r7
        L_0x008f:
            com.google.android.gms.internal.sj r2 = r11.t()     // Catch:{ all -> 0x00b1 }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = "Error querying user properties. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ all -> 0x00b1 }
            r2.a(r3, r4, r0)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x00a5
            r1.close()
        L_0x00a5:
            r0 = r10
            goto L_0x004a
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            if (r10 == 0) goto L_0x00ad
            r10.close()
        L_0x00ad:
            throw r0
        L_0x00ae:
            r0 = move-exception
            r10 = r7
            goto L_0x00a8
        L_0x00b1:
            r0 = move-exception
            r10 = r1
            goto L_0x00a8
        L_0x00b4:
            r0 = move-exception
            r1 = r10
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.xg, java.lang.Long>> a(java.lang.String r12, int r13, int r14) {
        /*
            r11 = this;
            r10 = 0
            r1 = 1
            r9 = 0
            r11.c()
            r11.Q()
            if (r13 <= 0) goto L_0x004e
            r0 = r1
        L_0x000c:
            com.google.android.gms.common.internal.y.b((boolean) r0)
            if (r14 <= 0) goto L_0x0050
        L_0x0011:
            com.google.android.gms.common.internal.y.b((boolean) r1)
            com.google.android.gms.common.internal.y.a((java.lang.String) r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.A()     // Catch:{ SQLiteException -> 0x00c5, all -> 0x00e3 }
            java.lang.String r1 = "queue"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00c5, all -> 0x00e3 }
            r3 = 0
            java.lang.String r4 = "rowid"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00c5, all -> 0x00e3 }
            r3 = 1
            java.lang.String r4 = "data"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00c5, all -> 0x00e3 }
            java.lang.String r3 = "app_id=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00c5, all -> 0x00e3 }
            r5 = 0
            r4[r5] = r12     // Catch:{ SQLiteException -> 0x00c5, all -> 0x00e3 }
            r5 = 0
            r6 = 0
            java.lang.String r7 = "rowid"
            java.lang.String r8 = java.lang.String.valueOf(r13)     // Catch:{ SQLiteException -> 0x00c5, all -> 0x00e3 }
            android.database.Cursor r2 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x00c5, all -> 0x00e3 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            if (r0 != 0) goto L_0x0052
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            if (r2 == 0) goto L_0x004d
            r2.close()
        L_0x004d:
            return r0
        L_0x004e:
            r0 = r9
            goto L_0x000c
        L_0x0050:
            r1 = r9
            goto L_0x0011
        L_0x0052:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            r3 = r9
        L_0x0058:
            r1 = 0
            long r4 = r2.getLong(r1)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            r1 = 1
            byte[] r1 = r2.getBlob(r1)     // Catch:{ IOException -> 0x009d }
            com.google.android.gms.internal.wr r6 = r11.p()     // Catch:{ IOException -> 0x009d }
            byte[] r1 = r6.b((byte[]) r1)     // Catch:{ IOException -> 0x009d }
            boolean r6 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            if (r6 != 0) goto L_0x0074
            int r6 = r1.length     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            int r6 = r6 + r3
            if (r6 > r14) goto L_0x0097
        L_0x0074:
            r6 = 0
            int r7 = r1.length     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            com.google.android.gms.internal.ajw r6 = com.google.android.gms.internal.ajw.a(r1, r6, r7)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            com.google.android.gms.internal.xg r7 = new com.google.android.gms.internal.xg     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            r7.<init>()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            r7.a((com.google.android.gms.internal.ajw) r6)     // Catch:{ IOException -> 0x00b1 }
            int r1 = r1.length     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            int r1 = r1 + r3
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            android.util.Pair r3 = android.util.Pair.create(r7, r3)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
        L_0x008f:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            if (r3 == 0) goto L_0x0097
            if (r1 <= r14) goto L_0x00f3
        L_0x0097:
            if (r2 == 0) goto L_0x004d
            r2.close()
            goto L_0x004d
        L_0x009d:
            r1 = move-exception
            com.google.android.gms.internal.sj r4 = r11.t()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            com.google.android.gms.internal.sl r4 = r4.y()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            java.lang.String r5 = "Failed to unzip queued bundle. appId"
            java.lang.Object r6 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            r4.a(r5, r6, r1)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            r1 = r3
            goto L_0x008f
        L_0x00b1:
            r1 = move-exception
            com.google.android.gms.internal.sj r4 = r11.t()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            com.google.android.gms.internal.sl r4 = r4.y()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            java.lang.String r5 = "Failed to merge queued bundle. appId"
            java.lang.Object r6 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            r4.a(r5, r6, r1)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00eb }
            r1 = r3
            goto L_0x008f
        L_0x00c5:
            r0 = move-exception
            r1 = r10
        L_0x00c7:
            com.google.android.gms.internal.sj r2 = r11.t()     // Catch:{ all -> 0x00ed }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x00ed }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ all -> 0x00ed }
            r2.a(r3, r4, r0)     // Catch:{ all -> 0x00ed }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00ed }
            if (r1 == 0) goto L_0x004d
            r1.close()
            goto L_0x004d
        L_0x00e3:
            r0 = move-exception
            r2 = r10
        L_0x00e5:
            if (r2 == 0) goto L_0x00ea
            r2.close()
        L_0x00ea:
            throw r0
        L_0x00eb:
            r0 = move-exception
            goto L_0x00e5
        L_0x00ed:
            r0 = move-exception
            r2 = r1
            goto L_0x00e5
        L_0x00f0:
            r0 = move-exception
            r1 = r2
            goto L_0x00c7
        L_0x00f3:
            r3 = r1
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.a(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0102, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0107, code lost:
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        r1 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x007c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.wq> a(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11 = this;
            r10 = 0
            com.google.android.gms.common.internal.y.a((java.lang.String) r12)
            r11.c()
            r11.Q()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            r1 = 3
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            r0.add(r12)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            java.lang.String r1 = "app_id=?"
            r3.<init>(r1)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            if (r1 != 0) goto L_0x002d
            r0.add(r13)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            java.lang.String r1 = " and origin=?"
            r3.append(r1)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
        L_0x002d:
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            if (r1 != 0) goto L_0x0045
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            java.lang.String r2 = "*"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            r0.add(r1)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            java.lang.String r1 = " and name glob ?"
            r3.append(r1)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
        L_0x0045:
            int r1 = r0.size()     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            java.lang.Object[] r4 = r0.toArray(r1)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            android.database.sqlite.SQLiteDatabase r0 = r11.A()     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            java.lang.String r1 = "user_attributes"
            r2 = 4
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            r5 = 0
            java.lang.String r6 = "name"
            r2[r5] = r6     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            r5 = 1
            java.lang.String r6 = "set_timestamp"
            r2[r5] = r6     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            r5 = 2
            java.lang.String r6 = "value"
            r2[r5] = r6     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            r5 = 3
            java.lang.String r6 = "origin"
            r2[r5] = r6     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            r5 = 0
            r6 = 0
            java.lang.String r7 = "rowid"
            java.lang.String r8 = "1001"
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x010c, all -> 0x00ff }
            boolean r0 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x010f, all -> 0x0106 }
            if (r0 != 0) goto L_0x008a
            if (r7 == 0) goto L_0x0087
            r7.close()
        L_0x0087:
            r0 = r9
        L_0x0088:
            return r0
        L_0x0089:
            r13 = r2
        L_0x008a:
            int r0 = r9.size()     // Catch:{ SQLiteException -> 0x010f, all -> 0x0106 }
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto L_0x00ac
            com.google.android.gms.internal.sj r0 = r11.t()     // Catch:{ SQLiteException -> 0x010f, all -> 0x0106 }
            com.google.android.gms.internal.sl r0 = r0.y()     // Catch:{ SQLiteException -> 0x010f, all -> 0x0106 }
            java.lang.String r1 = "Read more than the max allowed user properties, ignoring excess"
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x010f, all -> 0x0106 }
            r0.a(r1, r2)     // Catch:{ SQLiteException -> 0x010f, all -> 0x0106 }
        L_0x00a5:
            if (r7 == 0) goto L_0x00aa
            r7.close()
        L_0x00aa:
            r0 = r9
            goto L_0x0088
        L_0x00ac:
            r0 = 0
            java.lang.String r3 = r7.getString(r0)     // Catch:{ SQLiteException -> 0x010f, all -> 0x0106 }
            r0 = 1
            long r4 = r7.getLong(r0)     // Catch:{ SQLiteException -> 0x010f, all -> 0x0106 }
            r0 = 2
            java.lang.Object r6 = r11.a((android.database.Cursor) r7, (int) r0)     // Catch:{ SQLiteException -> 0x010f, all -> 0x0106 }
            r0 = 3
            java.lang.String r2 = r7.getString(r0)     // Catch:{ SQLiteException -> 0x010f, all -> 0x0106 }
            if (r6 != 0) goto L_0x00da
            com.google.android.gms.internal.sj r0 = r11.t()     // Catch:{ SQLiteException -> 0x00e4, all -> 0x0106 }
            com.google.android.gms.internal.sl r0 = r0.y()     // Catch:{ SQLiteException -> 0x00e4, all -> 0x0106 }
            java.lang.String r1 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r3 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x00e4, all -> 0x0106 }
            r0.a(r1, r3, r2, r14)     // Catch:{ SQLiteException -> 0x00e4, all -> 0x0106 }
        L_0x00d3:
            boolean r0 = r7.moveToNext()     // Catch:{ SQLiteException -> 0x00e4, all -> 0x0106 }
            if (r0 != 0) goto L_0x0089
            goto L_0x00a5
        L_0x00da:
            com.google.android.gms.internal.wq r0 = new com.google.android.gms.internal.wq     // Catch:{ SQLiteException -> 0x00e4, all -> 0x0106 }
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r6)     // Catch:{ SQLiteException -> 0x00e4, all -> 0x0106 }
            r9.add(r0)     // Catch:{ SQLiteException -> 0x00e4, all -> 0x0106 }
            goto L_0x00d3
        L_0x00e4:
            r0 = move-exception
            r1 = r7
            r13 = r2
        L_0x00e7:
            com.google.android.gms.internal.sj r2 = r11.t()     // Catch:{ all -> 0x0109 }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x0109 }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ all -> 0x0109 }
            r2.a(r3, r4, r13, r0)     // Catch:{ all -> 0x0109 }
            if (r1 == 0) goto L_0x00fd
            r1.close()
        L_0x00fd:
            r0 = r10
            goto L_0x0088
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            if (r10 == 0) goto L_0x0105
            r10.close()
        L_0x0105:
            throw r0
        L_0x0106:
            r0 = move-exception
            r10 = r7
            goto L_0x0100
        L_0x0109:
            r0 = move-exception
            r10 = r1
            goto L_0x0100
        L_0x010c:
            r0 = move-exception
            r1 = r10
            goto L_0x00e7
        L_0x010f:
            r0 = move-exception
            r1 = r7
            goto L_0x00e7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.rh> a(java.lang.String r24, java.lang.String[] r25) {
        /*
            r23 = this;
            r23.c()
            r23.Q()
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r23.A()     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            java.lang.String r3 = "conditional_properties"
            r4 = 13
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 0
            java.lang.String r6 = "app_id"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 1
            java.lang.String r6 = "origin"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 2
            java.lang.String r6 = "name"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 3
            java.lang.String r6 = "value"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 4
            java.lang.String r6 = "active"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 5
            java.lang.String r6 = "trigger_event_name"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 6
            java.lang.String r6 = "trigger_timeout"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 7
            java.lang.String r6 = "timed_out_event"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 8
            java.lang.String r6 = "creation_timestamp"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 9
            java.lang.String r6 = "triggered_event"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 10
            java.lang.String r6 = "triggered_timestamp"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 11
            java.lang.String r6 = "time_to_live"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r5 = 12
            java.lang.String r6 = "expired_event"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1001"
            r5 = r24
            r6 = r25
            android.database.Cursor r21 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0146, all -> 0x0160 }
            boolean r2 = r21.moveToFirst()     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            if (r2 != 0) goto L_0x0078
            if (r21 == 0) goto L_0x0075
            r21.close()
        L_0x0075:
            r2 = r20
        L_0x0077:
            return r2
        L_0x0078:
            int r2 = r20.size()     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r3) goto L_0x009b
            com.google.android.gms.internal.sj r2 = r23.t()     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            java.lang.String r3 = "Read more than the max allowed conditional properties, ignoring extra"
            r4 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r2.a(r3, r4)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
        L_0x0093:
            if (r21 == 0) goto L_0x0098
            r21.close()
        L_0x0098:
            r2 = r20
            goto L_0x0077
        L_0x009b:
            r2 = 0
            r0 = r21
            java.lang.String r8 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r2 = 1
            r0 = r21
            java.lang.String r7 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r2 = 2
            r0 = r21
            java.lang.String r3 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r2 = 3
            r0 = r23
            r1 = r21
            java.lang.Object r6 = r0.a((android.database.Cursor) r1, (int) r2)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r2 = 4
            r0 = r21
            int r2 = r0.getInt(r2)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            if (r2 == 0) goto L_0x0143
            r11 = 1
        L_0x00c3:
            r2 = 5
            r0 = r21
            java.lang.String r12 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r2 = 6
            r0 = r21
            long r14 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            com.google.android.gms.internal.wr r2 = r23.p()     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r4 = 7
            r0 = r21
            byte[] r4 = r0.getBlob(r4)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.rx> r5 = com.google.android.gms.internal.rx.CREATOR     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            android.os.Parcelable r13 = r2.a((byte[]) r4, r5)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            com.google.android.gms.internal.rx r13 = (com.google.android.gms.internal.rx) r13     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r2 = 8
            r0 = r21
            long r9 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            com.google.android.gms.internal.wr r2 = r23.p()     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r4 = 9
            r0 = r21
            byte[] r4 = r0.getBlob(r4)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.rx> r5 = com.google.android.gms.internal.rx.CREATOR     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            android.os.Parcelable r16 = r2.a((byte[]) r4, r5)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            com.google.android.gms.internal.rx r16 = (com.google.android.gms.internal.rx) r16     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r2 = 10
            r0 = r21
            long r4 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r2 = 11
            r0 = r21
            long r17 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            com.google.android.gms.internal.wr r2 = r23.p()     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r19 = 12
            r0 = r21
            r1 = r19
            byte[] r19 = r0.getBlob(r1)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.rx> r22 = com.google.android.gms.internal.rx.CREATOR     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r0 = r19
            r1 = r22
            android.os.Parcelable r19 = r2.a((byte[]) r0, r1)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            com.google.android.gms.internal.rx r19 = (com.google.android.gms.internal.rx) r19     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            com.google.android.gms.internal.wo r2 = new com.google.android.gms.internal.wo     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            com.google.android.gms.internal.rh r5 = new com.google.android.gms.internal.rh     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r6 = r8
            r8 = r2
            r5.<init>(r6, r7, r8, r9, r11, r12, r13, r14, r16, r17, r19)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            r0 = r20
            r0.add(r5)     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            boolean r2 = r21.moveToNext()     // Catch:{ SQLiteException -> 0x016f, all -> 0x0169 }
            if (r2 != 0) goto L_0x0078
            goto L_0x0093
        L_0x0143:
            r11 = 0
            goto L_0x00c3
        L_0x0146:
            r2 = move-exception
            r3 = r11
        L_0x0148:
            com.google.android.gms.internal.sj r4 = r23.t()     // Catch:{ all -> 0x016b }
            com.google.android.gms.internal.sl r4 = r4.y()     // Catch:{ all -> 0x016b }
            java.lang.String r5 = "Error querying conditional user property value"
            r4.a(r5, r2)     // Catch:{ all -> 0x016b }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x016b }
            if (r3 == 0) goto L_0x0077
            r3.close()
            goto L_0x0077
        L_0x0160:
            r2 = move-exception
            r21 = r11
        L_0x0163:
            if (r21 == 0) goto L_0x0168
            r21.close()
        L_0x0168:
            throw r2
        L_0x0169:
            r2 = move-exception
            goto L_0x0163
        L_0x016b:
            r2 = move-exception
            r21 = r3
            goto L_0x0163
        L_0x016f:
            r2 = move-exception
            r3 = r21
            goto L_0x0148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.a(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void a(rd rdVar) {
        y.a(rdVar);
        c();
        Q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rdVar.b());
        contentValues.put("app_instance_id", rdVar.c());
        contentValues.put("gmp_app_id", rdVar.d());
        contentValues.put("resettable_device_id_hash", rdVar.e());
        contentValues.put("last_bundle_index", Long.valueOf(rdVar.o()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(rdVar.g()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(rdVar.h()));
        contentValues.put("app_version", rdVar.i());
        contentValues.put("app_store", rdVar.k());
        contentValues.put("gmp_version", Long.valueOf(rdVar.l()));
        contentValues.put("dev_cert_hash", Long.valueOf(rdVar.m()));
        contentValues.put("measurement_enabled", Boolean.valueOf(rdVar.n()));
        contentValues.put("day", Long.valueOf(rdVar.s()));
        contentValues.put("daily_public_events_count", Long.valueOf(rdVar.t()));
        contentValues.put("daily_events_count", Long.valueOf(rdVar.u()));
        contentValues.put("daily_conversions_count", Long.valueOf(rdVar.v()));
        contentValues.put("config_fetched_time", Long.valueOf(rdVar.p()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(rdVar.q()));
        contentValues.put("app_version_int", Long.valueOf(rdVar.j()));
        contentValues.put("firebase_instance_id", rdVar.f());
        contentValues.put("daily_error_events_count", Long.valueOf(rdVar.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(rdVar.w()));
        contentValues.put("health_monitor_sample", rdVar.y());
        contentValues.put("android_id", Long.valueOf(rdVar.A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(rdVar.B()));
        try {
            SQLiteDatabase A = A();
            if (((long) A.update("apps", contentValues, "app_id = ?", new String[]{rdVar.b()})) == 0 && A.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                t().y().a("Failed to insert/update app (got -1). appId", sj.a(rdVar.b()));
            }
        } catch (SQLiteException e2) {
            t().y().a("Error storing app. appId", sj.a(rdVar.b()), e2);
        }
    }

    public final void a(rs rsVar) {
        long j = null;
        y.a(rsVar);
        c();
        Q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rsVar.a);
        contentValues.put("name", rsVar.b);
        contentValues.put("lifetime_count", Long.valueOf(rsVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(rsVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rsVar.e));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rsVar.f));
        contentValues.put("last_sampled_complex_event_id", rsVar.g);
        contentValues.put("last_sampling_rate", rsVar.h);
        if (rsVar.i != null && rsVar.i.booleanValue()) {
            j = 1L;
        }
        contentValues.put("last_exempt_from_sampling", j);
        try {
            if (A().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                t().y().a("Failed to insert/update event aggregates (got -1). appId", sj.a(rsVar.a));
            }
        } catch (SQLiteException e2) {
            t().y().a("Error storing event aggregates. appId", sj.a(rsVar.a), e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r8 = r3.b;
        r9 = r8.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
        if (r2 >= r9) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a8, code lost:
        if (r8[r2].a != null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00aa, code lost:
        t().A().a("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.internal.sj.a(r13), r3.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00be, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c1, code lost:
        r8 = r3.c;
        r9 = r8.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c5, code lost:
        if (r2 >= r9) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        if (a(r13, r7, r8[r2]) != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cf, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d0, code lost:
        if (r2 == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
        r8 = r3.b;
        r9 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d6, code lost:
        if (r3 >= r9) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00de, code lost:
        if (a(r13, r7, r8[r3]) != false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e0, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e1, code lost:
        if (r2 != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e3, code lost:
        Q();
        c();
        com.google.android.gms.common.internal.y.a(r13);
        r2 = A();
        r2.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r13, java.lang.String.valueOf(r7)});
        r2.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r13, java.lang.String.valueOf(r7)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011a, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013c, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r13, com.google.android.gms.internal.ws[] r14) {
        /*
            r12 = this;
            r4 = 1
            r0 = 0
            r12.Q()
            r12.c()
            com.google.android.gms.common.internal.y.a((java.lang.String) r13)
            com.google.android.gms.common.internal.y.a(r14)
            android.database.sqlite.SQLiteDatabase r5 = r12.A()
            r5.beginTransaction()
            r12.Q()     // Catch:{ all -> 0x0096 }
            r12.c()     // Catch:{ all -> 0x0096 }
            com.google.android.gms.common.internal.y.a((java.lang.String) r13)     // Catch:{ all -> 0x0096 }
            android.database.sqlite.SQLiteDatabase r1 = r12.A()     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "app_id=?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0096 }
            r7 = 0
            r6[r7] = r13     // Catch:{ all -> 0x0096 }
            r1.delete(r2, r3, r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "app_id=?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0096 }
            r7 = 0
            r6[r7] = r13     // Catch:{ all -> 0x0096 }
            r1.delete(r2, r3, r6)     // Catch:{ all -> 0x0096 }
            int r6 = r14.length     // Catch:{ all -> 0x0096 }
            r1 = r0
        L_0x003e:
            if (r1 >= r6) goto L_0x0120
            r3 = r14[r1]     // Catch:{ all -> 0x0096 }
            r12.Q()     // Catch:{ all -> 0x0096 }
            r12.c()     // Catch:{ all -> 0x0096 }
            com.google.android.gms.common.internal.y.a((java.lang.String) r13)     // Catch:{ all -> 0x0096 }
            com.google.android.gms.common.internal.y.a(r3)     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.wt[] r2 = r3.c     // Catch:{ all -> 0x0096 }
            com.google.android.gms.common.internal.y.a(r2)     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.ww[] r2 = r3.b     // Catch:{ all -> 0x0096 }
            com.google.android.gms.common.internal.y.a(r2)     // Catch:{ all -> 0x0096 }
            java.lang.Integer r2 = r3.a     // Catch:{ all -> 0x0096 }
            if (r2 != 0) goto L_0x0070
            com.google.android.gms.internal.sj r2 = r12.t()     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.sl r2 = r2.A()     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "Audience with no ID. appId"
            java.lang.Object r7 = com.google.android.gms.internal.sj.a((java.lang.String) r13)     // Catch:{ all -> 0x0096 }
            r2.a(r3, r7)     // Catch:{ all -> 0x0096 }
        L_0x006d:
            int r1 = r1 + 1
            goto L_0x003e
        L_0x0070:
            java.lang.Integer r2 = r3.a     // Catch:{ all -> 0x0096 }
            int r7 = r2.intValue()     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.wt[] r8 = r3.c     // Catch:{ all -> 0x0096 }
            int r9 = r8.length     // Catch:{ all -> 0x0096 }
            r2 = r0
        L_0x007a:
            if (r2 >= r9) goto L_0x009e
            r10 = r8[r2]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r10 = r10.a     // Catch:{ all -> 0x0096 }
            if (r10 != 0) goto L_0x009b
            com.google.android.gms.internal.sj r2 = r12.t()     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.sl r2 = r2.A()     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.internal.sj.a((java.lang.String) r13)     // Catch:{ all -> 0x0096 }
            java.lang.Integer r3 = r3.a     // Catch:{ all -> 0x0096 }
            r2.a(r7, r8, r3)     // Catch:{ all -> 0x0096 }
            goto L_0x006d
        L_0x0096:
            r0 = move-exception
            r5.endTransaction()
            throw r0
        L_0x009b:
            int r2 = r2 + 1
            goto L_0x007a
        L_0x009e:
            com.google.android.gms.internal.ww[] r8 = r3.b     // Catch:{ all -> 0x0096 }
            int r9 = r8.length     // Catch:{ all -> 0x0096 }
            r2 = r0
        L_0x00a2:
            if (r2 >= r9) goto L_0x00c1
            r10 = r8[r2]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r10 = r10.a     // Catch:{ all -> 0x0096 }
            if (r10 != 0) goto L_0x00be
            com.google.android.gms.internal.sj r2 = r12.t()     // Catch:{ all -> 0x0096 }
            com.google.android.gms.internal.sl r2 = r2.A()     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.internal.sj.a((java.lang.String) r13)     // Catch:{ all -> 0x0096 }
            java.lang.Integer r3 = r3.a     // Catch:{ all -> 0x0096 }
            r2.a(r7, r8, r3)     // Catch:{ all -> 0x0096 }
            goto L_0x006d
        L_0x00be:
            int r2 = r2 + 1
            goto L_0x00a2
        L_0x00c1:
            com.google.android.gms.internal.wt[] r8 = r3.c     // Catch:{ all -> 0x0096 }
            int r9 = r8.length     // Catch:{ all -> 0x0096 }
            r2 = r0
        L_0x00c5:
            if (r2 >= r9) goto L_0x013c
            r10 = r8[r2]     // Catch:{ all -> 0x0096 }
            boolean r10 = r12.a((java.lang.String) r13, (int) r7, (com.google.android.gms.internal.wt) r10)     // Catch:{ all -> 0x0096 }
            if (r10 != 0) goto L_0x011a
            r2 = r0
        L_0x00d0:
            if (r2 == 0) goto L_0x00e1
            com.google.android.gms.internal.ww[] r8 = r3.b     // Catch:{ all -> 0x0096 }
            int r9 = r8.length     // Catch:{ all -> 0x0096 }
            r3 = r0
        L_0x00d6:
            if (r3 >= r9) goto L_0x00e1
            r10 = r8[r3]     // Catch:{ all -> 0x0096 }
            boolean r10 = r12.a((java.lang.String) r13, (int) r7, (com.google.android.gms.internal.ww) r10)     // Catch:{ all -> 0x0096 }
            if (r10 != 0) goto L_0x011d
            r2 = r0
        L_0x00e1:
            if (r2 != 0) goto L_0x006d
            r12.Q()     // Catch:{ all -> 0x0096 }
            r12.c()     // Catch:{ all -> 0x0096 }
            com.google.android.gms.common.internal.y.a((java.lang.String) r13)     // Catch:{ all -> 0x0096 }
            android.database.sqlite.SQLiteDatabase r2 = r12.A()     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "property_filters"
            java.lang.String r8 = "app_id=? and audience_id=?"
            r9 = 2
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x0096 }
            r10 = 0
            r9[r10] = r13     // Catch:{ all -> 0x0096 }
            r10 = 1
            java.lang.String r11 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0096 }
            r9[r10] = r11     // Catch:{ all -> 0x0096 }
            r2.delete(r3, r8, r9)     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = "event_filters"
            java.lang.String r8 = "app_id=? and audience_id=?"
            r9 = 2
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ all -> 0x0096 }
            r10 = 0
            r9[r10] = r13     // Catch:{ all -> 0x0096 }
            r10 = 1
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0096 }
            r9[r10] = r7     // Catch:{ all -> 0x0096 }
            r2.delete(r3, r8, r9)     // Catch:{ all -> 0x0096 }
            goto L_0x006d
        L_0x011a:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x011d:
            int r3 = r3 + 1
            goto L_0x00d6
        L_0x0120:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            int r2 = r14.length     // Catch:{ all -> 0x0096 }
        L_0x0126:
            if (r0 >= r2) goto L_0x0132
            r3 = r14[r0]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r3 = r3.a     // Catch:{ all -> 0x0096 }
            r1.add(r3)     // Catch:{ all -> 0x0096 }
            int r0 = r0 + 1
            goto L_0x0126
        L_0x0132:
            r12.a((java.lang.String) r13, (java.util.List<java.lang.Integer>) r1)     // Catch:{ all -> 0x0096 }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x0096 }
            r5.endTransaction()
            return
        L_0x013c:
            r2 = r4
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.a(java.lang.String, com.google.android.gms.internal.ws[]):void");
    }

    public final void a(List<Long> list) {
        y.a(list);
        c();
        Q();
        StringBuilder sb = new StringBuilder("rowid in (");
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                break;
            }
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(list.get(i2).longValue());
            i = i2 + 1;
        }
        sb.append(")");
        int delete = A().delete("raw_events", sb.toString(), (String[]) null);
        if (delete != list.size()) {
            t().y().a("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
        }
    }

    public final boolean a(rh rhVar) {
        y.a(rhVar);
        c();
        Q();
        if (c(rhVar.a, rhVar.c.a) == null) {
            if (b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{rhVar.a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rhVar.a);
        contentValues.put("origin", rhVar.b);
        contentValues.put("name", rhVar.c.a);
        a(contentValues, "value", rhVar.c.a());
        contentValues.put("active", Boolean.valueOf(rhVar.e));
        contentValues.put("trigger_event_name", rhVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(rhVar.h));
        p();
        contentValues.put("timed_out_event", wr.a((Parcelable) rhVar.g));
        contentValues.put("creation_timestamp", Long.valueOf(rhVar.d));
        p();
        contentValues.put("triggered_event", wr.a((Parcelable) rhVar.i));
        contentValues.put("triggered_timestamp", Long.valueOf(rhVar.c.b));
        contentValues.put("time_to_live", Long.valueOf(rhVar.j));
        p();
        contentValues.put("expired_event", wr.a((Parcelable) rhVar.k));
        try {
            if (A().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                t().y().a("Failed to insert/update conditional user property (got -1)", sj.a(rhVar.a));
            }
        } catch (SQLiteException e2) {
            t().y().a("Error storing conditional user property", sj.a(rhVar.a), e2);
        }
        return true;
    }

    public final boolean a(rr rrVar, long j, boolean z) {
        c();
        Q();
        y.a(rrVar);
        y.a(rrVar.a);
        xd xdVar = new xd();
        xdVar.d = Long.valueOf(rrVar.d);
        xdVar.a = new xe[rrVar.e.a()];
        Iterator<String> it = rrVar.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            String next = it.next();
            xe xeVar = new xe();
            xdVar.a[i] = xeVar;
            xeVar.a = next;
            p().a(xeVar, rrVar.e.a(next));
            i++;
        }
        try {
            byte[] bArr = new byte[xdVar.f()];
            ajx a2 = ajx.a(bArr, 0, bArr.length);
            xdVar.a(a2);
            a2.a();
            t().E().a("Saving event, name, data size", o().a(rrVar.b), Integer.valueOf(bArr.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", rrVar.a);
            contentValues.put("name", rrVar.b);
            contentValues.put("timestamp", Long.valueOf(rrVar.c));
            contentValues.put("metadata_fingerprint", Long.valueOf(j));
            contentValues.put("data", bArr);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (A().insert("raw_events", (String) null, contentValues) != -1) {
                    return true;
                }
                t().y().a("Failed to insert raw event (got -1). appId", sj.a(rrVar.a));
                return false;
            } catch (SQLiteException e2) {
                t().y().a("Error storing raw event. appId", sj.a(rrVar.a), e2);
                return false;
            }
        } catch (IOException e3) {
            t().y().a("Data loss. Failed to serialize event params/data. appId", sj.a(rrVar.a), e3);
            return false;
        }
    }

    public final boolean a(wq wqVar) {
        y.a(wqVar);
        c();
        Q();
        if (c(wqVar.a, wqVar.c) == null) {
            if (wr.a(wqVar.c)) {
                if (b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{wqVar.a}) >= 25) {
                    return false;
                }
            } else {
                if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{wqVar.a, wqVar.b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", wqVar.a);
        contentValues.put("origin", wqVar.b);
        contentValues.put("name", wqVar.c);
        contentValues.put("set_timestamp", Long.valueOf(wqVar.d));
        a(contentValues, "value", wqVar.e);
        try {
            if (A().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                t().y().a("Failed to insert/update user property (got -1). appId", sj.a(wqVar.a));
            }
        } catch (SQLiteException e2) {
            t().y().a("Error storing user property. appId", sj.a(wqVar.a), e2);
        }
        return true;
    }

    public final boolean a(xg xgVar, boolean z) {
        c();
        Q();
        y.a(xgVar);
        y.a(xgVar.o);
        y.a(xgVar.f);
        D();
        long a2 = k().a();
        if (xgVar.f.longValue() < a2 - rj.y() || xgVar.f.longValue() > rj.y() + a2) {
            t().A().a("Storing bundle outside of the max uploading time span. appId, now, timestamp", sj.a(xgVar.o), Long.valueOf(a2), xgVar.f);
        }
        try {
            byte[] bArr = new byte[xgVar.f()];
            ajx a3 = ajx.a(bArr, 0, bArr.length);
            xgVar.a(a3);
            a3.a();
            byte[] a4 = p().a(bArr);
            t().E().a("Saving bundle, size", Integer.valueOf(a4.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", xgVar.o);
            contentValues.put("bundle_end_timestamp", xgVar.f);
            contentValues.put("data", a4);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (A().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                t().y().a("Failed to insert bundle (got -1). appId", sj.a(xgVar.o));
                return false;
            } catch (SQLiteException e2) {
                t().y().a("Error storing bundle. appId", sj.a(xgVar.o), e2);
                return false;
            }
        } catch (IOException e3) {
            t().y().a("Data loss. Failed to serialize bundle. appId", sj.a(xgVar.o), e3);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.rd b(java.lang.String r12) {
        /*
            r11 = this;
            r10 = 1
            r9 = 0
            r8 = 0
            com.google.android.gms.common.internal.y.a((java.lang.String) r12)
            r11.c()
            r11.Q()
            android.database.sqlite.SQLiteDatabase r0 = r11.A()     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            java.lang.String r1 = "apps"
            r2 = 24
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 0
            java.lang.String r4 = "app_instance_id"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 1
            java.lang.String r4 = "gmp_app_id"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 2
            java.lang.String r4 = "resettable_device_id_hash"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 3
            java.lang.String r4 = "last_bundle_index"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 4
            java.lang.String r4 = "last_bundle_start_timestamp"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 5
            java.lang.String r4 = "last_bundle_end_timestamp"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 6
            java.lang.String r4 = "app_version"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 7
            java.lang.String r4 = "app_store"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 8
            java.lang.String r4 = "gmp_version"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 9
            java.lang.String r4 = "dev_cert_hash"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 10
            java.lang.String r4 = "measurement_enabled"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 11
            java.lang.String r4 = "day"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 12
            java.lang.String r4 = "daily_public_events_count"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 13
            java.lang.String r4 = "daily_events_count"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 14
            java.lang.String r4 = "daily_conversions_count"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 15
            java.lang.String r4 = "config_fetched_time"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 16
            java.lang.String r4 = "failed_config_fetch_time"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 17
            java.lang.String r4 = "app_version_int"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 18
            java.lang.String r4 = "firebase_instance_id"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 19
            java.lang.String r4 = "daily_error_events_count"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 20
            java.lang.String r4 = "daily_realtime_events_count"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 21
            java.lang.String r4 = "health_monitor_sample"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 22
            java.lang.String r4 = "android_id"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r3 = 23
            java.lang.String r4 = "adid_reporting_enabled"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            java.lang.String r3 = "app_id=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r5 = 0
            r4[r5] = r12     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x01e5, all -> 0x0200 }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x020a }
            if (r0 != 0) goto L_0x00ba
            if (r1 == 0) goto L_0x00b8
            r1.close()
        L_0x00b8:
            r0 = r8
        L_0x00b9:
            return r0
        L_0x00ba:
            com.google.android.gms.internal.rd r0 = new com.google.android.gms.internal.rd     // Catch:{ SQLiteException -> 0x020a }
            com.google.android.gms.internal.tk r2 = r11.p     // Catch:{ SQLiteException -> 0x020a }
            r0.<init>(r2, r12)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.a((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 1
            java.lang.String r2 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.b((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 2
            java.lang.String r2 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.c((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 3
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.f((long) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 4
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.a((long) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 5
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.b((long) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 6
            java.lang.String r2 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.e((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 7
            java.lang.String r2 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.f((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 8
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.d((long) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 9
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.e((long) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 10
            boolean r2 = r1.isNull(r2)     // Catch:{ SQLiteException -> 0x020a }
            if (r2 != 0) goto L_0x0123
            r2 = 10
            int r2 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x020a }
            if (r2 == 0) goto L_0x01d1
        L_0x0123:
            r2 = r10
        L_0x0124:
            r0.a((boolean) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 11
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.i(r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 12
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.j(r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 13
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.k(r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 14
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.l(r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 15
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.g((long) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 16
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.h(r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 17
            boolean r2 = r1.isNull(r2)     // Catch:{ SQLiteException -> 0x020a }
            if (r2 == 0) goto L_0x01d4
            r2 = -2147483648(0xffffffff80000000, double:NaN)
        L_0x0168:
            r0.c((long) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 18
            java.lang.String r2 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.d((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 19
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.n(r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 20
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.m(r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 21
            java.lang.String r2 = r1.getString(r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.g((java.lang.String) r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 22
            boolean r2 = r1.isNull(r2)     // Catch:{ SQLiteException -> 0x020a }
            if (r2 == 0) goto L_0x01dc
            r2 = 0
        L_0x0199:
            r0.o(r2)     // Catch:{ SQLiteException -> 0x020a }
            r2 = 23
            boolean r2 = r1.isNull(r2)     // Catch:{ SQLiteException -> 0x020a }
            if (r2 != 0) goto L_0x01ac
            r2 = 23
            int r2 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x020a }
            if (r2 == 0) goto L_0x01e3
        L_0x01ac:
            r2 = r10
        L_0x01ad:
            r0.b((boolean) r2)     // Catch:{ SQLiteException -> 0x020a }
            r0.a()     // Catch:{ SQLiteException -> 0x020a }
            boolean r2 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x020a }
            if (r2 == 0) goto L_0x01ca
            com.google.android.gms.internal.sj r2 = r11.t()     // Catch:{ SQLiteException -> 0x020a }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ SQLiteException -> 0x020a }
            java.lang.String r3 = "Got multiple records for app, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x020a }
            r2.a(r3, r4)     // Catch:{ SQLiteException -> 0x020a }
        L_0x01ca:
            if (r1 == 0) goto L_0x00b9
            r1.close()
            goto L_0x00b9
        L_0x01d1:
            r2 = r9
            goto L_0x0124
        L_0x01d4:
            r2 = 17
            int r2 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x020a }
            long r2 = (long) r2     // Catch:{ SQLiteException -> 0x020a }
            goto L_0x0168
        L_0x01dc:
            r2 = 22
            long r2 = r1.getLong(r2)     // Catch:{ SQLiteException -> 0x020a }
            goto L_0x0199
        L_0x01e3:
            r2 = r9
            goto L_0x01ad
        L_0x01e5:
            r0 = move-exception
            r1 = r8
        L_0x01e7:
            com.google.android.gms.internal.sj r2 = r11.t()     // Catch:{ all -> 0x0208 }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x0208 }
            java.lang.String r3 = "Error querying app. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ all -> 0x0208 }
            r2.a(r3, r4, r0)     // Catch:{ all -> 0x0208 }
            if (r1 == 0) goto L_0x01fd
            r1.close()
        L_0x01fd:
            r0 = r8
            goto L_0x00b9
        L_0x0200:
            r0 = move-exception
            r1 = r8
        L_0x0202:
            if (r1 == 0) goto L_0x0207
            r1.close()
        L_0x0207:
            throw r0
        L_0x0208:
            r0 = move-exception
            goto L_0x0202
        L_0x020a:
            r0 = move-exception
            goto L_0x01e7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.b(java.lang.String):com.google.android.gms.internal.rd");
    }

    public final List<rh> b(String str, String str2, String str3) {
        y.a(str);
        c();
        Q();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void b(String str, String str2) {
        y.a(str);
        y.a(str2);
        c();
        Q();
        try {
            t().E().a("Deleted user attribute rows", Integer.valueOf(A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2})));
        } catch (SQLiteException e2) {
            t().y().a("Error deleting user attribute. appId", sj.a(str), o().c(str2), e2);
        }
    }

    public final long c(String str) {
        y.a(str);
        c();
        Q();
        try {
            return (long) A().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, v().b(str, rz.r))))});
        } catch (SQLiteException e2) {
            t().y().a("Error deleting over the limit events. appId", sj.a(str), e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.wq c(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            r8 = 0
            com.google.android.gms.common.internal.y.a((java.lang.String) r10)
            com.google.android.gms.common.internal.y.a((java.lang.String) r11)
            r9.c()
            r9.Q()
            android.database.sqlite.SQLiteDatabase r0 = r9.A()     // Catch:{ SQLiteException -> 0x0077, all -> 0x0099 }
            java.lang.String r1 = "user_attributes"
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0099 }
            r3 = 0
            java.lang.String r4 = "set_timestamp"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0077, all -> 0x0099 }
            r3 = 1
            java.lang.String r4 = "value"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0077, all -> 0x0099 }
            r3 = 2
            java.lang.String r4 = "origin"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0077, all -> 0x0099 }
            java.lang.String r3 = "app_id=? and name=?"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0077, all -> 0x0099 }
            r5 = 0
            r4[r5] = r10     // Catch:{ SQLiteException -> 0x0077, all -> 0x0099 }
            r5 = 1
            r4[r5] = r11     // Catch:{ SQLiteException -> 0x0077, all -> 0x0099 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0077, all -> 0x0099 }
            boolean r0 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
            if (r0 != 0) goto L_0x0044
            if (r7 == 0) goto L_0x0042
            r7.close()
        L_0x0042:
            r0 = r8
        L_0x0043:
            return r0
        L_0x0044:
            r0 = 0
            long r4 = r7.getLong(r0)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
            r0 = 1
            java.lang.Object r6 = r9.a((android.database.Cursor) r7, (int) r0)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
            r0 = 2
            java.lang.String r2 = r7.getString(r0)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
            com.google.android.gms.internal.wq r0 = new com.google.android.gms.internal.wq     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
            r1 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r6)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
            boolean r1 = r7.moveToNext()     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
            if (r1 == 0) goto L_0x0071
            com.google.android.gms.internal.sj r1 = r9.t()     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
            com.google.android.gms.internal.sl r1 = r1.y()     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.internal.sj.a((java.lang.String) r10)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
            r1.a(r2, r3)     // Catch:{ SQLiteException -> 0x00a6, all -> 0x00a0 }
        L_0x0071:
            if (r7 == 0) goto L_0x0043
            r7.close()
            goto L_0x0043
        L_0x0077:
            r0 = move-exception
            r1 = r8
        L_0x0079:
            com.google.android.gms.internal.sj r2 = r9.t()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r10)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.sh r5 = r9.o()     // Catch:{ all -> 0x00a3 }
            java.lang.String r5 = r5.c(r11)     // Catch:{ all -> 0x00a3 }
            r2.a(r3, r4, r5, r0)     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x0097
            r1.close()
        L_0x0097:
            r0 = r8
            goto L_0x0043
        L_0x0099:
            r0 = move-exception
        L_0x009a:
            if (r8 == 0) goto L_0x009f
            r8.close()
        L_0x009f:
            throw r0
        L_0x00a0:
            r0 = move-exception
            r8 = r7
            goto L_0x009a
        L_0x00a3:
            r0 = move-exception
            r8 = r1
            goto L_0x009a
        L_0x00a6:
            r0 = move-exception
            r1 = r7
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.c(java.lang.String, java.lang.String):com.google.android.gms.internal.wq");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.rh d(java.lang.String r22, java.lang.String r23) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.y.a((java.lang.String) r22)
            com.google.android.gms.common.internal.y.a((java.lang.String) r23)
            r21.c()
            r21.Q()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r2 = r21.A()     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            java.lang.String r3 = "conditional_properties"
            r4 = 11
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 0
            java.lang.String r6 = "origin"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 1
            java.lang.String r6 = "value"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 2
            java.lang.String r6 = "active"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 3
            java.lang.String r6 = "trigger_event_name"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 4
            java.lang.String r6 = "trigger_timeout"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 5
            java.lang.String r6 = "timed_out_event"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 6
            java.lang.String r6 = "creation_timestamp"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 7
            java.lang.String r6 = "triggered_event"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 8
            java.lang.String r6 = "triggered_timestamp"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 9
            java.lang.String r6 = "time_to_live"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r5 = 10
            java.lang.String r6 = "expired_event"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            java.lang.String r5 = "app_id=? and name=?"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r7 = 0
            r6[r7] = r22     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r7 = 1
            r6[r7] = r23     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r20 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0148 }
            boolean r2 = r20.moveToFirst()     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            if (r2 != 0) goto L_0x0070
            if (r20 == 0) goto L_0x006e
            r20.close()
        L_0x006e:
            r5 = 0
        L_0x006f:
            return r5
        L_0x0070:
            r2 = 0
            r0 = r20
            java.lang.String r7 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r2 = 1
            r0 = r21
            r1 = r20
            java.lang.Object r6 = r0.a((android.database.Cursor) r1, (int) r2)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r2 = 2
            r0 = r20
            int r2 = r0.getInt(r2)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            if (r2 == 0) goto L_0x0120
            r11 = 1
        L_0x008a:
            r2 = 3
            r0 = r20
            java.lang.String r12 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r2 = 4
            r0 = r20
            long r14 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            com.google.android.gms.internal.wr r2 = r21.p()     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r3 = 5
            r0 = r20
            byte[] r3 = r0.getBlob(r3)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.rx> r4 = com.google.android.gms.internal.rx.CREATOR     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            android.os.Parcelable r13 = r2.a((byte[]) r3, r4)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            com.google.android.gms.internal.rx r13 = (com.google.android.gms.internal.rx) r13     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r2 = 6
            r0 = r20
            long r9 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            com.google.android.gms.internal.wr r2 = r21.p()     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r3 = 7
            r0 = r20
            byte[] r3 = r0.getBlob(r3)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.rx> r4 = com.google.android.gms.internal.rx.CREATOR     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            android.os.Parcelable r16 = r2.a((byte[]) r3, r4)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            com.google.android.gms.internal.rx r16 = (com.google.android.gms.internal.rx) r16     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r2 = 8
            r0 = r20
            long r4 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r2 = 9
            r0 = r20
            long r17 = r0.getLong(r2)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            com.google.android.gms.internal.wr r2 = r21.p()     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r3 = 10
            r0 = r20
            byte[] r3 = r0.getBlob(r3)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            android.os.Parcelable$Creator<com.google.android.gms.internal.rx> r8 = com.google.android.gms.internal.rx.CREATOR     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            android.os.Parcelable r19 = r2.a((byte[]) r3, r8)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            com.google.android.gms.internal.rx r19 = (com.google.android.gms.internal.rx) r19     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            com.google.android.gms.internal.wo r2 = new com.google.android.gms.internal.wo     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r3 = r23
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            com.google.android.gms.internal.rh r5 = new com.google.android.gms.internal.rh     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r6 = r22
            r8 = r2
            r5.<init>(r6, r7, r8, r9, r11, r12, r13, r14, r16, r17, r19)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            boolean r2 = r20.moveToNext()     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            if (r2 == 0) goto L_0x0119
            com.google.android.gms.internal.sj r2 = r21.t()     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r22)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            com.google.android.gms.internal.sh r6 = r21.o()     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r0 = r23
            java.lang.String r6 = r6.c(r0)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
            r2.a(r3, r4, r6)     // Catch:{ SQLiteException -> 0x0157, all -> 0x0151 }
        L_0x0119:
            if (r20 == 0) goto L_0x006f
            r20.close()
            goto L_0x006f
        L_0x0120:
            r11 = 0
            goto L_0x008a
        L_0x0123:
            r2 = move-exception
            r3 = r10
        L_0x0125:
            com.google.android.gms.internal.sj r4 = r21.t()     // Catch:{ all -> 0x0153 }
            com.google.android.gms.internal.sl r4 = r4.y()     // Catch:{ all -> 0x0153 }
            java.lang.String r5 = "Error querying conditional property"
            java.lang.Object r6 = com.google.android.gms.internal.sj.a((java.lang.String) r22)     // Catch:{ all -> 0x0153 }
            com.google.android.gms.internal.sh r7 = r21.o()     // Catch:{ all -> 0x0153 }
            r0 = r23
            java.lang.String r7 = r7.c(r0)     // Catch:{ all -> 0x0153 }
            r4.a(r5, r6, r7, r2)     // Catch:{ all -> 0x0153 }
            if (r3 == 0) goto L_0x0145
            r3.close()
        L_0x0145:
            r5 = 0
            goto L_0x006f
        L_0x0148:
            r2 = move-exception
            r20 = r10
        L_0x014b:
            if (r20 == 0) goto L_0x0150
            r20.close()
        L_0x0150:
            throw r2
        L_0x0151:
            r2 = move-exception
            goto L_0x014b
        L_0x0153:
            r2 = move-exception
            r20 = r3
            goto L_0x014b
        L_0x0157:
            r2 = move-exception
            r3 = r20
            goto L_0x0125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.d(java.lang.String, java.lang.String):com.google.android.gms.internal.rh");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] d(java.lang.String r10) {
        /*
            r9 = this;
            r8 = 0
            com.google.android.gms.common.internal.y.a((java.lang.String) r10)
            r9.c()
            r9.Q()
            android.database.sqlite.SQLiteDatabase r0 = r9.A()     // Catch:{ SQLiteException -> 0x0056, all -> 0x0070 }
            java.lang.String r1 = "apps"
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0056, all -> 0x0070 }
            r3 = 0
            java.lang.String r4 = "remote_config"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x0056, all -> 0x0070 }
            java.lang.String r3 = "app_id=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0056, all -> 0x0070 }
            r5 = 0
            r4[r5] = r10     // Catch:{ SQLiteException -> 0x0056, all -> 0x0070 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x0056, all -> 0x0070 }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x007a }
            if (r0 != 0) goto L_0x0034
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            r0 = r8
        L_0x0033:
            return r0
        L_0x0034:
            r0 = 0
            byte[] r0 = r1.getBlob(r0)     // Catch:{ SQLiteException -> 0x007a }
            boolean r2 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x007a }
            if (r2 == 0) goto L_0x0050
            com.google.android.gms.internal.sj r2 = r9.t()     // Catch:{ SQLiteException -> 0x007a }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ SQLiteException -> 0x007a }
            java.lang.String r3 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r10)     // Catch:{ SQLiteException -> 0x007a }
            r2.a(r3, r4)     // Catch:{ SQLiteException -> 0x007a }
        L_0x0050:
            if (r1 == 0) goto L_0x0033
            r1.close()
            goto L_0x0033
        L_0x0056:
            r0 = move-exception
            r1 = r8
        L_0x0058:
            com.google.android.gms.internal.sj r2 = r9.t()     // Catch:{ all -> 0x0078 }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = "Error querying remote config. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r10)     // Catch:{ all -> 0x0078 }
            r2.a(r3, r4, r0)     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x006e
            r1.close()
        L_0x006e:
            r0 = r8
            goto L_0x0033
        L_0x0070:
            r0 = move-exception
            r1 = r8
        L_0x0072:
            if (r1 == 0) goto L_0x0077
            r1.close()
        L_0x0077:
            throw r0
        L_0x0078:
            r0 = move-exception
            goto L_0x0072
        L_0x007a:
            r0 = move-exception
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.d(java.lang.String):byte[]");
    }

    public final int e(String str, String str2) {
        y.a(str);
        y.a(str2);
        c();
        Q();
        try {
            return A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            t().y().a("Error deleting conditional property", sj.a(str), o().c(str2), e2);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.xh> e(java.lang.String r10) {
        /*
            r9 = this;
            r8 = 0
            r9.Q()
            r9.c()
            com.google.android.gms.common.internal.y.a((java.lang.String) r10)
            android.database.sqlite.SQLiteDatabase r0 = r9.A()
            java.lang.String r1 = "audience_filter_values"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0099 }
            r3 = 0
            java.lang.String r4 = "audience_id"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0099 }
            r3 = 1
            java.lang.String r4 = "current_results"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0099 }
            java.lang.String r3 = "app_id=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0099 }
            r5 = 0
            r4[r5] = r10     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0099 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x00a3, all -> 0x0099 }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0080 }
            if (r0 != 0) goto L_0x0039
            if (r1 == 0) goto L_0x0037
            r1.close()
        L_0x0037:
            r0 = r8
        L_0x0038:
            return r0
        L_0x0039:
            android.support.v4.c.a r0 = new android.support.v4.c.a     // Catch:{ SQLiteException -> 0x0080 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x0080 }
        L_0x003e:
            r2 = 0
            int r2 = r1.getInt(r2)     // Catch:{ SQLiteException -> 0x0080 }
            r3 = 1
            byte[] r3 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x0080 }
            r4 = 0
            int r5 = r3.length     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.internal.ajw r3 = com.google.android.gms.internal.ajw.a(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.internal.xh r4 = new com.google.android.gms.internal.xh     // Catch:{ SQLiteException -> 0x0080 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0080 }
            r4.a((com.google.android.gms.internal.ajw) r3)     // Catch:{ IOException -> 0x0069 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0080 }
            r0.put(r2, r4)     // Catch:{ SQLiteException -> 0x0080 }
        L_0x005d:
            boolean r2 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0080 }
            if (r2 != 0) goto L_0x003e
            if (r1 == 0) goto L_0x0038
            r1.close()
            goto L_0x0038
        L_0x0069:
            r3 = move-exception
            com.google.android.gms.internal.sj r4 = r9.t()     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.internal.sl r4 = r4.y()     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.internal.sj.a((java.lang.String) r10)     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0080 }
            r4.a(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x0080 }
            goto L_0x005d
        L_0x0080:
            r0 = move-exception
        L_0x0081:
            com.google.android.gms.internal.sj r2 = r9.t()     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x00a1 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r10)     // Catch:{ all -> 0x00a1 }
            r2.a(r3, r4, r0)     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x0097
            r1.close()
        L_0x0097:
            r0 = r8
            goto L_0x0038
        L_0x0099:
            r0 = move-exception
            r1 = r8
        L_0x009b:
            if (r1 == 0) goto L_0x00a0
            r1.close()
        L_0x00a0:
            throw r0
        L_0x00a1:
            r0 = move-exception
            goto L_0x009b
        L_0x00a3:
            r0 = move-exception
            r1 = r8
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.e(java.lang.String):java.util.Map");
    }

    public final long f(String str) {
        y.a(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.wt>> f(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            r9 = 0
            r10.Q()
            r10.c()
            com.google.android.gms.common.internal.y.a((java.lang.String) r11)
            com.google.android.gms.common.internal.y.a((java.lang.String) r12)
            android.support.v4.c.a r8 = new android.support.v4.c.a
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r0 = r10.A()
            java.lang.String r1 = "event_filters"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            r3 = 0
            java.lang.String r4 = "audience_id"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            r3 = 1
            java.lang.String r4 = "data"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            java.lang.String r3 = "app_id=? AND event_name=?"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            r5 = 0
            r4[r5] = r11     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            r5 = 1
            r4[r5] = r12     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x009a }
            if (r0 != 0) goto L_0x0047
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x009a }
            if (r1 == 0) goto L_0x0046
            r1.close()
        L_0x0046:
            return r0
        L_0x0047:
            r0 = 1
            byte[] r0 = r1.getBlob(r0)     // Catch:{ SQLiteException -> 0x009a }
            r2 = 0
            int r3 = r0.length     // Catch:{ SQLiteException -> 0x009a }
            com.google.android.gms.internal.ajw r0 = com.google.android.gms.internal.ajw.a(r0, r2, r3)     // Catch:{ SQLiteException -> 0x009a }
            com.google.android.gms.internal.wt r2 = new com.google.android.gms.internal.wt     // Catch:{ SQLiteException -> 0x009a }
            r2.<init>()     // Catch:{ SQLiteException -> 0x009a }
            r2.a((com.google.android.gms.internal.ajw) r0)     // Catch:{ IOException -> 0x0087 }
            r0 = 0
            int r3 = r1.getInt(r0)     // Catch:{ SQLiteException -> 0x009a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x009a }
            java.lang.Object r0 = r8.get(r0)     // Catch:{ SQLiteException -> 0x009a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ SQLiteException -> 0x009a }
            if (r0 != 0) goto L_0x0077
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x009a }
            r0.<init>()     // Catch:{ SQLiteException -> 0x009a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x009a }
            r8.put(r3, r0)     // Catch:{ SQLiteException -> 0x009a }
        L_0x0077:
            r0.add(r2)     // Catch:{ SQLiteException -> 0x009a }
        L_0x007a:
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x009a }
            if (r0 != 0) goto L_0x0047
            if (r1 == 0) goto L_0x0085
            r1.close()
        L_0x0085:
            r0 = r8
            goto L_0x0046
        L_0x0087:
            r0 = move-exception
            com.google.android.gms.internal.sj r2 = r10.t()     // Catch:{ SQLiteException -> 0x009a }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ SQLiteException -> 0x009a }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x009a }
            r2.a(r3, r4, r0)     // Catch:{ SQLiteException -> 0x009a }
            goto L_0x007a
        L_0x009a:
            r0 = move-exception
        L_0x009b:
            com.google.android.gms.internal.sj r2 = r10.t()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r11)     // Catch:{ all -> 0x00bb }
            r2.a(r3, r4, r0)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00b1
            r1.close()
        L_0x00b1:
            r0 = r9
            goto L_0x0046
        L_0x00b3:
            r0 = move-exception
            r1 = r9
        L_0x00b5:
            if (r1 == 0) goto L_0x00ba
            r1.close()
        L_0x00ba:
            throw r0
        L_0x00bb:
            r0 = move-exception
            goto L_0x00b5
        L_0x00bd:
            r0 = move-exception
            r1 = r9
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.ww>> g(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            r9 = 0
            r10.Q()
            r10.c()
            com.google.android.gms.common.internal.y.a((java.lang.String) r11)
            com.google.android.gms.common.internal.y.a((java.lang.String) r12)
            android.support.v4.c.a r8 = new android.support.v4.c.a
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r0 = r10.A()
            java.lang.String r1 = "property_filters"
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            r3 = 0
            java.lang.String r4 = "audience_id"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            r3 = 1
            java.lang.String r4 = "data"
            r2[r3] = r4     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            java.lang.String r3 = "app_id=? AND property_name=?"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            r5 = 0
            r4[r5] = r11     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            r5 = 1
            r4[r5] = r12     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x00bd, all -> 0x00b3 }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x009a }
            if (r0 != 0) goto L_0x0047
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x009a }
            if (r1 == 0) goto L_0x0046
            r1.close()
        L_0x0046:
            return r0
        L_0x0047:
            r0 = 1
            byte[] r0 = r1.getBlob(r0)     // Catch:{ SQLiteException -> 0x009a }
            r2 = 0
            int r3 = r0.length     // Catch:{ SQLiteException -> 0x009a }
            com.google.android.gms.internal.ajw r0 = com.google.android.gms.internal.ajw.a(r0, r2, r3)     // Catch:{ SQLiteException -> 0x009a }
            com.google.android.gms.internal.ww r2 = new com.google.android.gms.internal.ww     // Catch:{ SQLiteException -> 0x009a }
            r2.<init>()     // Catch:{ SQLiteException -> 0x009a }
            r2.a((com.google.android.gms.internal.ajw) r0)     // Catch:{ IOException -> 0x0087 }
            r0 = 0
            int r3 = r1.getInt(r0)     // Catch:{ SQLiteException -> 0x009a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x009a }
            java.lang.Object r0 = r8.get(r0)     // Catch:{ SQLiteException -> 0x009a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ SQLiteException -> 0x009a }
            if (r0 != 0) goto L_0x0077
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x009a }
            r0.<init>()     // Catch:{ SQLiteException -> 0x009a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x009a }
            r8.put(r3, r0)     // Catch:{ SQLiteException -> 0x009a }
        L_0x0077:
            r0.add(r2)     // Catch:{ SQLiteException -> 0x009a }
        L_0x007a:
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x009a }
            if (r0 != 0) goto L_0x0047
            if (r1 == 0) goto L_0x0085
            r1.close()
        L_0x0085:
            r0 = r8
            goto L_0x0046
        L_0x0087:
            r0 = move-exception
            com.google.android.gms.internal.sj r2 = r10.t()     // Catch:{ SQLiteException -> 0x009a }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ SQLiteException -> 0x009a }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x009a }
            r2.a(r3, r4, r0)     // Catch:{ SQLiteException -> 0x009a }
            goto L_0x007a
        L_0x009a:
            r0 = move-exception
        L_0x009b:
            com.google.android.gms.internal.sj r2 = r10.t()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = "Database error querying filters. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r11)     // Catch:{ all -> 0x00bb }
            r2.a(r3, r4, r0)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00b1
            r1.close()
        L_0x00b1:
            r0 = r9
            goto L_0x0046
        L_0x00b3:
            r0 = move-exception
            r1 = r9
        L_0x00b5:
            if (r1 == 0) goto L_0x00ba
            r1.close()
        L_0x00ba:
            throw r0
        L_0x00bb:
            r0 = move-exception
            goto L_0x00b5
        L_0x00bd:
            r0 = move-exception
            r1 = r9
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.rk.g(java.lang.String, java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: protected */
    public final long h(String str, String str2) {
        SQLiteException e2;
        long j;
        y.a(str);
        y.a(str2);
        c();
        Q();
        SQLiteDatabase A = A();
        A.beginTransaction();
        try {
            j = a(new StringBuilder(String.valueOf(str2).length() + 32).append("select ").append(str2).append(" from app2 where app_id=?").toString(), new String[]{str}, -1);
            if (j == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (A.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    t().y().a("Failed to insert column (got -1). appId", sj.a(str), str2);
                    A.endTransaction();
                    return -1;
                }
                j = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put(str2, Long.valueOf(1 + j));
                if (((long) A.update("app2", contentValues2, "app_id = ?", new String[]{str})) == 0) {
                    t().y().a("Failed to update column (got 0). appId", sj.a(str), str2);
                    A.endTransaction();
                    return -1;
                }
                A.setTransactionSuccessful();
                A.endTransaction();
                return j;
            } catch (SQLiteException e3) {
                e2 = e3;
                try {
                    t().y().a("Error inserting column. appId", sj.a(str), str2, e2);
                    return j;
                } finally {
                    A.endTransaction();
                }
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            j = 0;
            t().y().a("Error inserting column. appId", sj.a(str), str2, e2);
            return j;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    public final void x() {
        Q();
        A().beginTransaction();
    }

    public final void y() {
        Q();
        A().setTransactionSuccessful();
    }

    public final void z() {
        Q();
        A().endTransaction();
    }
}
