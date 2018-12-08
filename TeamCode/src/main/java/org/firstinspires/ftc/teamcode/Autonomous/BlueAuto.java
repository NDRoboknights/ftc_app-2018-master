package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.utils.Drop;

@Autonomous(name="BlueAuto",group = "testgroup")
public class BlueAuto extends LinearOpMode
{
    Drop drop;
    public void runOpMode()
    {
      /*
      put init() here before waitforStart();
      */
        waitForStart();
        drop.botDrop();
     /*
     put main functions here
      */
    }
}