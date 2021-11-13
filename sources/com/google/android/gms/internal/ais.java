package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class ais extends air<FieldDescriptorType, Object> {
    ais(int i) {
        super(i, (ais) null);
    }

    public final void a() {
        if (!b()) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= c()) {
                    break;
                }
                Map.Entry b = b(i2);
                if (((aha) b.getKey()).d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
                i = i2 + 1;
            }
            for (Map.Entry entry : d()) {
                if (((aha) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
