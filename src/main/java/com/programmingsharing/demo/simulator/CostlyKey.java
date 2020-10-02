package com.programmingsharing.demo.simulator;

/**
 * Simulating a costly class.
 * @author thanh.tran
 *
 */
public class CostlyKey {
	private String key;
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CostlyKey other = (CostlyKey) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	
	

}
