package com.leveraon.designpattern.structual.composite;

public class TestCompositePattern {
	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape squr = new Square();
		Shape cir = new Circle();

		Drawing drawing = new Drawing();
		drawing.add(tri);
		drawing.add(squr);
		drawing.add(cir);

		drawing.draw("Red");

		drawing.clear();

		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
	}
}
