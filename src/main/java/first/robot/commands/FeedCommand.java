package first.robot.commands;

import first.robot.subsystems.IntakeSubsystem;

public class FeedCommand {

  private final IntakeSubsystem intakeSubsystem;

  public FeedCommand(IntakeSubsystem intakeSubsystem) {

    this.intakeSubsystem = intakeSubsystem;
  }

  public void execute(double speed) {

    intakeSubsystem.runFeeder(speed);
  }
}
