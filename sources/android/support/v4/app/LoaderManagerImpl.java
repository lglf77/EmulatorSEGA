package android.support.v4.app;

import android.arch.lifecycle.e;
import android.arch.lifecycle.i;
import android.arch.lifecycle.j;
import android.support.v4.c.d;
import android.support.v4.c.g;

class LoaderManagerImpl extends c {
    static boolean a = false;
    private final e b;

    static class LoaderViewModel extends i {
        private static final j.a a = new j.a() {
        };
        private g<Object> b = new g<>();

        LoaderViewModel() {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        d.a(this.b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
