package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.Enums.Color;

import static org.firstinspires.ftc.teamcode.utils.Utilities.delay;

public class Drop
{
    getColor gc = new getColor();
    IdealBot bot;

    public Drop(HardwareMap hMap)
    {
        bot = new IdealBot(hMap);
        bot.init(hMap);
    }


    public void botDrop()
    {
        bot.spool.setPower(-1);
        delay(5000);
        bot.drop.setPosition(0.1);
        while(gc.interpretColor() == Color.UNKNOWN)
        {

        }
    }
}
