package org.firstinspires.ftc.teamcode.mode;

import org.firstinspires.ftc.teamcode.robot.CompetitionBot;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="AutoPark", group="Autonomous")
public class AutoPark extends AutonomousNew {
    @Override
    public void runOpMode() throws InterruptedException {
        robot = new CompetitionBot(hardwareMap, telemetry);

        waitForStart();
        forward(.3, .5, robot.getPitch(), true, false, telemetry);
    }
}
