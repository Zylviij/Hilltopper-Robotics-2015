package org.usfirst.frc.team1732.robot.subsystem;

/**
 * Creates all motors and actuators.
 * @author blakeziolkowski
 */
public class RobotMap {
	
	/*
	 * creates robot subsystems
	 */
	static Arm arm = new Arm();
	static Drive drive = new Drive();
	static Catapult catapult = new Catapult();
	static Gates gates = new Gates();
	
	public void makeSafe() {
		arm.makeSafe();
		drive.makeSafe();
		catapult.makeSafe();
		gates.makeSafe();
	}
}
