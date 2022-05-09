package com.lauramessinger.model;

import java.util.Objects;

public class CpuCooler extends Product {
	
	private Rpm rpm;
	
	private NoiseLevel noiseLevel;
	
	private boolean isLiquid;
	
	public CpuCooler() {}

	
	public Rpm getRpm() {
		return rpm;
	}

	public void setRpm(Rpm rpm) {
		this.rpm = rpm;
	}

	public NoiseLevel getNoiseLevel() {
		return noiseLevel;
	}

	public void setNoiseLevel(NoiseLevel noiseLevel) {
		this.noiseLevel = noiseLevel;
	}

	public boolean isLiquid() {
		return isLiquid;
	}

	public void setLiquid(boolean isLiquid) {
		this.isLiquid = isLiquid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(isLiquid, noiseLevel, rpm);
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
		CpuCooler other = (CpuCooler) obj;
		return isLiquid == other.isLiquid && Objects.equals(noiseLevel, other.noiseLevel)
				&& Objects.equals(rpm, other.rpm);
	}

	@Override
	public String toString() {
		return "CpuCooler [rpm=" + rpm + ", noiseLevel=" + noiseLevel + ", isLiquid=" + isLiquid + "]";
	}
	
}
