# 2026 Programming Lead Interview

## Interview Format

The Programming Lead Interview will be approximately **15 minutes**.

During the interview, you will:

* Work through the provided programming test
* Answer interview questions based on the information in this overview
* Explain your understanding of the existing code
* Explain your reasoning when identifying and fixing problems
* Discuss the changes you made to the project

The purpose of the interview is not only to see whether you can fix the code, but also to understand **how you approach problems, communicate your reasoning, and understand the code you are working with**.

## What You Will Be Expected To

During the Programming Lead Interview, you will work with a provided FRC programming project and demonstrate your ability to:

* Clone and work with a GitHub repository
* Read and understand existing code
* Explain what the code is doing
* Identify bugs and issues
* Debug and fix existing code
* Make appropriate improvements
* Implement small changes when requested
* Test your changes
* Commit and push your work using Git

You will be given the same general project and documentation as the other candidates, but each candidate will have their **own GitHub repository** to work in.

You are not expected to memorize WPILib or CTRE APIs. You may use the documentation provided with the test and should focus on demonstrating your ability to understand code, solve problems, and explain your reasoning.

---

## GitHub Workflow

Each candidate will receive their own GitHub repository containing the programming lead test.

The repository will contain a project with intentional issues for you to identify and fix.

### At the Beginning

1. Clone your assigned GitHub repository.
2. Open the project in your development environment.
3. Review the provided documentation and existing code.
4. Begin identifying the problems in the project.

### While Working

* Make changes directly in your local copy.
* Test your changes as you work.
* Use Git to keep track of your progress.
* Use the provided validation system to check your work.

### Before You Finish

Make sure that:

* Your changes are saved.
* Your code builds successfully.
* You have run the validation system.
* Your changes have been committed.
* Your final changes have been pushed to your assigned GitHub repository.

Your GitHub repository will be used to review your completed work and your use of Git.

---

## Testing Your Code

You will be provided with a validation system that can automatically check your work.

After making your changes, run:

```powershell
.\gradlew validateRobot
```

The validation system will check whether your implementation meets the requirements of the test.

A successful build does **not necessarily mean that you have completed the test correctly**. Make sure you run the validation command before finishing.

You can also build the project with:

```powershell
.\gradlew build
```

If the project builds successfully, Gradle will report:

```text
BUILD SUCCESSFUL
```

---

## AI Policy

**The use of AI is not allowed during the Programming Lead Interview.**

The purpose of this test is to evaluate your own:

* Problem-solving skills
* Debugging process
* Code comprehension
* Programming knowledge
* Communication
* Ability to work independently

You may use the documentation and resources provided as part of the interview.

---

# Robot Overview

The project represents a simplified FRC robot with three main systems:

* **Drivetrain**
* **Intake**
* **Autonomous**

You should be able to read the existing code and explain how these systems work together.

You may assume that the necessary imports are already provided unless the test specifically asks you to address them.

The documentation will include:

### ExpectedRobotBehavior

Describes what the robot **should** do.

### CurrentRobotState

Describes what the robot **currently** does.

Your job is to compare the expected behavior with the current implementation and determine what needs to be changed.

---

## Controller Controls

The robot uses an Xbox controller.

| Control     | Function              |
| ----------- | --------------------- |
| Left Stick  | Drive                 |
| Right Stick | Arcade drive rotation |
| A Button    | Run launcher/intake   |
| B Button    | Run feeder            |

Autonomous mode will follow the steps described in the provided documentation.

---

# Files In Scope

### `Robot.java`

The main robot entry point.

Responsible for:

* Starting the robot
* Creating the `RobotContainer`
* Running the appropriate robot lifecycle methods

### `RobotContainer.java`

Responsible for:

* Creating subsystems
* Creating commands
* Configuring controller inputs
* Connecting controls to robot actions

### `Constants.java`

Contains robot constants such as:

* CAN IDs
* Motor IDs
* Autonomous settings

### `DriveSubsystem.java`

Controls the robot's drivetrain.

You should understand:

* Which motors are leaders and followers
* How the drivetrain receives controller input
* How the motors are commanded

### `IntakeSubsystem.java`

Controls the intake and feeder mechanisms.

You should understand:

* How the intake is controlled
* How the feeder is controlled
* How the mechanisms are stopped

### `MyAuto.java`

Contains the autonomous routine.

You should understand:

* What the autonomous routine is intended to do
* How long it runs
* How the robot's mechanisms are controlled during autonomous

---

# What We Expect From You

You are **not expected to know everything immediately**.

We are looking for your ability to:

* Read unfamiliar code
* Break problems into smaller pieces
* Find the source of a problem
* Explain your thought process
* Test possible solutions
* Use Git appropriately
* Ask questions when you are stuck
* Learn from errors

You do not need to memorize every WPILib or CTRE function.

What matters most is that you can **reason through the problem and explain why you are making a particular change**.

---

# What We Are Looking For

The Programming Lead role requires more than simply writing code.

We are looking for:

### Logical Thinking

Can you understand what the code is supposed to do and determine where something is going wrong?

### Problem Solving

Can you investigate an issue, test possible solutions, and make a reasonable fix?

### Code Comprehension

Can you read existing code and explain what it does?

### Communication

Can you clearly explain your reasoning and the changes you make?

### Git Usage

Can you clone a repository, commit your work, and push your changes?

### Learning Ability

When you encounter something you do not know, can you work through it rather than immediately giving up?

A perfect solution is **not expected**.

Your reasoning, problem-solving process, and ability to understand the code are more important than immediately finding the answer.
