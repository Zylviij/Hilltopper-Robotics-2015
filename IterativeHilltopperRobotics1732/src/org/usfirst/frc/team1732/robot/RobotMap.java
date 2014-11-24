package org.usfirst.frc.team1732.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

/**
 * Creates all motors and actuators.
 * @author blakeziolkowski
 */
public class RobotMap {
	
	/*
	 * Creates Motors
	 */
	Talon leftMotor = new Talon(0);
	Talon rightMotor = new Talon(1);
	Talon armMotor = new Talon(2);
	Talon catapultMotor = new Talon(3);
	
	/* 
	 * Creates Solenoids
	 */
	Solenoid shifterSolenoid = new Solenoid(0);
	Solenoid pickupArmSolenoid = new Solenoid(1);
	Solenoid backPassSolenoid = new Solenoid(2);
	Solenoid gatesSolenoid = new Solenoid(3);
	
}
