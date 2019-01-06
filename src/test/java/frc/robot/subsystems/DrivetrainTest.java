package frc.robot.subsystems;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.thegongoliers.mockHardware.output.MockSpeedController;
import frc.robot.subsystems.Drivetrain;

public class DrivetrainTest {

    MockSpeedController left, right;
    Drivetrain drivetrain;

    @Before
    public void setup(){
        left = new MockSpeedController();
        right = new MockSpeedController();
        drivetrain = new Drivetrain(left, right);
    }

    @Test
    public void testForward(){
        drivetrain.forward(1.0);
        assertEquals(1.0, left.get(), 0.0001);
        assertEquals(-1.0, right.get(), 0.0001);

        drivetrain.forward(-1.0);
        assertEquals(-1.0, left.get(), 0.0001);
        assertEquals(1.0, right.get(), 0.0001);
    }

    @Test
    public void testRotate(){
        drivetrain.rotate(1.0);

        assertEquals(1.0, left.get(), 0.0001);
        assertEquals(1.0, right.get(), 0.0001);
    }


}