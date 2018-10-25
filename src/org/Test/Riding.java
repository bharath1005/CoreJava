package org.Test;

public class Riding {
	void drive() {
	System.out.println("Vehicle is Running");

}
	static class car extends Riding{
		public static void main(String[] args) {
			car c=new car();
			c.drive();
		}
}
}