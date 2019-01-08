package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;

import static org.firstinspires.ftc.teamcode.utils.Utilities.delay;

public class Drop
{
    IdealBot bot;

    public Drop(HardwareMap hMap)
    {
        bot = new IdealBot(hMap);
        bot.init(hMap);
    }

    public boolean dropped = false;

    public void botDrop()
    {
        dropped = true;
        bot.spool.setPower(1);
        delay(10000);
        bot.spool.setPower(0);
    }
}
