package com.google.android.gms.b;

import java.util.concurrent.Executor;

public abstract class d<TResult> {
    public abstract d<TResult> a(Executor executor, a aVar);

    public abstract d<TResult> a(Executor executor, b<? super TResult> bVar);

    public abstract boolean a();

    public abstract boolean b();

    public abstract TResult c();

    public abstract Exception d();
}
