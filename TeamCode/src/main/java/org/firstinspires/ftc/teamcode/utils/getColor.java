package org.firstinspires.ftc.teamcode.utils;

import org.firstinspires.ftc.teamcode.Autonomous.CustomAutonomous;
import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.Enums.Color;

public class getColor
{
    //bot instantiator
    public IdealBot bot;

    //color enum
    private Color AccColor;

    //gets color values
    private int getBlue(){return bot.cSensor1.blue();}
    private int getRed(){return bot.cSensor1.red();}
    private int getRed2(){return bot.cSensor2.red();}
    private int getBlue2(){return bot.cSensor2.blue();}

    public Color interpretColor()
    {
        //determines color
        if(getRed() > CustomAutonomous.COLOR_THRESHOLD && getRed2() > CustomAutonomous.COLOR_THRESHOLD)
        {
            AccColor = Color.GOLD;
        }else if()
        {
            AccColor = Color.BLUE;
        }else
        {
            AccColor = Color.UNKNOWN;
        }
        return AccColor;
    }
}