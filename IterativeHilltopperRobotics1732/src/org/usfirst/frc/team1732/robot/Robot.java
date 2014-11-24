
package org.usfirst.frc.team1732.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	/*
	 * Create Joysticks
	 */
	Joystick leftJoystick = new Joystick(0);
	Joystick rightJoystick = new Joystick(1);
	
	/*
	 * Create Joystick Buttons
	 */
	Button leftGate = new JoystickButton(leftJoystick, 0);
	Button rightGate = new JoystickButton(rightJoystick, 0);
	Button leftArm = new JoystickButton(leftJoystick, 1);
	Button rightArm = new JoystickButton(rightJoystick, 1);
	Button leftForward = new JoystickButton(leftJoystick, 2);
	Button rightForward = new JoystickButton(rightJoystick, 2);
	Button leftBackward = new JoystickButton(leftJoystick, 3);
	Button rightBackward = new JoystickButton(rightJoystick, 3);
	Button leftIntake = new JoystickButton(leftJoystick, 4);
	Button rightIntake = new JoystickButton(rightJoystick, 4);
	Button leftShoot = new JoystickButton(leftJoystick, 5);
	Button rightShoot = new JoystickButton(rightJoystick, 5);
		
	/*
	 * Creates Motors
	 */
	Talon leftMotor = new Talon(0);
	Talon rightMotor = new Talon(1);
	Talon armMotor = new Talon(2);
	Talon catapultMotor = new Talon(3);
	
	/* 
	 * Creates Solenoids
	 */
	Solenoid shifterSolenoid = new Solenoid(0);
	Solenoid pickupArmSolenoid = new Solenoid(1);
	Solenoid backPassSolenoid = new Solenoid(2);
	Solenoid gatesSolenoid = new Solenoid(3);
	
	static Sensor sensors = new Sensor();
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {

    }
    
    /**
     * This function is run when the robot is first in
     * disabled mode.
     */
    public void disabledInit() {
    	/*
    	 * As shown below, each component should be put in a safe
    	 * mode and should be freed.
    	 * 
    	 * shifterSolenoid.set(false);
    	 * shifterSolenoid.free();    	
    	*/
    }
    
    /**
     * This function is run when the robot is first in
     * autonomous mode. 
     */
    public void autonomousInit() {
    	
    }
    
    /**
     * This function is run when the robot is first in
     * teleop mode.
     */
    public void teleopInit() {
    	
    }
    
    /**
     * This function is run when the robot is first in
     * test mode.
     */
    public void testInit() {
    	
    }
    
    private boolean dpFirstRun = true;
    /**
     * This function is called periodically during disabled mode.
     */
    public void disabledPeriodic() {
    	if (dpFirstRun) {
            System.out.println("In disabled Periodic mode!");
            dpFirstRun = false;
        }
        Timer.delay(0.001);
    }
    
    /**
     * This function is called periodically during autonomous mode.
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during teleop mode.
     */
    public void teleopPeriodic() {
        
    }
    
    private boolean tpFirstRun = true;
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	if (tpFirstRun) {
            System.out.println("In test Periodic mode!");
            tpFirstRun = false;
        }
        Timer.delay(0.001);
    }
    
}
