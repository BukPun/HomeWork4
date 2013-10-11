package com.practacaljava.homework4.polymorphic;

public class Krug extends Shape implements DrawShape{
	
	public Krug(String mainColor){
		super(mainColor);
	}

	public boolean drawShape(int quantity) {
		if (quantity == DrawShape.MAXQUANTITY){
			System.out.println("We draw " + quantity + " " + mainColor + " circles");
			return true;
			
		} else {
			System.out.println("Sorry, can't draw more than " + DrawShape.MAXQUANTITY +" times "+ mainColor +" circles");
			return false;
		}
	}

}