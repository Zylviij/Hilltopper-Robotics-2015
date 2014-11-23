
package org.usfirst.frc.team1732.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team1732.robot.commands.ExampleCommand;
import org.usfirst.frc.team1732.robot.subsystems.Arm;
import org.usfirst.frc.team1732.robot.subsystems.BackPass;
import org.usfirst.frc.team1732.robot.subsystems.Catapult;
import org.usfirst.frc.team1732.robot.subsystems.Drive;
import org.usfirst.frc.team1732.robot.subsystems.FrontPass;
import org.usfirst.frc.team1732.robot.subsystems.Gates;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final Arm arm = new Arm();
	public static final BackPass backPass = new BackPass();
	public static final Catapult catapult = new Catapult();
	public static final Drive driveTrain = new Drive();
	public static final FrontPass frontPass = new FrontPass();
	public static final Gates gates = new Gates();
	
	public static OI oi;
	public static RobotMap robotMap;

    Command shift;
    Command drive;
    Command shoot;
    Command passFront;
    Command passBack;
    Command setArm;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
		robotMap = new RobotMap();
        // instantiate the command used for the autonomous period
        shift = new ExampleCommand();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        shift.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        shift.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
