package com.ust.di;

public class Car {
//	Engine engine = new Engine();
	Engine engine = null;
	
	public Car(){
		
	}
	public Car(Engine engine){
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
