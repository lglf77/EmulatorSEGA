package com.google.android.gms.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public abstract class gi implements os {
    public abstract oq a(aws<?> aws, Map<String, String> map);

    @Deprecated
    public final HttpResponse b(aws<?> aws, Map<String, String> map) {
        oq a = a(aws, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.a(), ""));
        ArrayList arrayList = new ArrayList();
        for (aqo next : a.b()) {
            arrayList.add(new BasicHeader(next.a(), next.b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream d = a.d();
        if (d != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(d);
            basicHttpEntity.setContentLength((long) a.c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
