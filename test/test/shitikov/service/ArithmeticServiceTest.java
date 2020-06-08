package test.shitikov.service;

import com.shitikov.service.ArithmeticService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticServiceTest {

    @Test
    public void testCalcSquareOfLastDigitPositive() {
        ArithmeticService arithmeticService = new ArithmeticService();
        double actual = arithmeticService.calcSquareOfLastDigit("83");
        double expected = 9.0;
        Assert.assertEquals(actual, expected, "Test failed as ...");
    }

    @Test
    public void testCalcSquareOfLastDigitNegative() {
        ArithmeticService arithmeticService = new ArithmeticService();
        double actual = arithmeticService.calcSquareOfLastDigit("658");
        double expected = 7.0;
        Assert.assertEquals(actual, expected, "Test failed as ...");
    }

    @Test
    public void testCheckForTwoAndMoreEvenNumbersTrue() {
        ArithmeticService arithmeticService = new ArithmeticService();
        boolean condition = arithmeticService.checkForTwoAndMoreEvenNumbers("32 11 16 17");
        Assert.assertTrue(condition, "Test failed as ...");
    }

    @Test
    public void testCheckForTwoAndMoreEvenNumbersFalse() {
        ArithmeticService arithmeticService = new ArithmeticService();
        boolean condition = arithmeticService.checkForTwoAndMoreEvenNumbers("32 11 115 17");
        Assert.assertFalse(condition, "Test failed as ...");
    }

    @Test
    public void testIsPerfectNumberTrue() {
        ArithmeticService arithmeticService = new ArithmeticService();
        boolean condition = arithmeticService.isPerfectNumber("496");
        Assert.assertTrue(condition, "Test failed as ...");
    }

    @Test
    public void testIsPerfectNumberFalse() {
        ArithmeticService arithmeticService = new ArithmeticService();
        boolean condition = arithmeticService.isPerfectNumber("153");
        Assert.assertFalse(condition, "Test failed as ...");
    }
}