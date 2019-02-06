package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;

@TeleOp(name = "servo calibration")
public class servoCalibration extends OpMode
{
    private IdealBot bot;
    private double cSensor1Pos = 0;
    private double cSensor2Pos = 0;
    public void init()
    {
        cSensor2Pos = 0;
        cSensor1Pos = 0;
        bot = new IdealBot(hardwareMap);
        bot.init(hardwareMap);
    }
    public void loop()
    {
        if(gamepad1.dpad_up)
        {
            cSensor1Pos+=0.1;
            bot.cServo1.setPosition(cSensor1Pos);
        }

        if(gamepad1.dpad_down)
        {
            cSensor1Pos-=0.1;
            bot.cServo2.setPosition(cSensor1Pos);
        }

        if(gamepad1.y)
        {
            cSensor2Pos+=0.1;
            bot.cServo2.setPosition(cSensor2Pos);
        }

        if(gamepad1.y)
        {
            cSensor2Pos-=0.1;
            bot.cServo2.setPosition(cSensor2Pos);
        }

        telemetry.addData("cSensor 1 pos: ", cSensor1Pos);
        telemetry.addData("cSensor 2 pos: ", cSensor2Pos);

        telemetry.update();
    }
}
