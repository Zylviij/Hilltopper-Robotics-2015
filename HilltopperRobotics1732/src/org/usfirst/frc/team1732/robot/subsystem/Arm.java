package org.usfirst.frc.team1732.robot.subsystem;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Arm {
	private Talon armMotor = new Talon(2);
	private Solenoid pickupArmSolenoid = new Solenoid(1);
	
	/**
	 * Set the arm intelligently.
	 * @param armButton
	 * @param intakeButton
	 * @param backPassButton
	 */
	public void setArm(boolean armButton, boolean intakeButton, boolean backPassButton) {
		if (backPassButton) {
			setArm(-1, false);
		} else if (intakeButton) {
			setArm(1, false);
		} else if (armButton) {
			setArm(1, true);
		} else {
			setArm(0, false);
		}
	}
	
	/**
	 * Set the arm.
	 * @param speed
	 * @param extended
	 */
	public void setArm(int speed, boolean extended) {
		armMotor.set(speed);
		pickupArmSolenoid.set(extended);
	}
	
	/**
	 * Make safe the arm.
	 */
	public void makeSafe() {
		armMotor.set(0);
		armMotor.free();
		armMotor.disable();
		
		pickupArmSolenoid.set(false);
		pickupArmSolenoid.free();
	}
}
