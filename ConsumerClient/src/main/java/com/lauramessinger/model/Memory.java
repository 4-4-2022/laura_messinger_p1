package com.lauramessinger.model;

import java.util.Objects;

public class Memory extends Product {
	
	private String speed;
	
	private String modules;

	public Memory() {}
	
	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getModules() {
		return modules;
	}

	public void setModules(String modules) {
		this.modules = modules;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(modules, speed);
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
		Memory other = (Memory) obj;
		return Objects.equals(modules, other.modules) && Objects.equals(speed, other.speed);
	}

	@Override
	public String toString() {
		return "Memory [speed=" + speed + ", modules=" + modules + "]";
	}
		
}
