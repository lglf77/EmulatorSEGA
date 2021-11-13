package com.google.android.gms.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

@bfk
public final class kt {
    public static HttpURLConnection a(String str, int i) {
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(i);
                openConnection.setReadTimeout(i);
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                jg jgVar = new jg();
                jgVar.a(httpURLConnection, (byte[]) null);
                httpURLConnection.setInstanceFollowRedirects(false);
                int responseCode = httpURLConnection.getResponseCode();
                jgVar.a(httpURLConnection, responseCode);
                if (responseCode / 100 != 3) {
                    return httpURLConnection;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    throw new IOException("Protocol is null");
                } else if (protocol.equals("http") || protocol.equals("https")) {
                    String valueOf = String.valueOf(headerField);
                    fn.b(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                    httpURLConnection.disconnect();
                    i2 = i3;
                    url = url2;
                } else {
                    String valueOf2 = String.valueOf(protocol);
                    throw new IOException(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                }
            } else {
                throw new IOException("Too many redirects (20)");
            }
        }
    }
}
