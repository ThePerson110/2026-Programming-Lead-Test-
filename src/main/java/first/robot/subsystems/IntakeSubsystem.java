package first.robot.subsystems;

import com.ctre.phoenix6.CANBus;
import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;
import first.robot.Constants;

public class IntakeSubsystem {

  private static final CANBus CAN_BUS = new CANBus();

  private final TalonFX intakeLauncher = new TalonFX(Constants.INTAKE_ID, CAN_BUS);

  private final TalonFX feeder = new TalonFX(Constants.FEEDER_ID, CAN_BUS);

  private final DutyCycleOut intakeOutput = new DutyCycleOut(0);
  private final DutyCycleOut feederOutput = new DutyCycleOut(0);

  public void runIntake(double speed) {
    intakeLauncher.setControl(intakeOutput.withOutput(speed));
  }

  public void runFeeder(double speed) {
    feeder.setControl(feederOutput.withOutput(speed));
  }

  public void stop() {
    intakeLauncher.setControl(intakeOutput.withOutput(0));
    feeder.setControl(feederOutput.withOutput(0));
  }
}
