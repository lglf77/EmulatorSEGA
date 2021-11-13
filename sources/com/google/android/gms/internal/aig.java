package com.google.android.gms.internal;

import com.google.android.gms.internal.ahc;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class aig {
    static String a(aid aid, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(str);
        a(aid, sb, 0);
        return sb.toString();
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void a(aid aid, StringBuilder sb, int i) {
        boolean booleanValue;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : aid.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String replaceFirst : treeSet) {
            String replaceFirst2 = replaceFirst.replaceFirst("get", "");
            if (replaceFirst2.endsWith("List") && !replaceFirst2.endsWith("OrBuilderList")) {
                String valueOf = String.valueOf(replaceFirst2.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(replaceFirst2.substring(1, replaceFirst2.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                String valueOf3 = String.valueOf(replaceFirst2);
                Method method2 = (Method) hashMap.get(valueOf3.length() != 0 ? "get".concat(valueOf3) : new String("get"));
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i, a(concat), ahc.a(method2, (Object) aid, new Object[0]));
                }
            }
            String valueOf4 = String.valueOf(replaceFirst2);
            if (((Method) hashMap2.get(valueOf4.length() != 0 ? "set".concat(valueOf4) : new String("set"))) != null) {
                if (replaceFirst2.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(replaceFirst2.substring(0, replaceFirst2.length() - 5));
                    if (hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(replaceFirst2.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(replaceFirst2.substring(1));
                String concat2 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                String valueOf8 = String.valueOf(replaceFirst2);
                Method method3 = (Method) hashMap.get(valueOf8.length() != 0 ? "get".concat(valueOf8) : new String("get"));
                String valueOf9 = String.valueOf(replaceFirst2);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? "has".concat(valueOf9) : new String("has"));
                if (method3 != null) {
                    Object a = ahc.a(method3, (Object) aid, new Object[0]);
                    if (method4 == null) {
                        booleanValue = !(a instanceof Boolean ? !((Boolean) a).booleanValue() : a instanceof Integer ? ((Integer) a).intValue() == 0 : a instanceof Float ? (((Float) a).floatValue() > 0.0f ? 1 : (((Float) a).floatValue() == 0.0f ? 0 : -1)) == 0 : a instanceof Double ? (((Double) a).doubleValue() > 0.0d ? 1 : (((Double) a).doubleValue() == 0.0d ? 0 : -1)) == 0 : a instanceof String ? a.equals("") : a instanceof age ? a.equals(age.a) : a instanceof aid ? a == ((aid) a).n() : a instanceof Enum ? ((Enum) a).ordinal() == 0 : false);
                    } else {
                        booleanValue = ((Boolean) ahc.a(method4, (Object) aid, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        a(sb, i, a(concat2), a);
                    }
                }
            }
        }
        if (aid instanceof ahc.d) {
            Iterator<Map.Entry<Object, Object>> b = ((ahc.d) aid).d.b();
            if (b.hasNext()) {
                b.next().getKey();
                throw new NoSuchMethodError();
            }
        }
        if (((ahc) aid).b != null) {
            ((ahc) aid).b.a(sb, i);
        }
    }

    static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                a(sb, i, str, a);
            }
            return;
        }
        sb.append(10);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"").append(aja.a(age.a((String) obj))).append('\"');
        } else if (obj instanceof age) {
            sb.append(": \"").append(aja.a((age) obj)).append('\"');
        } else if (obj instanceof ahc) {
            sb.append(" {");
            a((ahc) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        } else {
            sb.append(": ").append(obj.toString());
        }
    }
}
