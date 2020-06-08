package test.shitikov.service;

import com.shitikov.service.FunctionService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class FunctionServiceTest {

    @Test
    public void testCalcFunctionPositive() {
        FunctionService functionService = new FunctionService();
        double actual = functionService.calcFunction("3");
        double expected = 9.0;
        Assert.assertEquals(actual, expected, "Test failed as ...");
    }

    @Test
    public void testCalcFunctionNegative() {
        FunctionService functionService = new FunctionService();
        double actual = functionService.calcFunction("6.5");
        double expected = 15.0;
        Assert.assertEquals(actual, expected, "Test failed as ...");
    }

    @Test
    public void testCalcFunctionOnSegmentPosiive() {
        FunctionService functionService = new FunctionService();
        HashMap<Double, Double> actual = functionService.calcFunctionOnSegment("-1", "0", "0.5");
        HashMap<Double, Double> expected = new HashMap<Double, Double>();
        expected.put(-1.0, -1.5574077246549023);
        expected.put(-0.5, -0.5463024898437905);
        expected.put(0.0, 0.0);
        Assert.assertEquals(actual, expected, "Test failed as ...");
    }

    @Test
    public void testCalcFunctionOnSegmentNegative() {
        FunctionService functionService = new FunctionService();
        HashMap<Double, Double> actual = functionService.calcFunctionOnSegment("-0.785", "0.785", "0.157");
        HashMap<Double, Double> expected = new HashMap<Double, Double>();
        expected.put(-1.0, 2.0);
        Assert.assertEquals(actual, expected, "Test failed as ...");
    }
}