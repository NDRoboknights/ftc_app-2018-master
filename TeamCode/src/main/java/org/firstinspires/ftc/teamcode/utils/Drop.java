package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.Enums.Color;

import static org.firstinspires.ftc.teamcode.utils.Utilities.delay;

public class Drop
{
    //bot instantiator
    private IdealBot bot;
    public Drop(HardwareMap hMap)
    {
        bot = new IdealBot(hMap);
        bot.init(hMap);
    }


    public void botDrop()
    {
        bot.spool.setPower(1);
        bot.lift.setPower(-1);
        delay(2200);
        bot.spool.setPower(0);
        bot.lift.setPower(0);
        bot.lMotor.setPower(-1);
        bot.rMotor.setPower(-1);
        delay(4500);
        bot.rMotor.setPower(0);
        bot.lMotor.setPower(0);
        bot.cServo2.setPosition(0.4);
        bot.cServo1.setPosition(0.8);
    }
}
