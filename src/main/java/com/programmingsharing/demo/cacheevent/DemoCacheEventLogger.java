package com.programmingsharing.demo.cacheevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.event.CacheEventListener;

public class DemoCacheEventLogger implements CacheEventListener {
	
	public static final CacheEventListener INSTANCE = new DemoCacheEventLogger();
	
	private static final Logger log = LoggerFactory.getLogger(DemoCacheEventLogger.class);

	@Override
	public void notifyElementRemoved(Ehcache cache, Element element) throws CacheException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyElementPut(Ehcache cache, Element element) throws CacheException {
		log.info("New cache entry put into cache: "+cache.getName());
	}

	@Override
	public void notifyElementUpdated(Ehcache cache, Element element) throws CacheException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyElementExpired(Ehcache cache, Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyElementEvicted(Ehcache cache, Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyRemoveAll(Ehcache cache) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
