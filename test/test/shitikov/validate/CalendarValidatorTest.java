package test.shitikov.validate;

import com.shitikov.validate.CalendarValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarValidatorTest {
    CalendarValidator calendarValidator;

    @BeforeClass
    public void setUp() {
        calendarValidator = new CalendarValidator();
    }

    @Test
    public void testValidateYearTrue() {
        boolean condition = calendarValidator.validateYear(2020);
        assertTrue(condition, "Test failed as... ");
    }


    @DataProvider(name = "yearData")
    public Object[] createYearData() {
        return new Object[] {-5, 5000};
    }

    @Test(dataProvider = "yearData")
    public void testValidateYearFalse(int year) {
        boolean condition = calendarValidator.validateYear(year);
        assertFalse(condition, "Test failed as... ");
    }

    @Test
    public void testValidateMonthTrue() {
        boolean condition = calendarValidator.validateMonth(10);
        assertTrue(condition, "Test failed as... ");
    }

    @DataProvider(name = "monthData")
    public Object[] createMonthData() {
        return new Object[] {0, -3, 14};
    }

    @Test(dataProvider = "monthData")
    public void testValidateMonthFalse(int monthNumber) {
        boolean condition = calendarValidator.validateMonth(monthNumber);
        assertFalse(condition, "Test failed as... ");
    }

    @Test
    public void testValidateTimeTrue() {
        boolean condition = calendarValidator.validateTime(25654);
        assertTrue(condition, "Test failed as... ");
    }

    @DataProvider(name = "timeData")
    public Object[] createTimeData() {
        return new Object[] {-65, 90000};
    }

    @Test(dataProvider = "timeData")
    public void testValidateTimeFalse(int timeInSeconds) {
        boolean condition = calendarValidator.validateTime(timeInSeconds);
        assertFalse(condition, "Test failed as... ");
    }
}