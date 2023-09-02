package com.dicoding.numbertothariq

import android.os.Parcel
import android.os.Parcelable

data class Thariq (
    val name:String?,
    val age: Int?,
    val power: String?



) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeValue(age)
        parcel.writeString(power)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Thariq> {
        override fun createFromParcel(parcel: Parcel): Thariq {
            return Thariq(parcel)
        }

        override fun newArray(size: Int): Array<Thariq?> {
            return arrayOfNulls(size)
        }
    }
}