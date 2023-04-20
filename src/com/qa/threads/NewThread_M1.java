package com.qa.threads;

public class NewThread_M1 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		NewThread_M1 t1 = new NewThread_M1(); // if you don't want to extend Thread class, then just create an Object of Thread class- check M3 code 
		t1.start();
		System.out.println("Anyway, this us usual control flow of main()");
		
	}
	public void run() {
		System.out.println("This is running inside Thread class overridden method run()");
		System.out.println("Current time is " + System.nanoTime());
	}

}
