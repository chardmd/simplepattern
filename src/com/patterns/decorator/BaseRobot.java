package com.patterns.decorator;

/**
 * 
 * @author Richard Dimalanta
 * This is used for creating the based implementation of robot
 *
 */
public class BaseRobot implements Robot {
	
	@Override
	public void initialize() {
		System.out.println("Initializing Robot..");
	}
	
}
