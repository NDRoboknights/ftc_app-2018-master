package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.Enums.Color;
import org.firstinspires.ftc.teamcode.Enums.Direction;

public class knock
{
    private HardwareMap hardwareMap;
    private IdealBot bot;
    private getColor color;
    public knock(HardwareMap hardwareMap)
    {
        this.hardwareMap = hardwareMap;
        bot = new IdealBot(this.hardwareMap);
        bot.init(this.hardwareMap);
        color = new getColor(bot, hardwareMap);
    }
    public void knockMineral(Direction dir){

    }

    public Direction interpretDir(Color r, Color l)
    {
        if(r == Color.WHITE && l == Color.WHITE )
        {
            return Direction.FORWARD;
        }else if(r == Color.GOLD)
        {
            return Direction.RIGHT;
        }else if(l == Color.GOLD)
        {
            return Direction.LEFT;
        }else
            {
            return Direction.FORWARD;
        }
    }
}
