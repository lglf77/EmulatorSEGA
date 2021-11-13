package com.google.android.gms.internal;

final class aja {
    static String a(age age) {
        ajb ajb = new ajb(age);
        StringBuilder sb = new StringBuilder(ajb.a());
        for (int i = 0; i < ajb.a(); i++) {
            byte a = ajb.a(i);
            switch (a) {
                case 7:
                    sb.append("\\a");
                    break;
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append("\\t");
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                case 11:
                    sb.append("\\v");
                    break;
                case 12:
                    sb.append("\\f");
                    break;
                case 13:
                    sb.append("\\r");
                    break;
                case 34:
                    sb.append("\\\"");
                    break;
                case 39:
                    sb.append("\\'");
                    break;
                case 92:
                    sb.append("\\\\");
                    break;
                default:
                    if (a >= 32 && a <= 126) {
                        sb.append((char) a);
                        break;
                    } else {
                        sb.append('\\');
                        sb.append((char) (((a >>> 6) & 3) + 48));
                        sb.append((char) (((a >>> 3) & 7) + 48));
                        sb.append((char) ((a & 7) + 48));
                        break;
                    }
            }
        }
        return sb.toString();
    }
}
