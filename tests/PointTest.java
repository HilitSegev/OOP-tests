import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PointTest {

    Point pointA, pointB, pointC, pointD;
    double delta = 0.00001;
    String msg;

    @Before
    public void setUp() throws Exception {
        pointA = new Point(5.2,0);
        pointB = new Point(-2.2,-3.5123);
        pointC = new Point(20.4134,-5);
        pointD = new Point(10,5);
        msg = "PointTest - point is null";

        Assert.assertNotNull(msg, pointA);
        Assert.assertNotNull(msg, pointB);
        Assert.assertNotNull(msg, pointC);
        Assert.assertNotNull(msg, pointD);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void distance() {
        msg = "PointTest - distance to self failed";
        Assert.assertEquals(msg, pointA.distance(pointA), 0, delta);
        Assert.assertEquals(msg, pointB.distance(pointB), 0, delta);
        Assert.assertEquals(msg, pointC.distance(pointC), 0, delta);
        Assert.assertEquals(msg, pointD.distance(pointD), 0, delta);

        msg = "PointTest - distance to other failed";
        Assert.assertEquals(msg, Math.floor(pointA.distance(pointB)), 8, delta);
        Assert.assertEquals(msg, Math.floor(pointB.distance(pointC)), 22, delta);
        Assert.assertEquals(msg, Math.floor(pointC.distance(pointD)), 14, delta);
        Assert.assertEquals(msg, Math.ceil(pointD.distance(pointA)), 7, delta);

    }

    @Test
    public void testEquals() {
        Point pointAA = pointA;
        Point pointBB = pointB;
        Point pointCC = pointC;
        Point pointDD = pointD;
        msg = "PointTest - testEquals failed";


        Assert.assertFalse(msg, pointAA.equals(pointBB));
        Assert.assertFalse(msg, pointAA.equals(pointCC));
        Assert.assertFalse(msg, pointAA.equals(pointDD));

        Assert.assertTrue(msg, pointAA.equals(pointA));
        Assert.assertTrue(msg, pointBB.equals(pointB));
        Assert.assertTrue(msg, pointCC.equals(pointC));
        Assert.assertTrue(msg, pointDD.equals(pointD));
    }

    @Test
    public void getX() {
        msg = "PointTest - getX failed";

        Assert.assertEquals(msg, 5.2, pointA.getX(), delta);
        Assert.assertEquals(msg, -2.2, pointB.getX(), delta);
        Assert.assertEquals(msg, 20.4134, pointC.getX(), delta);
        Assert.assertEquals(msg, 10, pointD.getX(), delta);

        Assert.assertNotEquals(msg, 5.201, pointA.getX(), delta);
        Assert.assertNotEquals(msg, -2.203, pointB.getX(), delta);
        Assert.assertNotEquals(msg, 20.4133, pointC.getX(), delta);
        Assert.assertNotEquals(msg, 10.001, pointD.getX(), delta);
    }

    @Test
    public void getY() {
        msg = "PointTest - getY failed";

        Assert.assertEquals(msg, 0, pointA.getY(), delta);
        Assert.assertEquals(msg, -3.5123, pointB.getY(), delta);
        Assert.assertEquals(msg, -5, pointC.getY(), delta);
        Assert.assertEquals(msg, 5, pointD.getY(), delta);

        Assert.assertNotEquals(msg, 0.001, pointA.getY(), delta);
        Assert.assertNotEquals(msg, -3.5124, pointB.getY(), delta);
        Assert.assertNotEquals(msg, -5.1, pointC.getY(), delta);
        Assert.assertNotEquals(msg, 10.001, pointD.getY(), delta);
    }

    @Test
    public void setX() {
        pointA.setX(7.5);
        pointB.setX(-700);
        pointC.setX(-4.2324);
        pointD.setX(0);
        msg = "PointTest - setX failed";


        Assert.assertNotEquals(msg, 5.2, pointA.getX(), delta);
        Assert.assertNotEquals(msg, -2.2, pointB.getX(), delta);
        Assert.assertNotEquals(msg, 20.4134, pointC.getX(), delta);
        Assert.assertNotEquals(msg, 10, pointD.getX(), delta);

        Assert.assertEquals(msg, 7.5, pointA.getX(), delta);
        Assert.assertEquals(msg, -700, pointB.getX(), delta);
        Assert.assertEquals(msg, -4.2324, pointC.getX(), delta);
        Assert.assertEquals(msg, 0, pointD.getX(), delta);
    }

    @Test
    public void setY() {
        pointA.setY(7.5);
        pointB.setY(-700);
        pointC.setY(-4.2324);
        pointD.setY(0);
        msg = "PointTest - setY failed";

        Assert.assertNotEquals(msg, 0, pointA.getY(), delta);
        Assert.assertNotEquals(msg, -3.5123, pointB.getY(), delta);
        Assert.assertNotEquals(msg, -5, pointC.getY(), delta);
        Assert.assertNotEquals(msg, 5, pointD.getY(), delta);

        Assert.assertEquals(msg, 7.5, pointA.getY(), delta);
        Assert.assertEquals(msg, -700, pointB.getY(), delta);
        Assert.assertEquals(msg, -4.2324, pointC.getY(), delta);
        Assert.assertEquals(msg, 0, pointD.getY(), delta);
    }
}