package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain extends Subsystem {

    WPI_TalonSRX left;
    WPI_TalonSRX right;
    DifferentialDrive drive;

    public DriveTrain() {
        left = new WPI_TalonSRX(1);
        right = new WPI_TalonSRX(2);

        drive = new DifferentialDrive(left, right);
        drive.setSafetyEnabled(false);
    }

    @Override
    protected void initDefaultCommand() {
    }

    public void arcadeDrive(double speed, double rotation) {
        drive.arcadeDrive(speed, rotation);
    }

}