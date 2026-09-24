package first.robot.commands;

import first.robot.subsystems.IntakeSubsystem;

public class RunIntakeCommand {

  private final IntakeSubsystem intakeSubsystem;

  public RunIntakeCommand(IntakeSubsystem intakeSubsystem) {

    this.intakeSubsystem = intakeSubsystem;
  }

  public void execute(double speed) {

    intakeSubsystem.runIntake(speed);
  }
}
