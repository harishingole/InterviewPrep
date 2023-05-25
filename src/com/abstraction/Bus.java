package com.abstraction;

public interface Bus {

	default void drive() {
		System.out.println("This is bus");
	}
}
