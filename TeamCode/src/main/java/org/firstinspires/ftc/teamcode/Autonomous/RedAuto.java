package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.utils.Drop;
import org.firstinspires.ftc.teamcode.utils.knock;

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
//        knock.gc();
//        knock.knockMineral(knock.interpretDir(knock.rc, knock.lc));

        /*
        put main funcs here
         */
    }
}