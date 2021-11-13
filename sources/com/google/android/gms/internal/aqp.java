package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.a.a;

public interface aqp extends IInterface {
    aqb createAdLoaderBuilder(a aVar, String str, bar bar, int i);

    bcr createAdOverlay(a aVar);

    aqg createBannerAdManager(a aVar, apc apc, String str, bar bar, int i);

    bdb createInAppPurchaseManager(a aVar);

    aqg createInterstitialAdManager(a aVar, apc apc, String str, bar bar, int i);

    avl createNativeAdViewDelegate(a aVar, a aVar2);

    avq createNativeAdViewHolderDelegate(a aVar, a aVar2, a aVar3);

    cp createRewardedVideoAd(a aVar, bar bar, int i);

    aqg createSearchAdManager(a aVar, apc apc, String str, int i);

    aqv getMobileAdsSettingsManager(a aVar);

    aqv getMobileAdsSettingsManagerWithClientJarVersion(a aVar, int i);
}
