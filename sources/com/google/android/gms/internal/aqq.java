package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.a.a;

public abstract class aqq extends afv implements aqp {
    public aqq() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static aqp asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof aqp ? (aqp) queryLocalInterface : new aqr(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                aqg createBannerAdManager = createBannerAdManager(a.C0014a.a(parcel.readStrongBinder()), (apc) afw.a(parcel, apc.CREATOR), parcel.readString(), bas.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) createBannerAdManager);
                break;
            case 2:
                aqg createInterstitialAdManager = createInterstitialAdManager(a.C0014a.a(parcel.readStrongBinder()), (apc) afw.a(parcel, apc.CREATOR), parcel.readString(), bas.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) createInterstitialAdManager);
                break;
            case 3:
                aqb createAdLoaderBuilder = createAdLoaderBuilder(a.C0014a.a(parcel.readStrongBinder()), parcel.readString(), bas.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) createAdLoaderBuilder);
                break;
            case 4:
                aqv mobileAdsSettingsManager = getMobileAdsSettingsManager(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) mobileAdsSettingsManager);
                break;
            case 5:
                avl createNativeAdViewDelegate = createNativeAdViewDelegate(a.C0014a.a(parcel.readStrongBinder()), a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) createNativeAdViewDelegate);
                break;
            case 6:
                cp createRewardedVideoAd = createRewardedVideoAd(a.C0014a.a(parcel.readStrongBinder()), bas.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) createRewardedVideoAd);
                break;
            case 7:
                bdb createInAppPurchaseManager = createInAppPurchaseManager(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) createInAppPurchaseManager);
                break;
            case 8:
                bcr createAdOverlay = createAdOverlay(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) createAdOverlay);
                break;
            case 9:
                aqv mobileAdsSettingsManagerWithClientJarVersion = getMobileAdsSettingsManagerWithClientJarVersion(a.C0014a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) mobileAdsSettingsManagerWithClientJarVersion);
                break;
            case 10:
                aqg createSearchAdManager = createSearchAdManager(a.C0014a.a(parcel.readStrongBinder()), (apc) afw.a(parcel, apc.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) createSearchAdManager);
                break;
            case 11:
                avq createNativeAdViewHolderDelegate = createNativeAdViewHolderDelegate(a.C0014a.a(parcel.readStrongBinder()), a.C0014a.a(parcel.readStrongBinder()), a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) createNativeAdViewHolderDelegate);
                break;
            default:
                return false;
        }
        return true;
    }
}
