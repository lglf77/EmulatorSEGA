package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class ann implements beo {
    private final Executor a;

    public ann(Handler handler) {
        this.a = new aoo(this, handler);
    }

    public final void a(aws<?> aws, bbt<?> bbt) {
        a(aws, bbt, (Runnable) null);
    }

    public final void a(aws<?> aws, bbt<?> bbt, Runnable runnable) {
        aws.j();
        aws.b("post-response");
        this.a.execute(new apn(this, aws, bbt, runnable));
    }

    public final void a(aws<?> aws, ce ceVar) {
        aws.b("post-error");
        this.a.execute(new apn(this, aws, bbt.a(ceVar), (Runnable) null));
    }
}
