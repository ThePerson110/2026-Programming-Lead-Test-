package first.robot.validations;

import first.robot.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ValidationTests {

  public boolean configurationTestA() {
    return Constants.LEFT_LEADER_ID == 0;
  }

  public boolean configurationTestB() {
    return Constants.LEFT_FOLLOWER_ID == 1;
  }

  public boolean configurationTestC() {
    return Constants.RIGHT_LEADER_ID == 2;
  }

  public boolean configurationTestD() {
    return Constants.RIGHT_FOLLOWER_ID == 3;
  }

  public boolean configurationTestE() {
    return Constants.INTAKE_ID == 4;
  }

  public boolean configurationTestF() {
    return Constants.FEEDER_ID == 5;
  }

  public boolean followerTestA() {
    String source = readDriveSubsystem();

    if (source == null) {
      return false;
    }

    source = normalize(source);

    return source.contains("leftfollower.setcontrol")
        && source.contains("newfollower(leftleader.getdeviceid()")
        && source.contains("motoralignmentvalue.aligned");
  }

  public boolean followerTestB() {
    String source = readDriveSubsystem();

    if (source == null) {
      return false;
    }

    source = normalize(source);

    return source.contains("rightfollower.setcontrol")
        && source.contains("newfollower(rightleader.getdeviceid()")
        && source.contains("motoralignmentvalue.aligned");
  }

  public boolean motorTestA() {
    String source = readIntakeSubsystem();

    if (source == null) {
      return false;
    }

    source = normalize(source);

    return source.contains("talonfx")
        && source.contains("constants.intake_id")
        && source.contains("constants.feeder_id");
  }

  public boolean autoTestA() {
    return Constants.AUTO_DURATION == 5.0;
  }

  private String readDriveSubsystem() {
    Path path =
        Path.of("src", "main", "java", "first", "robot", "subsystems", "DriveSubsystem.java");

    try {
      return Files.readString(path);
    } catch (IOException e) {
      return null;
    }
  }

  private String readIntakeSubsystem() {
    Path path =
        Path.of("src", "main", "java", "first", "robot", "subsystems", "IntakeSubsystem.java");

    try {
      return Files.readString(path);
    } catch (IOException e) {
      return null;
    }
  }

  private String normalize(String source) {
    return source.replaceAll("\\s+", "").toLowerCase();
  }
}
