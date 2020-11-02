package com.programmingsharing.demo.cacheevent;

import java.util.Properties;

import net.sf.ehcache.event.CacheEventListener;
import net.sf.ehcache.event.CacheEventListenerFactory;

public class DemoEhcacheEventListenerFactory extends CacheEventListenerFactory{

	@Override
	public CacheEventListener createCacheEventListener(Properties properties) {
		return DemoCacheEventLogger.INSTANCE;
	}	

}
