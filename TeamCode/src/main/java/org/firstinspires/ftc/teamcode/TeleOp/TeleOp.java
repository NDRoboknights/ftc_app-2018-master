package org.firstinspires.ftc.teamcode.TeleOp;

import org.firstinspires.ftc.teamcode.Bot.IdealBot;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "TeleOp")
public class TeleOp extends customTeleOp
{
    //bot
    private IdealBot bot = new IdealBot(hardwareMap);

    //resets zeroes
    private long prevTime = 0;
    private int lPrevPos = 0;
    private int rPrevPos = 0;
    private double prevDist=0;

    //init
    public void init()
    {
        //maps hardware
        bot.init(hardwareMap);
    }

    //runs when active
    public void loop() {
        //sets time in NANOSECONDS
        long currTime = System.nanoTime();

        //encoder position
        //like tickmarks on a circle (does not reset at 360)
        int lPos = bot.lMotor.getCurrentPosition();
        int rPos = bot.rMotor.getCurrentPosition();


        /**GETS DELTAS**/
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
        if (gamepad1.right_stick_y > customTeleOp.JOYSTICK_THRESHOLD) {
            bot.rMotor.setPower(gamepad1.right_stick_y);
        } else {
            bot.rMotor.setPower(0);
        }

        //left motors
        if (gamepad1.left_stick_y > customTeleOp.JOYSTICK_THRESHOLD) {
            bot.lMotor.setPower(gamepad1.left_stick_y);
        } else {
            bot.lMotor.setPower(0);
        }

        if (gamepad1.right_bumper) {
            bot.intakeMotor.setPower(1);
        } else {
            bot.intakeMotor.setPower(0);
        }

        if (gamepad1.a)
        {
            bot.actuator.setPower(0.5);
        }else{
            bot.actuator.setPower(0);
        }

        if (gamepad1.y)
        {
            bot.actuator.setPower(-0.5);
        }else{
            bot.actuator.setPower(0);
        }

        //lifts intake
        if (gamepad1.dpad_up && gamepad1.right_trigger>JOYSTICK_THRESHOLD) {
            bot.liftMotor.setPower(gamepad1.right_trigger);
        } else {
            bot.liftMotor.setPower(0);
        }
        //lowers intake
        if (gamepad1.dpad_down && gamepad1.right_trigger>JOYSTICK_THRESHOLD) {
            bot.liftMotor.setPower(-gamepad1.right_trigger);
        } else {
            bot.liftMotor.setPower(0);
        }

        /*
        reserve axby for secondary functions
         */

        /*
        sets telemetry
        */

        //enc position
//        telemetry.addData("L Position: ", lPos);
//        telemetry.addData("R Position: ", rPos);

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