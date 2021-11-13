package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.internal.au;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@bfk
@TargetApi(14)
public final class le extends lp implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> c = new HashMap();
    private final me d;
    private final boolean e;
    private int f = 0;
    private int g = 0;
    private MediaPlayer h;
    private Uri i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private mb o;
    private boolean p;
    private int q;
    /* access modifiers changed from: private */
    public lo r;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            c.put(-1004, "MEDIA_ERROR_IO");
            c.put(-1007, "MEDIA_ERROR_MALFORMED");
            c.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            c.put(-110, "MEDIA_ERROR_TIMED_OUT");
            c.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        c.put(100, "MEDIA_ERROR_SERVER_DIED");
        c.put(1, "MEDIA_ERROR_UNKNOWN");
        c.put(1, "MEDIA_INFO_UNKNOWN");
        c.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        c.put(701, "MEDIA_INFO_BUFFERING_START");
        c.put(702, "MEDIA_INFO_BUFFERING_END");
        c.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        c.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        c.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            c.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            c.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public le(Context context, boolean z, boolean z2, mc mcVar, me meVar) {
        super(context);
        setSurfaceTextureListener(this);
        this.d = meVar;
        this.p = z;
        this.e = z2;
        this.d.a(this);
    }

    private final void a(float f2) {
        if (this.h != null) {
            try {
                this.h.setVolume(f2, f2);
            } catch (IllegalStateException e2) {
            }
        } else {
            fn.e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void a(boolean z) {
        fn.a("AdMediaPlayerView release");
        if (this.o != null) {
            this.o.b();
            this.o = null;
        }
        if (this.h != null) {
            this.h.reset();
            this.h.release();
            this.h = null;
            b(0);
            if (z) {
                this.g = 0;
                this.g = 0;
            }
        }
    }

    private final void b(int i2) {
        if (i2 == 3) {
            this.d.c();
            this.b.b();
        } else if (this.f == 3) {
            this.d.d();
            this.b.c();
        }
        this.f = i2;
    }

    private final void f() {
        SurfaceTexture surfaceTexture;
        fn.a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.i != null && surfaceTexture2 != null) {
            a(false);
            try {
                au.t();
                this.h = new MediaPlayer();
                this.h.setOnBufferingUpdateListener(this);
                this.h.setOnCompletionListener(this);
                this.h.setOnErrorListener(this);
                this.h.setOnInfoListener(this);
                this.h.setOnPreparedListener(this);
                this.h.setOnVideoSizeChangedListener(this);
                this.l = 0;
                if (this.p) {
                    this.o = new mb(getContext());
                    this.o.a(surfaceTexture2, getWidth(), getHeight());
                    this.o.start();
                    surfaceTexture = this.o.c();
                    if (surfaceTexture == null) {
                        this.o.b();
                        this.o = null;
                    }
                    this.h.setDataSource(getContext(), this.i);
                    au.u();
                    this.h.setSurface(new Surface(surfaceTexture));
                    this.h.setAudioStreamType(3);
                    this.h.setScreenOnWhilePlaying(true);
                    this.h.prepareAsync();
                    b(1);
                }
                surfaceTexture = surfaceTexture2;
                this.h.setDataSource(getContext(), this.i);
                au.u();
                this.h.setSurface(new Surface(surfaceTexture));
                this.h.setAudioStreamType(3);
                this.h.setScreenOnWhilePlaying(true);
                this.h.prepareAsync();
                b(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
                String valueOf = String.valueOf(this.i);
                fn.c(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed to initialize MediaPlayer at ").append(valueOf).toString(), e2);
                onError(this.h, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034 A[LOOP:0: B:9:0x0034->B:14:0x004f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g() {
        /*
            r8 = this;
            boolean r0 = r8.e
            if (r0 != 0) goto L_0x0005
        L_0x0004:
            return
        L_0x0005:
            boolean r0 = r8.h()
            if (r0 == 0) goto L_0x0004
            android.media.MediaPlayer r0 = r8.h
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0004
            int r0 = r8.g
            r1 = 3
            if (r0 == r1) goto L_0x0004
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.internal.fn.a(r0)
            r0 = 0
            r8.a((float) r0)
            android.media.MediaPlayer r0 = r8.h
            r0.start()
            android.media.MediaPlayer r0 = r8.h
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.d r1 = com.google.android.gms.ads.internal.au.k()
            long r2 = r1.a()
        L_0x0034:
            boolean r1 = r8.h()
            if (r1 == 0) goto L_0x0051
            android.media.MediaPlayer r1 = r8.h
            int r1 = r1.getCurrentPosition()
            if (r1 != r0) goto L_0x0051
            com.google.android.gms.common.util.d r1 = com.google.android.gms.ads.internal.au.k()
            long r4 = r1.a()
            long r4 = r4 - r2
            r6 = 250(0xfa, double:1.235E-321)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.h
            r0.pause()
            r8.e()
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.le.g():void");
    }

    private final boolean h() {
        return (this.h == null || this.f == -1 || this.f == 0 || this.f == 1) ? false : true;
    }

    public final String a() {
        String valueOf = String.valueOf(this.p ? " spherical" : "");
        return valueOf.length() != 0 ? "MediaPlayer".concat(valueOf) : new String("MediaPlayer");
    }

    public final void a(float f2, float f3) {
        if (this.o != null) {
            this.o.a(f2, f3);
        }
    }

    public final void a(int i2) {
        fn.a(new StringBuilder(34).append("AdMediaPlayerView seek ").append(i2).toString());
        if (h()) {
            this.h.seekTo(i2);
            this.q = 0;
            return;
        }
        this.q = i2;
    }

    public final void a(lo loVar) {
        this.r = loVar;
    }

    public final void b() {
        fn.a("AdMediaPlayerView stop");
        if (this.h != null) {
            this.h.stop();
            this.h.release();
            this.h = null;
            b(0);
            this.g = 0;
        }
        this.d.b();
    }

    public final void c() {
        fn.a("AdMediaPlayerView play");
        if (h()) {
            this.h.start();
            b(3);
            this.a.a();
            gw.a.post(new ll(this));
        }
        this.g = 3;
    }

    public final void d() {
        fn.a("AdMediaPlayerView pause");
        if (h() && this.h.isPlaying()) {
            this.h.pause();
            b(4);
            gw.a.post(new lm(this));
        }
        this.g = 4;
    }

    public final void e() {
        a(this.b.a());
    }

    public final int getCurrentPosition() {
        if (h()) {
            return this.h.getCurrentPosition();
        }
        return 0;
    }

    public final int getDuration() {
        if (h()) {
            return this.h.getDuration();
        }
        return -1;
    }

    public final int getVideoHeight() {
        if (this.h != null) {
            return this.h.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoWidth() {
        if (this.h != null) {
            return this.h.getVideoWidth();
        }
        return 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.l = i2;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        fn.a("AdMediaPlayerView completion");
        b(5);
        this.g = 5;
        gw.a.post(new lg(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = c.get(Integer.valueOf(i2));
        String str2 = c.get(Integer.valueOf(i3));
        fn.e(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer error: ").append(str).append(":").append(str2).toString());
        b(-1);
        this.g = -1;
        gw.a.post(new lh(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = c.get(Integer.valueOf(i2));
        String str2 = c.get(Integer.valueOf(i3));
        fn.a(new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length()).append("AdMediaPlayerView MediaPlayer info: ").append(str).append(":").append(str2).toString());
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int defaultSize = getDefaultSize(this.j, i2);
        int defaultSize2 = getDefaultSize(this.k, i3);
        if (this.j > 0 && this.k > 0 && this.o == null) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            defaultSize2 = View.MeasureSpec.getSize(i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                if (this.j * defaultSize2 < this.k * size) {
                    defaultSize = (this.j * defaultSize2) / this.k;
                } else if (this.j * defaultSize2 > this.k * size) {
                    defaultSize2 = (this.k * size) / this.j;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode == 1073741824) {
                int i4 = (this.k * size) / this.j;
                if (mode2 != Integer.MIN_VALUE || i4 <= defaultSize2) {
                    defaultSize2 = i4;
                    defaultSize = size;
                } else {
                    defaultSize = size;
                }
            } else if (mode2 == 1073741824) {
                defaultSize = (this.j * defaultSize2) / this.k;
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize = size;
                }
            } else {
                int i5 = this.j;
                int i6 = this.k;
                if (mode2 != Integer.MIN_VALUE || i6 <= defaultSize2) {
                    defaultSize2 = i6;
                    defaultSize = i5;
                } else {
                    defaultSize = (this.j * defaultSize2) / this.k;
                }
                if (mode == Integer.MIN_VALUE && defaultSize > size) {
                    defaultSize2 = (this.k * size) / this.j;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        if (this.o != null) {
            this.o.a(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            if ((this.m > 0 && this.m != defaultSize) || (this.n > 0 && this.n != defaultSize2)) {
                g();
            }
            this.m = defaultSize;
            this.n = defaultSize2;
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        fn.a("AdMediaPlayerView prepared");
        b(2);
        this.d.a();
        gw.a.post(new lf(this));
        this.j = mediaPlayer.getVideoWidth();
        this.k = mediaPlayer.getVideoHeight();
        if (this.q != 0) {
            a(this.q);
        }
        g();
        int i2 = this.j;
        fn.d(new StringBuilder(62).append("AdMediaPlayerView stream dimensions: ").append(i2).append(" x ").append(this.k).toString());
        if (this.g == 3) {
            c();
        }
        e();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        fn.a("AdMediaPlayerView surface created");
        f();
        gw.a.post(new li(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        fn.a("AdMediaPlayerView surface destroyed");
        if (this.h != null && this.q == 0) {
            this.q = this.h.getCurrentPosition();
        }
        if (this.o != null) {
            this.o.b();
        }
        gw.a.post(new lk(this));
        a(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        boolean z = true;
        fn.a("AdMediaPlayerView surface changed");
        boolean z2 = this.g == 3;
        if (!(this.j == i2 && this.k == i3)) {
            z = false;
        }
        if (this.h != null && z2 && z) {
            if (this.q != 0) {
                a(this.q);
            }
            c();
        }
        if (this.o != null) {
            this.o.a(i2, i3);
        }
        gw.a.post(new lj(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.d.b(this);
        this.a.a(surfaceTexture, this.r);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        fn.a(new StringBuilder(57).append("AdMediaPlayerView size changed: ").append(i2).append(" x ").append(i3).toString());
        this.j = mediaPlayer.getVideoWidth();
        this.k = mediaPlayer.getVideoHeight();
        if (this.j != 0 && this.k != 0) {
            requestLayout();
        }
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        anz a = anz.a(parse);
        if (a != null) {
            parse = Uri.parse(a.a);
        }
        this.i = parse;
        this.q = 0;
        f();
        requestLayout();
        invalidate();
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        return new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length()).append(name).append("@").append(hexString).toString();
    }
}
