package com.google.android.gms.common.util;

import java.util.regex.Pattern;

public final class m {
    private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
