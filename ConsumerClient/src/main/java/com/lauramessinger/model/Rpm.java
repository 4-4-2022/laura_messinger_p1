package com.lauramessinger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Rpm {
	
	private int min;
	
	private int max;
	
	@JsonInclude
	private String rpmLabel;
	
	public Rpm() {}

	public Rpm(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public String getRpmLabel() {
		if(min == max) {
			return (min + " RPM");
		} else {
			return (min + "-" + max + " RPM");
		}
	}
	
	public void setRpmLabel(String rpmLabel) {
		this.rpmLabel = rpmLabel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(max, min, rpmLabel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rpm other = (Rpm) obj;
		return max == other.max && min == other.min && Objects.equals(rpmLabel, other.rpmLabel);
	}

	@Override
	public String toString() {
		return "Rpm [min=" + min + ", max=" + max + ", rpmLabel=" + rpmLabel + "]";
	}

}
