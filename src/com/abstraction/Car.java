package com.abstraction;

public interface Car {

	default void drive() {
		System.out.println("This is car");
	}
}
