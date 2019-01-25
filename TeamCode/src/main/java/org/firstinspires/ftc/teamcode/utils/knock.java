package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.Enums.Color;
import org.firstinspires.ftc.teamcode.Enums.Direction;

public class knock
{
    private HardwareMap hardwareMap;
    private IdealBot bot;
    private getColor color = new getColor();
    public knock(HardwareMap hardwareMap)
    {
        this.hardwareMap = hardwareMap;
        bot = new IdealBot(this.hardwareMap);
    }
    public Direction sampler()
    {
        if(color.interpretColor() == Color.GOLD)
        {

        }
        return Direction.FORWARD;
    }
}
