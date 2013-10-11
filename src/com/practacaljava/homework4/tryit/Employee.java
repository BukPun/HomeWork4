package com.practacaljava.homework4.tryit;

public class Employee extends Person  implements Payable{

	public Employee(String name){
		super(name);
	}
	public boolean increasePay(int percent) {
			System.out.println("Increasing salary by " + percent + "%. "+ getName()); 
			return true;
	}
}
