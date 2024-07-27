package com.leveraon.designpattern.behavioral.state;


public class TVStartState implements State {

	public void doAction() {
		System.out.println("TV is turned ON");
	}
}
