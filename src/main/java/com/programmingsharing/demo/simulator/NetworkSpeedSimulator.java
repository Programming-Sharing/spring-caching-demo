package com.programmingsharing.demo.simulator;

import java.util.concurrent.TimeUnit;

public class NetworkSpeedSimulator {
	public static void slowSpeed(long milliseconds) {
		try {
			System.out.println("Simulating for slow speed");
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
