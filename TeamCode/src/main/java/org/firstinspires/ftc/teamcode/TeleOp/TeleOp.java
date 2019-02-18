package org.firstinspires.ftc.teamcode.TeleOp;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.utils.Utilities;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp")
public class TeleOp extends customTeleOp
{
    //bot
    private IdealBot bot = new IdealBot(hardwareMap);

    //resets zeroes
    private long prevTime = 0;
    private int lPrevPos = 0;
    private int rPrevPos = 0;

    //init
    public void init()
    {
        //maps hardware
        bot.init(hardwareMap);
        bot.cServo1.setPosition(0);
        bot.cServo2.setPosition(0.4);
    }

    //runs when active
    public void loop()
    {
        double lPower = -gamepad1.left_stick_y;
        double rPower = -gamepad1.right_stick_y;

        //sets time in NANOSECONDS
        long currTime = System.nanoTime();

        //encoder position
        //like tickmarks on a circle (does not reset at 360)
        int lPos = bot.lMotor.getCurrentPosition();
        int rPos = bot.rMotor.getCurrentPosition();


        /*GETS DELTAS*/
        //delta time used in speed calculations
        double dTime = (currTime - prevTime) * 10E-9;

        //diff of ticks used in
        double dLPos = lPos - lPrevPos;
        double dRPos = rPos - rPrevPos;

        //speed calculation (ticks/sec)
        double lSpeed = Math.abs(dLPos / dTime);
        double rSpeed = Math.abs(dRPos / dTime);

        /** Motor controls.
         * checks if |stick_y| is > stick thresh
         * if ^^ is true, sets motor power to stick y value**/
        //right motors
        if ((Math.abs(rPower) > customTeleOp.JOYSTICK_THRESHOLD)&& !gamepad1.left_bumper)
        {
            rPower = Utilities.scalePower(rPower)[0];
            bot.rMotor.setPower(rPower);
        } else {
            bot.rMotor.setPower(0);
        }

        //left motors
        if ((Math.abs(lPower) > customTeleOp.JOYSTICK_THRESHOLD) && !gamepad1.left_bumper)
        {
            lPower = Utilities.scalePower(lPower)[0];
            bot.lMotor.setPower(lPower);
        } else {
            bot.lMotor.setPower(0);
        }

        if(gamepad1.left_trigger>customTeleOp.JOYSTICK_THRESHOLD)
        {
            bot.spool.setPower(gamepad1.left_trigger);
            bot.lift.setPower(gamepad1.left_trigger);
        }else if(gamepad1.right_trigger > customTeleOp.JOYSTICK_THRESHOLD)
        {
            bot.spool.setPower(-gamepad1.right_trigger);
            bot.lift.setPower(-gamepad1.right_trigger);
        }else {
            bot.spool.setPower(0);
            bot.lift.setPower(0);
        }

        //motor speed (ticks/sec)

        telemetry.addData("L Speed: ", lSpeed);
        telemetry.addData("R Speed: ", rSpeed);

        //sticks
        telemetry.addData("LeftStick Y: ", gamepad1.left_stick_y);
        telemetry.addData("RightStick Y: ", gamepad1.right_stick_y);

        //power to motors
        telemetry.addData("L Pow: ", bot.lMotor.getPower());
        telemetry.addData("R Pow: ", bot.rMotor.getPower());

        telemetry.update();

        //reset prevs
        prevTime = currTime;
        lPrevPos = lPos;
        rPrevPos = rPos;
    }
}