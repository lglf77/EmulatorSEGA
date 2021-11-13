package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.a;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.AppMeasurement;

public final class sh extends uk {
    private static String[] a = new String[AppMeasurement.a.a.length];
    private static String[] b = new String[AppMeasurement.d.a.length];
    private static String[] c = new String[AppMeasurement.e.a.length];

    sh(tk tkVar) {
        super(tkVar);
    }

    private final String a(rt rtVar) {
        if (rtVar == null) {
            return null;
        }
        return !y() ? rtVar.toString() : a(rtVar.b());
    }

    private static String a(String str, String[] strArr, String[] strArr2, String[] strArr3) {
        boolean z = true;
        int i = 0;
        y.a(strArr);
        y.a(strArr2);
        y.a(strArr3);
        y.b(strArr.length == strArr2.length);
        if (strArr.length != strArr3.length) {
            z = false;
        }
        y.b(z);
        while (true) {
            if (i >= strArr.length) {
                break;
            } else if (wr.a(str, strArr[i])) {
                synchronized (strArr3) {
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str = strArr3[i];
                }
            } else {
                i++;
            }
        }
        return str;
    }

    private static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void a(StringBuilder sb, int i, wu wuVar) {
        if (wuVar != null) {
            a(sb, i);
            sb.append("filter {\n");
            a(sb, i, "complement", (Object) wuVar.c);
            a(sb, i, "param_name", (Object) b(wuVar.d));
            int i2 = i + 1;
            wx wxVar = wuVar.a;
            if (wxVar != null) {
                a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (wxVar.a != null) {
                    String str = "UNKNOWN_MATCH_TYPE";
                    switch (wxVar.a.intValue()) {
                        case a.b.AdsAttrs_adSizes:
                            str = "REGEXP";
                            break;
                        case 2:
                            str = "BEGINS_WITH";
                            break;
                        case 3:
                            str = "ENDS_WITH";
                            break;
                        case 4:
                            str = "PARTIAL";
                            break;
                        case 5:
                            str = "EXACT";
                            break;
                        case 6:
                            str = "IN_LIST";
                            break;
                    }
                    a(sb, i2, "match_type", (Object) str);
                }
                a(sb, i2, "expression", (Object) wxVar.b);
                a(sb, i2, "case_sensitive", (Object) wxVar.c);
                if (wxVar.d.length > 0) {
                    a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String append : wxVar.d) {
                        a(sb, i2 + 2);
                        sb.append(append);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                a(sb, i2);
                sb.append("}\n");
            }
            a(sb, i + 1, "number_filter", wuVar.b);
            a(sb, i);
            sb.append("}\n");
        }
    }

    private final void a(StringBuilder sb, int i, String str, wv wvVar) {
        if (wvVar != null) {
            a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (wvVar.a != null) {
                String str2 = "UNKNOWN_COMPARISON_TYPE";
                switch (wvVar.a.intValue()) {
                    case a.b.AdsAttrs_adSizes:
                        str2 = "LESS_THAN";
                        break;
                    case 2:
                        str2 = "GREATER_THAN";
                        break;
                    case 3:
                        str2 = "EQUAL";
                        break;
                    case 4:
                        str2 = "BETWEEN";
                        break;
                }
                a(sb, i, "comparison_type", (Object) str2);
            }
            a(sb, i, "match_as_float", (Object) wvVar.b);
            a(sb, i, "comparison_value", (Object) wvVar.c);
            a(sb, i, "min_comparison_value", (Object) wvVar.d);
            a(sb, i, "max_comparison_value", (Object) wvVar.e);
            a(sb, i);
            sb.append("}\n");
        }
    }

    private static void a(StringBuilder sb, int i, String str, xh xhVar) {
        int i2 = 0;
        if (xhVar != null) {
            int i3 = i + 1;
            a(sb, i3);
            sb.append(str);
            sb.append(" {\n");
            if (xhVar.b != null) {
                a(sb, i3 + 1);
                sb.append("results: ");
                long[] jArr = xhVar.b;
                int length = jArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    Long valueOf = Long.valueOf(jArr[i4]);
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf);
                    i4++;
                    i5 = i6;
                }
                sb.append(10);
            }
            if (xhVar.a != null) {
                a(sb, i3 + 1);
                sb.append("status: ");
                long[] jArr2 = xhVar.a;
                int length2 = jArr2.length;
                int i7 = 0;
                while (i2 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i2]);
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf2);
                    i2++;
                    i7 = i8;
                }
                sb.append(10);
            }
            a(sb, i3);
            sb.append("}\n");
        }
    }

    private static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    private final void a(StringBuilder sb, int i, xc[] xcVarArr) {
        if (xcVarArr != null) {
            for (xc xcVar : xcVarArr) {
                if (xcVar != null) {
                    a(sb, 2);
                    sb.append("audience_membership {\n");
                    a(sb, 2, "audience_id", (Object) xcVar.a);
                    a(sb, 2, "new_audience", (Object) xcVar.d);
                    a(sb, 2, "current_data", xcVar.b);
                    a(sb, 2, "previous_data", xcVar.c);
                    a(sb, 2);
                    sb.append("}\n");
                }
            }
        }
    }

    private final void a(StringBuilder sb, int i, xd[] xdVarArr) {
        if (xdVarArr != null) {
            for (xd xdVar : xdVarArr) {
                if (xdVar != null) {
                    a(sb, 2);
                    sb.append("event {\n");
                    a(sb, 2, "name", (Object) a(xdVar.b));
                    a(sb, 2, "timestamp_millis", (Object) xdVar.c);
                    a(sb, 2, "previous_timestamp_millis", (Object) xdVar.d);
                    a(sb, 2, "count", (Object) xdVar.e);
                    xe[] xeVarArr = xdVar.a;
                    if (xeVarArr != null) {
                        for (xe xeVar : xeVarArr) {
                            if (xeVar != null) {
                                a(sb, 3);
                                sb.append("param {\n");
                                a(sb, 3, "name", (Object) b(xeVar.a));
                                a(sb, 3, "string_value", (Object) xeVar.b);
                                a(sb, 3, "int_value", (Object) xeVar.c);
                                a(sb, 3, "double_value", (Object) xeVar.d);
                                a(sb, 3);
                                sb.append("}\n");
                            }
                        }
                    }
                    a(sb, 2);
                    sb.append("}\n");
                }
            }
        }
    }

    private final void a(StringBuilder sb, int i, xi[] xiVarArr) {
        if (xiVarArr != null) {
            for (xi xiVar : xiVarArr) {
                if (xiVar != null) {
                    a(sb, 2);
                    sb.append("user_property {\n");
                    a(sb, 2, "set_timestamp_millis", (Object) xiVar.a);
                    a(sb, 2, "name", (Object) c(xiVar.b));
                    a(sb, 2, "string_value", (Object) xiVar.c);
                    a(sb, 2, "int_value", (Object) xiVar.d);
                    a(sb, 2, "double_value", (Object) xiVar.e);
                    a(sb, 2);
                    sb.append("}\n");
                }
            }
        }
    }

    private final boolean y() {
        return this.p.f().a(3);
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!y()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(rr rrVar) {
        if (rrVar == null) {
            return null;
        }
        if (!y()) {
            return rrVar.toString();
        }
        return "Event{appId='" + rrVar.a + "', name='" + a(rrVar.b) + "', params=" + a(rrVar.e) + "}";
    }

    /* access modifiers changed from: protected */
    public final String a(rx rxVar) {
        if (rxVar == null) {
            return null;
        }
        if (!y()) {
            return rxVar.toString();
        }
        return "origin=" + rxVar.c + ",name=" + a(rxVar.a) + ",params=" + a(rxVar.b);
    }

    /* access modifiers changed from: protected */
    public final String a(wt wtVar) {
        if (wtVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        a(sb, 0, "filter_id", (Object) wtVar.a);
        a(sb, 0, "event_name", (Object) a(wtVar.b));
        a(sb, 1, "event_count_filter", wtVar.d);
        sb.append("  filters {\n");
        for (wu a2 : wtVar.c) {
            a(sb, 2, a2);
        }
        a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(ww wwVar) {
        if (wwVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        a(sb, 0, "filter_id", (Object) wwVar.a);
        a(sb, 0, "property_name", (Object) c(wwVar.b));
        a(sb, 1, wwVar.c);
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(xf xfVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (xfVar.a != null) {
            for (xg xgVar : xfVar.a) {
                if (!(xgVar == null || xgVar == null)) {
                    a(sb, 1);
                    sb.append("bundle {\n");
                    a(sb, 1, "protocol_version", (Object) xgVar.a);
                    a(sb, 1, "platform", (Object) xgVar.i);
                    a(sb, 1, "gmp_version", (Object) xgVar.q);
                    a(sb, 1, "uploading_gmp_version", (Object) xgVar.r);
                    a(sb, 1, "config_version", (Object) xgVar.E);
                    a(sb, 1, "gmp_app_id", (Object) xgVar.y);
                    a(sb, 1, "app_id", (Object) xgVar.o);
                    a(sb, 1, "app_version", (Object) xgVar.p);
                    a(sb, 1, "app_version_major", (Object) xgVar.C);
                    a(sb, 1, "firebase_instance_id", (Object) xgVar.B);
                    a(sb, 1, "dev_cert_hash", (Object) xgVar.v);
                    a(sb, 1, "app_store", (Object) xgVar.n);
                    a(sb, 1, "upload_timestamp_millis", (Object) xgVar.d);
                    a(sb, 1, "start_timestamp_millis", (Object) xgVar.e);
                    a(sb, 1, "end_timestamp_millis", (Object) xgVar.f);
                    a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) xgVar.g);
                    a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) xgVar.h);
                    a(sb, 1, "app_instance_id", (Object) xgVar.u);
                    a(sb, 1, "resettable_device_id", (Object) xgVar.s);
                    a(sb, 1, "device_id", (Object) xgVar.D);
                    a(sb, 1, "limited_ad_tracking", (Object) xgVar.t);
                    a(sb, 1, "os_version", (Object) xgVar.j);
                    a(sb, 1, "device_model", (Object) xgVar.k);
                    a(sb, 1, "user_default_language", (Object) xgVar.l);
                    a(sb, 1, "time_zone_offset_minutes", (Object) xgVar.m);
                    a(sb, 1, "bundle_sequential_index", (Object) xgVar.w);
                    a(sb, 1, "service_upload", (Object) xgVar.z);
                    a(sb, 1, "health_monitor", (Object) xgVar.x);
                    if (xgVar.F.longValue() != 0) {
                        a(sb, 1, "android_id", (Object) xgVar.F);
                    }
                    a(sb, 1, xgVar.c);
                    a(sb, 1, xgVar.A);
                    a(sb, 1, xgVar.b);
                    a(sb, 1);
                    sb.append("}\n");
                }
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return y() ? a(str, AppMeasurement.a.b, AppMeasurement.a.a, a) : str;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return y() ? a(str, AppMeasurement.d.b, AppMeasurement.d.a, b) : str;
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!y()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return a(str, AppMeasurement.e.b, AppMeasurement.e.a, c);
        }
        return "experiment_id" + "(" + str + ")";
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ qz d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ rg e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ um f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ se g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ rq h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ vg i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ vc j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ d k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Context l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ sf m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ rk n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ sh o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ wr p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ te q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ wg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ tf s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ sj t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ su u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ rj v() {
        return super.v();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }
}
