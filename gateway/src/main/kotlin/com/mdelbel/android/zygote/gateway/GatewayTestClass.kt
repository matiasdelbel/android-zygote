package com.mdelbel.android.zygote.gateway

data class GatewayTestClass(val value: Int) {

    fun addOneToValue() = GatewayTestClass(value + 1)
}