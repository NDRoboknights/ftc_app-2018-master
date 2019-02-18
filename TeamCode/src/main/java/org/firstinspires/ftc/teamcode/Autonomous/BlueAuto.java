package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.utils.getColor;
import org.firstinspires.ftc.teamcode.utils.knock;
import org.firstinspires.ftc.teamcode.utils.Drop;

@Autonomous(name="BlueAuto")
public class BlueAuto extends LinearOpMode
{
    Drop drop;
    knock knock;
    getColor gc;
    public void runOpMode()
    {
        drop = new Drop(hardwareMap);
        knock = new knock(hardwareMap);
        gc = new getColor(hardwareMap);

      /*
      put init() here before waitforStart();
      */
        waitForStart();
        drop.botDrop();
//        knock.gc();
//        knock.knockMineral(knock.interpretDir(knock.rc, knock.lc));
        telemetry.addData("r color", knock.rc);
        telemetry.addData("l color", knock.lc);
        telemetry.update();
     /*
     put main functions here
      */
    }
}