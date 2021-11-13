package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.j;
import java.io.InputStream;

final class bee implements im<aty> {
    private /* synthetic */ boolean a;
    private /* synthetic */ double b;
    private /* synthetic */ boolean c;
    private /* synthetic */ String d;
    private /* synthetic */ bea e;

    bee(bea bea, boolean z, double d2, boolean z2, String str) {
        this.e = bea;
        this.a = z;
        this.b = d2;
        this.c = z2;
        this.d = str;
    }

    /* access modifiers changed from: private */
    @TargetApi(19)
    /* renamed from: b */
    public final aty a(InputStream inputStream) {
        Bitmap bitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (160.0d * this.b);
        if (!this.c) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            bitmap = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        } catch (Exception e2) {
            fn.b("Error grabbing image.", e2);
            bitmap = null;
        }
        if (bitmap == null) {
            this.e.a(2, this.a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (j.e() && fn.a()) {
            int width = bitmap.getWidth();
            fn.a(new StringBuilder(108).append("Decoded image w: ").append(width).append(" h:").append(bitmap.getHeight()).append(" bytes: ").append(bitmap.getAllocationByteCount()).append(" time: ").append(uptimeMillis2 - uptimeMillis).append(" on ui thread: ").append(Looper.getMainLooper().getThread() == Thread.currentThread()).toString());
        }
        return new aty(new BitmapDrawable(Resources.getSystem(), bitmap), Uri.parse(this.d), this.b);
    }

    public final /* synthetic */ Object a() {
        this.e.a(2, this.a);
        return null;
    }
}
