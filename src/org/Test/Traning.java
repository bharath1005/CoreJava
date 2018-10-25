package org.Test;

public class Traning {
	public void test1() {
    System.out.println("Test1");
	}
	
		public static class C extends Traning{
			public void test3() {
         System.out.println("Test3");
			}
		
		public static void main(String[] args) {
			C c=new C();
			c.test1();
			c.test3();
		
					
}
		}
}
