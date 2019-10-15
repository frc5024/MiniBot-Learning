package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID;

public class OI {
  public XboxController m_driverController = new XboxController(0);

  public double getThrottle() {
    return m_driverController.getY(GenericHID.Hand.kLeft) * -1;
  }

  public double getTurn() {
    return m_driverController.getX(GenericHID.Hand.kLeft);
  }
}