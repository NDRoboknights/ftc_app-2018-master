package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;

public class knock
{
    private HardwareMap hardwareMap;
    private IdealBot bot;
    private getColor color;
    public knock(HardwareMap hardwareMap)
    {
        this.hardwareMap = hardwareMap;
        bot = new IdealBot(this.hardwareMap);
        color = new getColor(bot, hardwareMap);
    }
}
