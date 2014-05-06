package com.patterns.decorator;

public class CommonRobot extends BaseRobot {

	Robot robot;
	
	public CommonRobot(Robot robot) {
		this.robot = robot;
	}

	public void initialize() {
		robot.initialize();
	}
}
