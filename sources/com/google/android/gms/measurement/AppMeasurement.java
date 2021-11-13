package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.tk;
import com.google.android.gms.internal.wo;
import com.google.android.gms.internal.wr;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;

@Keep
@Deprecated
public class AppMeasurement {
    public static final String CRASH_ORIGIN = "crash";
    public static final String FCM_ORIGIN = "fcm";
    private final tk zziwf;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            y.a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            if (conditionalUserProperty.mValue != null) {
                this.mValue = wr.b(conditionalUserProperty.mValue);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mValue = conditionalUserProperty.mValue;
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    public static final class a extends FirebaseAnalytics.a {
        public static final String[] a = {"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"};
        public static final String[] b = {"_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_vs", "_ep"};

        public static String a(String str) {
            return wr.a(str, a, b);
        }
    }

    public interface b {
        void a(String str, String str2, Bundle bundle, long j);
    }

    public interface c {
        void a(String str, String str2, Bundle bundle, long j);
    }

    public static final class d extends FirebaseAnalytics.b {
        public static final String[] a = {"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "firebase_event_id", "firebase_extra_params_ct", "firebase_group_name", "firebase_list_length", "firebase_index", "firebase_event_name"};
        public static final String[] b = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en"};

        public static String a(String str) {
            return wr.a(str, a, b);
        }
    }

    public static final class e extends FirebaseAnalytics.c {
        public static final String[] a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install"};
        public static final String[] b = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_fi"};

        public static String a(String str) {
            return wr.a(str, a, b);
        }
    }

    public interface f {
        boolean a(g gVar, g gVar2);
    }

    public static class g {
        public String b;
        public String c;
        public long d;

        public g() {
        }

        public g(g gVar) {
            this.b = gVar.b;
            this.c = gVar.c;
            this.d = gVar.d;
        }
    }

    public AppMeasurement(tk tkVar) {
        y.a(tkVar);
        this.zziwf = tkVar;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return tk.a(context).m();
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.zziwf.A().a(str);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zziwf.l().b(str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        this.zziwf.l().a(str, str2, str3, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.zziwf.A().b(str);
    }

    @Keep
    public long generateEventId() {
        return this.zziwf.o().y();
    }

    @Keep
    public String getAppInstanceId() {
        return this.zziwf.l().z();
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.zziwf.l().a(str, str2);
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        return this.zziwf.l().a(str, str2, str3);
    }

    @Keep
    public String getCurrentScreenClass() {
        g z = this.zziwf.v().z();
        if (z != null) {
            return z.c;
        }
        return null;
    }

    @Keep
    public String getCurrentScreenName() {
        g z = this.zziwf.v().z();
        if (z != null) {
            return z.b;
        }
        return null;
    }

    @Keep
    public String getGmpAppId() {
        try {
            return com.google.android.gms.common.api.internal.a.a();
        } catch (IllegalStateException e2) {
            this.zziwf.f().y().a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public int getMaxUserProperties(String str) {
        this.zziwf.l();
        y.a(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zziwf.l().a(str, str2, z);
    }

    public Map<String, Object> getUserProperties(boolean z) {
        List<wo> b2 = this.zziwf.l().b(z);
        android.support.v4.c.a aVar = new android.support.v4.c.a(b2.size());
        for (wo next : b2) {
            aVar.put(next.a, next.a());
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        return this.zziwf.l().a(str, str2, str3, z);
    }

    public final void logEvent(String str, Bundle bundle) {
        int b2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if ("_iap".equals(str) || (b2 = this.zziwf.o().b(str)) == 0) {
            this.zziwf.l().a("app", str, bundle, true);
            return;
        }
        this.zziwf.o();
        this.zziwf.o().a(b2, "_ev", wr.a(str, 40, true), str != null ? str.length() : 0);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zziwf.l().a(str, str2, bundle);
    }

    public void logEventInternalNoInterceptor(String str, String str2, Bundle bundle, long j) {
        this.zziwf.l().a(str, str2, bundle == null ? new Bundle() : bundle, j);
    }

    public void registerOnMeasurementEventListener(c cVar) {
        this.zziwf.l().a(cVar);
    }

    @Keep
    public void registerOnScreenChangeCallback(f fVar) {
        this.zziwf.v().a(fVar);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.zziwf.l().a(conditionalUserProperty);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.zziwf.l().b(conditionalUserProperty);
    }

    public void setEventInterceptor(b bVar) {
        this.zziwf.l().a(bVar);
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
        this.zziwf.l().a(z);
    }

    public final void setMinimumSessionDuration(long j) {
        this.zziwf.l().a(j);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zziwf.l().b(j);
    }

    public final void setUserProperty(String str, String str2) {
        int d2 = this.zziwf.o().d(str);
        if (d2 != 0) {
            this.zziwf.o();
            this.zziwf.o().a(d2, "_ev", wr.a(str, 24, true), str != null ? str.length() : 0);
            return;
        }
        setUserPropertyInternal("app", str, str2);
    }

    public void setUserPropertyInternal(String str, String str2, Object obj) {
        this.zziwf.l().a(str, str2, obj);
    }

    public void unregisterOnMeasurementEventListener(c cVar) {
        this.zziwf.l().b(cVar);
    }

    @Keep
    public void unregisterOnScreenChangeCallback(f fVar) {
        this.zziwf.v().b(fVar);
    }
}
