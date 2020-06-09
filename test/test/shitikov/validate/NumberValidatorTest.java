package test.shitikov.validate;

import com.shitikov.validate.NumberValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberValidatorTest {
    NumberValidator validator;

    @BeforeClass
    public void setUp() {
        validator = new NumberValidator();
    }

    @Test
    public void testNumberValidatorTrue() {
        boolean condition = validator.validateNumber(10, 5, 15);
        assertTrue(condition, "Test failed as... ");
    }

    @DataProvider(name = "numbers")
    public Object[][] createData() {
        return new Object[][]{{5.5, 6.8, 15.4}, {10, 6.8, 9}};
    }

    @Test(dataProvider = "numbers")
    public void testNumberValidatorFalse(double number, double minValue, double maxValue) {
        NumberValidator validator = new NumberValidator();
        boolean condition = validator.validateNumber(number, minValue, maxValue);
        assertFalse(condition, "Test failed as... ");
    }
}