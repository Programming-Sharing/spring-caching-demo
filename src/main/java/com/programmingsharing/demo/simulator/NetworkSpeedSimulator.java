package com.programmingsharing.demo.simulator;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetworkSpeedSimulator {

	private static final Logger LOGGER = LoggerFactory.getLogger(NetworkSpeedSimulator.class);

	public static void slowSpeed(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			LOGGER.error("Error durring simulate network speed", e);
		}
	}
}