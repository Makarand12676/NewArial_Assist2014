// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1923.NewArial_Assist.subsystems;

import org.usfirst.frc1923.NewArial_Assist.RobotMap;
import org.usfirst.frc1923.NewArial_Assist.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveSystem extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController frontLeftDrive = RobotMap.frontLeftDrive;
    SpeedController rearLeftDrive = RobotMap.rearLeftDrive;
    SpeedController frontRightDrive = RobotMap.frontRightDrive;
    SpeedController rearRightDrive = RobotMap.rearRightDrive;
    RobotDrive robotDriveTrain = RobotMap.driveSystemRobotDriveTrain;
    Encoder driveEncoderLeft = RobotMap.DriveEncoderLeft;
    Gyro driveGyro = RobotMap.DriveGyro;
    Encoder driveEncoderRight = RobotMap.DriveEncoderRight;
    Accelerometer driveAccelerometer = RobotMap.DriveAccelerometer;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

