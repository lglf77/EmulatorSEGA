package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: a */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    private final int a;
    private final float b;

    RatingCompat(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public int describeContents() {
        return this.a;
    }

    public String toString() {
        return "Rating:style=" + this.a + " rating=" + (this.b < 0.0f ? "unrated" : String.valueOf(this.b));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
