package com.lauramessinger.model;

import java.util.Objects;

public class Os extends Product {

	private String mode;

	public Os() {}
		

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(mode);
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
		Os other = (Os) obj;
		return Objects.equals(mode, other.mode);
	}

	@Override
	public String toString() {
		return "Os [mode=" + mode + "]";
	}

}
