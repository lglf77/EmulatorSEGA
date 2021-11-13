package com.google.android.gms.internal;

import com.google.android.gms.internal.afz;
import com.google.android.gms.internal.aga;
import java.io.IOException;

public abstract class afz<MessageType extends afz<MessageType, BuilderType>, BuilderType extends aga<MessageType, BuilderType>> implements aid {
    private static boolean b = false;
    protected int a = 0;

    public final age j() {
        try {
            agj b2 = age.b(d());
            a(b2.b());
            return b2.a();
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("ByteString").length()).append("Serializing ").append(name).append(" to a ").append("ByteString").append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    public final byte[] k() {
        try {
            byte[] bArr = new byte[d()];
            agq a2 = agq.a(bArr);
            a(a2);
            a2.b();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf("byte array").length()).append("Serializing ").append(name).append(" to a ").append("byte array").append(" threw an IOException (should never happen).").toString(), e);
        }
    }
}
