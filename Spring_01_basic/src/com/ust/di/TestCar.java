package com.ust.di;

public class TestCar {
	public static void main(String[] args) {
//		Car bmw1 = new Car();
//		Car car2 = new Car();
//		Car bmw2 = new Car();
//		
//		if(bmw1.getEngine() == bmw2.getEngine()){
//			System.out.println("Both cars have same engine");
//		} else {
//			System.out.println("Both cars dont have same engine");
//		}

//	Dependency Injection
	Car bmw = new Car(new BmwEngine());
//	Car jag = new Car();
//	jag.setEngine(new Engine());
	}

}
