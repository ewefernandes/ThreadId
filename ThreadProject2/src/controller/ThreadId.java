package controller;

import java.util.Random;

public class ThreadId extends Thread{
	
	public void run() {
		System.out.println("TID #" +getId());
	}
	
	
	
}
