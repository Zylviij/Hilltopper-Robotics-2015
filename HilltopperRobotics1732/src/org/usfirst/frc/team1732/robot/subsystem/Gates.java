package org.usfirst.frc.team1732.robot.subsystem;

import edu.wpi.first.wpilibj.Solenoid;

public class Gates {
	private Solenoid gatesSolenoid = new Solenoid(3);
	
	/**
	 * Set the gates.
	 * @param gatesButton
	 * @param forwardPassButton
	 * @param shootButton
	 */
	public void setGates(boolean gatesButton, boolean forwardPassButton, boolean shootButton) {
		gatesSolenoid.set(gatesButton || forwardPassButton || shootButton);
	}
	
	/**
	 * Make safe the gates.
	 */
	public void makeSafe() {
		gatesSolenoid.set(false);
		gatesSolenoid.free();
	}
}
