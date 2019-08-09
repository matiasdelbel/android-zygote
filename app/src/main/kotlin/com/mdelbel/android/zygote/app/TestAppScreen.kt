package com.mdelbel.android.zygote.app

import android.app.Activity
import android.os.Bundle

class TestAppScreen : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)
    }
}