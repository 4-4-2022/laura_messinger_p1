package com.lauramessinger.model;

import java.util.Objects;

public class Cpu extends Product {
	
	private int coreCount;
	
	private float clockSpeed;
	
	private boolean integratedGraphics;
	
	public Cpu() {}
	
	
	public int getCoreCount() {
		return coreCount;
	}
	
	public void setCoreCount(int coreCount) {
		this.coreCount = coreCount;
	}
	
	public float getClockSpeed() {
		return clockSpeed;
	}
	
	public void setClockSpeed(float clockSpeed) {
		this.clockSpeed = clockSpeed;
	}
	
	public boolean isIntegratedGraphics() {
		return integratedGraphics;
	}
	
	public void setIntegratedGraphics(boolean integratedGraphics) {
		this.integratedGraphics = integratedGraphics;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(clockSpeed, coreCount, integratedGraphics);
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
		Cpu other = (Cpu) obj;
		return Float.floatToIntBits(clockSpeed) == Float.floatToIntBits(other.clockSpeed)
				&& coreCount == other.coreCount && integratedGraphics == other.integratedGraphics;
	}

	@Override
	public String toString() {
		return "Cpu [coreCount=" + coreCount + ", clockSpeed=" + clockSpeed + ", integratedGraphics="
				+ integratedGraphics + "]";
	}
	
}
