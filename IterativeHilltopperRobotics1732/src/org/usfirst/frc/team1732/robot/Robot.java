
package org.usfirst.frc.team1732.robot;

import org.usfirst.frc.team1732.robot.subsystem.RobotMap;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	static IO io = new IO();
	static RobotMap robotMap = new RobotMap();
	
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
    	robotMap.makeSafe();
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
