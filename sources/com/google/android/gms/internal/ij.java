package com.google.android.gms.internal;

final class ij implements bcm {
    private /* synthetic */ String a;
    private /* synthetic */ in b;

    ij(Cif ifVar, String str, in inVar) {
        this.a = str;
        this.b = inVar;
    }

    public final void a(ce ceVar) {
        String str = this.a;
        String ceVar2 = ceVar.toString();
        fn.e(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(ceVar2).length()).append("Failed to load URL: ").append(str).append("\n").append(ceVar2).toString());
        this.b.a(null);
    }
}
