package org.usfirst.frc.team1732.robot.subsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Creates all IO. (Joysticks and buttons)
 * @author blakeziolkowski
 */
public class IO {
	
	/*
	 * Create Joysticks
	 */
	public Joystick leftJoystick = new Joystick(0);
	public Joystick rightJoystick = new Joystick(1);
	
	
	/*
	 * Create Joystick Buttons
	 */
	// gate openers
	private Button leftGate = new JoystickButton(leftJoystick, 2);
	private Button rightGate = new JoystickButton(rightJoystick, 3);
	
	/**
	 * Sends OR joystick value of gate buttons.
	 * @return left OR right gate button is pressed
	 */
	public boolean getGates() {
		return leftGate.get() || rightGate.get();
	}
	
	// arm actuators
	private Button leftArm = new JoystickButton(leftJoystick, 4);
	private Button rightArm = new JoystickButton(rightJoystick, 5);
	
	/**
	 * Sends OR joystick value of arm buttons
	 * @return left OR right arm button is pressed
	 */
	public boolean getArm() {
		return leftArm.get() || rightArm.get();
	}
	
	// front passers	
	/**
	 * Sends OR joystick value of forward buttons
	 * @return left OR right forward button is pressed
	 */
	public boolean getForward() {
		return leftJoystick.getTop() || rightJoystick.getTop();
	}
		
	// back passers
	private Button leftBackward = new JoystickButton(leftJoystick, 1);
	private Button rightBackward = new JoystickButton(rightJoystick, 1);
	
	/**
	 * Sends OR joystick value of backward buttons
	 * @return left OR right backward button is pressed
	 */
	public boolean getBackward() {
		return leftBackward.get() || rightBackward.get();
	}
	
	// intakers
	private Button leftIntake = new JoystickButton(leftJoystick, 3);
	private Button rightIntake = new JoystickButton(rightJoystick, 2);
	
	/**
	 * Sends OR joystick value of intake buttons
	 * @return left OR right intake button is pressed
	 */
	public boolean getIntake() {
		return leftIntake.get() || rightIntake.get();
	}
	
	// shooters
	private Button leftShoot = new JoystickButton(leftJoystick, 5);
	private Button rightShoot = new JoystickButton(rightJoystick, 4);
	
	/**
	 * Sends OR joystick value of shoot buttons
	 * @return left OR right shoot button is pressed
	 */
	public boolean getShoot() {
		return leftShoot.get() || rightShoot.get();
	}
	
	// shifters
	private Button leftShift = new JoystickButton(leftJoystick, 0);
	private Button rightShift = new JoystickButton(rightJoystick, 0);
	
	/**
	 * Sends OR joystick value of shift buttons
	 * @return left OR right shift button is pressed
	 */
	public boolean getShift() {
		return leftShift.get() || rightShift.get();
	}
	
}
