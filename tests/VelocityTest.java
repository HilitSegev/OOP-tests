import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VelocityTest {
    Velocity velocityA, velocityB, velocityC, velocityD;
    Velocity angleVelocityA, angleVelocityB, angleVelocityC, angleVelocityD;
    Velocity angleVelocityE, angleVelocityF, angleVelocityG, angleVelocityH;


    double delta = 0.00001;
    String msg;

    @Before
    public void setUp() throws Exception {
        velocityA = new Velocity(Consts.BALL_SLOW_SPEED, Consts.BALL_SLOW_SPEED);
        velocityB = new Velocity(Consts.BALL_MID_SPEED, Consts.BALL_MID_SPEED);
        velocityC = new Velocity(Consts.BALL_FAST_SPEED, Consts.BALL_FAST_SPEED);
        velocityD = new Velocity(Consts.BALL_VERY_FAST_SPEED, Consts.BALL_VERY_FAST_SPEED);

        angleVelocityA = Velocity.fromAngleAndSpeed(90,Consts.BALL_SLOW_SPEED);
        angleVelocityB = Velocity.fromAngleAndSpeed(90,Consts.BALL_MID_SPEED);


        msg = "PointTest - point is null";

        Assert.assertNotNull(msg, velocityA);
        Assert.assertNotNull(msg, velocityB);
        Assert.assertNotNull(msg, velocityC);
        Assert.assertNotNull(msg, velocityD);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fromAngleAndSpeed() {
    }

    @Test
    public void getDx() {
    }

    @Test
    public void setDx() {
    }

    @Test
    public void getDy() {
    }

    @Test
    public void setDy() {
    }

    @Test
    public void applyToPoint() {
    }
}