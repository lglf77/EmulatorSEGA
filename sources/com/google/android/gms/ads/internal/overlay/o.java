package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.jc;

@bfk
public final class o extends FrameLayout implements View.OnClickListener {
    private final ImageButton a;
    private final t b;

    public o(Context context, p pVar, t tVar) {
        super(context);
        this.b = tVar;
        setOnClickListener(this);
        this.a = new ImageButton(context);
        this.a.setImageResource(17301527);
        this.a.setBackgroundColor(0);
        this.a.setOnClickListener(this);
        ImageButton imageButton = this.a;
        app.a();
        int a2 = jc.a(context, pVar.a);
        app.a();
        int a3 = jc.a(context, 0);
        app.a();
        int a4 = jc.a(context, pVar.b);
        app.a();
        imageButton.setPadding(a2, a3, a4, jc.a(context, pVar.d));
        this.a.setContentDescription("Interstitial close button");
        app.a();
        jc.a(context, pVar.e);
        ImageButton imageButton2 = this.a;
        app.a();
        int a5 = jc.a(context, pVar.e + pVar.a + pVar.b);
        app.a();
        addView(imageButton2, new FrameLayout.LayoutParams(a5, jc.a(context, pVar.e + pVar.d), 17));
    }

    public final void a(boolean z, boolean z2) {
        if (!z2) {
            this.a.setVisibility(0);
        } else if (z) {
            this.a.setVisibility(4);
        } else {
            this.a.setVisibility(8);
        }
    }

    public final void onClick(View view) {
        if (this.b != null) {
            this.b.c();
        }
    }
}
