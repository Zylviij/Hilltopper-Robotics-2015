package org.usfirst.frc.team1732.robot.subsystem;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Catapult {
	private DigitalInput proximitySensor = new DigitalInput(0);
	private Solenoid backPassSolenoid = new Solenoid(2);
	private Talon catapultMotor = new Talon(3);
	
	private long shotStart = 0;
	public boolean shooting = false;
	
	private final int SHOT_TIME_LIMIT = 200;
	
	/**
	 * Set the catapult intelligently.
	 * @param shootButton
	 * @param frontPassButton
	 * @param backPassButton
	 */
	public void setCatapult(boolean shootButton, boolean frontPassButton, boolean backPassButton) {
		// set variables on button press
		if (shootButton && !shooting && isReady()) {
			shooting = true;
			shotStart = System.currentTimeMillis();
		}
		
		if (backPassButton) {
			// only extend if catapult is cocked
			if (isReady()) {
				setCatapult(0, true);
			} else {
				setCatapult(0, false);
			}
		} else if (frontPassButton) {
			setCatapult(-1, false);
		} else if (shooting) {
			setCatapult(1, false);
			shooting = System.currentTimeMillis() - shotStart < SHOT_TIME_LIMIT;
		}
	}
	
	/**
	 * Set the catapult.
	 * @param speed
	 * @param pass
	 */
	public void setCatapult(int speed, boolean pass) {
		catapultMotor.set(speed);
		backPassSolenoid.set(pass);
	}
	
	private boolean isReady() {
		return proximitySensor.get();
	}
	
	/**
	 * Make safe the catapult.
	 */
	public void makeSafe() {
		backPassSolenoid.set(false);
		backPassSolenoid.free();
		
		catapultMotor.set(0);
		catapultMotor.free();
		catapultMotor.disable();
	}
}
