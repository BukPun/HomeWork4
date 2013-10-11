package com.practacaljava.homework4.polymorphic;

/*
 * Condition: we can draw no more than two circles,
 * only violet squares and any color triangles
 * in any quantities
 */

public class TestDrawShape {

	public static void main(String[] args) {
		
		DrawShape figure[] = new DrawShape[4];
		figure[0] = new Kvadrat("GREEN");
		figure[1] = new Treugolnik("VIOLET");
		figure[2] = new Krug("VIOLET");
		figure[3] = new Kvadrat("VIOLET");
		
		for (DrawShape p: figure){
	          ((DrawShape)p).drawShape(4);
	}

	}

}
