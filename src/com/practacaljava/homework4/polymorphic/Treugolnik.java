package com.practacaljava.homework4.polymorphic;

public class Treugolnik extends Shape implements DrawShape {
	
	public Treugolnik(String mainColor) {
		super(mainColor);
	}
	
	public boolean drawShape(int quantity) {
		
		System.out.println("We draw " + quantity + " " + mainColor + " triangle");
		return true;
			 
	}
}
