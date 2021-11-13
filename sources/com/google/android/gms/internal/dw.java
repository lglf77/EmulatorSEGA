package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.a;
import com.google.android.gms.common.internal.v;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

@bfk
public final class dw extends pp {
    public static final Parcelable.Creator<dw> CREATOR = new dx();
    public final String a;
    public final int b;

    public dw(a aVar) {
        this(aVar.a(), aVar.b());
    }

    public dw(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static dw a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(new JSONArray(str));
        } catch (JSONException e) {
            return null;
        }
    }

    public static dw a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new dw(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return v.a(this.a, dwVar.a) && v.a(Integer.valueOf(this.b), Integer.valueOf(dwVar.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, this.b);
        ps.a(parcel, a2);
    }
}
