package com.practacaljava.homework4.polymorphic;

public class Kvadrat extends Shape implements DrawShape{
	
	public Kvadrat(String mainColor) {
		super(mainColor);
	}
	
	public boolean drawShape(int quantity) {
		if (mainColor.equals("VIOLET")){
			System.out.println("We draw " + quantity + " " + mainColor + " square");
			return true;
			
		} else {
			System.out.println("Sorry, can't draw " + mainColor + " square");
			return false;
		}
	}
}