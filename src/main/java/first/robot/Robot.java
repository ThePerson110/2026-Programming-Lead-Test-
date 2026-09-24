package first.robot;

import first.robot.validations.ValidationRunner;
import org.wpilib.framework.OpModeRobot;

public class Robot extends OpModeRobot {

  private final RobotContainer container = new RobotContainer();

  public static void run() {
    System.out.println("VALIDATION RUNNER STARTED");
    ValidationRunner.run();
  }

  public RobotContainer getContainer() {
    return container;
  }
}
