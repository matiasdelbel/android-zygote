package com.mdelbel.android.zygote.domain

data class DomainTestClass(val value: Int) {

    fun addOneToValue() = DomainTestClass(value + 1)
}