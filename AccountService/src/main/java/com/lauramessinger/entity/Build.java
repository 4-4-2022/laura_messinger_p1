package com.lauramessinger.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "account_builds")
public class Build {

	@Id
	@Column(name = "build_uid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;

	@ManyToOne(targetEntity = Account.class)
	@JoinColumn(name = "account_uid")
	private Account account;

	@Column(name = "build_name")
	private String nickname;

	@Column(name = "cpu_uid")
	private int cpu;

	@Column(name = "cooler_uid")
	private int cpuCooler;

	@Column(name = "motherboard_uid")
	private int motherboard;

	@Column(name = "memory_uid")
	private int memory;

	@Column(name = "storage_uid")
	private int storage;

	@Column(name = "gpu_uid")
	private int gpu;

	@Column(name = "case_uid")
	private int pcCase;

	@Column(name = "psu_uid")
	private int psu;

	@Column(name = "os_uid")
	private int os;

	@Column(name = "monitor_uid")
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
