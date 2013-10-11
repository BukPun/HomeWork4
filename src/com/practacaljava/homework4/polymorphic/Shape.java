package com.practacaljava.homework4.polymorphic;

public class Shape {
	protected String mainColor;
	
	public Shape (String mainColor){
		this.mainColor = mainColor;
	}
	
	public String getColor(){
		return "Our color is " + mainColor;
	}
	
}
