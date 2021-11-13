package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

@TargetApi(11)
final class sg extends SQLiteOpenHelper {
    private /* synthetic */ sf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    sg(sf sfVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = sfVar;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            if (Build.VERSION.SDK_INT < 11 || !(e instanceof SQLiteDatabaseLockedException)) {
                this.a.t().y().a("Opening the local database failed, dropping and recreating it");
                if (!this.a.l().getDatabasePath("google_app_measurement_local.db").delete()) {
                    this.a.t().y().a("Failed to delete corrupted local db file", "google_app_measurement_local.db");
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException e2) {
                    this.a.t().y().a("Failed to open local database. Events will bypass local storage", e2);
                    return null;
                }
            } else {
                throw e;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        rk.a(this.a.t(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        if (Build.VERSION.SDK_INT < 15) {
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", (String[]) null);
                try {
                    rawQuery.moveToFirst();
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = rawQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        rk.a(this.a.t(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
