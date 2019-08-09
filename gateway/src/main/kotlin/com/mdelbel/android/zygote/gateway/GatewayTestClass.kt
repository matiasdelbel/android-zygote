package com.mdelbel.android.zygote.gateway

import com.mdelbel.android.zygote.domain.DomainTestClass

// TODO Delete this class after clone
data class GatewayTestClass(val value: Int) {

    fun addOneToValue() = GatewayTestClass(value + 1)

    fun bla() {
        val f = DomainTestClass(0)
    }
}