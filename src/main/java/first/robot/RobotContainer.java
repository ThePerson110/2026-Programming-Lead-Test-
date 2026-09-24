package first.robot;

import first.robot.commands.ArcadeDriveCommand;
import first.robot.commands.FeedCommand;
import first.robot.commands.RunIntakeCommand;
import first.robot.subsystems.DriveSubsystem;
import first.robot.subsystems.IntakeSubsystem;

public class RobotContainer {

  public final DriveSubsystem driveSubsystem = new DriveSubsystem();

  public final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();

  public final ArcadeDriveCommand arcadeDriveCommand = new ArcadeDriveCommand(driveSubsystem);

  public final RunIntakeCommand runIntakeCommand = new RunIntakeCommand(intakeSubsystem);

  public final FeedCommand feedCommand = new FeedCommand(intakeSubsystem);
}
