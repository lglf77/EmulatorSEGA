package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.internal.y;
import java.util.List;

@bfk
public final class atx extends RelativeLayout {
    private static final float[] a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable b;

    public atx(Context context, atw atw, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        y.a(atw);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(a, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(atw.d());
        setLayoutParams(layoutParams);
        au.g().a((View) this, (Drawable) shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(atw.a())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(atw.a());
            textView.setTextColor(atw.e());
            textView.setTextSize((float) atw.f());
            app.a();
            int a2 = jc.a(context, 4);
            app.a();
            textView.setPadding(a2, 0, jc.a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<aty> c = atw.c();
        if (c != null && c.size() > 1) {
            this.b = new AnimationDrawable();
            for (aty a3 : c) {
                try {
                    this.b.addFrame((Drawable) c.a(a3.a()), atw.g());
                } catch (Exception e) {
                    fn.b("Error while getting drawable.", e);
                }
            }
            au.g().a((View) imageView, (Drawable) this.b);
        } else if (c.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) c.a(c.get(0).a()));
            } catch (Exception e2) {
                fn.b("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        if (this.b != null) {
            this.b.start();
        }
        super.onAttachedToWindow();
    }
}
