package android.support.v4.c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class e<K, V> {
    e<K, V>.b b;
    e<K, V>.c c;
    e<K, V>.e d;

    final class a<T> implements Iterator<T> {
        final int a;
        int b;
        int c;
        boolean d = false;

        a(int i) {
            this.a = i;
            this.b = e.this.a();
        }

        public boolean hasNext() {
            return this.c < this.b;
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T a2 = e.this.a(this.c, this.a);
            this.c++;
            this.d = true;
            return a2;
        }

        public void remove() {
            if (!this.d) {
                throw new IllegalStateException();
            }
            this.c--;
            this.b--;
            this.d = false;
            e.this.a(this.c);
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a2 = e.this.a();
            for (Map.Entry entry : collection) {
                e.this.a(entry.getKey(), entry.getValue());
            }
            return a2 != e.this.a();
        }

        public void clear() {
            e.this.c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = e.this.a(entry.getKey());
            if (a2 >= 0) {
                return c.a(e.this.a(a2, 1), entry.getValue());
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return e.a(this, obj);
        }

        public int hashCode() {
            int a2 = e.this.a() - 1;
            int i = 0;
            while (a2 >= 0) {
                Object a3 = e.this.a(a2, 0);
                Object a4 = e.this.a(a2, 1);
                a2--;
                i += (a4 == null ? 0 : a4.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return e.this.a() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return e.this.a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            e.this.c();
        }

        public boolean contains(Object obj) {
            return e.this.a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return e.a(e.this.b(), collection);
        }

        public boolean equals(Object obj) {
            return e.a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a2 = e.this.a() - 1; a2 >= 0; a2--) {
                Object a3 = e.this.a(a2, 0);
                i += a3 == null ? 0 : a3.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return e.this.a() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int a2 = e.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            e.this.a(a2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return e.b(e.this.b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return e.c(e.this.b(), collection);
        }

        public int size() {
            return e.this.a();
        }

        public Object[] toArray() {
            return e.this.b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return e.this.a(tArr, 0);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int a;
        int b;
        boolean c = false;

        d() {
            this.a = e.this.a() - 1;
            this.b = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.b++;
            this.c = true;
            return this;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!c.a(entry.getKey(), e.this.a(this.b, 0)) || !c.a(entry.getValue(), e.this.a(this.b, 1))) {
                    z = false;
                }
                return z;
            }
        }

        public K getKey() {
            if (this.c) {
                return e.this.a(this.b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.c) {
                return e.this.a(this.b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.b < this.a;
        }

        public int hashCode() {
            int i = 0;
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object a2 = e.this.a(this.b, 0);
            Object a3 = e.this.a(this.b, 1);
            int hashCode = a2 == null ? 0 : a2.hashCode();
            if (a3 != null) {
                i = a3.hashCode();
            }
            return i ^ hashCode;
        }

        public void remove() {
            if (!this.c) {
                throw new IllegalStateException();
            }
            e.this.a(this.b);
            this.b--;
            this.a--;
            this.c = false;
        }

        public V setValue(V v) {
            if (this.c) {
                return e.this.a(this.b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: android.support.v4.c.e$e  reason: collision with other inner class name */
    final class C0004e implements Collection<V> {
        C0004e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            e.this.c();
        }

        public boolean contains(Object obj) {
            return e.this.b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return e.this.a() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int b = e.this.b(obj);
            if (b < 0) {
                return false;
            }
            e.this.a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            int a2 = e.this.a();
            boolean z = false;
            while (i < a2) {
                if (collection.contains(e.this.a(i, 1))) {
                    e.this.a(i);
                    i--;
                    a2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int i = 0;
            int a2 = e.this.a();
            boolean z = false;
            while (i < a2) {
                if (!collection.contains(e.this.a(i, 1))) {
                    e.this.a(i);
                    i--;
                    a2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return e.this.a();
        }

        public Object[] toArray() {
            return e.this.b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return e.this.a(tArr, 1);
        }
    }

    e() {
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                z = false;
            }
            return z;
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    public static <K, V> boolean b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract V a(int i, V v);

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(K k, V v);

    public <T> T[] a(T[] tArr, int i) {
        int a2 = a();
        T[] tArr2 = tArr.length < a2 ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a2) : tArr;
        for (int i2 = 0; i2 < a2; i2++) {
            tArr2[i2] = a(i2, i);
        }
        if (tArr2.length > a2) {
            tArr2[a2] = null;
        }
        return tArr2;
    }

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> b();

    public Object[] b(int i) {
        int a2 = a();
        Object[] objArr = new Object[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    public Set<Map.Entry<K, V>> d() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }

    public Set<K> e() {
        if (this.c == null) {
            this.c = new c();
        }
        return this.c;
    }

    public Collection<V> f() {
        if (this.d == null) {
            this.d = new C0004e();
        }
        return this.d;
    }
}
