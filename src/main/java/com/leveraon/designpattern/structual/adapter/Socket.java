package com.leveraon.designpattern.structual.adapter;

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}
}
