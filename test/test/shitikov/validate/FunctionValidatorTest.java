package test.shitikov.validate;

import com.shitikov.validate.FunctionValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionValidatorTest {
    FunctionValidator functionValidator;

    @BeforeClass
    public void setUp(){
        functionValidator = new FunctionValidator();
    }

    @Test
    public void testValidateXTrue() {
        boolean condition = functionValidator.validateX(56.25);
        assertTrue(condition, "Test failed as... ");
    }

    @Test
    public void testValidateXFalse() {
        boolean condition = functionValidator.validateX(Math.cbrt(6));
        assertFalse(condition, "Test failed as... ");
    }

    @Test
    public void testValidateSegmentTrue() {
        boolean condition = functionValidator.validateSegment(0, 5, 2.5);
        assertTrue(condition, "Test failed as... ");
    }

    @DataProvider(name = "segmentData")
    Object[][] createData() {
        return new Object[][] {{6, 3, 1}, {0, 10, 15}};
    }

    @Test(dataProvider = "segmentData")
    public void testValidateSegmentFalse(double start, double finish, double step) {
        boolean condition = functionValidator.validateSegment(start, finish, step);
        assertFalse(condition, "Test failed as... ");
    }
}