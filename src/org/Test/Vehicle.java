package org.Test;

class Vehicle {
 void bike() {
 System.out.println("Driving");
}
 static class Truck extends Vehicle{
	 void move() {
		 System.out.println("Slow Moving");
	

	}
	 public static void main(String[] args) {
		Truck t=new Truck();
		t.bike();
		t.move();
	}
}
}
