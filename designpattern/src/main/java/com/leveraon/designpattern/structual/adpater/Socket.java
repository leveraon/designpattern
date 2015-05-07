package com.leveraon.designpattern.structual.adpater;

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
