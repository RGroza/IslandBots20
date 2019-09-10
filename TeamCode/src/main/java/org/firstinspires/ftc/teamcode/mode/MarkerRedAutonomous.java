package org.firstinspires.ftc.islandbots19.mode;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.islandbots19.robot.CompetitionBot;
import org.firstinspires.ftc.robotcore.external.ClassFactory;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="MarkerRedAutonomous", group="Competition")
public class MarkerRedAutonomous extends AutonomousNew {
    @Override
    public void runOpMode() throws InterruptedException {
        robot = new CompetitionBot(hardwareMap, telemetry);
        initVuforia();

        if (ClassFactory.getInstance().canCreateTFObjectDetector()) {
            initTfod();
        } else {
            telemetry.addData("Sorry!", "This device is not compatible with TFOD");
        }

        /** Wait for the game to begin */
        telemetry.addData(">", "Press Play to start tracking");
        telemetry.update();
//        robot.SweeperBoxPivot.setPosition(.75);
        waitForStart();
        if(opModeIsActive()) {
            activateTfod();
        }
        if(opModeIsActive()) {
//            markerAutonomous(telemetry);
        }
    }
}
