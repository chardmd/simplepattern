package com.patterns.decorator;

public class WarriorRobotDecorator extends CommonRobot {
	
	public WarriorRobotDecorator(Robot robot) {
		super(robot);
	}
	
	public void initialize() {
		robot.initialize();
		equipWeapon();
	}
	
	private void equipWeapon() {
		System.out.println("Machine gun activated!");
		System.out.println("Sensors activated!");
		System.out.println("Armor shield equipped!");
	}

}
