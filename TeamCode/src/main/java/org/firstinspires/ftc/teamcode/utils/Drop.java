package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.Enums.Color;

import static org.firstinspires.ftc.teamcode.utils.Utilities.delay;

public class Drop
{
    //bot instantiator
    private IdealBot bot;
    private getColor gc;
    public Drop(HardwareMap hMap)
    {
        bot = new IdealBot(hMap);
        bot.init(hMap);
        gc = new getColor(bot, hMap);
    }


    public void botDrop()
    {
        bot.drop.setPosition(1);
        bot.spool.setPower(-1);
        delay(5000);
        bot.drop.setPosition(0);
    }
}
