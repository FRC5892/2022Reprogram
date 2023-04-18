// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

  PWMSparkMax leftMotor1;
  PWMSparkMax leftMotor2;
  PWMSparkMax leftMotor3;
  MotorControllerGroup leftMotors;
  PWMSparkMax rightMotor1;
  PWMSparkMax rightMotor2;
  PWMSparkMax rightMotor3;
  MotorControllerGroup rightMotors;
  Encoder leftEncoder;
  Encoder rightEncoder;
  DifferentialDrive drive;

  public Drivetrain() {
    leftMotor1 = new PWMSparkMax(0);
    leftMotor2 = new PWMSparkMax(1);
    leftMotor3 = new PWMSparkMax(2);
    leftMotors = new MotorControllerGroup(leftMotor1, leftMotor2, leftMotor3);
    rightMotor1 = new PWMSparkMax(3);
    rightMotor2 = new PWMSparkMax(4);
    rightMotor3 = new PWMSparkMax(5);
    rightMotors = new MotorControllerGroup(leftMotor1, leftMotor2, leftMotor3);

    drive = new DifferentialDrive(leftMotors, rightMotors);
    leftEncoder = new Encoder(0, 2, false, EncodingType.k4X);
    rightEncoder = new Encoder(3, 5, false, EncodingType.k4X);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
