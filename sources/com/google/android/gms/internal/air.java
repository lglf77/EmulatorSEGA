package com.google.android.gms.internal;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class air<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int a;
    /* access modifiers changed from: private */
    public List<aiw> b;
    /* access modifiers changed from: private */
    public Map<K, V> c;
    private boolean d;
    private volatile aiy e;
    private Map<K, V> f;

    private air(int i) {
        this.a = i;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    /* synthetic */ air(int i, ais ais) {
        this(i);
    }

    private final int a(K k) {
        int size = this.b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        int i2 = size;
        while (i <= i2) {
            int i3 = (i + i2) / 2;
            int compareTo2 = k.compareTo((Comparable) this.b.get(i3).getKey());
            if (compareTo2 < 0) {
                i2 = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i = i3 + 1;
            }
        }
        return -(i + 1);
    }

    static <FieldDescriptorType extends aha<FieldDescriptorType>> air<FieldDescriptorType, Object> a(int i) {
        return new ais(i);
    }

    /* access modifiers changed from: private */
    public final V c(int i) {
        e();
        V value = this.b.remove(i).getValue();
        if (!this.c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            this.b.add(new aiw(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    public final void e() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> f() {
        e();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            this.c = new TreeMap();
            this.f = ((TreeMap) this.c).descendingMap();
        }
        return (SortedMap) this.c;
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        e();
        int a2 = a(k);
        if (a2 >= 0) {
            return this.b.get(a2).setValue(v);
        }
        e();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
        int i = -(a2 + 1);
        if (i >= this.a) {
            return f().put(k, v);
        }
        if (this.b.size() == this.a) {
            aiw remove = this.b.remove(this.a - 1);
            f().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.b.add(i, new aiw(this, k, v));
        return null;
    }

    public void a() {
        if (!this.d) {
            this.c = this.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.c);
            this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
            this.d = true;
        }
    }

    public final Map.Entry<K, V> b(int i) {
        return this.b.get(i);
    }

    public final boolean b() {
        return this.d;
    }

    public final int c() {
        return this.b.size();
    }

    public void clear() {
        e();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.c.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.c.isEmpty() ? ait.a() : this.c.entrySet();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new aiy(this, (ais) null);
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof air)) {
            return super.equals(obj);
        }
        air air = (air) obj;
        int size = size();
        if (size != air.size()) {
            return false;
        }
        int c2 = c();
        if (c2 != air.c()) {
            return entrySet().equals(air.entrySet());
        }
        for (int i = 0; i < c2; i++) {
            if (!b(i).equals(air.b(i))) {
                return false;
            }
        }
        if (c2 != size) {
            return this.c.equals(air.c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        return a2 >= 0 ? this.b.get(a2).getValue() : this.c.get(comparable);
    }

    public int hashCode() {
        int c2 = c();
        int i = 0;
        for (int i2 = 0; i2 < c2; i2++) {
            i += this.b.get(i2).hashCode();
        }
        return this.c.size() > 0 ? this.c.hashCode() + i : i;
    }

    public V remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return c(a2);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    public int size() {
        return this.b.size() + this.c.size();
    }
}
