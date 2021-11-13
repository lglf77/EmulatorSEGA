package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class sd extends afu implements sb {
    sd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List<wo> a(re reVar, boolean z) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) reVar);
        afw.a(i_, z);
        Parcel a = a(7, i_);
        ArrayList<wo> createTypedArrayList = a.createTypedArrayList(wo.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<rh> a(String str, String str2, re reVar) {
        Parcel i_ = i_();
        i_.writeString(str);
        i_.writeString(str2);
        afw.a(i_, (Parcelable) reVar);
        Parcel a = a(16, i_);
        ArrayList<rh> createTypedArrayList = a.createTypedArrayList(rh.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<rh> a(String str, String str2, String str3) {
        Parcel i_ = i_();
        i_.writeString(str);
        i_.writeString(str2);
        i_.writeString(str3);
        Parcel a = a(17, i_);
        ArrayList<rh> createTypedArrayList = a.createTypedArrayList(rh.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<wo> a(String str, String str2, String str3, boolean z) {
        Parcel i_ = i_();
        i_.writeString(str);
        i_.writeString(str2);
        i_.writeString(str3);
        afw.a(i_, z);
        Parcel a = a(15, i_);
        ArrayList<wo> createTypedArrayList = a.createTypedArrayList(wo.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<wo> a(String str, String str2, boolean z, re reVar) {
        Parcel i_ = i_();
        i_.writeString(str);
        i_.writeString(str2);
        afw.a(i_, z);
        afw.a(i_, (Parcelable) reVar);
        Parcel a = a(14, i_);
        ArrayList<wo> createTypedArrayList = a.createTypedArrayList(wo.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final void a(long j, String str, String str2, String str3) {
        Parcel i_ = i_();
        i_.writeLong(j);
        i_.writeString(str);
        i_.writeString(str2);
        i_.writeString(str3);
        b(10, i_);
    }

    public final void a(re reVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) reVar);
        b(4, i_);
    }

    public final void a(rh rhVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) rhVar);
        b(13, i_);
    }

    public final void a(rh rhVar, re reVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) rhVar);
        afw.a(i_, (Parcelable) reVar);
        b(12, i_);
    }

    public final void a(rx rxVar, re reVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) rxVar);
        afw.a(i_, (Parcelable) reVar);
        b(1, i_);
    }

    public final void a(rx rxVar, String str, String str2) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) rxVar);
        i_.writeString(str);
        i_.writeString(str2);
        b(5, i_);
    }

    public final void a(wo woVar, re reVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) woVar);
        afw.a(i_, (Parcelable) reVar);
        b(2, i_);
    }

    public final byte[] a(rx rxVar, String str) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) rxVar);
        i_.writeString(str);
        Parcel a = a(9, i_);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    public final void b(re reVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) reVar);
        b(6, i_);
    }

    public final String c(re reVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) reVar);
        Parcel a = a(11, i_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void d(re reVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) reVar);
        b(18, i_);
    }
}
