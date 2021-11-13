package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.au;
import java.util.List;

@bfk
public final class anz extends pp {
    public static final Parcelable.Creator<anz> CREATOR = new aoa();
    public final String a;
    private long b;
    private String c;
    private String d;
    private String e;
    private Bundle f;
    private boolean g;
    private long h;

    anz(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.a = str;
        this.b = j;
        this.c = str2 == null ? "" : str2;
        this.d = str3 == null ? "" : str3;
        this.e = str4 == null ? "" : str4;
        this.f = bundle == null ? new Bundle() : bundle;
        this.g = z;
        this.h = j2;
    }

    public static anz a(Uri uri) {
        long j = 0;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                fn.e(new StringBuilder(62).append("Expected 2 path parts for namespace and id, found :").append(pathSegments.size()).toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 != null) {
                j = Long.parseLong(queryParameter2);
            }
            Bundle bundle = new Bundle();
            for (String next : au.g().a(uri)) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri.getQueryParameter(next));
                }
            }
            return new anz(queryParameter, j, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e2) {
            fn.c("Unable to parse Uri into cache offering.", e2);
            return null;
        }
    }

    public static anz a(String str) {
        return a(Uri.parse(str));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, this.b);
        ps.a(parcel, 4, this.c, false);
        ps.a(parcel, 5, this.d, false);
        ps.a(parcel, 6, this.e, false);
        ps.a(parcel, 7, this.f, false);
        ps.a(parcel, 8, this.g);
        ps.a(parcel, 9, this.h);
        ps.a(parcel, a2);
    }
}
