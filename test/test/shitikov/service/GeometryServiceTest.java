package test.shitikov.service;

import com.shitikov.entity.Point;
import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.service.GeometryService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GeometryServiceTest {
    GeometryService geometryService;

    @BeforeClass
    public void setUp(){
        geometryService = new GeometryService();
    }

    @Test
    public void testCalcRatioOfAreasPositive() {
        GeometryService geometryService = new GeometryService();
        double actual = geometryService.calcRatioOfAreas(25.0, 5.0);
        double expected = 5.0;
        assertEquals(actual, expected, "Test failed as... ");
    }

    @Test
    public void testCalcRatioOfAreasNegative() {
        GeometryService geometryService = new GeometryService();
        double actual = geometryService.calcRatioOfAreas(36.0, 5.0);
        double expected = 5.0;
        assertNotEquals(actual, expected, "Test failed as... ");
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testCalcSquareAreaException() throws IncorrectFormatException {
        geometryService.calcSquareArea(-12.25);
    }

    @Test
    public void testCalcSquareAreaPositive() {
        try {
            double actual = geometryService.calcSquareArea(36);
            double expected = 18.0;
            assertEquals(actual, expected, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            Assert.fail("Exception has occurred");
        }
    }

    @Test
    public void testCalcSquareAreaNegative() {
        try {
            double actual = geometryService.calcSquareArea(144);
            double expected = 70.0;
            assertNotEquals(actual, expected, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            Assert.fail("Exception has occurred");
        }
    }

    @Test
    public void testFindNearestPointPositive() {
        GeometryService geometryService = new GeometryService();
        Point actual = geometryService.findNearestPoint(new Point(5.0, 6.0), new Point(6.0, 8.0));
        Point expected = new Point(5.0, 6.0);
        assertEquals(actual, expected, "Test failed as... ");
    }

    @Test
    public void testFindNearestPointNegative() {
        GeometryService geometryService = new GeometryService();
        Point actual = geometryService.findNearestPoint(new Point(5.0, 6.0), new Point(6.0, 8.0));
        Point expected = new Point(6.0, 8.0);
        assertNotEquals(actual, expected, "Test failed as... ");
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testCalcCircleAreaException() throws IncorrectFormatException {
        geometryService.calcCircleArea(10000000.00);
    }

    @Test
    public void testCalcCircleAreaPositive() {
        try {
            double actual = geometryService.calcCircleArea(5);
            double expected = 78.54;
            assertEquals(actual, expected, 0.01, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            Assert.fail("Exception has occurred");
        }
    }

    @Test
    public void testCalcCircleAreaNegative() {
        try {
            double actual = geometryService.calcCircleArea(6);
            double expected = 80.65;
            assertNotEquals(actual, expected, 0.01, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            Assert.fail("Exception has occurred");
        }
    }

    @Test(expectedExceptions = IncorrectFormatException.class)
    public void testCalcCircumferenceException() throws IncorrectFormatException {
        geometryService.calcCircumference(-15.00);
    }

    @Test
    public void testCalcCircumferencePositive() {
        try {
            double actual = geometryService.calcCircumference(5);
            double expected = 31.42;
            assertEquals(actual, expected, 0.01, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            Assert.fail("Exception has occurred");
        }
    }

    @Test
    public void testCalcCircumferenceNegative() {
        try {
            double actual = geometryService.calcCircumference(8);
            double expected = 48.54;
            assertNotEquals(actual, expected, 0.01, "Test failed as... ");
        } catch (IncorrectFormatException e) {
            Assert.fail("Exception has occurred");
        }
    }
}