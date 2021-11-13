package android.support.v4.app;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

public class a extends android.support.v4.a.a {
    private static b a;

    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    public interface C0000a {
        void a(int i, String[] strArr, int[] iArr);
    }

    public interface b {
        boolean a(Activity activity, String[] strArr, int i);
    }

    public interface c {
        void a(int i);
    }

    public static void a(final Activity activity, final String[] strArr, final int i) {
        if (a != null && a.a(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof c) {
                ((c) activity).a(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof C0000a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((C0000a) activity).a(i, strArr, iArr);
                }
            });
        }
    }
}
