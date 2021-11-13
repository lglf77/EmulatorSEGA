package android.support.v4.a;

import android.content.Context;
import android.os.Build;
import android.os.Process;

public class a {
    private static final Object a = new Object();

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }
}
