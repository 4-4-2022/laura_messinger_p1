package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Embeddable
public class Rpm {
	
	@Column(name="min_rpm")
	private int min;
	
	@Column(name="max_rpm")
	private int max;
	
	@Transient
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
