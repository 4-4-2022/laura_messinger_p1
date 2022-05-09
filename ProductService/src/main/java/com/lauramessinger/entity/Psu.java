package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="psu")
public class Psu extends Product {
	
	@Column(name="form_factor")
	private String formFactor;
	
	@Column
	private int wattage;

	public Psu() {}	
	

	public String getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public int getWattage() {
		return wattage;
	}

	public void setWattage(int wattage) {
		this.wattage = wattage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(formFactor, wattage);
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
		Psu other = (Psu) obj;
		return Objects.equals(formFactor, other.formFactor) && wattage == other.wattage;
	}

	@Override
	public String toString() {
		return "Psu [formFactor=" + formFactor + ", wattage=" + wattage + "]";
	}
	
}
