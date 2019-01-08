package org.firstinspires.ftc.teamcode.Bot;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.PID.ADAFruitIMU;


public class IdealBot extends Bot
{

    //hmap
    private HardwareMap hardwareMap;

    /** BOT HARDWARE **/
    //motors
    public DcMotor lMotor;
    public DcMotor rMotor;
    public DcMotor spool;

    //sensors
    public ADAFruitIMU imu;
    public ColorSensor colorSensor;

    //constructor
    public IdealBot(HardwareMap hMap)
    {
        //identifies the hardwaremap variable as the one in this class
        //sets it equal to the one given by the code in the teleop class
        this.hardwareMap = hMap;
    }

    //initializing hardware
    public void init(HardwareMap hardwareMap)
    {
        //motors, all set to use encoders
        rMotor = hardwareMap.dcMotor.get("rMotor");
        rMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lMotor = hardwareMap.dcMotor.get("lMotor");
        lMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        spool = hardwareMap.dcMotor.get("spool");
    }
}