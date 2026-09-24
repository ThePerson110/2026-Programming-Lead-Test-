package first.robot.validation;

import first.robot.Constants;

public class ValidationTests {

  public boolean configurationTestA() {

    return Constants.LEFT_LEADER_ID == 0;
  }

  public boolean configurationTestB() {

    return Constants.RIGHT_LEADER_ID == 2;
  }

  public boolean autoTestA() {

    return Constants.AUTO_DURATION == 5.0;
  }
}
