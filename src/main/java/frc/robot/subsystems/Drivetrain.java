package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

class Drivetrain extends Subsystem {

    private SpeedController leftMotor, rightMotor;
    private DifferentialDrive drive;

    public Drivetrain(SpeedController left, SpeedController right){
        leftMotor = left;
        rightMotor = right;

        drive = new DifferentialDrive(leftMotor, rightMotor);
    }


    @Override
    protected void initDefaultCommand() {

    }

    public void forward(double speed){
        drive.arcadeDrive(speed, 0);
    }

    public void rotate(double speed){
        drive.arcadeDrive(0, speed);
    }

}