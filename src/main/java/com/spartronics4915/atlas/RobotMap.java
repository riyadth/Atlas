package com.spartronics4915.atlas;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * NO CODE HERE! Only constants!
 */
public class RobotMap
{
    //Speeds
    public static final double kHarvesterIntakeWheelSpeed = -0.75;
    public static final double kHarvesterExpelWheelSpeed = 0.75;

    //CAN Devices
    public static final int kNumPigeons = 1;
    public static final int kNumPCMs = 1;
    public static final int kNumCANDevices = kNumPCMs + kNumPigeons;

    //Solenoid IDs
    public static final int kHarvesterRetractSolenoidId = 0; //PCM 0
	public static final int kHarvesterExtendSolenoidId = 1; // PCM 1
    public static final int kLaunchExtendSolenoidId = 2; //PCM 2
    public static final int kLaunchRetractSolenoidId = 3; //PCM 3
	
	//Motor IDs
	public static final int kLeftDriveMotorId = 0;
    public static final int kRightDriveMotorId = 1;
	public static final int kHarvesterCollectionMotorId = 2;
	public static final int kLauncherWindingMotorId = 3;
    
    //Analog IDs
    public static final int kBallPresentSensorId = 0; //Analog port 0
    
    //DIO IDs
    public static final int kHarvesterTopMagneticSwitchId = 0; //DIO 0
    public static final int kHarvesterBottomMagneticSwitchId = 1; //DIO 1
    public static final int klauncherRewoundSwitchId = 2; //DIO 2

    //CAN IDs
    public static final int kDriveTrainIMUID = 2;
    
}
