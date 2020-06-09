package test.shitikov.service;

import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.service.FunctionService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class FunctionServiceTest {
    FunctionService functionService;

    @BeforeClass
    public void setUp() {
        functionService = new FunctionService();
    }


    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testCalcFunctionException() throws IncorrectFormatException {
        functionService.calcFunction(Math.cbrt(6.0));
    }

    @Test
    public void testCalcFunctionPositive() {
        try {
            double actual = functionService.calcFunction(3.0);
            double expected = 9.0;
            assertEquals(actual, expected, "Test failed as ...");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }

    @Test
    public void testCalcFunctionNegative() {
        try {
            double actual = functionService.calcFunction(6.5);
            double expected = 15.0;
            assertNotEquals(actual, expected, "Test failed as ...");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testCalcFunctionOnSegmentException() throws IncorrectFormatException {
        functionService.calcFunctionOnSegment(1, 0, 0.5);
    }

    @Test
    public void testCalcFunctionOnSegmentPositive() {
        try {
            Map<Double, Double> actual = functionService.calcFunctionOnSegment(-1, 0, 0.5);
            Map<Double, Double> expected = new HashMap<Double, Double>();
            expected.put(-1.0, -1.5574077246549023);
            expected.put(-0.5, -0.5463024898437905);
            expected.put(0.0, 0.0);
            assertEquals(actual, expected, "Test failed as ...");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }

    @Test
    public void testCalcFunctionOnSegmentNegative() {
        try {
            FunctionService functionService = new FunctionService();
            Map<Double, Double> actual = functionService.calcFunctionOnSegment(-0.785, 0.785, 0.157);
            Map<Double, Double> expected = new HashMap<Double, Double>();
            expected.put(-1.0, 2.0);
            assertNotEquals(actual, expected, "Test failed as ...");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }
}