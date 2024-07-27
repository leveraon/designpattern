package com.leveraon.designpattern.creational.factory.abstracts;

import com.leveraon.designpattern.creational.factory.Computer;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
