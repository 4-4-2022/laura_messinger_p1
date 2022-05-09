package com.lauramessinger.model;

import java.util.Objects;

public class Monitor extends Product {
	
	private float screenSize;
	
	private String resolution;
	
	private int refreshRate;
	
	private float responseTime;

	public Monitor() {}
	
	public float getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public int getRefreshRate() {
		return refreshRate;
	}

	public void setRefreshRate(int refreshRate) {
		this.refreshRate = refreshRate;
	}

	public float getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(float responseTime) {
		this.responseTime = responseTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(refreshRate, resolution, responseTime, screenSize);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monitor other = (Monitor) obj;
		return refreshRate == other.refreshRate && Objects.equals(resolution, other.resolution)
				&& Float.floatToIntBits(responseTime) == Float.floatToIntBits(other.responseTime)
				&& Float.floatToIntBits(screenSize) == Float.floatToIntBits(other.screenSize);
	}

	@Override
	public String toString() {
		return "Monitor [screenSize=" + screenSize + ", resolution=" + resolution + ", refreshRate=" + refreshRate
				+ ", responseTime=" + responseTime + "]";
	}
	
}
