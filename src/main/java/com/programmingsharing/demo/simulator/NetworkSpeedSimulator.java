package com.programmingsharing.demo.simulator;

import java.util.concurrent.TimeUnit;

public class NetworkSpeedSimulator {
	public static void slowSpeed(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
