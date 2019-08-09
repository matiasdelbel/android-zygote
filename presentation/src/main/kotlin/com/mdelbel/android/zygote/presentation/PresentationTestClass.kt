package com.mdelbel.android.zygote.presentation

data class PresentationTestClass(val value: Int) {

    fun addOneToValue() = PresentationTestClass(value + 1)
}