package com.designpattern;

public class JavaFactoryPatternTransport {

	public static void main(String[] args) {
		FactoryClass ob = new FactoryClass();
		Transport transport = ob.createObject("bus");
		transport.readyToMove();		
	}	
}

class FactoryClass{
	
	public Transport createObject(String info){
		if("bus".equalsIgnoreCase(info))
			return new Bus();
		if("car".equalsIgnoreCase(info))
			return new Car();
		if("ship".equalsIgnoreCase(info))
			return new Ship();
		else
			return null;
	}
}

interface Transport{
	public void readyToMove();
}

class Bus implements Transport{
	@Override
	public void readyToMove() {
		System.out.println("Bus is ready to move");		
	}	
}

class Car implements Transport{
	@Override
	public void readyToMove() {
		System.out.println("Car is ready to move");		
	}	
}

class Ship implements Transport{
	@Override
	public void readyToMove() {
		System.out.println("Ship is ready to move");		
	}	
}

