package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.utils.getColor;
import org.firstinspires.ftc.teamcode.utils.knock;

@TeleOp(name = "color sensor test")
public class colorTest extends OpMode
{
    getColor gc;
    IdealBot bot;
    knock knock;
    public void init()
    {
        bot = new IdealBot(hardwareMap);
        bot.init(hardwareMap);
        gc = new getColor(bot, hardwareMap);
        knock = new knock(hardwareMap);
    }
    public void loop()
    {
        telemetry.addData("right red: ", gc.getRightRed());
        telemetry.addData("right blue: ", gc.getRightBlue());
        telemetry.addData("right green: ", gc.getRightGreen());
        telemetry.addData("right color: ", gc.rightColor());
        telemetry.addData("left red: ", gc.getLeftRed());
        telemetry.addData("left blue: ", gc.getLeftBlue());
        telemetry.addData("left green: ", gc.getLeftGreen());
        telemetry.addData("left color: ", gc.leftColor());

        telemetry.update();
    }
}
