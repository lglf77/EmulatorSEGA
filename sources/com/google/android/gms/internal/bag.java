package com.google.android.gms.internal;

final class bag implements Runnable {
    private /* synthetic */ bae a;
    private /* synthetic */ baf b;

    bag(baf baf, bae bae) {
        this.b = baf;
        this.a = bae;
    }

    public final void run() {
        synchronized (this.b.i) {
            if (this.b.s == -2) {
                bav unused = this.b.r = this.b.d();
                if (this.b.r == null) {
                    this.b.a(4);
                } else if (!this.b.e() || this.b.b(1)) {
                    this.a.a((baj) this.b);
                    this.b.a(this.a);
                } else {
                    String f = this.b.a;
                    fn.e(new StringBuilder(String.valueOf(f).length() + 56).append("Ignoring adapter ").append(f).append(" as delayed impression is not supported").toString());
                    this.b.a(2);
                }
            }
        }
    }
}
