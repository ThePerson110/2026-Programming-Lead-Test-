/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */
package first.robot.opmode;

import org.wpilib.system.Timer;
import first.robot.Robot;
import org.wpilib.opmode.Autonomous;
import org.wpilib.opmode.PeriodicOpMode;

@Autonomous(name = "Shoot Auto", group = "Competition")
public class MyAuto extends PeriodicOpMode {

  private final Robot robot;

  private final Timer autoTimer = new Timer();

  public MyAuto(Robot robot) {
    this.robot = robot;
  }

  @Override
  public void start() {

    autoTimer.restart();
  }

  @Override
  public void periodic() {

    if (autoTimer.get() < 5.0) {

      // Run shooter
      robot.getContainer().runIntakeCommand.execute(1.0);

      // Feed game pieces
      robot.getContainer().feedCommand.execute(1.0);

    } else {

      // Stop everything
      robot.getContainer().runIntakeCommand.execute(0.0);

      robot.getContainer().feedCommand.execute(0.0);
    }
  }
}
