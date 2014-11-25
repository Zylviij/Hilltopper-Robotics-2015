package org.usfirst.frc.team1732.robot.subsystem;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Drive {
	private Talon leftMotor = new Talon(0);
	private Talon rightMotor = new Talon(1);
	private Solenoid shifterSolenoid = new Solenoid(0);
	
	public void drive(double left, double right, boolean shift) {
		leftMotor.set(left);
		rightMotor.set(right);
		shifterSolenoid.set(shift);
	}
	
	public void makeSafe() {
		leftMotor.set(0);
		leftMotor.free();
		leftMotor.disable();
		
		rightMotor.set(0);
		rightMotor.free();
		rightMotor.disable();
		
		shifterSolenoid.set(false);
		shifterSolenoid.free();
	}
}
