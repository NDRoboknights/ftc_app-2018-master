package org.firstinspires.ftc.teamcode.Bot;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

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
    public DcMotor lift;
    public DcMotor crank;

    //sensors
    public ADAFruitIMU imu;
    public ColorSensor rSensor;
    public ColorSensor lSensor;

    //Servos
    public Servo cServo1;
    public Servo cServo2;
    public Servo drop;
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
        spool.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lift = hardwareMap.dcMotor.get("lift");
        lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        crank = hardwareMap.dcMotor.get("crank");

//        //Servos
//        cServo1 = hardwareMap.servo.get("cServo1");
//        cServo2 = hardwareMap.servo.get("cServo2");
        drop = hardwareMap.servo.get("drop");
//
//        //sensors
        rSensor = hardwareMap.colorSensor.get("rSensor");
        lSensor = hardwareMap.colorSensor.get("lSensor");
    }
}