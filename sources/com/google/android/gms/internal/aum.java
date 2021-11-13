package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.a;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.bq;
import com.google.android.gms.common.internal.y;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public class aum implements aui {
    boolean a;
    private final Object b = new Object();
    private final auj c;
    private final Context d;
    private final JSONObject e;
    private final beq f;
    private final auk g;
    private final xr h;
    private final jp i;
    private String j;
    private el k;
    private WeakReference<View> l = null;

    public aum(Context context, auj auj, beq beq, xr xrVar, JSONObject jSONObject, auk auk, jp jpVar, String str) {
        this.d = context;
        this.c = auj;
        this.f = beq;
        this.h = xrVar;
        this.e = jSONObject;
        this.g = auk;
        this.i = jpVar;
        this.j = str;
    }

    private final int a(int i2) {
        app.a();
        return jc.b(this.d, i2);
    }

    private final JSONObject a(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", a(rect.right - rect.left));
        jSONObject.put("height", a(rect.bottom - rect.top));
        jSONObject.put("x", a(rect.left));
        jSONObject.put("y", a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private final JSONObject a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] d2 = d(view);
        synchronized (map) {
            for (Map.Entry next : map.entrySet()) {
                View view2 = (View) ((WeakReference) next.getValue()).get();
                if (view2 != null) {
                    int[] d3 = d(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", a(d3[0] - d2[0]));
                        jSONObject4.put("y", a(d3[1] - d2[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = a(rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", a(d3[0] - d2[0]));
                            jSONObject.put("y", a(d3[1] - d2[1]));
                            jSONObject.put("relative_to", "ad_view");
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", (double) textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject2.put((String) next.getKey(), jSONObject3);
                    } catch (JSONException e2) {
                        fn.e("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject2;
    }

    private final void a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        boolean z = true;
        y.b("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.e);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.g.k());
            au.g();
            jSONObject8.put("is_privileged_process", hc.e());
            jSONObject8.put("has_custom_click_handler", this.c.b(this.g.l()) != null);
            if (this.c.b(this.g.l()) == null) {
                z = false;
            }
            jSONObject7.put("has_custom_click_handler", z);
            try {
                JSONObject optJSONObject = this.e.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject8.put("click_signals", this.h.a().a(this.d, optJSONObject.optString("click_string"), view));
            } catch (Exception e2) {
                fn.b("Exception obtaining click signals", e2);
            }
            jSONObject7.put("click", jSONObject8);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.j);
            jv.a(this.f.b(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e3) {
            fn.b("Unable to create click JSON.", e3);
        }
    }

    private final boolean a(String str) {
        JSONObject optJSONObject = this.e == null ? null : this.e.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    private final boolean a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        y.b("recordImpression must be called on the main UI thread.");
        if (this.a) {
            return true;
        }
        this.a = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.e);
            jSONObject6.put("ads_id", this.j);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            jv.a(this.f.c(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.c.a((aui) this);
            this.c.z();
            return true;
        } catch (JSONException e2) {
            fn.b("Unable to create impression JSON.", e2);
            return false;
        }
    }

    private static boolean c(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
    }

    private static int[] d(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    private final JSONObject e(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            try {
                int[] d2 = d(view);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", a(view.getMeasuredWidth()));
                jSONObject3.put("height", a(view.getMeasuredHeight()));
                jSONObject3.put("x", a(d2[0]));
                jSONObject3.put("y", a(d2[1]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put("frame", jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = a(rect);
                } else {
                    jSONObject = new JSONObject();
                    jSONObject.put("width", 0);
                    jSONObject.put("height", 0);
                    jSONObject.put("x", a(d2[0]));
                    jSONObject.put("y", a(d2[1]));
                    jSONObject.put("relative_to", "window");
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (Exception e2) {
                fn.e("Unable to get native ad view bounding box");
            }
        }
        return jSONObject2;
    }

    private static JSONObject f(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                au.e();
                jSONObject.put("contained_in_scroll_view", gw.d(view) != -1);
            } catch (Exception e2) {
            }
        }
        return jSONObject;
    }

    private final JSONObject g(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                au.e();
                jSONObject.put("can_show_on_lock_screen", gw.c(view));
                au.e();
                jSONObject.put("is_keyguard_locked", gw.l(this.d));
            } catch (JSONException e2) {
                fn.e("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public View a(View.OnClickListener onClickListener, boolean z) {
        atw m = this.g.m();
        if (m == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (!z) {
            switch (m.h()) {
                case a.b.AdsAttrs_adSize:
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                    break;
                case 2:
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                    break;
                case 3:
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                    break;
                default:
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    break;
            }
        }
        atx atx = new atx(this.d, m, layoutParams);
        atx.setOnClickListener(onClickListener);
        atx.setContentDescription((CharSequence) app.f().a(asw.bQ));
        return atx;
    }

    public final void a(MotionEvent motionEvent) {
        this.h.a(motionEvent);
    }

    public final void a(View view) {
        xn a2;
        if (((Boolean) app.f().a(asw.bt)).booleanValue() && this.h != null && (a2 = this.h.a()) != null) {
            a2.a(view);
        }
    }

    public final void a(View view, aug aug) {
        if (!b(view, aug)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            if (this.g instanceof aul) {
                aul aul = (aul) this.g;
                if (aul.b() != null && aul.b().size() > 0) {
                    Object obj = aul.b().get(0);
                    avh a2 = obj instanceof IBinder ? avi.a((IBinder) obj) : null;
                    if (a2 != null) {
                        try {
                            com.google.android.gms.a.a a3 = a2.a();
                            if (a3 != null) {
                                ImageView imageView = new ImageView(this.d);
                                imageView.setImageDrawable((Drawable) c.a(a3));
                                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException e2) {
                            fn.e("Could not get drawable from image");
                        }
                    }
                }
            }
        }
    }

    public final void a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        JSONObject a2 = a(map, view2);
        JSONObject e2 = e(view2);
        JSONObject f2 = f(view2);
        JSONObject g2 = g(view2);
        try {
            JSONObject a3 = au.e().a(bundle, (JSONObject) null);
            jSONObject = new JSONObject();
            try {
                jSONObject.put("click_point", a3);
                jSONObject.put("asset_id", str);
            } catch (Exception e3) {
                e = e3;
                fn.b("Error occurred while grabbing click signals.", e);
                a(view, e2, a2, f2, g2, str, jSONObject, (JSONObject) null);
            }
        } catch (Exception e4) {
            e = e4;
            jSONObject = null;
            fn.b("Error occurred while grabbing click signals.", e);
            a(view, e2, a2, f2, g2, str, jSONObject, (JSONObject) null);
        }
        a(view, e2, a2, f2, g2, str, jSONObject, (JSONObject) null);
    }

    public void a(View view, Map<String, WeakReference<View>> map) {
        a(e(view), a(map, view), f(view), g(view), (JSONObject) null);
    }

    public void a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        y.b("performClick must be called on the main UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Map.Entry next : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                        a(view, (String) next.getKey(), bundle, map, view2);
                        return;
                    }
                }
            }
        }
        if ("2".equals(this.g.k())) {
            a(view, "2099", bundle, map, view2);
        } else if ("1".equals(this.g.k())) {
            a(view, "1099", bundle, map, view2);
        }
    }

    public void a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        if (((Boolean) app.f().a(asw.bO)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                synchronized (map) {
                    for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(onTouchListener);
                            view2.setClickable(true);
                            view2.setOnClickListener(onClickListener);
                        }
                    }
                }
            }
            if (map2 != null) {
                synchronized (map2) {
                    for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                        View view3 = (View) ((WeakReference) value2.getValue()).get();
                        if (view3 != null) {
                            view3.setOnTouchListener(onTouchListener);
                        }
                    }
                }
            }
        }
    }

    public final void a(Map<String, WeakReference<View>> map) {
        if (this.g.o() == null) {
            return;
        }
        if ("2".equals(this.g.k())) {
            au.i().a(this.d, this.c.A(), this.g.k(), map.containsKey("2011"));
        } else if ("1".equals(this.g.k())) {
            au.i().a(this.d, this.c.A(), this.g.k(), map.containsKey("1009"));
        }
    }

    public boolean a() {
        atw m = this.g.m();
        return m != null && m.i();
    }

    public final boolean a(Bundle bundle) {
        if (!a("impression_reporting")) {
            fn.c("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, au.e().a(bundle, (JSONObject) null));
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            fn.b("Click data is null. No click is reported.");
        } else if (!a("click_reporting")) {
            fn.c("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            a((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle.getBundle("click_signal").getString("asset_id"), (JSONObject) null, au.e().a(bundle, (JSONObject) null));
        }
    }

    public final void b(View view) {
        this.l = new WeakReference<>(view);
    }

    public void b(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) app.f().a(asw.bN)).booleanValue()) {
            view.setOnTouchListener((View.OnTouchListener) null);
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            if (map != null) {
                synchronized (map) {
                    for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener((View.OnTouchListener) null);
                            view2.setClickable(false);
                            view2.setOnClickListener((View.OnClickListener) null);
                        }
                    }
                }
            }
        }
    }

    public boolean b() {
        return this.e != null && this.e.optBoolean("allow_pub_owned_ad_view", false);
    }

    public final boolean b(View view, aug aug) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        View o = this.g.o();
        if (o == null) {
            return false;
        }
        ViewParent parent = o.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(o);
        }
        ((FrameLayout) view).removeAllViews();
        ((FrameLayout) view).addView(o, layoutParams);
        this.c.a(aug);
        return true;
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            fn.b("Touch event data is null. No touch event is reported.");
        } else if (!a("touch_reporting")) {
            fn.c("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i2 = bundle.getInt("duration_ms");
            this.h.a().a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i2);
        }
    }

    public final void c(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.b) {
            if (!this.a) {
                if (c(view)) {
                    a(view, map);
                    return;
                }
                if (((Boolean) app.f().a(asw.bV)).booleanValue() && map != null) {
                    synchronized (map) {
                        for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                            View view2 = (View) ((WeakReference) value.getValue()).get();
                            if (view2 != null && c(view2)) {
                                a(view, map);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public mw e() {
        if (this.e == null || this.e.optJSONObject("overlay") == null) {
            return null;
        }
        ng f2 = au.f();
        Context context = this.d;
        apc a2 = apc.a(this.d);
        mw a3 = f2.a(context, or.a(a2), a2.a, false, false, this.h, this.i, (atj) null, (an) null, (bq) null, aog.a());
        if (a3 == null) {
            return a3;
        }
        if (a3 == null) {
            throw null;
        }
        ((View) a3).setVisibility(8);
        new auo(a3).a(this.f);
        return a3;
    }

    public void f() {
        this.f.a();
    }

    public void g() {
        this.c.K();
    }

    public final View h() {
        if (this.l != null) {
            return (View) this.l.get();
        }
        return null;
    }

    public final Context i() {
        return this.d;
    }

    public final el j() {
        if (!au.z().c(this.d)) {
            return null;
        }
        if (this.k == null) {
            this.k = new el(this.d, this.c.A());
        }
        return this.k;
    }
}
