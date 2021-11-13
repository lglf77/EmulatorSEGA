package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.b;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.f;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@bfk
public final class jg {
    private static Object a = new Object();
    private static boolean b = false;
    private static boolean c = false;
    private static d d = f.d();
    private static final Set<String> e = new HashSet(Arrays.asList(new String[0]));
    private final List<String> f;

    public jg() {
        this((String) null);
    }

    public jg(String str) {
        List<String> asList;
        if (!c()) {
            asList = new ArrayList<>();
        } else {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
                asList = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String valueOf2 = String.valueOf(str);
                strArr2[0] = valueOf2.length() != 0 ? "ad_request_".concat(valueOf2) : new String("ad_request_");
                String valueOf3 = String.valueOf(uuid);
                strArr2[1] = valueOf3.length() != 0 ? "network_request_".concat(valueOf3) : new String("network_request_");
                asList = Arrays.asList(strArr2);
            }
        }
        this.f = asList;
    }

    public static void a() {
        synchronized (a) {
            b = false;
            c = false;
            jn.e("Ad debug logging enablement is out of date.");
        }
    }

    static final /* synthetic */ void a(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        a(jsonWriter, (Map<String, ?>) map);
        jsonWriter.endObject();
    }

    private static void a(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!e.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            jn.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    static final /* synthetic */ void a(String str, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    private final void a(String str, jm jmVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(d.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            jmVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            jn.b("unable to log", e2);
        }
        c(stringWriter.toString());
    }

    static final /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        a(jsonWriter, (Map<String, ?>) map);
        if (bArr != null) {
            jsonWriter.name("body").value(b.a(bArr));
        }
        jsonWriter.endObject();
    }

    public static void a(boolean z) {
        synchronized (a) {
            b = true;
            c = z;
        }
    }

    static final /* synthetic */ void a(byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a2 = b.a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(a2);
        } else {
            String a3 = jc.a(a2);
            if (a3 != null) {
                jsonWriter.name("bodydigest").value(a3);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return ((Boolean) app.f().a(asw.aT)).booleanValue() && Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    private final void b(String str) {
        a("onNetworkRequestError", (jm) new jk(str));
    }

    private final void b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        a("onNetworkRequest", (jm) new jh(str, str2, map, bArr));
    }

    private final void b(Map<String, ?> map, int i) {
        a("onNetworkResponse", (jm) new ji(i, map));
    }

    public static boolean b() {
        boolean z;
        synchronized (a) {
            z = b;
        }
        return z;
    }

    private static synchronized void c(String str) {
        synchronized (jg.class) {
            jn.d("GMA Debug BEGIN");
            for (int i = 0; i < str.length(); i += 4000) {
                String valueOf = String.valueOf(str.substring(i, Math.min(i + 4000, str.length())));
                jn.d(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
            }
            jn.d("GMA Debug FINISH");
        }
    }

    public static boolean c() {
        boolean z;
        synchronized (a) {
            z = b && c;
        }
        return z;
    }

    public final void a(String str) {
        if (c() && str != null) {
            a(str.getBytes());
        }
    }

    public final void a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (c()) {
            b(str, str2, map, bArr);
        }
    }

    public final void a(HttpURLConnection httpURLConnection, int i) {
        String str = null;
        if (c()) {
            b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    jn.e(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                b(str);
            }
        }
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (c()) {
            b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void a(Map<String, ?> map, int i) {
        if (c()) {
            b(map, i);
            if (i < 200 || i >= 300) {
                b((String) null);
            }
        }
    }

    public final void a(byte[] bArr) {
        a("onNetworkResponseBody", (jm) new jj(bArr));
    }
}
