package org.usfirst.frc.team1732.robot.subsystem;

/**
 * Creates all motors and actuators.
 * @author blakeziolkowski
 */
public class RobotMap {
	
	/*
	 * creates robot subsystems
	 */
	public Arm arm = new Arm();
	public Drive drive = new Drive();
	public Catapult catapult = new Catapult();
	public Gates gates = new Gates();
	
	/**
	 * Make safe the robot.
	 */
	public void makeSafe() {
		arm.makeSafe();
		drive.makeSafe();
		catapult.makeSafe();
		gates.makeSafe();
	}
}
