package test.shitikov.service;

import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.service.ArithmeticService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArithmeticServiceTest {
    ArithmeticService arithmeticService;

    @BeforeClass
    public void setUp(){
        arithmeticService = new ArithmeticService();
    }

    @Test
    public void testCalcSquareOfLastDigitPositive() {
        double actual = arithmeticService.calcSquareOfLastDigit(83);
        double expected = 9.0;
        assertEquals(actual, expected, "Test failed as ...");
    }

    @Test
    public void testCalcSquareOfLastDigitNegative() {
        double actual = arithmeticService.calcSquareOfLastDigit(658);
        double expected = 7.0;
        assertNotEquals(actual, expected, "Test failed as ...");
    }

    @Test
    public void testCheckForTwoAndMoreEvenNumbersTrue() {
        boolean condition = arithmeticService.checkForTwoAndMoreEvenNumbers(new int[] {12, 13, 16, 11});
        assertTrue(condition, "Test failed as ...");
    }

    @Test
    public void testCheckForTwoAndMoreEvenNumbersFalse() {
        ArithmeticService arithmeticService = new ArithmeticService();
        boolean condition = arithmeticService.checkForTwoAndMoreEvenNumbers(new int[] {12, 13, 15, 11});
        assertFalse(condition, "Test failed as ...");
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testIsPerfectNumberException() throws IncorrectFormatException {
        arithmeticService.isPerfectNumber(-56);
    }

    @Test
    public void testIsPerfectNumberTrue() {
        try {
            boolean condition = arithmeticService.isPerfectNumber(496);
            assertTrue(condition, "Test failed as ...");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }

    @Test
    public void testIsPerfectNumberFalse() {
        try {
            boolean condition = arithmeticService.isPerfectNumber(153);
            assertFalse(condition, "Test failed as ...");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }
}