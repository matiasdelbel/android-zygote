package com.mdelbel.android.zygote.usecases

import org.junit.Assert.assertEquals
import org.junit.Test

// TODO Delete this class after clone
class UseCasesTestClassTest {

    @Test
    fun `addOneToValue should returns a new test class with value increased`() {
        val testClass = UseCasesTestClass(1)

        val result = testClass.addOneToValue()

        assertEquals(2, result.value)
    }
}