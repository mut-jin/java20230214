package ch09.exercise.exam04;

import ch09.exercise.exam04.Car.*;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Car.Engine();
	}
}
