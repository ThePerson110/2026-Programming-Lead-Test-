# Expected Robot Behavior

This document describes how the robot should behave when functioning correctly.

---

## Teleoperated Mode

### Drivetrain

The drivetrain should use arcade drive.

* Left stick forward → drive forward
* Left stick backward → drive backward
* Right stick left → rotate left
* Right stick right → rotate right
* The robot should drive straight when commanded forward.

### Intake Launcher

Pressing **A** should start the intake launcher motor.

Releasing **A** should stop the intake launcher motor.

### Feeder

Pressing **B** should start the feeder motor.

Releasing **B** should stop the feeder motor.

---

## Autonomous Mode

When autonomous begins:

1. The intake launcher starts.
2. The feeder starts.
3. Game pieces are launched for **5 seconds**.
4. All mechanisms stop.

The autonomous routine should complete after 5 seconds.

---

## Hardware Configuration

### Drivetrain

| Device         | CAN ID |
| -------------- | -----: |
| Left Leader    |      0 |
| Left Follower  |      1 |
| Right Leader   |      2 |
| Right Follower |      3 |

The follower motors should follow their respective leader motors.

### Intake System

| Device          | CAN ID |
| --------------- | -----: |
| Intake Launcher |      4 |
| Feeder          |      5 |

---

## Code Organization

The project should follow this structure:

* **`Constants.java`** — Stores CAN IDs and robot constants.
* **`DriveSubsystem.java`** — Manages the drivetrain hardware.
* **`IntakeSubsystem.java`** — Manages the intake and feeder hardware.
* **`MyAuto.java`** — Implements the autonomous routine.
* **`RobotContainer.java`** — Handles robot-wide construction and controller bindings.
