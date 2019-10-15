package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.commands.DriveControl;
import frc.robot.subsystems.DriveTrain;

public class Robot extends TimedRobot {

  public static OI m_oi;
  public static DriveTrain m_driveTrain;
  DriveControl m_driveControl;
  @Override
  public void robotInit() {
    m_oi = new OI();
    m_driveControl = new DriveControl();
    m_driveTrain = new DriveTrain();
  }

  @Override
  public void teleopInit() {

  }

  @Override 
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

}



