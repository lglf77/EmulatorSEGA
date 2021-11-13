package com.google.android.gms.internal;

import android.os.Bundle;

final class wh extends ro {
    private /* synthetic */ wg a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    wh(wg wgVar, tk tkVar) {
        super(tkVar);
        this.a = wgVar;
    }

    public final void a() {
        wg wgVar = this.a;
        wgVar.c();
        wgVar.t().E().a("Session started, time", Long.valueOf(wgVar.k().b()));
        wgVar.u().l.a(false);
        wgVar.f().a("auto", "_s", new Bundle());
        wgVar.u().m.a(wgVar.k().a());
    }
}
