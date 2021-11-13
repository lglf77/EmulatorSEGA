package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.au;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@bfk
@TargetApi(8)
public class hc {
    private hc() {
    }

    public static boolean a(mw mwVar) {
        if (mwVar == null) {
            return false;
        }
        mwVar.onPause();
        return true;
    }

    public static boolean b(mw mwVar) {
        if (mwVar == null) {
            return false;
        }
        mwVar.onResume();
        return true;
    }

    public static boolean e() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public int a() {
        return 0;
    }

    public Drawable a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public mx a(mw mwVar, boolean z) {
        return new mx(mwVar, z);
    }

    public String a(Context context) {
        return "";
    }

    public String a(SslError sslError) {
        return "";
    }

    public Set<String> a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public void a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public void a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public boolean a(DownloadManager.Request request) {
        return false;
    }

    public boolean a(Context context, WebSettings webSettings) {
        return false;
    }

    public boolean a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean a(Window window) {
        return false;
    }

    public int b() {
        return 1;
    }

    public void b(Context context) {
        au.i().w();
    }

    public boolean b(View view) {
        return false;
    }

    public int c() {
        return 5;
    }

    public CookieManager c(Context context) {
        if (e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            fn.b("Failed to obtain CookieManager.", th);
            au.i().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebChromeClient c(mw mwVar) {
        return null;
    }

    public boolean c(View view) {
        return false;
    }

    public ViewGroup.LayoutParams d() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public int f() {
        return 0;
    }
}
