package test.shitikov.validate;

import com.shitikov.validate.Validator;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValidatorTest {

    @Test
    public void testValidateInputTrue() {
        Validator validator = new Validator();
        boolean condition = validator.validateInput("53", "\\d+");
        Assert.assertTrue(condition, "Test failed as... ");
    }

    @Test
    public void testValidateInputFalse() {
        Validator validator = new Validator();
        boolean condition = validator.validateInput("asdas", "\\d+");
        Assert.assertFalse(condition, "Test failed as... ");
    }

    @Test
    public void testValidateInputTimeTrue() {
        Validator validator = new Validator();
        boolean condition = validator.validateInputTime("56252", "\\d{1,5}");
        Assert.assertTrue(condition, "Test failed as... ");
    }

    @Test
    public void testValidateInputTimeFalse() {
        Validator validator = new Validator();
        boolean condition = validator.validateInputTime("90523", "\\d{1,5}");
        Assert.assertFalse(condition, "Test failed as... ");
    }
}