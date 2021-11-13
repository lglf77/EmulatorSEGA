package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.internal.ara;
import com.google.android.gms.internal.atw;
import com.google.android.gms.internal.atz;
import com.google.android.gms.internal.aub;
import com.google.android.gms.internal.avh;
import com.google.android.gms.internal.avi;
import com.google.android.gms.internal.bai;
import com.google.android.gms.internal.bbe;
import com.google.android.gms.internal.bbh;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.nb;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

@bfk
public final class r {
    public static View a(ev evVar) {
        if (evVar == null) {
            fn.c("AdState is null");
            return null;
        } else if (!b(evVar) || evVar.b == null) {
            try {
                a a = evVar.o != null ? evVar.o.a() : null;
                if (a != null) {
                    return (View) c.a(a);
                }
                fn.e("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e) {
                fn.c("Could not get View from mediation adapter.", e);
                return null;
            }
        } else {
            mw mwVar = evVar.b;
            if (mwVar != null) {
                return (View) mwVar;
            }
            throw null;
        }
    }

    static aa<mw> a(bbe bbe, bbh bbh, c cVar) {
        return new w(bbe, cVar, bbh);
    }

    private static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            fn.e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        String valueOf2 = String.valueOf(encodeToString);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    static String a(avh avh) {
        if (avh == null) {
            fn.e("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = avh.b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException e) {
            fn.e("Unable to get image uri. Trying data uri next");
        }
        return b(avh);
    }

    public static boolean a(mw mwVar, bai bai, CountDownLatch countDownLatch) {
        boolean z;
        if (mwVar == null) {
            try {
                throw null;
            } catch (RemoteException e) {
                fn.c("Unable to invoke load assets", e);
                z = false;
            } catch (RuntimeException e2) {
                countDownLatch.countDown();
                throw e2;
            }
        } else {
            View view = (View) mwVar;
            if (view == null) {
                fn.e("AdWebView is null");
                z = false;
            } else {
                view.setVisibility(4);
                List<String> list = bai.b.p;
                if (list == null || list.isEmpty()) {
                    fn.e("No template ids present in mediation response");
                    z = false;
                } else {
                    mwVar.w().a("/nativeExpressAssetsLoaded", (aa<? super mw>) new u(countDownLatch));
                    mwVar.w().a("/nativeExpressAssetsLoadingFailed", (aa<? super mw>) new v(countDownLatch));
                    bbe h = bai.c.h();
                    bbh i = bai.c.i();
                    if (list.contains("2") && h != null) {
                        mwVar.w().a((nb) new s(new atz(h.a(), h.b(), h.c(), h.d(), h.e(), h.f(), h.g(), h.h(), (atw) null, h.l(), (ara) null, h.p() != null ? (View) c.a(h.p()) : null, h.q(), (String) null), bai.b.o, mwVar));
                    } else if (!list.contains("1") || i == null) {
                        fn.e("No matching template id and mapper");
                        z = false;
                    } else {
                        mwVar.w().a((nb) new t(new aub(i.a(), i.b(), i.c(), i.d(), i.e(), i.f(), (atw) null, i.j(), (ara) null, i.n() != null ? (View) c.a(i.n()) : null, i.o(), (String) null), bai.b.o, mwVar));
                    }
                    String str = bai.b.m;
                    String str2 = bai.b.n;
                    if (str2 != null) {
                        mwVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
                    } else {
                        mwVar.loadData(str, "text/html", "UTF-8");
                    }
                    z = true;
                }
            }
            if (!z) {
                countDownLatch.countDown();
            }
            return z;
        }
    }

    /* access modifiers changed from: private */
    public static avh b(Object obj) {
        if (obj instanceof IBinder) {
            return avi.a((IBinder) obj);
        }
        return null;
    }

    private static String b(avh avh) {
        try {
            a a = avh.a();
            if (a == null) {
                fn.e("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) c.a(a);
            if (drawable instanceof BitmapDrawable) {
                return a(((BitmapDrawable) drawable).getBitmap());
            }
            fn.e("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException e) {
            fn.e("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    /* access modifiers changed from: private */
    public static JSONObject b(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null || TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (bundle.containsKey(next)) {
                if ("image".equals(jSONObject2.getString(next))) {
                    Object obj = bundle.get(next);
                    if (obj instanceof Bitmap) {
                        jSONObject.put(next, a((Bitmap) obj));
                    } else {
                        fn.e("Invalid type. An image type extra should return a bitmap");
                    }
                } else if (bundle.get(next) instanceof Bitmap) {
                    fn.e("Invalid asset type. Bitmap should be returned only for image type");
                } else {
                    jSONObject.put(next, String.valueOf(bundle.get(next)));
                }
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public static void b(mw mwVar) {
        View.OnClickListener I = mwVar.I();
        if (I == null) {
            return;
        }
        if (mwVar == null) {
            throw null;
        }
        I.onClick((View) mwVar);
    }

    public static boolean b(ev evVar) {
        return (evVar == null || !evVar.m || evVar.n == null || evVar.n.m == null) ? false : true;
    }
}
