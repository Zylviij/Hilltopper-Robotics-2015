package org.usfirst.frc.team1732.robot.subsystem;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Catapult {
	public DigitalInput proximitySensor = new DigitalInput(0);
	public Solenoid backPassSolenoid = new Solenoid(2);
	public Talon catapultMotor = new Talon(3);
	
	public void makeSafe() {
		backPassSolenoid.set(false);
		backPassSolenoid.free();
		
		catapultMotor.set(0);
		catapultMotor.free();
		catapultMotor.disable();
	}
}
