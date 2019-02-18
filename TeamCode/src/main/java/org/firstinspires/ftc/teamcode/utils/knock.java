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
    public Color lc;
    public Color rc;
    public knock(HardwareMap hardwareMap)
    {
        this.hardwareMap = hardwareMap;
        bot = new IdealBot(this.hardwareMap);
        bot.init(this.hardwareMap);
        color = new getColor(hardwareMap);
    }

    public void gc()
    {
        bot.rMotor.setPower(-1);
        Utilities.delay(175);
        bot.rMotor.setPower(0);
        lc = color.leftColor();
        bot.rMotor.setPower(1);
        Utilities.delay(350);
        bot.rMotor.setPower(0);
        rc = color.rightColor();
        bot.lMotor.setPower(-1);
        Utilities.delay(250);
        bot.rMotor.setPower(0);

    }
    public void knockMineral(Direction dir)
    {
        if(dir == Direction.LEFT)
        {
            bot.lMotor.setPower(1);
            bot.rMotor.setPower(-1);
            bot.cServo2.setPosition(0);
            Utilities.delay(1000);
            bot.lMotor.setPower(0);
            bot.rMotor.setPower(0);
        }
        if(dir == Direction.RIGHT)
        {
            bot.lMotor.setPower(-1);
            bot.rMotor.setPower(1);
            bot.cServo1.setPosition(0);
            Utilities.delay(1000);
            bot.lMotor.setPower(0);
            bot.rMotor.setPower(0);
        }else{
            bot.rMotor.setPower(-1);
            bot.lMotor.setPower(-1);
            Utilities.delay(2500);
            bot.rMotor.setPower(0);
            bot.lMotor.setPower(0);
        }
    }

    public Direction interpretDir(Color r, Color l)
    {
        if((r == Color.WHITE || r == Color.UNKNOWN) && (l == Color.UNKNOWN || l == Color.WHITE))
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
