package com.mdelbel.android.features.template.gateway

import com.mdelbel.android.features.template.domain.DomainTestClass

// TODO Delete this class after clone
data class GatewayTestClass(val value: Int) {

    fun addOneToValue() = GatewayTestClass(value + 1)

    fun bla() {
        val f = DomainTestClass(0)
    }

}