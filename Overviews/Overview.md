# 2026 Programming Lead Interview

## What You Will Be Expected To
    During this interview you may be asked to:
    - Read existing code
    - Explain what the code is doing
    - Identify issues
    - Fix bugs
    - Make improvements
    - Implement small changes

    The goal is not to finish everything perfectly.

    The goal is to demonstrate:

    - Problem solving
    - Debugging ability
    - Communication
    - Code comprehension

## You will be given a way to test your code
## The use of AI is not allowed

## Robot Overview
    This project is a simplified FRC robot used for the programming lead interview.
    It is safe to assume that everything is imported correctly.
    What the robot is supposed to is in:ExpectedRobotBehavior
    What the robot is currently doing is in: CurrentRobotState

    The robot contains three main systems:

    ### Drivetrain

    The drivetrain is a four-motor tank drive consisting of:

    - Left Leader Motor
    - Left Follower Motor
    - Right Leader Motor
    - Right Follower Motor

    The drivetrain is controlled using arcade drive.

    ### Intake System

    The intake system consists of:

    - Intake Launcher Motor
    - Feeder Motor

    The intake system is responsible for moving game pieces through the robot and launching them.

    ### Autonomous

    The robot contains a single autonomous routine that:

    1. Starts the intake launcher
    2. Runs the feeder
    3. Launches game pieces for a fixed amount of time
    4. Stops all mechanisms

    ---
    ## Controls

    The robot is operated using a single Xbox controller.

    ### Drivetrain

    The drivetrain uses arcade drive:

    - Left Stick Y Axis: Forward and backwards movement
    - Right Stick X Axis: Turning

    ### Intake Launcher

    - A Button: Run intake launcher

    ### Feeder

    - B Button: Run feeder

    ### Autonomous

    During autonomous mode, no driver input is used.

    The robot will automatically:

    1. Start the intake launcher
    2. Run the feeder
    3. Score game pieces for a fixed amount of time
    4. Stop all mechanisms
    ## Files In Scope

    The following files are considered fair game during the interview.

    ### Robot.java

    The main entry point of the robot program.

    Responsibilities:

    - Create RobotContainer
    - Manage robot lifecycle events

    ### RobotContainer.java

    The central location where the robot is assembled.

    Responsibilities:

    - Create subsystems
    - Create commands
    - Manage dependencies between systems

    ### Constants.java

    Stores robot-wide constants and configuration values.

    Examples:

    - CAN IDs
    - Motor IDs
    - Configuration values

    ### DriveSubsystem.java

    Controls the drivetrain.

    Responsibilities:

    - Configure drive motors
    - Configure followers
    - Control robot movement
    - Stop drivetrain movement

    ### IntakeSubsystem.java

    Controls game piece manipulation.

    Responsibilities:

    - Control intake launcher
    - Control feeder
    - Stop mechanisms

    ### MyAuto.java

    Controls autonomous behavior.

    Responsibilities:

    - Execute autonomous routine
    - Manage autonomous timing
    - Control scoring actions


## Expectations
    You are not expected to:

    - Memorize WPILib APIs
    - Memorize CTRE APIs
    - Know this project beforehand

    You are expected to:

    - Explain your thought process
    - Work through problems logically
    - Ask questions when neede,d I will give explanations to the best of my abltiy and depending on the question

## What We Are Looking For

    We are looking for programmers who demonstrate:

    - Logical thinking
    - Problem solving
    - Communication

    A perfect solution is not expected.

    The ability to explain your reasoning is often more important than immediately finding the correct answer.
