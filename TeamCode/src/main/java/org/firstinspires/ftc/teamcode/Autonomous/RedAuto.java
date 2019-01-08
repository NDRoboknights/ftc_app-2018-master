package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.utils.Drop;

@Autonomous(name = "RedAuto")
public class RedAuto extends LinearOpMode
{
    Drop drop;
    public void runOpMode()
    {
        drop = new Drop(hardwareMap);
        /*
        put init() here
         */
        waitForStart();
        drop.botDrop();
        /*
        put main funcs here
         */
    }
}