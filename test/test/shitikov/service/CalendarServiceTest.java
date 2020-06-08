package test.shitikov.service;

import com.shitikov.entity.PassedTime;
import com.shitikov.service.CalendarService;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalendarServiceTest {

    @Test
    public void testNumberOfDaysInMonthPositive() {
        CalendarService calendarService = new CalendarService();
        int actual = calendarService.numberOfDaysInMonth("2020", "2");
        int expected = 29;
        Assert.assertEquals(actual, expected, "Test failed as... ");
    }

    @Test
    public void testNumberOfDaysInMonthNegative() {
        CalendarService calendarService = new CalendarService();
        int actual = calendarService.numberOfDaysInMonth("2020", "2");
        int expected = 28;
        Assert.assertEquals(actual, expected, "Test failed as... ");
    }

    @Test
    public void testGetTimePositive() {
        CalendarService calendarService = new CalendarService();
        PassedTime actual = calendarService.getTime("72266");
        PassedTime expected = new PassedTime(20, 4, 26);
        Assert.assertEquals(actual, expected, "Test failed as... ");
    }

    @Test
    public void testGetTimeNegative() {
        CalendarService calendarService = new CalendarService();
        PassedTime actual = calendarService.getTime("72266");
        PassedTime expected = new PassedTime(20, 25, 26);
        Assert.assertEquals(actual, expected, "Test failed as... ");
    }
}