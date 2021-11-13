package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class pq {
    public static int a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new pr(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = dataPosition + a;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new pr(new StringBuilder(54).append("Size read is invalid start=").append(dataPosition).append(" end=").append(i).toString(), parcel);
    }

    public static int a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return t;
    }

    private static void a(Parcel parcel, int i, int i2) {
        int a = a(parcel, i);
        if (a != i2) {
            String hexString = Integer.toHexString(a);
            throw new pr(new StringBuilder(String.valueOf(hexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(a).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }

    private static void a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            throw new pr(new StringBuilder(String.valueOf(hexString).length() + 46).append("Expected size ").append(i3).append(" got ").append(i2).append(" (0x").append(hexString).append(")").toString(), parcel);
        }
    }

    public static void b(Parcel parcel, int i) {
        parcel.setDataPosition(a(parcel, i) + parcel.dataPosition());
    }

    public static <T> T[] b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static boolean c(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int d(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readInt();
    }

    public static long e(Parcel parcel, int i) {
        a(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long f(Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        a(parcel, i, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static float g(Parcel parcel, int i) {
        a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float h(Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        a(parcel, i, a, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static Double i(Parcel parcel, int i) {
        int a = a(parcel, i);
        if (a == 0) {
            return null;
        }
        a(parcel, i, a, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static String j(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder k(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Bundle l(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] m(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    public static String[] n(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    public static ArrayList<Integer> o(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + a);
        return arrayList;
    }

    public static ArrayList<String> p(Parcel parcel, int i) {
        int a = a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static void q(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new pr(new StringBuilder(37).append("Overread allowed size end=").append(i).toString(), parcel);
        }
    }
}
