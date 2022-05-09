package com.lauramessinger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Build {

	private int uid;

	private Account account;

	private String nickname;

	private int cpu;

	private int cpuCooler;

	private int motherboard;

	private int memory;

	private int storage;

	private int gpu;

	private int pcCase;

	private int psu;

	private int os;

	private int monitors;

	public Build() {
	}
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@JsonBackReference
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getCpuCooler() {
		return cpuCooler;
	}

	public void setCpuCooler(int cpuCooler) {
		this.cpuCooler = cpuCooler;
	}

	public int getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(int motherboard) {
		this.motherboard = motherboard;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getGpu() {
		return gpu;
	}

	public void setGpu(int gpu) {
		this.gpu = gpu;
	}

	public int getPcCase() {
		return pcCase;
	}

	public void setPcCase(int pcCase) {
		this.pcCase = pcCase;
	}

	public int getPsu() {
		return psu;
	}

	public void setPsu(int psu) {
		this.psu = psu;
	}

	public int getOs() {
		return os;
	}

	public void setOs(int os) {
		this.os = os;
	}

	public int getMonitors() {
		return monitors;
	}

	public void setMonitors(int monitors) {
		this.monitors = monitors;
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, cpu, cpuCooler, gpu, memory, monitors, motherboard, nickname, os, pcCase, psu,
				storage, uid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Build other = (Build) obj;
		return Objects.equals(account, other.account) && cpu == other.cpu && cpuCooler == other.cpuCooler
				&& Objects.equals(gpu, other.gpu) && Objects.equals(memory, other.memory)
				&& Objects.equals(monitors, other.monitors) && motherboard == other.motherboard
				&& Objects.equals(nickname, other.nickname) && os == other.os && pcCase == other.pcCase
				&& psu == other.psu && Objects.equals(storage, other.storage) && uid == other.uid;
	}

	@Override
	public String toString() {
		return "Build [uid=" + uid + ", account=" + account + ", nickname=" + nickname + ", cpu=" + cpu + ", cpuCooler="
				+ cpuCooler + ", motherboard=" + motherboard + ", memory=" + memory + ", storage=" + storage + ", gpu="
				+ gpu + ", pcCase=" + pcCase + ", psu=" + psu + ", os=" + os + ", monitors=" + monitors + "]";
	}

}
