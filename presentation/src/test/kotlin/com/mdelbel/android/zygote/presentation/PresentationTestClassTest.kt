package com.mdelbel.android.zygote.presentation

import org.junit.Assert.assertEquals
import org.junit.Test

class PresentationTestClassTest {

    @Test
    fun `addOneToValue should returns a new test class with value increased`() {
        val testClass = PresentationTestClass(1)

        val result = testClass.addOneToValue()

        assertEquals(2, result.value)
    }
}