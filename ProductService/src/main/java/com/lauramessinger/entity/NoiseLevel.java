package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Embeddable
public class NoiseLevel {
	
	@Column(name="min_noise")
	private float min;
	
	@Column(name="max_noise")
	private float max;
	
	@Transient
	@JsonInclude
	private String noiseLabel;
	
	public NoiseLevel() {}

	public NoiseLevel(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	public float getMin() {
		return min;
	}

	public void setMin(float min) {
		this.min = min;
	}

	public float getMax() {
		return max;
	}

	public void setMax(float max) {
		this.max = max;
	}

	public String getnoiseLabel() {
		if(min == max) {
			return (min + " RPM");
		} else {
			return (min + "-" + max + " RPM");
		}
	}

	public void setnoiseLabel(String noiseLabel) {
		this.noiseLabel = noiseLabel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(max, min, noiseLabel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoiseLevel other = (NoiseLevel) obj;
		return Float.floatToIntBits(max) == Float.floatToIntBits(other.max)
				&& Float.floatToIntBits(min) == Float.floatToIntBits(other.min)
				&& Objects.equals(noiseLabel, other.noiseLabel);
	}

	@Override
	public String toString() {
		return "NoiseLevel [min=" + min + ", max=" + max + ", noiseLabel=" + noiseLabel + "]";
	}
	
}
