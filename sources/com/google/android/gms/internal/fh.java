package com.google.android.gms.internal;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

final class fh extends gi {
    private final os a;

    fh(os osVar) {
        this.a = osVar;
    }

    public final oq a(aws<?> aws, Map<String, String> map) {
        try {
            HttpResponse b = this.a.b(aws, map);
            int statusCode = b.getStatusLine().getStatusCode();
            Header[] allHeaders = b.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new aqo(header.getName(), header.getValue()));
            }
            if (b.getEntity() == null) {
                return new oq(statusCode, arrayList);
            }
            long contentLength = b.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new oq(statusCode, arrayList, (int) b.getEntity().getContentLength(), b.getEntity().getContent());
            }
            throw new IOException(new StringBuilder(40).append("Response too large: ").append(contentLength).toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
