package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.Servo;//

/**
 * Created by David on 11/4/2017.
 */
@TeleOp( name = "Teleopbasic",group ="Training")
public class DriveTele extends LinearOpMode
{
    private DcMotor MotorLeftFront;
    private DcMotor MotorLeftBack;
    private DcMotor MotorRightFront;
    private DcMotor MotorRightBack;
    private DcMotor MotorArmLeft;
    private DcMotor MotorArmRight;
    private DcMotor MotorHandLeft;
    private DcMotor MotorHandRight;

    //private Servo ArmServo;//

    //private static final double ARM_RETRACTED_POSITION = 0.2;//
    //private static final double ARM_EXTENDED_POSITION = 0.8;//

    @Override
    public void runOpMode () throws InterruptedException
    {
        MotorLeftFront = hardwareMap.dcMotor.get ("MotorLeftFront");
        MotorLeftBack = hardwareMap.dcMotor.get("MotorLeftBack");
        MotorRightFront = hardwareMap.dcMotor.get("MotorRightFront");
        MotorRightBack = hardwareMap.dcMotor.get("MotorRightBack");
        MotorArmLeft = hardwareMap.dcMotor.get("MotorArmLeft");
        MotorArmRight = hardwareMap.dcMotor.get("MotorArmRight");
        MotorHandLeft = hardwareMap.dcMotor.get("MotorHandLeft");
        MotorHandRight = hardwareMap.dcMotor.get("MotorHandRight");


        MotorRightFront . setDirection(DcMotor.Direction.REVERSE);
        MotorRightBack . setDirection(DcMotor.Direction.REVERSE);
        MotorArmLeft . setDirection(DcMotor.Direction.REVERSE);
        MotorHandLeft . setDirection(DcMotor.Direction.REVERSE);



        waitForStart();
        // This makes the program wait for the start button to be pressed //

        while (opModeIsActive())
        {
            idle();
            MotorLeftFront . setPower(-gamepad1.left_stick_y);
            MotorLeftBack . setPower(-gamepad1.left_stick_y);
            MotorRightFront . setPower(-gamepad1. left_stick_y);
            MotorRightBack . setPower(-gamepad1. left_stick_y);
            MotorArmLeft . setPower(-gamepad2. left_stick_y);
            MotorArmRight . setPower(-gamepad2. left_stick_y);
            MotorHandLeft . setPower(-gamepad2. right_stick_y);
            MotorHandRight . setPower(-gamepad2. right_stick_y);
            //turnin//
            MotorLeftFront . setPower (-gamepad1. right_stick_x);
            MotorLeftBack . setPower (-gamepad1.right_stick_x);
            MotorRightFront . setPower (gamepad1. right_stick_x);
            MotorRightBack . setPower (gamepad1. right_stick_x);




                    // setting all of the important items to each respectable gamepad imput//
            if (gamepad1. right_bumper)
            {
                MotorLeftFront . setPower(1);
                MotorLeftBack . setPower(-1);
                MotorRightFront . setPower(-1);
                MotorRightBack . setPower(1);
            }
            if (gamepad1. left_bumper)
            {
                MotorLeftFront . setPower(-1);
                MotorLeftBack . setPower(1);
                MotorRightFront . setPower(1);
                MotorRightBack .setPower(-1);
            }

        }
    }
}

