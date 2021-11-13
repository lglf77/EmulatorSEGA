package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class xr {
    private static final String[] e = {"/aclk", "/pcs/click"};
    private String a = "googleads.g.doubleclick.net";
    private String b = "/pagead/ads";
    private String c = "ad.doubleclick.net";
    private String[] d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private xn f;

    public xr(xn xnVar) {
        this.f = xnVar;
    }

    private final Uri a(Uri uri, Context context, String str, boolean z, View view, Activity activity) {
        try {
            boolean c2 = c(uri);
            if (c2) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new xs("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new xs("Query parameter already exists: ms");
            }
            String a2 = z ? this.f.a(context, str, view, activity) : this.f.a(context);
            if (c2) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    return Uri.parse(uri2.substring(0, indexOf + 1) + "dc_ms" + "=" + a2 + ";" + uri2.substring(indexOf + 1));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + a2 + ";" + uri2.substring(encodedPath.length() + indexOf2));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            return indexOf3 != -1 ? Uri.parse(uri3.substring(0, indexOf3 + 1) + "ms" + "=" + a2 + "&" + uri3.substring(indexOf3 + 1)) : uri.buildUpon().appendQueryParameter("ms", a2).build();
        } catch (UnsupportedOperationException e2) {
            throw new xs("Provided Uri is not in a valid state");
        }
    }

    private final boolean c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.c);
        } catch (NullPointerException e2) {
            return false;
        }
    }

    public final Uri a(Uri uri, Context context) {
        return a(uri, context, (String) null, false, (View) null, (Activity) null);
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException e2) {
            throw new xs("Provided Uri is not in a valid state");
        }
    }

    public final xn a() {
        return this.f;
    }

    public final void a(MotionEvent motionEvent) {
        this.f.a(motionEvent);
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.d) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }

    public final boolean b(Uri uri) {
        if (!a(uri)) {
            return false;
        }
        for (String endsWith : e) {
            if (uri.getPath().endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }
}
