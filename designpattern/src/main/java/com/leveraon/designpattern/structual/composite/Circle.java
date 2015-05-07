package com.leveraon.designpattern.structual.composite;

public class Circle implements Shape {

	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color " + fillColor);
	}
}
