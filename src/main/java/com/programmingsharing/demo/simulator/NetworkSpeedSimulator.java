package com.programmingsharing.demo.simulator;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetworkSpeedSimulator {
	
	private static final Logger log = LoggerFactory.getLogger(NetworkSpeedSimulator.class);

	public static void slowSpeed(long milliseconds) {
		try {
			log.info("Simulating slow network: waiting for "+milliseconds+"miliseconds.");
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
