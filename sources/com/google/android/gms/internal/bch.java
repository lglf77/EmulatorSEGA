package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.au;

final class bch implements DialogInterface.OnClickListener {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ bcg c;

    bch(bcg bcg, String str, String str2) {
        this.c = bcg;
        this.a = str;
        this.b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.c.b.getSystemService("download");
        try {
            String str = this.a;
            String str2 = this.b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            au.g().a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException e) {
            this.c.a("Could not store picture.");
        }
    }
}
