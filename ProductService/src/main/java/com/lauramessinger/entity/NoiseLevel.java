package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Embeddable
public class NoiseLevel {
	
	@Column(name="min_noise")
	private Float min;
	
	@Column(name="max_noise")
	private Float max;
	
	@Transient
	@JsonInclude
	private String noiseLabel;
	
	public NoiseLevel() {}

	

	public Float getMin() {
		return min;
	}



	public void setMin(Float min) {
		this.min = min;
	}



	public Float getMax() {
		return max;
	}



	public void setMax(Float max) {
		this.max = max;
	}



	public String getNoiseLabel() {
		if(min == max) {
			return (min + " RPM");
		} else {
			return (min + "-" + max + " RPM");
		}
	}

	public void setNoiseLabel(String noiseLabel) {
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
		return Objects.equals(max, other.max) && Objects.equals(min, other.min)
				&& Objects.equals(noiseLabel, other.noiseLabel);
	}

	@Override
	public String toString() {
		return "NoiseLevel [min=" + min + ", max=" + max + ", noiseLabel=" + noiseLabel + "]";
	}
	
}
