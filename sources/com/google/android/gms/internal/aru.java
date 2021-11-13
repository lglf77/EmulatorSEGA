package com.google.android.gms.internal;

final class aru extends apz {
    final /* synthetic */ ars a;

    private aru(ars ars) {
        this.a = ars;
    }

    public final String a() {
        return null;
    }

    public final void a(aoy aoy) {
        a(aoy, 1);
    }

    public final void a(aoy aoy, int i) {
        jn.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        jc.a.post(new arv(this));
    }

    public final String b() {
        return null;
    }

    public final boolean c() {
        return false;
    }
}
