package com.mdelbel.android.zygote.domain

// TODO Delete this class after clone
data class DomainTestClass(val value: Int) {

    fun addOneToValue() = DomainTestClass(value + 1)
}