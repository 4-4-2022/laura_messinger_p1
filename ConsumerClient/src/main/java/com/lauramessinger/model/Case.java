package com.lauramessinger.model;

import java.util.Objects;

public class Case extends Product {
	
	private String type;
	
	private String color;

	public Case() {}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color, type);
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
		Case other = (Case) obj;
		return Objects.equals(color, other.color) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Case [type=" + type + ", color=" + color + "]";
	}
	
}
