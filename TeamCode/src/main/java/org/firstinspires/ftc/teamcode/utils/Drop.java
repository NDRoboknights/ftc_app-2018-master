package org.firstinspires.ftc.teamcode.utils;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;

public class Drop
{
    IdealBot bot;

    public boolean dropped = false;

    public void botDrop()
    {
        bot.drop.setPosition(0);
        dropped = true;
    }
    public void dropReset()
    {
        if (dropped)
        {
            bot.drop.setPosition(1);
            dropped = false;
        }
    }
}
