package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class ab extends pp {
    public static final Parcelable.Creator<ab> CREATOR = new ad();
    public final boolean a;
    public final List<String> b;

    public ab() {
        this(false, Collections.emptyList());
    }

    public ab(boolean z, List<String> list) {
        this.a = z;
        this.b = list;
    }

    public static ab a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new ab();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    fn.c("Error grabbing url from json.", e);
                }
            }
        }
        return new ab(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a);
        ps.b(parcel, 3, this.b, false);
        ps.a(parcel, a2);
    }
}
