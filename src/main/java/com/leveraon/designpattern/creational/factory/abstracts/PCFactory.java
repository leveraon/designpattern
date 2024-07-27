package com.leveraon.designpattern.creational.factory.abstracts;

import com.leveraon.designpattern.creational.factory.Computer;
import com.leveraon.designpattern.creational.factory.PC;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}

}
