package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a  reason: collision with other inner class name */
    public static abstract class C0008a extends Binder implements a {

        /* renamed from: android.support.v4.media.session.a$a$a  reason: collision with other inner class name */
        private static class C0009a implements a {
            private IBinder a;

            C0009a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.a.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(CharSequence charSequence) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(List<MediaSessionCompat.QueueItem> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    this.a.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.a.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void b() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.a.transact(13, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void b(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.a.transact(12, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void b(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.a.transact(11, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0008a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0009a(iBinder) : (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: android.support.v4.media.session.ParcelableVolumeInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: android.support.v4.media.MediaMetadataCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r0v42 */
        /* JADX WARNING: type inference failed for: r0v43 */
        /* JADX WARNING: type inference failed for: r0v44 */
        /* JADX WARNING: type inference failed for: r0v45 */
        /* JADX WARNING: type inference failed for: r0v46 */
        /* JADX WARNING: type inference failed for: r0v47 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r2 = 0
                r0 = 0
                r1 = 1
                switch(r5) {
                    case 1: goto L_0x0011;
                    case 2: goto L_0x002c;
                    case 3: goto L_0x0035;
                    case 4: goto L_0x004c;
                    case 5: goto L_0x0063;
                    case 6: goto L_0x0072;
                    case 7: goto L_0x0089;
                    case 8: goto L_0x00a1;
                    case 9: goto L_0x00b9;
                    case 10: goto L_0x00c7;
                    case 11: goto L_0x00da;
                    case 12: goto L_0x00eb;
                    case 13: goto L_0x00f9;
                    case 1598968902: goto L_0x000b;
                    default: goto L_0x0006;
                }
            L_0x0006:
                boolean r1 = super.onTransact(r5, r6, r7, r8)
            L_0x000a:
                return r1
            L_0x000b:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r7.writeString(r0)
                goto L_0x000a
            L_0x0011:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                java.lang.String r2 = r6.readString()
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x0028
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0028:
                r4.a(r2, r0)
                goto L_0x000a
            L_0x002c:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                r4.a()
                goto L_0x000a
            L_0x0035:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0048
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r0 = android.support.v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.support.v4.media.session.PlaybackStateCompat r0 = (android.support.v4.media.session.PlaybackStateCompat) r0
            L_0x0048:
                r4.a((android.support.v4.media.session.PlaybackStateCompat) r0)
                goto L_0x000a
            L_0x004c:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x005f
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r0 = android.support.v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.support.v4.media.MediaMetadataCompat r0 = (android.support.v4.media.MediaMetadataCompat) r0
            L_0x005f:
                r4.a((android.support.v4.media.MediaMetadataCompat) r0)
                goto L_0x000a
            L_0x0063:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r0 = android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r0 = r6.createTypedArrayList(r0)
                r4.a((java.util.List<android.support.v4.media.session.MediaSessionCompat.QueueItem>) r0)
                goto L_0x000a
            L_0x0072:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0085
                android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            L_0x0085:
                r4.a((java.lang.CharSequence) r0)
                goto L_0x000a
            L_0x0089:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x009c
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x009c:
                r4.a((android.os.Bundle) r0)
                goto L_0x000a
            L_0x00a1:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00b4
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r0 = android.support.v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.support.v4.media.session.ParcelableVolumeInfo r0 = (android.support.v4.media.session.ParcelableVolumeInfo) r0
            L_0x00b4:
                r4.a((android.support.v4.media.session.ParcelableVolumeInfo) r0)
                goto L_0x000a
            L_0x00b9:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.a((int) r0)
                goto L_0x000a
            L_0x00c7:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x00d8
                r0 = r1
            L_0x00d3:
                r4.a((boolean) r0)
                goto L_0x000a
            L_0x00d8:
                r0 = r2
                goto L_0x00d3
            L_0x00da:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x00e6
                r2 = r1
            L_0x00e6:
                r4.b((boolean) r2)
                goto L_0x000a
            L_0x00eb:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.b((int) r0)
                goto L_0x000a
            L_0x00f9:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                r4.b()
                goto L_0x000a
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.C0008a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void a();

    void a(int i);

    void a(Bundle bundle);

    void a(MediaMetadataCompat mediaMetadataCompat);

    void a(ParcelableVolumeInfo parcelableVolumeInfo);

    void a(PlaybackStateCompat playbackStateCompat);

    void a(CharSequence charSequence);

    void a(String str, Bundle bundle);

    void a(List<MediaSessionCompat.QueueItem> list);

    void a(boolean z);

    void b();

    void b(int i);

    void b(boolean z);
}
