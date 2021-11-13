package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.a.a;

public interface qg extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z, int i);

    int getIntFlagValue(String str, int i, int i2);

    long getLongFlagValue(String str, long j, int i);

    String getStringFlagValue(String str, String str2, int i);

    void init(a aVar);
}
