package android.support.v4.d;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    static final j a;

    /* renamed from: android.support.v4.d.a$a  reason: collision with other inner class name */
    static class C0005a extends j {
        C0005a() {
        }
    }

    static class b extends C0005a {
        b() {
        }
    }

    static class c extends b {
        c() {
        }
    }

    static class d extends c {
        d() {
        }
    }

    static class e extends d {
        e() {
        }

        public boolean a(View view) {
            return view.isAttachedToWindow();
        }
    }

    static class f extends e {
        f() {
        }
    }

    static class g extends f {
        g() {
        }
    }

    static class h extends g {
        h() {
        }
    }

    static class i extends h {
        i() {
        }
    }

    static class j {
        static boolean b = false;
        private static final AtomicInteger c = new AtomicInteger(1);
        WeakHashMap<View, Object> a = null;

        j() {
        }

        public boolean a(View view) {
            return view.getWindowToken() != null;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            a = new i();
        } else if (Build.VERSION.SDK_INT >= 24) {
            a = new h();
        } else if (Build.VERSION.SDK_INT >= 23) {
            a = new g();
        } else if (Build.VERSION.SDK_INT >= 21) {
            a = new f();
        } else if (Build.VERSION.SDK_INT >= 19) {
            a = new e();
        } else if (Build.VERSION.SDK_INT >= 18) {
            a = new d();
        } else if (Build.VERSION.SDK_INT >= 17) {
            a = new c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            a = new b();
        } else if (Build.VERSION.SDK_INT >= 15) {
            a = new C0005a();
        } else {
            a = new j();
        }
    }

    public static boolean a(View view) {
        return a.a(view);
    }
}
