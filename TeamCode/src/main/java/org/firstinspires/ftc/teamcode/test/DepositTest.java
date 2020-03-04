package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.mode.AutonomousNew;
import org.firstinspires.ftc.teamcode.robot.CompetitionBot;

@Autonomous(name="DepositTest", group="Test")
public class DepositTest extends AutonomousNew {
    @Override
    public void runOpMode() {
        robot = new CompetitionBot(hardwareMap, telemetry);

        robot.Lfoundation.setPosition(CompetitionBot.L_FOUND_DOWN);
        robot.Rfoundation.setPosition(CompetitionBot.R_FOUND_DOWN);
        robot.grabberServo.setPosition(CompetitionBot.GRABBER_CLOSED);

        waitForStart();
        depositBlock();
        sleep(2000);
    }
}
