package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.DownloadManager;

@TargetApi(9)
public class he extends hc {
    public he() {
        super();
    }

    public final int a() {
        return 6;
    }

    public boolean a(DownloadManager.Request request) {
        request.setShowRunningNotification(true);
        return true;
    }

    public final int b() {
        return 7;
    }
}
