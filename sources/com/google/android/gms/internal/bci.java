package com.google.android.gms.internal;

import android.content.DialogInterface;

final class bci implements DialogInterface.OnClickListener {
    private /* synthetic */ bcg a;

    bci(bcg bcg) {
        this.a = bcg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a("User canceled the download.");
    }
}
