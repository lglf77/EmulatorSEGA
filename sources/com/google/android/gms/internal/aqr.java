package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.a;

public final class aqr extends afu implements aqp {
    aqr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final aqb createAdLoaderBuilder(a aVar, String str, bar bar, int i) {
        aqb aqd;
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeString(str);
        afw.a(i_, (IInterface) bar);
        i_.writeInt(i);
        Parcel a = a(3, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aqd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            aqd = queryLocalInterface instanceof aqb ? (aqb) queryLocalInterface : new aqd(readStrongBinder);
        }
        a.recycle();
        return aqd;
    }

    public final bcr createAdOverlay(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        Parcel a = a(8, i_);
        bcr a2 = bcs.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final aqg createBannerAdManager(a aVar, apc apc, String str, bar bar, int i) {
        aqg aqi;
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) apc);
        i_.writeString(str);
        afw.a(i_, (IInterface) bar);
        i_.writeInt(i);
        Parcel a = a(1, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aqi = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            aqi = queryLocalInterface instanceof aqg ? (aqg) queryLocalInterface : new aqi(readStrongBinder);
        }
        a.recycle();
        return aqi;
    }

    public final bdb createInAppPurchaseManager(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        Parcel a = a(7, i_);
        bdb a2 = bdc.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final aqg createInterstitialAdManager(a aVar, apc apc, String str, bar bar, int i) {
        aqg aqi;
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) apc);
        i_.writeString(str);
        afw.a(i_, (IInterface) bar);
        i_.writeInt(i);
        Parcel a = a(2, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aqi = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            aqi = queryLocalInterface instanceof aqg ? (aqg) queryLocalInterface : new aqi(readStrongBinder);
        }
        a.recycle();
        return aqi;
    }

    public final avl createNativeAdViewDelegate(a aVar, a aVar2) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (IInterface) aVar2);
        Parcel a = a(5, i_);
        avl a2 = avm.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final avq createNativeAdViewHolderDelegate(a aVar, a aVar2, a aVar3) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (IInterface) aVar2);
        afw.a(i_, (IInterface) aVar3);
        Parcel a = a(11, i_);
        avq a2 = avs.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final cp createRewardedVideoAd(a aVar, bar bar, int i) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (IInterface) bar);
        i_.writeInt(i);
        Parcel a = a(6, i_);
        cp a2 = cq.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final aqg createSearchAdManager(a aVar, apc apc, String str, int i) {
        aqg aqi;
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) apc);
        i_.writeString(str);
        i_.writeInt(i);
        Parcel a = a(10, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aqi = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            aqi = queryLocalInterface instanceof aqg ? (aqg) queryLocalInterface : new aqi(readStrongBinder);
        }
        a.recycle();
        return aqi;
    }

    public final aqv getMobileAdsSettingsManager(a aVar) {
        aqv aqx;
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        Parcel a = a(4, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aqx = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            aqx = queryLocalInterface instanceof aqv ? (aqv) queryLocalInterface : new aqx(readStrongBinder);
        }
        a.recycle();
        return aqx;
    }

    public final aqv getMobileAdsSettingsManagerWithClientJarVersion(a aVar, int i) {
        aqv aqx;
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeInt(i);
        Parcel a = a(9, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aqx = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            aqx = queryLocalInterface instanceof aqv ? (aqv) queryLocalInterface : new aqx(readStrongBinder);
        }
        a.recycle();
        return aqx;
    }
}
