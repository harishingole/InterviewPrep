package com.impl;

import com.abstraction.Bus;
import com.abstraction.Car;

public class Drive implements Bus, Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		Bus.super.drive();
		Car.super.drive();
	}
	public static void main(String[] args) {
		new Drive().drive();
	}

}
