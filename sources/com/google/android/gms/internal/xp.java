package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class xp extends xo {
    private static Object r = new Object();
    private static final String s = xp.class.getSimpleName();
    private static volatile yj t = null;
    private static boolean u = false;
    private static long v = 0;
    protected boolean q = false;
    private String w;
    private boolean x = false;
    private boolean y = false;
    private acb z;

    protected xp(Context context, String str, boolean z2) {
        super(context);
        this.w = str;
        this.q = z2;
    }

    private static yy a(yj yjVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method a = yjVar.a("Qplw2pUqnSpmThNy4cjVdvqrjxx/9Z0jyK1w8BPQVMfA35eh0MC7cXEA3u5Xkcuj", "JqjJogq0azQ/rErdMQn/B0NsEhrIRbxY2b3jvD0/vE8=");
        if (a == null || motionEvent == null) {
            throw new yg();
        }
        try {
            return new yy((String) a.invoke((Object) null, new Object[]{motionEvent, displayMetrics}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new yg(e);
        }
    }

    protected static synchronized void a(Context context, boolean z2) {
        synchronized (xp.class) {
            if (!u) {
                v = zz.a().longValue() / 1000;
                t = b(context, z2);
                u = true;
            }
        }
    }

    private static void a(List<Callable<Void>> list) {
        ExecutorService c;
        if (t != null && (c = t.c()) != null && !list.isEmpty()) {
            try {
                c.invokeAll(list, ((Long) app.f().a(asw.bp)).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Log.d(s, String.format("class methods got exception: %s", new Object[]{zz.a((Throwable) e)}));
            }
        }
    }

    private static yj b(Context context, boolean z2) {
        if (t == null) {
            synchronized (r) {
                if (t == null) {
                    yj a = yj.a(context, "WKdn2zzE+pFOb2FrixdUDF+m9GVRaxGTq2U3/uOmGmE=", "cn9TOtsqW5O6p67qBR/47Sau1ZYA0L2myntlm34lj9RmJFoGCDUOJzs+k6Y6t0NAkJZ47KGO/YElJyaMX9EzHCqqy8QwqReHwqhzoFIho29tPAltd/8bEwzbLRJpSO5rz4Ar0SRx53PuznOu8XPaVh7XLig7jTpA1k625yBzA/fyjU2ULVsXpS2p87GXrRiWh/1AoXOdW128fBktZ+5vbLmT/zQIn+5IhHDqnXscgcqZYtCuoZwfmG6u525QDiZA9wWvhqEPohVGBwrC/cLboiIwQTXOeVCzyR6CIJuCLN+BHn3RrOFKEua3bkZfTXKZN8wOLv38Sv2+S++z27/o72Bm2zQR/rc9X+CwVdDZQJMngB8fKQi/jUX4k9pJfYcszEj7oMx1fgsB5Rd6zw77hUvji8Y5+Km7BCU5KEYTzM0zAEZhRyCdC7vDFe4owXPaqV1Rtnuaxtf9BdDRyMsUBSMu1ttNDKvP1MxEDQUftu53javfNHsju14/2IP5I4d3ZEx8phtOV6fe+G4D5tOucF2R9vUx93PaOtXLLLDgebyI8ObJeybrIrw8DQMGAUJPgSH60NW0RIeR16CYBtEBJ4+xiVFAxbGMamlo3+FccKbvNNn4YomGRQ4R8sVdyXCsPbflAy2Fgf0wXHYl5QNRrnXYdDljixNWF2qlGBkxS/wysKY2VWJgfXkqu0fcTcWI/6ccNkSkLvdSrjbv7+h7vnN8kI/t1CNQbXh4McszjGz5VN9X3JlVSrzK3ZLE+KR0lOOli2e53GyLx8m9kSbmKSgbTQiimXF2QJOVWsvIOf7KS/Rly6eGAmJye5DWj32qjSwZvVVbnLq7kc+eq31/GqaME/8Yys+irZbdWlMy6TevbOekMM1yJaHgCRwt7guesADXwOSDNMZ0FGySYJf5ZB/zHHDTVcNwjTrHW4hZHgrWIF3wqdS5Td609jbVjOc1zJd+06Zdnt30ZpdpubtmdsdlgR5dp0Xi4JIv9qlKo9O676Q0YcN1sPXcZU8SeLaotQAiJXiF06ZBkK2ii6+MjlOhrugle7hFijRGJKKeiXvw7ZJlQ17LgTnNvmNEhR1kKHQHzgkmwu9BJypdoy5i9EPWsxuAKWPurOy0Q2AKro9b91UC242ic+ZTbSDzyJhQAGaMS9Lg5CQvTNz6O8jJ5Vr9W1YLCfs3F9W1zkVnfLiaJTdOJ7r90Q0Q4IQmY4R0wax3vCJ2ge4uDhLJg+ZGxFBb1g6BHl8+SFu7HhWUwM05kpyckQgfn5DABVEvvzYdh71PY8ed5T74w1r97+9eEh49DKjE75XM7jon3drZ12kwdotQ/vER1yuV81XflvK4dDlEkWMuFQ1RXnzmAxis/YQnhSsNXTPmgDgRuYO+PJTLd5e5WDWiTmSu7/Y9/Fn3aUhKoPHJ82gq1UEQ8tiYBw2XgVKrN9APl1i8+ELtR+h4ycMIIlK27vSdVT+3JyWtbKmE/M2lIhhtr8Qq1D36BDsZKIg/ymTrBfy1tOyk8rUYHH/uDCt84ieERHpqgmWPmyUH8HajLq2wfp4tVoTFnGc3NIjBayKgyDaiP9rqYIwfdx0wp8z7kRqxkgOk8Yr5aL7X3JBea7uJhwwxO/a66pPbiTw8+UoI3JE7PVCQYq/oRV1JXcZrkYTkUJNTnxV7JjCWd/Pt324ng9/jx8M1nRUOf/hYqkrsVGjwITerjhAY1rObORmURsDWyCOlhounfesXlYugrBndDrldvwM1TQMBag9P5+lmrSOWdNkOdKMM2FR77PqH46acFgZI8tZglkRLwgSfE6lPbVdoOPhC8zRpRSfu2eFcew7i9PRFBLI9C0EgkZW2tInkZhSNhIZ3WovYiMXx61pHSZs3DUgtIG6qa+Pk0yq39dMLyt1k1VLrecUur4w5nCX4f3S2vd8OYoRMSkeqE/YhoBOtoUEZAg8AZCLoM+pQlOylPKt6INz22AgRvgzmtC1M3KwtGCnn5VedWUtXLbDY2xRGbUFfj7SxxhjbHwWAM5pCI+GVRTsLsnHrLTWuSJJepHO1Fe1LrCfoehYtr6NV0SD/EtKrVabM/iB7OARDVkU+yz+TwpdHuUJ/p1IKHjE1r+XmAtamBajaBUhIGtYlqsx2lFQU8B+VfkYur+50JRlxM0ntjorR30p4Ew3icphiJaIAy4c69dwH+m00x3ZXN2W7C2rVpJDJQH4oGj0zFmaNVhgUC2keCC3psWFMhfqT2Z9ug+uU0jlIW2BoX4lQBaXdMTpeFSBnVr9xJnVi88oup6lrmLaJJcN27+0g3RGekwyhBBxFqiUz+63cYZbEVh6geH4AhnYC/HxG4jrX1X3SnLUg/dzyxEr31CYo56Ffr3OwYN8Pxal2Vft2ZDxYxszxMh6X7kELrungHwpSSJ53JlAu/Jf49CdOYE4g3dfa6LzchI1EDJr4V0eG8vsxhIH2s/nvdAJMcyuO30evxo346d5hnTpo0O5GiUvCV2VeBJjWtP0434nDTvSPYAHGdNfS3dc8j9UzzNkAEM9xrFncdEuUAiqYFs8EXN4dUGaehabDAkaQxJQAct6EtR4FUxiruFrXZO4/AlTm4xBu3qxKsQXrKAVrrYXjbwrxJpfi7fieHOInEEWSVaDunUwxRBiYveyaoIVniyVWjcKojn/iFpH1waqgJs5f0lJvCskey1IP706KO2u5HsDdnImlW4j1vUEusUTL2Qva/zGSX+8Uu62UmDgyVrKUUXqKPAmc2dg9holDK0l0tCgY/liMTuhXzV1DkxMEvhupRvGf02mjDuD2wqcvHvsEpZkTH77z+EptHdG6ad1NRyA9Ml/+dxemk2rtDNsbVEC9wPYW/5OltPwh7PBIZasshkpqL6BtjeqciLyhsNPztm23a2H7LJb/4vx2i4c6clKhM3MOXesodkPxa2UEEBz2h/t7QWXzdYx8xW3mg9z2p8sZYY0xh7u9DNBkKle8VMUTP5IWJILwlWvNPAFmgCRycJYaQwiGRjNQMqbGIw0CtU99ZINWIJMEbmmgT+yKMYPf73X0PAX+k9VNTtqEtEP8QMCllBW7VGdF4FGDsJXf6eQpxg7oxbp0rMTO5HskTACydcBziV3Usi4kGZd+7jJy6zg3DneXuAHH/b+xIPt5wjgREOL3tzNroR87jE+SfP0Bi+5YgeUGFoy5RBlH1bxLBFptZrNnCIE/LnNDiPegSCC2Nrcz1DmBlCl009CgUW8Xx0qhtUV2xbWKey37cWwRJXACkkFDlM0r5ETdsAnCAIUJ6q7J7v2lBKprjxuhUnazO4KU0M9GW/4ORX0B0/IX/R8m/abdMDJgnn4/vz/lZsbbeVQI5y0u6sR3Dt6d+9m/sMkYTLToWOsH5ZZ5odE0S9Hqqz43hrpU4wKP1L393u6WIepBBJ1lQBMzyvGyptHiV/aYJLWRC3jpwuxyURDRTZ4g/DE1NfrtH0+37OwOmlmNBt/vTiqd6IHxXm8N+w1a3XKTE7EIWD67RS2q6QGugDLdAw1v0NLwOWnbiOBYYZvnewdtjB7vZpUoObIisAXfcMkXFCQggPdDhNlZHROirt5lEcR8SvkaZLLrvcLfQpDs5tA12styaEXxN+NP3a7CGI8P9HxOVh/CHWywtSVNBH7Bbh4LZ23jDpaKpoDcZ1ZqJNB3Lfw00iGaif4gI3BJ1gS+HO8aJUQWL7TcFYV+tkevSWIIyvN8VvQzGNA1QIJYCh1TD1RMOCZupMuERbELcXp8sWF4ztJxxOx3Cp5KgUICO069ewlD+qFwPqETInO7nhNy7syZmqxH+W3/iwIKQZHMDS4xq88lEQsXggSoS0Ufh15J5Px34OIHBtcOT/WQzkCsLyRTrvxkvhoctHc0fVd7qJXQsynBVaR2mViF6XkLGZ0Zmy2jTUYUJ/vrLMJIPkwadgeWKqcdZshW8v29+drqzpROFmGILqTQEcJTCG7hVdlLDRk0bY2czTegL+qvNGu8o4fFY4yTfwArsJuievjdBYSkxtmTKWNyZQLdXL/5jvUOEytzK2u80WqvNMKOoLk524DdU/u3ub6vqG06t3nJcMqIRangUF20ym5X0RcBbfKkT7lqvGYhOvvlO0wRzDXVbaaUahOwRNMivT3jmhc2ZZl4MoxvmqwGd3+BGLtuDmpOCZfkZKvVpKDoFuNUeOapaX+5Lg5w270sPbigoFaXgK6mjMMkHak54fCVqt5z4rqcB6cvYOFcxpUwDewc51XUuv/Ow1U6BUL/4x+WeGZ59yFBV7map/3Ycoy7MXtcmBluxzWsqqv7xGnmg9ek8fUhnCNvxtP6b7fceS6wX2N0os5IofefvbbcfonjgbigKCrB5KuXSiZr/FTn8EKCAeK/WqS/TGPqqceWd7EgrowJob+JYZ6UyjAduaJnd7i2dp6nGBjazCy8OAb2I70UyvpOXGrjxM1VkxnWMqx6OeXc+kk9Ru/UMyuM57N1MhhogbpeX+hN1DnASCEWmSnHkcmna6gp6WjdpNwMStKv23kBEy6Cx6MsGNERluYj8pf5WHm2rdL1ulSGladdz6S3LFxwS8oaBrKN5UTa4EuUKbuIYek/EY2nwrdh5XZh6Y9DQUbwbSU9H5i2wfLKzWfmndIU0vrA4MkZYHRVlap05OZfzFON/ApB/outGofI4YhhVYd8e4YoxIb/bRiOuxLhAirp5HwSRBcdyh9h/I2CQ6EZjzi19zIWxtWiByWwG0SgwHgYVxRprDrASHnkvQ5t7Iv3RTdmcUy8enItQN4TPckxh7MJLOMDa+JYfW60EA9xLpJOp3eZoDnL5vcBFIhoxIdda9ZZuQlKw8bFPJYpSal71NXc3FslNXGiaUr755ZYKqap+ijlcp2JT3EjsDt2o8+1PS+dl+dvkqlnpRKgEbWXuaslrUaPtiC0AKMhz56LqfiKAmFgw+VbYDsLUyqzf3VsZunfdyy9RmF0t/LlzW9Z4K/GPsoIu2C1spBKYIfbeGgRS+76W0VlYdGiGjf5tNacM+kQR5dmFTcExTzlju5ZgYOIqYtg60RL3dwcKuESuL1qlWxwbYYEQ/h0UMV1KtN5CxTl/xo5YrPuJAXaf7t22UNhb8jnmAEA/15b9mwJlUxfe73ZaXsPvRI1n7R4l50a8+d9HD3/yoRFPja5T5gegF07B/Xxr4AbUBmkafApirrb7uQL/RnOKdUU7oO9zUd5Ue8rHa9M1VgMDGbOwjaxQuUIlv0iPaObgz62/zNbH0Xql6X/giok6dGWNAgkJvS3GV3o/oVPzrmpUG6bizIFSlP4VvyjzRDytr9AD+Wgax+E7d7EhkBzBmv0hncx6mBOxpnr/1xpLkabiMBLXyXOWH9eb9Z0gYrklF3/dMj/UiSHnm5vWNYjTabF2Ei7vCvbFzxAw3PKNddddP62c2pbJEqrs30y7tohBpzEywxB27IDbx+dR6+w0N2/FWEbSYPvKWXIqaFKECjfhvAB7Usz5RXyzK2eJtJsLSjhawLQUxVNiy5k2CvB4mNdEVReYyTNSxo94Mkb03WeVu8NrSnXbEHIRMdIxGwCjFFJ8v8WUpq7JGaP2pHKh1LNh4rrPcBsIXQ3sdqkoKGjq+tYWwMi/cZC0rUmk9RXaLTO9JhiTu8K2nZqOwogU3r6/98VJjCUZTEgXWznEY4cXZfzJXI/Kl9bKfAFA4RdWy1vKOxJ0uIQHzykUP3iY/jFUsEPB6tcBS+zqksj4ZeiWTRlLtEhWEyrqK4okGQF48DF81DGiw77uxGQ5ebbtowd0DvashXDPlpLihe3eWkxCRBiYlPdc94KU3BB0UF23Y0vYN18pUtO6hsQ4yFamUgBxEm79hq/0s/f5ucCrZZUvlW+0Pcp4q+PIJDjMPtZluvG7e1etSoL9+38VJf00qMIR6VaBn88oez3320Y6ADCu/JIcfD9sbbiTwvBOll5O/GNu5TsDe88JBiwI4EtIBmQY72iIR3IU9SjpdPoiqEn4k0j6nl1E6x84h+qIsh+VCy9XvuDUvDS2AyIiaqRBtw/otjZJnNKbEYFVH1TJM7myc0/dchhvZUSsfJf2gn+DGkgHYFTyQEfNQGTeyVeAhV+o0AquykbkZ3PErwdS/k2iqQFcxlcp9MnLlMIKdLL7By+AZzPF/SPUOwOM7/zLBF26DG017Yiw1bvz59EQWtZtRq5m4pJ06ZqlbYictmMmQP45zPTB6TzOoj6ttRuTDAXVgazkFATbvg16yGVHr0OhN0DP4c39j3QsqmA92Ky+6tYlvQWfYVAqYTKjW58L3QYgyt435/oqNk0dPjIkz7wXQJFPAesoGZXJhjEo1GSJcbbke1SJC4rcBM2+Kw2Kk3TZdgjadwm+kfiR+kEAwR/lGxaqFYhD1RQ7dT24gRWEkHywWg1wgRMEe887KWPUepf4he6oYDHnTAPtgccCNnaXHAF/E6XI3Eet5N3H/A29N5JO8zbRRLzdui0nyEerI5LRoFv7OfmftWB+8AzkP8KePo5am1T1cHK4ktgOp8YhhZYbI7IygI965HzlaHBi4E8mdqIda8SuB/KoZLEvhiv03uTioLBNM9bOjB4gE+F2toTiIVAbFH2RI5EnHWlbpBFDUnXvc1xKcjkdbZIKfsk4pcuk6RcQq2D9LzApqc5miVcOJlhxmfAHIV3nLhCdCPcqphy1pnF2K6tYbMTBvCREXFQxvkceAJH+9kwKMotgZjGigZxA6634VYVV9cvIsW8G/8p2r0y7FZnxYoFzZwn0g16u5s1MvRilIws6g+srZWRmpw9HOsyGdZh3JXPCAwqsaXRzueUVdjIJcXkECE46jOQrXX07ES1nKU3x9PHLmdGWTkmbSU72jxr2I4bt960A0AmkZrJrvvVSkyvWbC+GPJBXej6yd9qWa7+NXkhe/cZ8U54lAch66xosCgf0yDBXBTDbFJfSzmpuF9QplYb5lnY5RCp9rHywa0fy0tn65QRpWhaC4mCpF2n5p4WJ+c656EozbCDxJt6JxFiMIg79mBJYv6LQF2Z+BTdzpxfudYfvb/CSkCy4mHFlGfZa6Z7Rk8dPmjXNLjyGDhAbBpQVe4gBPRxuw7bVqIO7i4V+zf11LIb7YkPq9Cw9uYvb3MwA6TLY4D+Sev1FNqpDREUGNZY+0m4ikWd3S8iRQnk+oNsikUm/rXEcWW4944yFDklL3+zoP9YJYxuU7Gj2/JMFJOEvsZyk8xpsv2kbY4NZefJz8JexoMvRGjTNEl0XfvSg7RycZKsvSLMLIvb82PNVgYx2bitVUWiHWS9bHRoFwDw99rrGSop5kr1k42RvM1YY078NWMIkUnMvQSLMumeNIXg8AVYS8TAnLpbfFMyVeSPsSjYB+U9i7gjwZEFXhHIi0Ua/kzQ2qS/Kjt30uQTz/rh+rKAnDF/8zvtuFQQlSFELGHqByAecadab6igbRzK08OIllyxRc/LCUH8bfKns3MN6L0JZQzw9UBgk265paoC1o4wyHeKxgtRmnM0wAJvcb3oaSOFkY9067nXdeJp/j5adZZnbFVNWJZrtdpbtWNbhUKNxDtM5+l6DP/X1Wnr4ZCgG+JlXxD7xjcofPGjh7DFtTu7RAmrIQkFdAR7h4diRopiDADDohJZE0J1hx16pfJXH87bMA/KY5hVZ4fGUupEgHa0Yros/GQRk5bxhAtMrZuUx3nkvKNYfz61dBAwvOF5AnX50W/J8ybkjyLvwiWcLEnkNEiffY+P7g+aDb+6sr+5dskF8MAJM3deI70FLsxsGn+y1IRzYNXqX1ym/OZW7yqRxz8vUaNCv3Fkh+YOCdVtLyNnWQoDzSAlONIdn8HMw5aRGtptc5b8oq28CNk5J+ND7PHgycTKsOEeQU8JUCWQm7SQUD2pKrOKYP3LCbdUbMwK80k78GwuwCob6ZRVNJmuMbAbihBbyGD+F7nFD5TdXVE50bZGxxazOpoAerDrKlNVW+MLOeAPA4ZI7tI8GQ51hH00Vt3cUhHjBUnnrzVXJYj5pbAjOhNZVhq7/mPOPwFBLf0AgECKABGpf2TF9T+Rhvid/7/FUwm/5LASCc8C9dt1WoHQWNMVoRXFBbwYAvi3pr1nkhUz5FtYzcHpKUmkRWs3LgEutWSlUMyjKDUx1WGN3Wvk3aR4I4BSjpqcOscJS6fKXUViVlKT+yfjjFP14QXz5l+dT1p0XcssWF2CNgtov+RuFsaEQ7lkOp90F2dSKYqOcBQH00AGqgvU4QW1GkZzkWakAj7va2+hrH7M7g3ClendtT4ehMHWgQVqRci+wmb4ArLy9ALS0RtHJYEsZKxVGTdt/i7wSxWFVIIMgRCfD07dtFkkw5Y5qKyl4Q2bQ2gLIEBuOdqtOdvEINOscgxgH7gDJuJU8+f4LgxjuHn4hLv4PY2bfZM67d787BYZ4zcZLa0fApfCHIhkyKz7eR+YNcXZvIRyfarqkEag/Lx9K/hEtCrS0oGyoFDh2egRbrb7ce0zApma7yuD4ntOwqdempySNpUAKbO+0KF9S6vTbRN7PVU35yoc2c4hukhqEkqIXqZ7hNg3Sre8pMiniIQA5bUCa4D4XfhHn/U7/KH9RQi3nLt4xMUA2jqCB5ooE3xeNXMWWoUYn6QBQCFEZEw5edysPJgXXkLxKLL88pJmG+V08cWOvE/nO11aA33ldzy8rgnT7dvxtdG/RAG/mKuh4jHKbcXp/rcZK5Q0zPTaxnpUgCWXfqCrwgEv6PZrVoWLtP0nj4XESoOLrIJMMkxytu/xmSURCqGxuS8YP2jqxFIXVaJyWK3BoFqPz68L826KNdgvziWNDoypTNX20/+DPIViGCoJ36TXtCtIV/v+MDIfJPx9ESDdU4hLI1ZhC3Gc6UJOPRQIbPd+S8c6xJBzbPiQDFHmuGyZjbvGZ1GfytD5NQ8rrI5VUoo72M6baIY/i65KZiCZQm8zb8p7SPiU0QYM8NE0XZcG0xTOBW9pxwoUGRgF5jQRmxwryCvswLoXK/bb4PVHqO5Lqc5WEhvm299nO+8+9hEL4loYkkeVagYup1QOhJ4mC9dBPa9tEVQqy20tHHlL49gDVI8JgnA8fgojY79O4I0QFdREzOw8A/hKtK+m0iRAag9jzlY7JE3BmFgSm5dAB/O+goNv2CA6XGHL8d4ute3COCsFAbqJmpuubYuuiKpvDjTYKF3ue5kULESlNtRHCvdLb5WFAgzIZfKtZs+7kPAv40KGNeQjf8f6g4MUxK6n6hAIxDvfC7rCWWCJRpWK9tYEh/i0LpouSG8dkM6nn5PXAx6USXaXEn+dXWyri3Oi8x75frNs2x1IxITKUx9BG6/ZQ7S0pg85buwv4dvqESZZ70Wq156Zbth57tGUuLfMV5XgXcEO5AqCNkjAYWYsYAA16erc134XyqOE8OACtbuPHWrwmGTDlTaaPSKT++B7GETxMDdbggSp3gbhrx3K6zszAqRYUrj7xdL72OVarHHaXi0mrYn5Oq6wH5FqzXjLczQkfbVw48kdwGLjJzvGDn+vAPobSBbLF1T81RG/HyqkiP8NCzXr3C9Bt5rL+jwMlOb+r+bO9FgcI4nvS+vrt0ZBVtRqOtZP/+L0+jJ7VKwWCdotB/blaV4i+MkrRUwfPWsAzqjSz8Cl1zPCEh53CUigQr0HE1n9rwdfcecCc85briGb9l38/qZNDE//hSJlzSSKMd0L3Afvr7HEUf17oTQ+QXcLdYLKaflQyQI6YKwxw1vxSCXaaQRhXXJiqBd/XOLuaip7EsUbWofp14jpjVShM5NrMTUY9FUl++ZIMpYS1jWdXukm7uQgkj7T+g5llVmIhRbzUwipvMhu1v14VfF+5C5qe7iS1TiZoVMivia0qzTYbSrjHhJQ58OVTjtk7H/9nF5E3mpc4mOjTN4HGAbHb2tOOPOVWtT1rxHHfTx+tOAR5mltXXailIgflwmEYOoDuQ+DsBeU1AH45fsiZVIYgWkC9xWQ48i9qRqPSMXJOaBgPCrPno7D+X6GtFLpYt5rwbAcSGCfm8CZGu4dPUV1kB1X7YTUQp49CYk4+GcRfq5w7Y8GoW+N2nw8BUbA3+fDMl64Pt/dXG+rd95e1hefnrQoQu5Qu7ENuPbg7YMBn8AVbv9nIvKb8OQSm/1ViIP4QaXldN+TyRgSvij9AzE2FuKObd22rfQipGrdHVLTO8Aqs6lKDM0bOiFzqO9eCI/8rsPtj6K0dDuXLOhU06ISiXemYIpRs9MerSiCqemPOBw8pAVIj6G91G6qeDKFUMYnzQVDvGIudJqgpMgwOVPLEI84q1xkxqEr0ScNfn2cDRfSyMbLHNO01CWrw4H7vn7LCAHMLCHo3m58Ryr+ivDvPKSd2DpMzW8/L09i7zesFjTdzf4ZnRZVhFg9mUSbZRURO47O9z8batr3fxLC0/W4focT/yGFAOrr4V/54dihv102FqgtEvFBzYxP1A2eIjon3xmT4cqI2FSnZ1NrWpiWjR4dg2J49mjrRFNaBstncts2AHUMq+2Tf2p9EBJv8ZT9YxadxtKhmTwLapIzEuzXXOTqr4OFoNE80aZnbrBD/Va2C4NS4QPZZMbNYvnmSWfQ6dwbIDHylGdcHdjzQFsxPh20MLOdVumlIt6oJCP2GW4rep62lv9TxpLBRV26jzzkGkLG3HqPm+5DvT96hTKyrhnhz4JRxh45n9shK0KkXDgebX4+GJz10gzFdR8WqzCnt0SDM5/pO2SbZ45sEi1SfII2/VHgQNv+zon6xgX0aVV+4Yhe8GhmW7ebpzWnE+uKOjvviL/03kkR4lycZwO5wn6N2ypQbyXK10XkAZBpFuOgMo7Xs4HL9spkmOzG1NP4zSXll/c9z5Y+IHlnL0mBSZWXZuQKh+hCvZI9/7nbO0e4n02n+rBIcdre4wlR3F3M0gZi54FRd81gEbXagwZELZq22e/4s+dJwM8aSAjiOWR6Ryn5dQubD8ftCc20yGpWi2YJ2S3GyAkU7zkY4638jO/s1fO0hEFMbxvhYvh/xfck3jumW3a5cKcB+UznV3BrBaf8pf9j/kV790/mqxHJbHJclN8jIeExfo2RdHLRAfgYr3JU8PxqxbX8PnCdsbjp97X/veI/Rf4A5myAnT/L6NufaSPxb/nQgDHuxjKqvh7evGLiQVwVLPvcHwYjS6ZND75GKutWkFvkihMNFTSrmDVm0liTxe1Vy7eml7uRhD6dImOjLiTNoGJgvq+G0dS5THEKENSYxdKfUJ7tyILf1JeMk9+pKhbZ0Vdr/nWYdaQ6w1fVCqxk6XOz5QpziwuSc9n+rsdnuWUebrXAecWyiqMZPjB13cI6n4t39recfYNLj4SwKUtalOFO8082oo9s8ztyujC4mangF/0mRXNLr0V6H1gKjLCOh2AXzClT6jbARtgZ8uBgBBQw", z2);
                    if (a.b()) {
                        a.a("VywbbfxE2QuRqZ5xcIwapO7AdSzfVaSWnmJxmUg+0adJ3QBAH5P7EgXr1uzyY+u6", "JgKAyQW0PWqOrZHk4ZNT0IJH02FdSWTXOOjBnF9RRok=", Context.class);
                        a.a("yzGxsS8IwfgINPYaD3TFRjRVH+0Pq4QvVGq15MBf/opCBPnlCr4QHvEcReKXEMs7", "kMEgIGkHy2R1ROJUgud//6gDu/wM35rLhA6gUKrjKq0=", Context.class);
                        a.a("notQcG55r2oh2A1cS/dLfKg9hawk3H86BF0iXzU7AAnhYpfHWl9mq3lZzdkAltxm", "U9ntf5BvZUTabci6TosC4bQNHZ+DOrzvRmpSy4CzkoQ=", Context.class);
                        a.a("2GI4cQuNT2V9TGPC/Z2McvgqRAU80qquJKbm0BMTxLR8WwMEgJwPEKdGCxKNxeUN", "1Kj5K8xXQ2YA9zbG2Rm9FzZtUD9R2drVmZXzLVF7uLA=", Context.class);
                        a.a("ZsnUMRH5gS7aUE0TqnSYS8JWwJCKCL7bH7XFSqbI4dWEEyg2o14AuyyBvtsnwc4D", "SFchXCfZXuuDAwXfTJDosXRUHrZZ0v26SJChYX3rL/o=", Context.class);
                        a.a("lMH30ZU/uP5xaOsdIj/K3/wZfVr7hnOzUHjpO1NWhTJQvW+gY38/OvCWA8Ap4ZOf", "FCjXGcebz7gnog9LMAWyd/isayIV3I84uK1cUtHZ2fI=", Context.class);
                        a.a("oWVj3eW9lsJMixyFq7g0kyuRqYP087mdDp4dCL3paE/7Ut3Ewp3IcEq6P10MPRyy", "siNRngHYHRLjixmg2PEX5OdKhRHe1h8DNRpJp4wC0pk=", Context.class);
                        a.a("yATd8qneW4MlwQIx8jIN6cfiWJ28/zOw6vW7xs0IWvNvim2a85v5X4ZiVD1KK9hX", "0wjmexcQnona3bxO7Nd7FrKMEEoBhOp7s6KivBhMQKU=", Context.class);
                        a.a("Qplw2pUqnSpmThNy4cjVdvqrjxx/9Z0jyK1w8BPQVMfA35eh0MC7cXEA3u5Xkcuj", "JqjJogq0azQ/rErdMQn/B0NsEhrIRbxY2b3jvD0/vE8=", MotionEvent.class, DisplayMetrics.class);
                        a.a("I8ATAvvv3zdNeDvmT5gQ/ekfiNEF+bBdZZ3FGipPSiGHOLI4yQdK3XpX6xFRuejz", "SRWP8PeqaQflId3WUP9WJTho9Un3bF1tLB8c7UP1Ruo=", MotionEvent.class, DisplayMetrics.class, Integer.TYPE);
                        a.a("HYkEKMk8dvMdQrlbFR00sh73U7jSOxxrrxd0BhHmEXYlIfEqe1EzBQsw2kucbDs8", "puD1TaAJX/qcP/8PMgKROAswM+eaSDu4sTUEXpqs2fU=", new Class[0]);
                        a.a("8Hx2xRqW2QZDPiXj7EKgQgzecg5taNOrZe4YkZ9zi7FcQAOy1BO0rYbAdBI9x6Pm", "nJw4XP5tQfSQ6wm+0x6UMq5j2kNiUh+TXa92gyyhaOo=", new Class[0]);
                        a.a("4w5pMN4cUsuXvD3CJ7PKPSwMmWPClIaNSjeM6jtHahV40Q7EiLps1VIbOcEaCSp4", "5XuSFVTSxDkE27CIZHrBIXal5K53Dv1J/UFXKGBFAXY=", new Class[0]);
                        a.a("igTfSDGbP3Q2KSYfnqAL0vFW/zSSX6v+f+5s7NdwuKQgo6M7dQVerLATgNETrLAr", "Wz4eX479PrQ8rGu0gkJoEYqOJ2Dr8sAHE85KoBBz7s4=", new Class[0]);
                        a.a("BiRNVQ0aQHyQJTXKNLbpSFJJy6+rG5ICwTiWxRhS6qdZjM6S9BBOaVfdO1b0Kd8E", "z9Ycw/7CJTzBzg6MPXNZ2oLMXcxWzT8qsF0ig0ITUxc=", new Class[0]);
                        a.a("2glehmg5UKxyaNPdnG06BLa5QbEzBADKVm3lYiT3+JTkguRZEzOA9BDahqC4W8ki", "wM87KVhGHShMaqkZWTxt04VnU6kJHrMxqQyksEW6glI=", new Class[0]);
                        a.a("DGPkHpN6F5DQjFiQDfOpLUfwAMooIPhSFT4YA2aSEj+k+u5Kt4pQoimNrK0aCsHP", "V/2NrZQU5cdFMpqYa0Q9vKRizJ0aHS7vWXQS8vp0qlI=", Context.class, Boolean.TYPE);
                        a.a("hoZ4RlhPWT5MX/I+m/lUD5aYJ9aPmEb2eUGLaeSBLBDs9eDpXoNNJPm6j1dXVkvA", "Z7StFiuQ59x4y88apmlBJn3lPoWOEnuqoEhP2AVUL8A=", StackTraceElement[].class);
                        a.a("peD/v7hHRn46N2uI0dQKpTtMr7rKDQ+Rzb4yluPWMw4TUUwj2SFV9GkdTp0kog66", "XxfDY0AzBkt4iSC5Sim2fww10jQc1evowDldz5+caY4=", View.class, DisplayMetrics.class);
                        a.a("cINMMi7uKicDN2DHSf1rHdgax7DU+CM2mIG3cRQw3SI0nkdhPwdVz1PCbewJpJoO", "VWQmr3p+wsDJ15H20t2tLb975qLEArv8gtHgpBQKEOE=", Context.class, Boolean.TYPE);
                        a.a("6qQh+8GAMu6fM86JkRzoeHiiHD67+MgHO4xhhwcbyPT7CQmAN57q8YytJQRqDjU5", "Qrc1hPZgr+QjlmQtpbdJO1QCxqr2PdTRKIIDeDNdHp8=", View.class, Activity.class);
                        a.a("HBbZPURZUWU/TDYIx99LmOTdgpFP2mdidp6Zk4sZdEVCGaQNYtmNlQBCP3rgXOne", "pdXBsPFh4N2rQp3r0gjTSQiWtas1GOGaKulNSciQTj0=", Long.TYPE);
                    }
                    t = a;
                }
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    public final long a(StackTraceElement[] stackTraceElementArr) {
        Method a = t.a("hoZ4RlhPWT5MX/I+m/lUD5aYJ9aPmEb2eUGLaeSBLBDs9eDpXoNNJPm6j1dXVkvA", "Z7StFiuQ59x4y88apmlBJn3lPoWOEnuqoEhP2AVUL8A=");
        if (a == null || stackTraceElementArr == null) {
            throw new yg();
        }
        try {
            return new yh((String) a.invoke((Object) null, new Object[]{stackTraceElementArr})).a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new yg(e);
        }
    }

    /* access modifiers changed from: protected */
    public final pb a(Context context, View view, Activity activity) {
        List list;
        pb pbVar = new pb();
        if (!TextUtils.isEmpty(this.w)) {
            pbVar.b = this.w;
        }
        yj b = b(context, this.q);
        if (!b.b()) {
            pbVar.k = 16384L;
            list = Arrays.asList(new Callable[]{new afe(b, pbVar)});
        } else {
            try {
                yy a = a(b, this.a, this.p);
                pbVar.g = a.a;
                pbVar.h = a.b;
                pbVar.i = a.c;
                if (this.o) {
                    pbVar.u = a.d;
                    pbVar.v = a.e;
                }
            } catch (yg e) {
            }
            pd pdVar = new pd();
            if (this.c > 0 && zz.a(this.p)) {
                int intValue = ((Integer) app.f().a(asw.bu)).intValue();
                pdVar.m = Long.valueOf(zz.a(this.j, intValue, this.p));
                if (((Boolean) app.f().a(asw.bv)).booleanValue()) {
                    pdVar.n = Long.valueOf(zz.a((double) (this.m - this.k), intValue, this.p));
                    pdVar.o = Long.valueOf(zz.a((double) (this.n - this.l), intValue, this.p));
                    pdVar.r = Long.valueOf(zz.a((double) this.k, intValue, this.p));
                    pdVar.s = Long.valueOf(zz.a((double) this.l, intValue, this.p));
                }
                if (((Boolean) app.f().a(asw.bw)).booleanValue() && this.o && this.a != null) {
                    long a2 = zz.a((double) (((this.k - this.m) + this.a.getRawX()) - this.a.getX()), intValue, this.p);
                    if (a2 != 0) {
                        pdVar.p = Long.valueOf(a2);
                    }
                    long a3 = zz.a((double) (((this.l - this.n) + this.a.getRawY()) - this.a.getY()), intValue, this.p);
                    if (a3 != 0) {
                        pdVar.q = Long.valueOf(a3);
                    }
                }
            }
            try {
                yy b2 = b(this.a);
                pdVar.a = b2.a;
                pdVar.b = b2.b;
                pdVar.t = b2.l;
                pdVar.u = b2.m;
                pdVar.h = b2.c;
                if (this.o) {
                    pdVar.c = b2.e;
                    pdVar.e = b2.d;
                    pdVar.g = Integer.valueOf(b2.f.longValue() != 0 ? 1 : 0);
                    if (this.d > 0) {
                        pdVar.d = zz.a(this.p) ? Long.valueOf(Math.round(((double) this.i) / ((double) this.d))) : null;
                        pdVar.f = Long.valueOf(Math.round(((double) this.h) / ((double) this.d)));
                    }
                    pdVar.j = b2.i;
                    pdVar.i = b2.j;
                    pdVar.k = Integer.valueOf(b2.k.longValue() != 0 ? 1 : 0);
                }
            } catch (yg e2) {
            }
            if (this.g > 0) {
                pdVar.l = Long.valueOf(this.g);
            }
            pbVar.K = pdVar;
            if (this.c > 0) {
                pbVar.y = Long.valueOf(this.c);
            }
            if (this.d > 0) {
                pbVar.x = Long.valueOf(this.d);
            }
            if (this.e > 0) {
                pbVar.w = Long.valueOf(this.e);
            }
            if (this.f > 0) {
                pbVar.z = Long.valueOf(this.f);
            }
            try {
                int size = this.b.size() - 1;
                if (size > 0) {
                    pbVar.L = new pd[size];
                    for (int i = 0; i < size; i++) {
                        yy a4 = a(t, (MotionEvent) this.b.get(i), this.p);
                        pd pdVar2 = new pd();
                        pdVar2.a = a4.a;
                        pdVar2.b = a4.b;
                        pbVar.L[i] = pdVar2;
                    }
                }
            } catch (yg e3) {
                pbVar.L = null;
            }
            ArrayList arrayList = new ArrayList();
            if (b.c() != null) {
                int n = b.n();
                arrayList.add(new afe(b, pbVar));
                arrayList.add(new afh(b, "4w5pMN4cUsuXvD3CJ7PKPSwMmWPClIaNSjeM6jtHahV40Q7EiLps1VIbOcEaCSp4", "5XuSFVTSxDkE27CIZHrBIXal5K53Dv1J/UFXKGBFAXY=", pbVar, n, 1));
                arrayList.add(new afc(b, "HYkEKMk8dvMdQrlbFR00sh73U7jSOxxrrxd0BhHmEXYlIfEqe1EzBQsw2kucbDs8", "puD1TaAJX/qcP/8PMgKROAswM+eaSDu4sTUEXpqs2fU=", pbVar, v, n, 25));
                arrayList.add(new afb(b, "igTfSDGbP3Q2KSYfnqAL0vFW/zSSX6v+f+5s7NdwuKQgo6M7dQVerLATgNETrLAr", "Wz4eX479PrQ8rGu0gkJoEYqOJ2Dr8sAHE85KoBBz7s4=", pbVar, n, 44));
                arrayList.add(new afg(b, "ZsnUMRH5gS7aUE0TqnSYS8JWwJCKCL7bH7XFSqbI4dWEEyg2o14AuyyBvtsnwc4D", "SFchXCfZXuuDAwXfTJDosXRUHrZZ0v26SJChYX3rL/o=", pbVar, n, 12));
                arrayList.add(new afi(b, "lMH30ZU/uP5xaOsdIj/K3/wZfVr7hnOzUHjpO1NWhTJQvW+gY38/OvCWA8Ap4ZOf", "FCjXGcebz7gnog9LMAWyd/isayIV3I84uK1cUtHZ2fI=", pbVar, n, 3));
                arrayList.add(new aff(b, "BiRNVQ0aQHyQJTXKNLbpSFJJy6+rG5ICwTiWxRhS6qdZjM6S9BBOaVfdO1b0Kd8E", "z9Ycw/7CJTzBzg6MPXNZ2oLMXcxWzT8qsF0ig0ITUxc=", pbVar, n, 22));
                arrayList.add(new afa(b, "2GI4cQuNT2V9TGPC/Z2McvgqRAU80qquJKbm0BMTxLR8WwMEgJwPEKdGCxKNxeUN", "1Kj5K8xXQ2YA9zbG2Rm9FzZtUD9R2drVmZXzLVF7uLA=", pbVar, n, 5));
                arrayList.add(new afp(b, "oWVj3eW9lsJMixyFq7g0kyuRqYP087mdDp4dCL3paE/7Ut3Ewp3IcEq6P10MPRyy", "siNRngHYHRLjixmg2PEX5OdKhRHe1h8DNRpJp4wC0pk=", pbVar, n, 48));
                arrayList.add(new aew(b, "yATd8qneW4MlwQIx8jIN6cfiWJ28/zOw6vW7xs0IWvNvim2a85v5X4ZiVD1KK9hX", "0wjmexcQnona3bxO7Nd7FrKMEEoBhOp7s6KivBhMQKU=", pbVar, n, 49));
                arrayList.add(new afm(b, "2glehmg5UKxyaNPdnG06BLa5QbEzBADKVm3lYiT3+JTkguRZEzOA9BDahqC4W8ki", "wM87KVhGHShMaqkZWTxt04VnU6kJHrMxqQyksEW6glI=", pbVar, n, 51));
                arrayList.add(new afl(b, "hoZ4RlhPWT5MX/I+m/lUD5aYJ9aPmEb2eUGLaeSBLBDs9eDpXoNNJPm6j1dXVkvA", "Z7StFiuQ59x4y88apmlBJn3lPoWOEnuqoEhP2AVUL8A=", pbVar, n, 45, new Throwable().getStackTrace()));
                arrayList.add(new afq(b, "peD/v7hHRn46N2uI0dQKpTtMr7rKDQ+Rzb4yluPWMw4TUUwj2SFV9GkdTp0kog66", "XxfDY0AzBkt4iSC5Sim2fww10jQc1evowDldz5+caY4=", pbVar, n, 57, view));
                if (((Boolean) app.f().a(asw.br)).booleanValue()) {
                    arrayList.add(new afk(b, "cINMMi7uKicDN2DHSf1rHdgax7DU+CM2mIG3cRQw3SI0nkdhPwdVz1PCbewJpJoO", "VWQmr3p+wsDJ15H20t2tLb975qLEArv8gtHgpBQKEOE=", pbVar, n, 61));
                }
                if (((Boolean) app.f().a(asw.bs)).booleanValue()) {
                    arrayList.add(new aev(b, "6qQh+8GAMu6fM86JkRzoeHiiHD67+MgHO4xhhwcbyPT7CQmAN57q8YytJQRqDjU5", "Qrc1hPZgr+QjlmQtpbdJO1QCxqr2PdTRKIIDeDNdHp8=", pbVar, n, 62, view, activity));
                }
                if (((Boolean) app.f().a(asw.bt)).booleanValue()) {
                    arrayList.add(new afn(b, "HBbZPURZUWU/TDYIx99LmOTdgpFP2mdidp6Zk4sZdEVCGaQNYtmNlQBCP3rgXOne", "pdXBsPFh4N2rQp3r0gjTSQiWtas1GOGaKulNSciQTj0=", pbVar, n, 53, this.z));
                }
            }
            list = arrayList;
        }
        a((List<Callable<Void>>) list);
        return pbVar;
    }

    /* access modifiers changed from: protected */
    public final pb a(Context context, oy oyVar) {
        pb pbVar = new pb();
        if (!TextUtils.isEmpty(this.w)) {
            pbVar.b = this.w;
        }
        yj b = b(context, this.q);
        if (b.c() != null) {
            a(a(b, pbVar, (oy) null));
        }
        return pbVar;
    }

    /* access modifiers changed from: protected */
    public List<Callable<Void>> a(yj yjVar, pb pbVar, oy oyVar) {
        int n = yjVar.n();
        ArrayList arrayList = new ArrayList();
        if (!yjVar.b()) {
            pbVar.k = 16384L;
            return arrayList;
        }
        arrayList.add(new aey(yjVar, "DGPkHpN6F5DQjFiQDfOpLUfwAMooIPhSFT4YA2aSEj+k+u5Kt4pQoimNrK0aCsHP", "V/2NrZQU5cdFMpqYa0Q9vKRizJ0aHS7vWXQS8vp0qlI=", pbVar, n, 27, oyVar));
        ArrayList arrayList2 = arrayList;
        arrayList2.add(new afc(yjVar, "HYkEKMk8dvMdQrlbFR00sh73U7jSOxxrrxd0BhHmEXYlIfEqe1EzBQsw2kucbDs8", "puD1TaAJX/qcP/8PMgKROAswM+eaSDu4sTUEXpqs2fU=", pbVar, v, n, 25));
        arrayList.add(new afh(yjVar, "4w5pMN4cUsuXvD3CJ7PKPSwMmWPClIaNSjeM6jtHahV40Q7EiLps1VIbOcEaCSp4", "5XuSFVTSxDkE27CIZHrBIXal5K53Dv1J/UFXKGBFAXY=", pbVar, n, 1));
        arrayList.add(new afj(yjVar, "notQcG55r2oh2A1cS/dLfKg9hawk3H86BF0iXzU7AAnhYpfHWl9mq3lZzdkAltxm", "U9ntf5BvZUTabci6TosC4bQNHZ+DOrzvRmpSy4CzkoQ=", pbVar, n, 31));
        arrayList.add(new afo(yjVar, "8Hx2xRqW2QZDPiXj7EKgQgzecg5taNOrZe4YkZ9zi7FcQAOy1BO0rYbAdBI9x6Pm", "nJw4XP5tQfSQ6wm+0x6UMq5j2kNiUh+TXa92gyyhaOo=", pbVar, n, 33));
        arrayList.add(new aex(yjVar, "yzGxsS8IwfgINPYaD3TFRjRVH+0Pq4QvVGq15MBf/opCBPnlCr4QHvEcReKXEMs7", "kMEgIGkHy2R1ROJUgud//6gDu/wM35rLhA6gUKrjKq0=", pbVar, n, 29));
        arrayList.add(new afa(yjVar, "2GI4cQuNT2V9TGPC/Z2McvgqRAU80qquJKbm0BMTxLR8WwMEgJwPEKdGCxKNxeUN", "1Kj5K8xXQ2YA9zbG2Rm9FzZtUD9R2drVmZXzLVF7uLA=", pbVar, n, 5));
        arrayList.add(new afg(yjVar, "ZsnUMRH5gS7aUE0TqnSYS8JWwJCKCL7bH7XFSqbI4dWEEyg2o14AuyyBvtsnwc4D", "SFchXCfZXuuDAwXfTJDosXRUHrZZ0v26SJChYX3rL/o=", pbVar, n, 12));
        arrayList.add(new afi(yjVar, "lMH30ZU/uP5xaOsdIj/K3/wZfVr7hnOzUHjpO1NWhTJQvW+gY38/OvCWA8Ap4ZOf", "FCjXGcebz7gnog9LMAWyd/isayIV3I84uK1cUtHZ2fI=", pbVar, n, 3));
        arrayList.add(new afb(yjVar, "igTfSDGbP3Q2KSYfnqAL0vFW/zSSX6v+f+5s7NdwuKQgo6M7dQVerLATgNETrLAr", "Wz4eX479PrQ8rGu0gkJoEYqOJ2Dr8sAHE85KoBBz7s4=", pbVar, n, 44));
        arrayList.add(new aff(yjVar, "BiRNVQ0aQHyQJTXKNLbpSFJJy6+rG5ICwTiWxRhS6qdZjM6S9BBOaVfdO1b0Kd8E", "z9Ycw/7CJTzBzg6MPXNZ2oLMXcxWzT8qsF0ig0ITUxc=", pbVar, n, 22));
        arrayList.add(new afp(yjVar, "oWVj3eW9lsJMixyFq7g0kyuRqYP087mdDp4dCL3paE/7Ut3Ewp3IcEq6P10MPRyy", "siNRngHYHRLjixmg2PEX5OdKhRHe1h8DNRpJp4wC0pk=", pbVar, n, 48));
        arrayList.add(new aew(yjVar, "yATd8qneW4MlwQIx8jIN6cfiWJ28/zOw6vW7xs0IWvNvim2a85v5X4ZiVD1KK9hX", "0wjmexcQnona3bxO7Nd7FrKMEEoBhOp7s6KivBhMQKU=", pbVar, n, 49));
        arrayList.add(new afm(yjVar, "2glehmg5UKxyaNPdnG06BLa5QbEzBADKVm3lYiT3+JTkguRZEzOA9BDahqC4W8ki", "wM87KVhGHShMaqkZWTxt04VnU6kJHrMxqQyksEW6glI=", pbVar, n, 51));
        if (((Boolean) app.f().a(asw.br)).booleanValue()) {
            arrayList.add(new afk(yjVar, "cINMMi7uKicDN2DHSf1rHdgax7DU+CM2mIG3cRQw3SI0nkdhPwdVz1PCbewJpJoO", "VWQmr3p+wsDJ15H20t2tLb975qLEArv8gtHgpBQKEOE=", pbVar, n, 61));
        }
        return arrayList;
    }

    public final void a(View view) {
        if (((Boolean) app.f().a(asw.bt)).booleanValue()) {
            if (this.z == null) {
                this.z = new acb(t, view);
            } else {
                this.z.a(view);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final yy b(MotionEvent motionEvent) {
        Method a = t.a("I8ATAvvv3zdNeDvmT5gQ/ekfiNEF+bBdZZ3FGipPSiGHOLI4yQdK3XpX6xFRuejz", "SRWP8PeqaQflId3WUP9WJTho9Un3bF1tLB8c7UP1Ruo=");
        if (a == null || motionEvent == null) {
            throw new yg();
        }
        try {
            return new yy((String) a.invoke((Object) null, new Object[]{motionEvent, this.p, app.f().a(asw.bu)}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new yg(e);
        }
    }
}
