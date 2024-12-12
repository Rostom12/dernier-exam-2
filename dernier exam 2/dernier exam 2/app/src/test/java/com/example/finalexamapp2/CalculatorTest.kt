package com.example.finalexamapp2

import org.junit.Test
import org.junit.Assert.assertEquals

class CalculatorTest {

    @Test
    fun addition_isCorrect() {
        val calculator = Calculator()
        assertEquals(4, calculator.add(2, 2))
    }

    @Test
    fun subtraction_isCorrect() {
        val calculator = Calculator()
        assertEquals(1, calculator.subtract(3, 2))
    }
}
