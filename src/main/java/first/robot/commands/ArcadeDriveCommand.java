package first.robot.commands;

import first.robot.subsystems.DriveSubsystem;

public class ArcadeDriveCommand {

  private final DriveSubsystem driveSubsystem;

  public ArcadeDriveCommand(DriveSubsystem driveSubsystem) {

    this.driveSubsystem = driveSubsystem;
  }

  public void execute(double forward, double turn) {

    driveSubsystem.arcadeDrive(forward, turn);
  }
}
