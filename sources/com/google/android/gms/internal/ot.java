package com.google.android.gms.internal;

import com.google.android.gms.a;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public final class ot extends gi {
    private final ou a;
    private final SSLSocketFactory b;

    public ot() {
        this((ou) null);
    }

    private ot(ou ouVar) {
        this((ou) null, (SSLSocketFactory) null);
    }

    private ot(ou ouVar, SSLSocketFactory sSLSocketFactory) {
        this.a = null;
        this.b = null;
    }

    private static InputStream a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException e) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static List<aqo> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String aqo : (List) next.getValue()) {
                    arrayList.add(new aqo((String) next.getKey(), aqo));
                }
            }
        }
        return arrayList;
    }

    private static void a(HttpURLConnection httpURLConnection, aws<?> aws) {
        byte[] a2 = aws.a();
        if (a2 != null) {
            httpURLConnection.setDoOutput(true);
            String valueOf = String.valueOf("UTF-8");
            httpURLConnection.addRequestProperty("Content-Type", valueOf.length() != 0 ? "application/x-www-form-urlencoded; charset=".concat(valueOf) : new String("application/x-www-form-urlencoded; charset="));
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(a2);
            dataOutputStream.close();
        }
    }

    public final oq a(aws<?> aws, Map<String, String> map) {
        String str;
        String e = aws.e();
        HashMap hashMap = new HashMap();
        hashMap.putAll(aws.b());
        hashMap.putAll(map);
        if (this.a != null) {
            str = this.a.a(e);
            if (str == null) {
                String valueOf = String.valueOf(e);
                throw new IOException(valueOf.length() != 0 ? "URL blocked by rewriter: ".concat(valueOf) : new String("URL blocked by rewriter: "));
            }
        } else {
            str = e;
        }
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int h = aws.h();
        httpURLConnection.setConnectTimeout(h);
        httpURLConnection.setReadTimeout(h);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        for (String str2 : hashMap.keySet()) {
            httpURLConnection.addRequestProperty(str2, (String) hashMap.get(str2));
        }
        switch (aws.c()) {
            case -1:
                break;
            case a.b.AdsAttrs_adSize:
                httpURLConnection.setRequestMethod("GET");
                break;
            case a.b.AdsAttrs_adSizes:
                httpURLConnection.setRequestMethod("POST");
                a(httpURLConnection, aws);
                break;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                a(httpURLConnection, aws);
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                a(httpURLConnection, aws);
                break;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        return !(aws.c() != 4 && ((100 > responseCode || responseCode >= 200) && responseCode != 204 && responseCode != 304)) ? new oq(responseCode, a((Map<String, List<String>>) httpURLConnection.getHeaderFields())) : new oq(responseCode, a((Map<String, List<String>>) httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), a(httpURLConnection));
    }
}
