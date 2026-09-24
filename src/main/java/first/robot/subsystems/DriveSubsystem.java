package first.robot.subsystems;

import com.ctre.phoenix6.CANBus;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;
import com.ctre.phoenix6.signals.MotorAlignmentValue;
import first.robot.Constants;
import org.wpilib.drive.DifferentialDrive;

public class DriveSubsystem {

  private static final CANBus CAN_BUS = new CANBus();

  private final TalonFX leftLeader = new TalonFX(Constants.LEFT_LEADER_ID, CAN_BUS);

  private final TalonFX leftFollower = new TalonFX(Constants.LEFT_FOLLOWER_ID, CAN_BUS);

  private final TalonFX rightLeader = new TalonFX(Constants.RIGHT_LEADER_ID, CAN_BUS);

  private final TalonFX rightFollower = new TalonFX(Constants.RIGHT_FOLLOWER_ID, CAN_BUS);

  private final DutyCycleOut leftOutput = new DutyCycleOut(0);
  private final DutyCycleOut rightOutput = new DutyCycleOut(0);

  private final DifferentialDrive drivetrain =
      new DifferentialDrive(
          output -> leftLeader.setControl(leftOutput.withOutput(output)),
          output -> rightLeader.setControl(rightOutput.withOutput(output)));

  public DriveSubsystem() {
    configureMotors();
  }

  private void configureMotors() {

    TalonFXConfiguration leftConfig = new TalonFXConfiguration();

    leftConfig.MotorOutput.Inverted = InvertedValue.Clockwise_Positive;

    leftLeader.getConfigurator().apply(leftConfig);
    leftFollower.getConfigurator().apply(leftConfig);

    TalonFXConfiguration rightConfig = new TalonFXConfiguration();

    rightConfig.MotorOutput.Inverted = InvertedValue.CounterClockwise_Positive;

    rightLeader.getConfigurator().apply(rightConfig);
    rightFollower.getConfigurator().apply(rightConfig);

    leftFollower.setControl(new Follower(leftLeader.getDeviceID(), MotorAlignmentValue.Aligned));

    rightFollower.setControl(new Follower(rightLeader.getDeviceID(), MotorAlignmentValue.Aligned));
  }

  public void arcadeDrive(double forward, double turn) {
    drivetrain.arcadeDrive(forward, turn);
  }

  public void stop() {
    drivetrain.stopMotor();
  }
}
