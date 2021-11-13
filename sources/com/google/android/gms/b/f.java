package com.google.android.gms.b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class f {
    public static final Executor a = new a();
    static final Executor b = new n();

    static final class a implements Executor {
        private final Handler a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }
}
