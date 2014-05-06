package com.patterns.decorator;

public class BuilderRobot extends CommonRobot {

	public BuilderRobot(Robot robot) {
		super(robot);
	}
	
	public void initialize() {
		robot.initialize();
		equipWeapon();
	}
	
	private void equipWeapon() {
		System.out.println("Start building houses..");
	}

}