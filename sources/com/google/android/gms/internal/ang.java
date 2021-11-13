package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class ang {
    private ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
    private Base64OutputStream b = new Base64OutputStream(this.a, 10);

    public final void a(byte[] bArr) {
        this.b.write(bArr);
    }

    public final String toString() {
        String str;
        try {
            this.b.close();
        } catch (IOException e) {
            fn.b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.a.close();
            str = this.a.toString();
        } catch (IOException e2) {
            fn.b("HashManager: Unable to convert to Base64.", e2);
            str = "";
        } finally {
            this.a = null;
            this.b = null;
        }
        return str;
    }
}
