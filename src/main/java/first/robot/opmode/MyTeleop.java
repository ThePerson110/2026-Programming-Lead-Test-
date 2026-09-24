package first.robot.opmode;

import org.wpilib.driverstation.XboxController;import first.robot.Robot;
import org.wpilib.opmode.PeriodicOpMode;
import org.wpilib.opmode.Teleop;

@Teleop
public class MyTeleop extends PeriodicOpMode {

  private final Robot robot;

  private final XboxController controller = new XboxController(0);

  public MyTeleop(Robot robot) {

    this.robot = robot;
  }

  @Override
  public void periodic() {

    robot.getContainer().arcadeDriveCommand.execute(-controller.getLeftY(), controller.getRightX());

    if (controller.getAButton()) {

      robot.getContainer().runIntakeCommand.execute(1.0);

    } else {

      robot.getContainer().runIntakeCommand.execute(0.0);
    }

    if (controller.getBButton()) {

      robot.getContainer().feedCommand.execute(1.0);

    } else {

      robot.getContainer().feedCommand.execute(0.0);
    }
  }
}
