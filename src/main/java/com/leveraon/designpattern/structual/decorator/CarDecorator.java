package com.leveraon.designpattern.structual.decorator;

public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}

	public void assemble() {
		this.car.assemble();
	}
}
