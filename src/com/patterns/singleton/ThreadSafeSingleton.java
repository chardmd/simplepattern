package com.patterns.singleton;

/**
 * 
 * @author Richard Dimalanta
 * Design Pattern Sample - ThreadSafe Singleton
 *
 */
public class ThreadSafeSingleton {

	private ThreadSafeSingleton() { }
	
	private static ThreadSafeSingleton INSTANCE;
	
	public static ThreadSafeSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (ThreadSafeSingleton.class) {
				INSTANCE = new ThreadSafeSingleton();	
			}
		}
		
		return INSTANCE;
	}
	
	public void singletonMethod() {
		// implement your business logic here
	}
}
