package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.pp;
import com.google.android.gms.internal.ps;
import java.util.Arrays;

public final class a extends pp {
    public static final Parcelable.Creator<a> CREATOR = new f();
    public static final a a = new a(0);
    private int b;
    private final int c;
    private final PendingIntent d;
    private final String e;

    public a(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    a(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public a(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public a(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    static String a(int i) {
        switch (i) {
            case -1:
                return "UNKNOWN";
            case a.b.AdsAttrs_adSize:
                return "SUCCESS";
            case a.b.AdsAttrs_adSizes:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 99:
                return "UNFINISHED";
            case 1500:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                return new StringBuilder(31).append("UNKNOWN_ERROR_CODE(").append(i).append(")").toString();
        }
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final int b() {
        return this.c;
    }

    public final PendingIntent c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.c == aVar.c && v.a(this.d, aVar.d) && v.a(this.e, aVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        return v.a(this).a("statusCode", a(this.c)).a("resolution", this.d).a("message", this.e).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.b);
        ps.a(parcel, 2, b());
        ps.a(parcel, 3, (Parcelable) c(), i, false);
        ps.a(parcel, 4, d(), false);
        ps.a(parcel, a2);
    }
}
