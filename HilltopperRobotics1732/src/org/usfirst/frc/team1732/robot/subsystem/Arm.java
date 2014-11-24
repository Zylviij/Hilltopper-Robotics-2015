package org.usfirst.frc.team1732.robot.subsystem;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Arm {
	public Talon armMotor = new Talon(2);
	public Solenoid pickupArmSolenoid = new Solenoid(1);
	
	public void makeSafe() {
		armMotor.set(0);
		armMotor.free();
		armMotor.disable();
		
		pickupArmSolenoid.set(false);
		pickupArmSolenoid.free();
	}
}