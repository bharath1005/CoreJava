package org.Test;

 class Animal {
  void eat() {
    System.out.println("Eating");
    
	}
	static class Dog extends Animal{
   void bark() {
        System.out.println("Barking");
		}
   
   void lick() {
	System.out.println("Licking");

}
   		public static void main(String[] args) {
			Dog d=new Dog();
			d.eat();
			d.bark();
			d.lick();
	}
}
}
 