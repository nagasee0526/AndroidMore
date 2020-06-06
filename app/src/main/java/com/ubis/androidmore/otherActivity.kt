package com.ubis.androidmore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class otherActivity : baseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        setValue()
        setupEvent()

        goBack.setOnClickListener {
            finish()
        }
    }

    override fun setupEvent() {

    }

    override fun setValue() {

    }

}
