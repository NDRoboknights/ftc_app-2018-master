package org.firstinspires.ftc.teamcode.Bot;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
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
    public DcMotor liftMotor;
    public DcMotor intakeMotor;
    public DcMotor actuator;

    public Servo dump;
    public Servo drop;

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
        actuator = hardwareMap.dcMotor.get("actuator");
        intakeMotor = hardwareMap.dcMotor.get("iMotor");
        liftMotor = hardwareMap.dcMotor.get("liftMotor");
        rMotor = hardwareMap.dcMotor.get("rMotor");
        rMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lMotor = hardwareMap.dcMotor.get("lMotor");
        lMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        dump = hardwareMap.servo.get("dump");
        drop = hardwareMap.servo.get("drop");

        //sensors

//        imu = new ADAFruitIMU(hardwareMap, "imu");
//        colorSensor = hardwareMap.colorSensor.get("colorSensor");
    }
}