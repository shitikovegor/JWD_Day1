package test.shitikov.parse;

import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.parse.StringParser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringParserTest {

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testParseStringToIntException() {
        StringParser stringParser = new StringParser();
        stringParser.parseStringToInt("sdfsd", "\\d+");
    }

    @Test
    public void testParseStringToInt() {
        StringParser stringParser = new StringParser();
        int actual = stringParser.parseStringToInt("6", "\\d+");
        int expected = 6;
        Assert.assertEquals(actual, expected, "Test failed as...");
    }

    @Test
    public void testConvertStringToIntArray() {
        StringParser stringParser = new StringParser();
        int[] actual = stringParser.convertStringToIntArray("25 36 45 25");
        int[] expected = new int[]{25, 36, 45, 25};
        Assert.assertEquals(actual, expected, "Test failed as...");
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testConvertStringToLongException() {
        StringParser stringParser = new StringParser();
        stringParser.convertStringToLong("-85sd", "\\-?\\d+");
    }

    @Test
    public void testConvertStringToLong() {
        StringParser stringParser = new StringParser();
        long actual = stringParser.convertStringToLong("-8556265845258", "\\-?\\d+");
        long expected = -8556265845258l;
        Assert.assertEquals(actual, expected, "Test failed as...");
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testConvertStringToDoubleException() {
        StringParser stringParser = new StringParser();
        stringParser.convertStringToDouble("number", true);
    }

    @Test
    public void testConvertStringToDouble() {
        StringParser stringParser = new StringParser();
        double actual = stringParser.convertStringToDouble("25.636", true);
        double expected = 25.636;
        Assert.assertEquals(actual, expected, 0.001, "Test failed as...");
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testConvertStringToSecondsException() {
        StringParser stringParser = new StringParser();
        stringParser.convertStringToSeconds("1256.25","\\d{1,5}");

    }

    @Test
    public void testConvertStringToSeconds() {
        StringParser stringParser = new StringParser();
        int actual = stringParser.convertStringToSeconds("2567","\\d{1,5}");
        int expected = 2567;
        Assert.assertEquals(actual, expected,"Test failed as...");
    }
}