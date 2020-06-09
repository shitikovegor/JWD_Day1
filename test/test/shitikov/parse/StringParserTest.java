package test.shitikov.parse;

import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.parse.StringParser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringParserTest {
    StringParser stringParser;

    @BeforeClass
    public void setUp(){
        stringParser = new StringParser();
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testParseStringToIntException() throws IncorrectFormatException {
        stringParser.parseStringToInt("sdfsd");
    }

    @Test
    public void testParseStringToInt() {
        try {
            int actual = stringParser.parseStringToInt("6");
            int expected = 6;
            assertEquals(actual, expected, "Test failed as...");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }

    }

    @Test
    public void testConvertStringToIntArray() {
        try {
            int[] actual = stringParser.parseStringToIntArray("25 36 45 25");
            int[] expected = new int[]{25, 36, 45, 25};
            assertEquals(actual, expected, "Test failed as...");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testConvertStringToLongException() throws IncorrectFormatException {
        stringParser.parseStringToLong("-85sd");
    }

    @Test
    public void testConvertStringToLong() {
        try {
            long actual = stringParser.parseStringToLong("-8556265845258");
            long expected = -8556265845258L;
            assertEquals(actual, expected, "Test failed as...");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testConvertStringToDoubleException() throws IncorrectFormatException {
        stringParser.parseStringToDouble("number");
    }

    @Test
    public void testConvertStringToDouble() {
        try {
            double actual = stringParser.parseStringToDouble("25.636");
            double expected = 25.636;
            assertEquals(actual, expected, 0.001, "Test failed as...");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }
}