package org.firstinspires.ftc.teamcode.utils;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Autonomous.CustomAutonomous;
import org.firstinspires.ftc.teamcode.Bot.Bot;
import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.Enums.Color;

public class getColor
{
    //bot instantiator
    public IdealBot bot;

    public getColor(IdealBot bot, HardwareMap hardwareMap){
        this.bot = bot;
        bot.init(hardwareMap);
    }

    //color enum
    public Color rightColor;
    public Color leftColor;

    //gets color values
    public int getRightBlue(){return bot.rSensor.blue();}
    public int getRightRed(){return bot.rSensor.red();}
    public int getRightGreen(){return bot.rSensor.green();}
    public int getLeftRed(){return bot.lSensor.red();}
    public int getLeftBlue(){return bot.lSensor.blue();}
    public int getLeftGreen(){return bot.lSensor.green();}

    public Color rightColor()
    {
        if(getRightBlue()> CustomAutonomous.COLOR_THRESHOLD &&  getRightGreen() > CustomAutonomous.COLOR_THRESHOLD && getRightRed() > CustomAutonomous.COLOR_THRESHOLD){
            rightColor = Color.WHITE;
            return Color.WHITE;
        }else
            {
                rightColor = Color.UNKNOWN;
            return rightColor;
        }
    }
    
    public Color leftColor()
    {
        return leftColor;
    }
}