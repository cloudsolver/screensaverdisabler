package com.rohitsood.screensaver.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 * @author Rohit Sood
 * Disabler will simulate keys pressed while you're away from the computer
 * NUM lock is pressed and released in real-time with a 15 minute wait cycle.
 */
public class Disabler{
	
	public static void key() throws Exception{
		
		Robot r=new Robot();
		while(true){
		r.keyPress(KeyEvent.VK_NUM_LOCK);
		r.keyRelease(KeyEvent.VK_NUM_LOCK);
		System.out.println("NUM LOCK Key Pressed & released"+System.currentTimeMillis());
		r.keyPress(KeyEvent.VK_NUM_LOCK);
		r.keyRelease(KeyEvent.VK_NUM_LOCK);
		System.out.println("NUM LOCK Key Pressed & released again "+System.currentTimeMillis());
		Thread.sleep((long)(15*60*1000));
		}
	}
	
	public static void main(String[] args){
	
		try {
			key();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
