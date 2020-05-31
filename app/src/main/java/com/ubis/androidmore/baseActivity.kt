package com.ubis.androidmore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class baseActivity : AppCompatActivity() {
    val mContext = this

    abstract fun setupEvent()
    abstract fun setValue()
}
