package test.shitikov.service;

import com.shitikov.entity.PassedTime;
import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.service.CalendarService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarServiceTest {
    CalendarService calendarService;

    @BeforeClass
    public void setUp() {
        calendarService = new CalendarService();
    }


    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testNumberOfDaysInMonthYearException() throws IncorrectFormatException {
        calendarService.numberOfDaysInMonth(-56, 2);
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testNumberOfDaysInMonthMonthException() throws IncorrectFormatException {
        calendarService.numberOfDaysInMonth(2020, 15);
    }

    @Test
    public void testNumberOfDaysInMonthPositive() {
        try {
            int actual = calendarService.numberOfDaysInMonth(2020, 1);
            int expected = 31;
            assertEquals(actual, expected, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }

    @Test
    public void testNumberOfDaysInMonthNegative() {
        try {
            int actual = calendarService.numberOfDaysInMonth(2020, 5);
            int expected = 30;
            assertNotEquals(actual, expected, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }

    @Test
    public void testNumberOfDaysInMonthLeapYear() {
        try {
            int actual = calendarService.numberOfDaysInMonth(2020, 2);
            int expected = 29;
            assertEquals(actual, expected, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testGetTimeException() throws IncorrectFormatException {
        calendarService.getTime(90000);
    }

    @Test
    public void testGetTimePositive() {
        try {

            PassedTime actual = calendarService.getTime(72266);
            PassedTime expected = new PassedTime(20, 4, 26);
            assertEquals(actual, expected, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }

    @Test
    public void testGetTimeNegative() {
        try {
            PassedTime actual = calendarService.getTime(72266);
            PassedTime expected = new PassedTime(20, 25, 26);
            assertNotEquals(actual, expected, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            fail("Exception has occurred");
        }
    }
}