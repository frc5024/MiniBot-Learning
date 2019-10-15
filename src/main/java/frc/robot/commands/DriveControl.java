package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveControl extends Command {

    @Override
    protected void execute() {
        double speed = Robot.m_oi.getThrottle();
        double rotation = Robot.m_oi.getTurn();
        Robot.m_driveTrain.arcadeDrive(speed, rotation);
    }

    @Override
	protected boolean isFinished() {
		return false;
	}


}