package com.patterns.decorator;

/**
 * 
 * @author Richard Dimalanta
 * Design Pattern Sample - Decorator Pattern
 * Change or configure the behaviour of an individual object without affecting
 * the behaviour of other objects. Also know as Wrapper.
 * This kind of pattern was used extensively in File.IO classes in Java
 */

public class App {

	public static void main(String[] args) {
		
		Robot robot = new BaseRobot();
		
		/** Add Warrior feature to robot **/
		robot = new WarriorRobotDecorator(robot);
		
		/** add builder feature to robot **/
		robot = new BuilderRobot(robot);
		
		robot.initialize();
		
	}

}
