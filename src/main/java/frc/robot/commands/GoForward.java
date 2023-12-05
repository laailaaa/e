// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class GoForward extends CommandBase {
  //public Drivetrain DriveTrain;

  public GoForward(DriveTrain DriveTrain) {
    //DriveTrain = Drivetrain;
    DriveTrain.setMotors(DriveTrain, 0.5);
  }

  // Called once the command ends or is interrupted.
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  public boolean isFinished() {
    return true;
  }
}
