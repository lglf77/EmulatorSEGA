package android.support.v4.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b {

    static class a {
        private static Method a;
        private static boolean b;

        public static IBinder a(Bundle bundle, String str) {
            if (!b) {
                try {
                    a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                b = true;
            }
            if (a != null) {
                try {
                    return (IBinder) a.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    a = null;
                }
            }
            return null;
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : a.a(bundle, str);
    }
}
