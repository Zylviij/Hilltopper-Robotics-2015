package org.usfirst.frc.team1732.robot.subsystem;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Catapult {
	private DigitalInput proximitySensor = new DigitalInput(0);
	private Solenoid backPassSolenoid = new Solenoid(2);
	private Talon catapultMotor = new Talon(3);
	
	private int shotStart = 0;
	private boolean shooting = false;
	
	public void setCatapult(boolean shootButton, boolean frontPassButton, boolean backPassButton) {
		// TODO: Finish logic for shooting
	}
	
	public void setCatapult(int speed, boolean pass) {
		catapultMotor.set(speed);
		backPassSolenoid.set(pass);
	}
	
	public void makeSafe() {
		backPassSolenoid.set(false);
		backPassSolenoid.free();
		
		catapultMotor.set(0);
		catapultMotor.free();
		catapultMotor.disable();
	}
}
