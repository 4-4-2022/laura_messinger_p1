package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cpu_cooler")
public class CpuCooler extends Product {
	
	@Embedded
	private Rpm rpm;
	
	@Embedded
	private NoiseLevel noiseLevel;
	
	@Column(name="is_liquid")
	private Boolean isLiquid;
	
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

	public Boolean getLiquid() {
		return isLiquid;
	}

	public void setLiquid(Boolean isLiquid) {
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
		return Objects.equals(isLiquid, other.isLiquid) && Objects.equals(noiseLevel, other.noiseLevel)
				&& Objects.equals(rpm, other.rpm);
	}

	@Override
	public String toString() {
		return "CpuCooler [rpm=" + rpm + ", noiseLevel=" + noiseLevel + ", isLiquid=" + isLiquid + "]";
	}
	
}
