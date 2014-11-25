package org.usfirst.frc.team1732.robot.subsystem;

import edu.wpi.first.wpilibj.Solenoid;

public class Gates {
	private Solenoid gatesSolenoid = new Solenoid(3);
	
	public void setGates(boolean gatesButton, boolean forwardPassButton) {
		gatesSolenoid.set(gatesButton || forwardPassButton);
	}
	
	public void makeSafe() {
		gatesSolenoid.set(false);
		gatesSolenoid.free();
	}
}
