package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.a;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.br;
import com.google.android.gms.ads.internal.overlay.d;

@bfk
@TargetApi(11)
public class ny extends WebChromeClient {
    private final mw a;

    public ny(mw mwVar) {
        this.a = mwVar;
    }

    private static Context a(WebView webView) {
        if (!(webView instanceof mw)) {
            return webView.getContext();
        }
        mw mwVar = (mw) webView;
        Activity d = mwVar.d();
        return d == null ? mwVar.getContext() : d;
    }

    private final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        br a2;
        try {
            if (this.a == null || this.a.w() == null || this.a.w().a() == null || (a2 = this.a.w().a()) == null || a2.b()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    builder.setView(linearLayout).setPositiveButton(17039370, new oe(jsPromptResult, editText)).setNegativeButton(17039360, new od(jsPromptResult)).setOnCancelListener(new oc(jsPromptResult)).create().show();
                    return true;
                }
                builder.setMessage(str3).setPositiveButton(17039370, new ob(jsResult)).setNegativeButton(17039360, new oa(jsResult)).setOnCancelListener(new nz(jsResult)).create().show();
                return true;
            }
            a2.a(new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length()).append("window.").append(str).append("('").append(str3).append("')").toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            fn.c("Fail to display Dialog.", e);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        d s = this.a.s();
        if (s == null) {
            fn.e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        s.a(view, customViewCallback);
        s.a(i);
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof mw)) {
            fn.e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        d s = ((mw) webView).s();
        if (s == null) {
            fn.e("Tried to close an AdWebView not associated with an overlay.");
        } else {
            s.a();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        String sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length()).append("JS: ").append(message).append(" (").append(sourceId).append(":").append(consoleMessage.lineNumber()).append(")").toString();
        if (sb.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (of.a[consoleMessage.messageLevel().ordinal()]) {
            case a.b.AdsAttrs_adSizes:
                fn.c(sb);
                break;
            case 2:
                fn.e(sb);
                break;
            case 3:
            case 4:
                fn.d(sb);
                break;
            case 5:
                fn.b(sb);
                break;
            default:
                fn.d(sb);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.a.w());
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(Math.min(131072, j4) + j, 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            au.e();
            if (!gw.a(this.a.getContext(), this.a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) {
                au.e();
                if (!gw.a(this.a.getContext(), this.a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        d s = this.a.s();
        if (s == null) {
            fn.e("Could not get ad overlay when hiding custom view.");
        } else {
            s.b();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(a(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = 131072 + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        a(view, -1, customViewCallback);
    }
}
