package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.gmsg.aa;
import java.util.Map;

@bfk
public final class mk implements aa<md> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        nq nqVar;
        md mdVar = (md) obj;
        if (((Boolean) app.f().a(asw.bg)).booleanValue()) {
            nq b = mdVar.b();
            if (b == null) {
                try {
                    nq nqVar2 = new nq(mdVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                    mdVar.a(nqVar2);
                    nqVar = nqVar2;
                } catch (NullPointerException | NumberFormatException e) {
                    fn.b("Unable to parse videoMeta message.", e);
                    au.i().a(e, "VideoMetaGmsgHandler.onGmsg");
                    return;
                }
            } else {
                nqVar = b;
            }
            boolean equals = "1".equals(map.get("muted"));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            int i = (parseInt < 0 || 3 < parseInt) ? 0 : parseInt;
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (fn.a(3)) {
                fn.b(new StringBuilder(String.valueOf(str).length() + 79).append("Video Meta GMSG: isMuted : ").append(equals).append(" , playbackState : ").append(i).append(" , aspectRatio : ").append(str).toString());
            }
            nqVar.a(parseFloat, i, equals, parseFloat2);
        }
    }
}
