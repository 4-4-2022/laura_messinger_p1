package com.lauramessinger.model;

import java.util.Objects;

public class Motherboard extends Product {
	
	private String socket;
	
	private String formFactor;
	
	private int memorySlots;
	
	public Motherboard() {}
	

	public String getSocket() {
		return socket;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public String getFormFactor() {
		return formFactor;
	}

	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}

	public int getMemorySlots() {
		return memorySlots;
	}

	public void setMemorySlots(int memorySlots) {
		this.memorySlots = memorySlots;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(formFactor, memorySlots, socket);
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
		Motherboard other = (Motherboard) obj;
		return Objects.equals(formFactor, other.formFactor) && memorySlots == other.memorySlots
				&& Objects.equals(socket, other.socket);
	}

	@Override
	public String toString() {
		return "Motherboard [socket=" + socket + ", formFactor=" + formFactor + ", memorySlots=" + memorySlots + "]";
	}
	
}
