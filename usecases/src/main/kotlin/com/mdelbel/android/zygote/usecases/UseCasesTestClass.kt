package com.mdelbel.android.zygote.usecases

data class UseCasesTestClass(val value: Int) {

    fun addOneToValue() = UseCasesTestClass(value + 1)
}