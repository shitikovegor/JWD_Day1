package test.shitikov.service;

import com.shitikov.entity.Point;
import com.shitikov.service.GeometryService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GeometryServiceTest {

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
        assertEquals(actual, expected, "Test failed as... ");
    }

    @Test
    public void testCalcSquareAreaPositive() {
        GeometryService geometryService = new GeometryService();
        double actual = geometryService.calcSquareArea("36");
        double expected = 18.0;
        assertEquals(actual, expected, "Test failed as... ");
    }

    @Test
    public void testCalcSquareAreaNegative() {
        GeometryService geometryService = new GeometryService();
        double actual = geometryService.calcSquareArea("144");
        double expected = 70.0;
        assertEquals(actual, expected, "Test failed as... ");
    }

    @Test
    public void testPointFromInputPositive() {
        GeometryService geometryService = new GeometryService();
        Point actual = geometryService.pointFromInput("25", "0.56");
        Point expected = new Point(25, 0.56);
        assertEquals(actual, expected, "Test failed as... ");
    }

    @Test
    public void testPointFromInputNegative() {
        GeometryService geometryService = new GeometryService();
        Point actual = geometryService.pointFromInput("44.54", "32");
        Point expected = new Point(5, 1.5);
        assertEquals(actual, expected, "Test failed as... ");
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
        assertEquals(actual, expected, "Test failed as... ");
    }

    @Test
    public void testCalcCircleAreaPositive() {
        GeometryService geometryService = new GeometryService();
        double actual = geometryService.calcCircleArea("5");
        double expected = 78.54;
        assertEquals(actual, expected, 0.01, "Test failed as... ");
    }

    @Test
    public void testCalcCircleAreaNegative() {
        GeometryService geometryService = new GeometryService();
        double actual = geometryService.calcCircleArea("6");
        double expected = 80.65;
        assertEquals(actual, expected, 0.01, "Test failed as... ");
    }

    @Test
    public void testCalcCircumferencePositive() {
        GeometryService geometryService = new GeometryService();
        double actual = geometryService.calcCircumference("5");
        double expected = 31.42;
        assertEquals(actual, expected, 0.01, "Test failed as... ");
    }

    @Test
    public void testCalcCircumferenceNegative() {
        GeometryService geometryService = new GeometryService();
        double actual = geometryService.calcCircumference("8");
        double expected = 48.54;
        assertEquals(actual, expected, 0.01, "Test failed as... ");
    }
}