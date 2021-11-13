package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.y;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class e implements ServiceConnection {
    private boolean a = false;
    private final BlockingQueue<IBinder> b = new LinkedBlockingQueue();

    public final IBinder a(long j, TimeUnit timeUnit) {
        y.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        IBinder poll = this.b.poll(10000, timeUnit);
        if (poll != null) {
            return poll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
