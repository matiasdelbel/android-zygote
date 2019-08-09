package com.mdelbel.android.zygote.domain

import junit.framework.Assert.assertEquals
import org.junit.Test

// TODO Delete this class after clone
class DomainTestClassTest {

    @Test
    fun `addOneToValue should returns a new test class with value increased`() {
        val testClass = DomainTestClass(1)

        val result = testClass.addOneToValue()

        assertEquals(2, result.value)
    }
}