package designpattern.builder;

public class Usage {
	public static void main(String[] args) {
		Car car = new CarBuilder()
				.setBrand("Toyota")
				.setModel("Camry")
				.setYear(2022)
				.setColor("Red")
				.build();

		System.out.println(car.getBrand()); // Output: Toyota
		System.out.println(car.getModel()); // Output: Camry
		System.out.println(car.getYear()); // Output: 2022
		System.out.println(car.getColor()); // Output: Red
	}
}
