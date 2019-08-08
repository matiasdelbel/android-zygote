package com.mdelbel.android.features.template.gateway

import org.junit.Assert.assertEquals
import org.junit.Test

// TODO Delete this class after clone
class GatewayTestClassTest {

    @Test
    fun `addOneToValue should returns a new test class with value increased`() {
        val testClass = GatewayTestClass(1)

        val result = testClass.addOneToValue()

        assertEquals(2, result.value)
    }
}