# Current Robot Report

The following observations were made during robot testing.

Your task is to compare these observations against the project documentation and determine whether the robot is behaving as intended.

---

## Teleop

### Drivetrain

When the left joystick is pushed forward, the robot drives forward.

When the right joystick is moved left or right, the robot rotates.

The drivetrain appears to respond to driver commands.

---

### Intake Launcher

Pressing the A button does not activate the intake launcher.

A different controller button appears to activate the intake launcher.

---

### Feeder

Pressing the B button does not activate the feeder.

A different controller button appears to activate the feeder.

---

## Autonomous

During autonomous mode:

- The intake launcher starts.
- The feeder starts.
- Game pieces are launched.
- All mechanisms eventually stop.

The autonomous routine finishes earlier than expected.

---

## Mechanical / Electrical Observations

### Drivetrain

The drivetrain does not drive straight when commanded forward.

One side of the drivetrain appears weaker than the other side.

---

### Intake System

The intake launcher and feeder both function.

No obvious mechanical issues were observed.

---

## Configuration Review

Electrical has supplied the following CAN ID assignments:

| Device | Expected CAN ID |
|----------|----------|
| Left Leader | 0 |
| Left Follower | 1 |
| Right Leader | 2 |
| Right Follower | 3 |
| Intake Launcher | 4 |
| Feeder | 5 |

Verify that software matches the configuration requested by the Electrical Team.

---

## Additional Notes

Not every issue is necessarily caused by hardware.

Some problems may be caused by:

- Incorrect constants
- Missing configuration
- Incorrect controller bindings
- Logic errors
- Missing code
- Improper subsystem setup

Use the provided documentation and source code to determine the root cause of each issue.
