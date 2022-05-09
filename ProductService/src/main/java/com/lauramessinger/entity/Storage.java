package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="storage_units")
public class Storage extends Product {
	
	@Column
	private int gigabytes;
	
	@Column(name="is_ssd")
	private boolean isSSD;
	
	public Storage() {}

	public int getGigabytes() {
		return gigabytes;
	}

	public void setGigabytes(int gigabytes) {
		this.gigabytes = gigabytes;
	}

	public boolean isSSD() {
		return isSSD;
	}

	public void setSSD(boolean isSSD) {
		this.isSSD = isSSD;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(gigabytes, isSSD);
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
		Storage other = (Storage) obj;
		return gigabytes == other.gigabytes && isSSD == other.isSSD;
	}

	@Override
	public String toString() {
		return "Storage [gigabytes=" + gigabytes + ", isSSD=" + isSSD + "]";
	}
		
	
}
