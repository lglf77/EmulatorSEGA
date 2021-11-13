package com.google.android.gms.a;

import android.os.IBinder;
import com.google.android.gms.a.a;
import java.lang.reflect.Field;

public final class c<T> extends a.C0014a {
    private final T a;

    private c(T t) {
        this.a = t;
    }

    public static <T> a a(T t) {
        return new c(t);
    }

    public static <T> T a(a aVar) {
        int i = 0;
        if (aVar instanceof c) {
            return ((c) aVar).a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field2 = declaredFields[i2];
            if (!field2.isSynthetic()) {
                i++;
            } else {
                field2 = field;
            }
            i2++;
            field = field2;
        }
        if (i != 1) {
            throw new IllegalArgumentException(new StringBuilder(64).append("Unexpected number of IObjectWrapper declared fields: ").append(declaredFields.length).toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
