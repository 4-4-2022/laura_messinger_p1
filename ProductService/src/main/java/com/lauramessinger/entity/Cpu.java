package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cpu")
public class Cpu extends Product {
	
	@Column(name="core_count")
	private Integer coreCount;
	
	@Column(name="clock_speed")
	private Float clockSpeed;
	
	@Column(name="integrated_graphics")
	private Boolean integratedGraphics;
	
	public Cpu() {}
	
	

	public Integer getCoreCount() {
		return coreCount;
	}



	public void setCoreCount(Integer coreCount) {
		this.coreCount = coreCount;
	}



	public Float getClockSpeed() {
		return clockSpeed;
	}



	public void setClockSpeed(Float clockSpeed) {
		this.clockSpeed = clockSpeed;
	}



	public Boolean getIntegratedGraphics() {
		return integratedGraphics;
	}



	public void setIntegratedGraphics(Boolean integratedGraphics) {
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
		return Objects.equals(clockSpeed, other.clockSpeed) && Objects.equals(coreCount, other.coreCount)
				&& Objects.equals(integratedGraphics, other.integratedGraphics);
	}

	@Override
	public String toString() {
		return "Cpu [coreCount=" + coreCount + ", clockSpeed=" + clockSpeed + ", integratedGraphics="
				+ integratedGraphics + "]";
	}
	
}
