package com.google.android.gms.internal;

import android.webkit.ConsoleMessage;

final /* synthetic */ class of {
    static final /* synthetic */ int[] a = new int[ConsoleMessage.MessageLevel.values().length];

    static {
        try {
            a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
