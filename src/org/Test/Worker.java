package org.Test;

public class Worker {
	public void test1(String name) {
		System.out.println(name);

}
	public void test1(int age,long phone) {
    System.out.println(age);
    System.out.println(phone);
}
	public void test1(float point) {
		System.out.println(point);
	}
	public static void main(String[] args) {
		Worker w=new Worker();
		w.test1(466.366f);
		w.test1("BHARATH");
		w.test1(25,8300840420l);
	}
}	
	
	
	


