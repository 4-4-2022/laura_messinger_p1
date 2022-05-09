package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="gpu")
public class Gpu extends Product {
	
	@Column
	private String chipset;
	
	@Column(name="vram")
	private int vRam;
	
	@Column(name="clock_speed")
	private int clockSpeed;
	
	@Column(name="length_mm")
	private int length;
	
	public Gpu() {}
	
	

	public String getChipset() {
		return chipset;
	}

	public void setChipset(String chipset) {
		this.chipset = chipset;
	}

	public int getvRam() {
		return vRam;
	}

	public void setvRam(int vRam) {
		this.vRam = vRam;
	}

	public int getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(int clockSpeed) {
		this.clockSpeed = clockSpeed;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(chipset, clockSpeed, length, vRam);
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
		Gpu other = (Gpu) obj;
		return Objects.equals(chipset, other.chipset) && clockSpeed == other.clockSpeed && length == other.length
				&& vRam == other.vRam;
	}

	@Override
	public String toString() {
		return "Gpu [chipset=" + chipset + ", vRam=" + vRam + ", clockSpeed=" + clockSpeed + ", length=" + length + "]";
	}	
		
}
